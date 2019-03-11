package com.example.rockapopplayer_jaime;


import retrofit2.http.GET;
import retrofit2.Call;

public interface InterafaceAPI_Classic {

    @GET("/search?term=classick&amp;media=music&amp;entity=song&amp;limit=50")
    Call<DataResult>getClassicmusic();


}
