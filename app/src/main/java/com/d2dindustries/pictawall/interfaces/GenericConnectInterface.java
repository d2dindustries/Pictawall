package com.d2dindustries.pictawall.interfaces;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * A Generic Retrofit interface that GETs a JSON list,
 * but does so by taking in the GET URL as a parameter.
 * Created by l1ttl_000 on 1/22/2017.
 */
public interface GenericConnectInterface {
//    @GET
//    void getStreams(Callback<List<BasicPhotoSource>> mCallback);

    @GET
    Call<ResponseBody> getStreams(@Url String getURL);
}
