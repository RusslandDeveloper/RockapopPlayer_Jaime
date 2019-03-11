package com.example.rockapopplayer_jaime;

import retrofit2.http.GET;
import retrofit2.Call;

public interface InterfaceAPI_Pop {

    @GET("/search?term=pop&amp;amp;media=music&amp;amp;entity=song&amp;amp;limit=50")
    Call<DataResult>getPopMusic();
}
