package com.example.rockapopplayer_jaime;

public class DataListClassic {
    String artistname,
            trackname,
            imageID;

    double trackprice;


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

    public double getTrackprice() {
        return trackprice;
    }

    public void setTrackprice(double trackprice) {
        this.trackprice = trackprice;
    }

    DataListClassic(String name, String track, Double price, String image ){

        this.artistname = name;
        this.trackname = track;
        try {
            this.trackprice = price;
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.imageID = image;


    }
}

