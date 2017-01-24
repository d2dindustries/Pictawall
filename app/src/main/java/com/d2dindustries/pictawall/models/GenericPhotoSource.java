package com.d2dindustries.pictawall.models;

import com.d2dindustries.pictawall.interfaces.GenericPhotoInterface;

/**
 * A Generic Model for the Gallery Images.
 * Contains the only necessary info for displaying the content.
 * Created by l1ttl_000 on 1/22/2017.
 */
public class GenericPhotoSource implements GenericPhotoInterface {
    private String thumbnail;
    private String image;
    private String network;//Which photo source it's from
    private String date;
    private String location;

    public GenericPhotoSource(String thumbnail, String image, String network, String date, String location){
        this.thumbnail = thumbnail;
        this.image = image;
        this.network = network;
        this.date = date;
        this.location = location;
    }

    public void setThumbnail(String thumbnail){
        this.thumbnail = thumbnail;
    }

    public void setImage(String image){
        this.image = image;
    }

    public void setNetwork(String network){
        this.network = network;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getThumbnail(){
        return thumbnail;
    }

    public String getImage(){
        return image;
    }

    public String getNetwork(){
        return network;
    }

    public String getDate(){
        return date;
    }

    public String getLocation(){
        return location;
    }
}
