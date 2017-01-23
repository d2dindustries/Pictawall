package com.d2dindustries.pictawall.models;

/**
 * A Basic Model for populating the Gallery Images.
 * Created by l1ttl_000 on 1/22/2017.
 */
public class BasicPhotoSource {
    private String thumbnail;
    private String image;
    private String caption;

    public BasicPhotoSource(){

    }

    public BasicPhotoSource(String thumbnail, String image, String caption){
        this.thumbnail = thumbnail;
        this.image = image;
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

    public void setThumbnail(String thumbnail){
        this.thumbnail = thumbnail;
    }

    public void setImage(String image){
        this.image = image;
    }

    public void setCaption(String caption){
        this.caption = caption;
    }

    public String getNetwork() {
        return "General";
    }

//    public static class GalleryPhotoSourceBuilder {
//        private String photo;
//        private String thumbnail;
//        private String network;
//
//        public GalleryPhotoSourceBuilder(int size) {
//            this.size = size;
//        }
//
//        public GalleryPhotoSourceBuilder facebook(String value) {
//            cheese = value;
//            return this;
//        }
//
//        public GalleryPhotoSourceBuilder instagram(String value) {
//            pepperoni = value;
//            return this;
//        }
//
//        public GalleryPhotoSourceBuilder pixabay(String value) {
//            bacon = value;
//            return this;
//        }
//
//        public GalleryPhotoSource build() {
//            return new GalleryPhotoSource(this);
//        }
//    }

//    private GalleryPhotoSource(GalleryPhotoSourceBuilder builder) {
//        size = builder.size;
//        cheese = builder.cheese;
//        pepperoni = builder.pepperoni;
//        bacon = builder.bacon;
//    }
}
