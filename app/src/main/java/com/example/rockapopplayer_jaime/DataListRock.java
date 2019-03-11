
package com.example.rockapopplayer_jaime;


public class DataListRock {
    String artistname,
            trackname,
            imageID;

    double trackprice;




    DataListRock(String name, String track, Double price, String image ){

        this.artistname = name;
        this.trackname = track;
        try {
            this.trackprice = price;
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.imageID = image;


    }


    public String getArtistname() {
        return artistname;
    }

    public void setArtistname(String artistname) {
        this.artistname = artistname;
    }

    public String getTrackname() {
        return trackname;
    }

    public void setTrackname(String trackname) {
        this.trackname = trackname;
    }


    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public Double getTrackprice() {
        return trackprice;
    }

    public void setTrackprice(Double trackprice) {
        this.trackprice = trackprice;
    }
}






