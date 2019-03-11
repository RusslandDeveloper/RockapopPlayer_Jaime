package com.example.rockapopplayer_jaime;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RVAdapterPop extends RecyclerView.Adapter<RVAdapterPop.ViewHolderData> {

    ArrayList<DataListPop> dataListPops;

    // Retrieving the list to your adapter
    public RVAdapterPop(ArrayList<DataListPop>dataListPops){

        this.dataListPops =dataListPops;
    }


    @NonNull
    @Override
    public RVAdapterPop.ViewHolderData onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cv_pop,
                null,false);
        return new ViewHolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapterPop.ViewHolderData viewHolderData, int i) {

        viewHolderData.cv_Aname.setText(dataListPops.get(i).getArtistname());
        viewHolderData.cv_Tname.setText(dataListPops.get(i).getTrackname());

        viewHolderData.cv_price.setText(dataListPops.get(i).getTrackprice()+" "+"USD");
        Picasso.with(viewHolderData.itemView.getContext()).
                load(dataListPops.get(i).getImageID()).
                into(viewHolderData.cv_image);


    }

    @Override
    public int getItemCount() {



        return dataListPops.size() ;
    }


    public static class ViewHolderData extends RecyclerView.ViewHolder {

        TextView cv_Aname, cv_Tname, cv_price;

        ImageView cv_image;

        ViewHolderData(View itemView) {

            super(itemView);
            cv_Aname = itemView.findViewById(R.id.cvP_Aname_text);
            cv_Tname = itemView.findViewById(R.id.cvP_Tname_text);
            cv_price = itemView.findViewById(R.id.cvP_Tprice_text);
            cv_image = itemView.findViewById(R.id.cvP_imageview);


        }

    }
}
