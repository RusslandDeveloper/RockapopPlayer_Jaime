package com.example.rockapopplayer_jaime;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClassicFragment extends Fragment {


    // Constantof the base URL of the API
    final String Base_URL = "https://itunes.apple.com";

    ArrayList<DataListClassic> dataListClassics = new ArrayList<>();

    RecyclerView recList;
    RVAdapterClassic RVAdapter =new RVAdapterClassic(dataListClassics);




    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_classic, container, false);

        recList =  v.findViewById(R.id.classic_recyclerview);
        RecyclerView.LayoutManager rcvM = new LinearLayoutManager(getActivity());
        recList.setLayoutManager(rcvM);

        initiatlizeRetrofit();

        return v;
    }

    public void initiatlizeRetrofit() {

        //Creating an instance of retrofit
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Base_URL).
                addConverterFactory(GsonConverterFactory.create()).build();

        InterafaceAPI_Classic interafeAPIClassic = retrofit.create(InterafaceAPI_Classic.class);
        interafeAPIClassic.getClassicmusic().enqueue(new Callback<DataResult>() {
            @Override
            public void onResponse(Call<DataResult> call, Response<DataResult> response) {

                if(response.body().getResults() != null){

                    for(int i = 0 ; i < response.body().getResultCount(); i++){

                        dataListClassics.add(new DataListClassic(

                                response.body().getResults().get(i).artistName,
                                response.body().getResults().get(i).trackName,
                                response.body().getResults().get(i).trackPrice,
                                response.body().getResults().get(i).artworkUrl60
                        ));
                    }
                    recList.setAdapter(RVAdapter);
                }
            }

            @Override
            public void onFailure(Call<DataResult> call, Throwable t) {

                Toast.makeText(getActivity(),
                        "Connection failure to Classic",
                        Toast.LENGTH_SHORT).show();


            }
        });


    }

}
