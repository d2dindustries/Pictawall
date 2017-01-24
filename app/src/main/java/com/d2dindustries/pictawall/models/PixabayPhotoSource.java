package com.d2dindustries.pictawall.models;

import com.d2dindustries.pictawall.interfaces.GenericPhotoInterface;
import com.d2dindustries.pictawall.utils.SharedPhotoSourceStrings;

/**
 * Model for Pixabay API Photo Source.
 * Created by l1ttl_000 on 1/22/2017.
 */
public class PixabayPhotoSource implements GenericPhotoInterface {
    private final int SOURCE_ID = 0;
    private int previewHeight;
    private int likes;
    private int favorites;
    private String tags;
    private int webformatHeight;
    private int views;
    private int webformatWidth;
    private int previewWidth;
    private int comments;
    private int downloads;
    private String pageURL;
    private String previewURL;
    private String webformatURL;
    private int imageWidth;
    private int userId;
    private String user;
    private String type;
    private int id;
    private String userImageURL;
    private int imageHeight;

    public int getPreviewHeight(){
        return previewHeight;
    }
    public void setPreviewHeight(int input){
        this.previewHeight = input;
    }
    public int getLikes(){
        return likes;
    }
    public void setLikes(int input){
        this.likes = input;
    }
    public int getFavorites(){
        return favorites;
    }
    public void setFavorites(int input){
        this.favorites = input;
    }
    public String getTags(){
        return tags;
    }
    public void setTags(String input){
        this.tags = input;
    }
    public int getWebformatHeight(){
        return webformatHeight;
    }
    public void setWebformatHeight(int input){
        this.webformatHeight = input;
    }
    public int getViews(){
        return views;
    }
    public void setViews(int input){
        this.views = input;
    }
    public int getWebformatWidth(){
        return webformatWidth;
    }
    public void setWebformatWidth(int input){
        this.webformatWidth = input;
    }
    public int getPreviewWidth(){
        return previewWidth;
    }
    public void setPreviewWidth(int input){
        this.previewWidth = input;
    }
    public int getComments(){
        return comments;
    }
    public void setComments(int input){
        this.comments = input;
    }
    public int getDownloads(){
        return downloads;
    }
    public void setDownloads(int input){
        this.downloads = input;
    }
    public String getPageURL(){
        return pageURL;
    }
    public void setPageURL(String input){
        this.pageURL = input;
    }
    public String getPreviewURL(){
        return previewURL;
    }
    public void setPreviewURL(String input){
        this.previewURL = input;
    }
    public String getWebformatURL(){
        return webformatURL;
    }
    public void setWebformatURL(String input){
        this.webformatURL = input;
    }
    public int getImageWidth(){
        return imageWidth;
    }
    public void setImageWidth(int input){
        this.imageWidth = input;
    }
    public int getUserId(){
        return userId;
    }
    public void setUserId(int input){
        this.userId = input;
    }
    public String getUser(){
        return user;
    }
    public void setUser(String input){
        this.user = input;
    }
    public String getType(){
        return type;
    }
    public void setType(String input){
        this.type = input;
    }
    public int getId(){
        return id;
    }
    public void setId(int input){
        this.id = input;
    }
    public String getUserImageURL(){
        return userImageURL;
    }
    public void setUserImageURL(String input){
        this.userImageURL = input;
    }
    public int getImageHeight(){
        return imageHeight;
    }
    public void setImageHeight(int input){
        this.imageHeight = input;
    }

    public String getThumbnail() {
        return previewURL;
    }

    public String getImage() {
        return webformatURL;
    }

    public String getNetwork() {
        return SharedPhotoSourceStrings.SOCIAL_ARRAY_NETWORK[SOURCE_ID];
    }

    public String getDate() {
        return "N/A";
    }

    public String getLocation() {
        return tags;
    }
}