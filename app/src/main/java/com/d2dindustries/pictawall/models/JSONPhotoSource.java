package com.d2dindustries.pictawall.models;

import com.d2dindustries.pictawall.interfaces.GenericPhotoInterface;
import com.d2dindustries.pictawall.utils.SharedPhotoSourceStrings;

/**
 * Model for Basic JSON Photo Source.
 * Created by l1ttl_000 on 1/22/2017.
 */
public class JSONPhotoSource implements GenericPhotoInterface {
    private final int SOURCE_ID = 1;
    private String thumbnail;
    private String image;
    private String caption;

    public JSONPhotoSource(String thumbnail, String image, String caption){
        this.thumbnail = thumbnail;
        this.image = image;
        this.caption = caption;
    }

    public void setThumbnail(String thumbnail){
        this.thumbnail = thumbnail;
    }

    public void setImage(String image){
        this.image = image;
    }

    public void setCaption(String caption){
        this.caption = caption;
    }

    public String getThumbnail(){
        return thumbnail;
    }

    public String getImage(){
        return image;
    }

    public String getCaption(){
        return caption;
    }

    public String getNetwork() {
        return SharedPhotoSourceStrings.SOCIAL_ARRAY_NETWORK[SOURCE_ID];
    }

    public String getDate() {
        return "N/A";
    }

    public String getLocation() {
        return "N/A";
    }
}
