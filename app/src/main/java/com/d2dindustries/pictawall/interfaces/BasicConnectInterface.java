package com.d2dindustries.pictawall.interfaces;

import com.d2dindustries.pictawall.models.BasicPhotoSource;
import com.d2dindustries.pictawall.utils.SharedPhotoSourceStrings;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * A Basic Retrofit interface that GETs a JSON list.
 * Created by l1ttl_000 on 1/22/2017.
 */
public interface BasicConnectInterface {
    @GET(SharedPhotoSourceStrings.SOCIAL_BASIC_GET)
    Call<List<BasicPhotoSource>> getStreams();
}
