package com.d2dindustries.pictawall.utils;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Simple ServiceGenerator Template.
 * Courtesy of https://futurestud.io/
 * Created by l1ttl_000 on 1/23/2017.
 */
public class RetrofitServiceGenerator {
    private static OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder();

    public static <S> S createService(String baseURL, Class<S> serviceClass) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create());
        builder.client(httpClient.build());
        Retrofit retrofit = builder.build();

        return retrofit.create(serviceClass);
    }
}