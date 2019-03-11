package com.example.rockapopplayer_jaime;


import retrofit2.http.GET;
import retrofit2.Call;



public interface InterfaceAPI_Rock {


    // Get from the home page of API

    @GET("/search?term=rock&amp;media=music&amp;entity=song&amp;limit=50")
    Call<DataResult>getRockMusic();


}
