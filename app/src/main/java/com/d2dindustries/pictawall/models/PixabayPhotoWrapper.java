package com.d2dindustries.pictawall.models;

import java.util.List;

/**
 * Created by l1ttl_000 on 1/22/2017.
 */
public class PixabayPhotoWrapper{
    private int totalHits;
    private List<PixabayPhotoSource> hits;
    private int total;

    public int getTotalHits(){
        return totalHits;
    }
    public void setTotalHits(int input){
        this.totalHits = input;
    }
    public List<PixabayPhotoSource> getHits(){
        return hits;
    }
    public void setHits(List<PixabayPhotoSource> input){
        this.hits = input;
    }
    public int getTotal(){
        return total;
    }
    public void setTotal(int input){
        this.total = input;
    }
}
