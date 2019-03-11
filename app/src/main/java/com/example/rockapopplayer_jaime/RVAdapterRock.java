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

public class RVAdapterRock extends RecyclerView.Adapter<RVAdapterRock.ViewHolderData> {

    ArrayList<DataListRock> datalistRocks;

    // Retrieving the list to your adapter
    public RVAdapterRock(ArrayList<DataListRock> datalistRocks){

        this.datalistRocks = datalistRocks;
    }


    @NonNull
    @Override
    public ViewHolderData onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // Fill fragment
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cv_rock,
                null,false);
        return new ViewHolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderData viewHolderData, int i) {

        viewHolderData.cv_Aname.setText(datalistRocks.get(i).getArtistname());
        viewHolderData.cv_Tname.setText(datalistRocks.get(i).getTrackname());

        viewHolderData.cv_price.setText(datalistRocks.get(i).getTrackprice()+" "+"USD");
        Picasso.with(viewHolderData.itemView.getContext()).
                load(datalistRocks.get(i).getImageID()).
                into(viewHolderData.cv_image);

    }

    @Override
    public int getItemCount() {
        return datalistRocks.size();
    }

    public static class ViewHolderData extends RecyclerView.ViewHolder{

        TextView cv_Aname,cv_Tname, cv_price ;

        ImageView cv_image;

        ViewHolderData(View itemView){
            super(itemView);
            cv_Aname = itemView.findViewById(R.id.cvR_Aname_text);
            cv_Tname = itemView.findViewById(R.id.cvR_Tname_text);
            cv_price = itemView.findViewById(R.id.cvR_Tprice_text);
            cv_image = itemView.findViewById(R.id.cvR_imageview);
        }
    }
}
