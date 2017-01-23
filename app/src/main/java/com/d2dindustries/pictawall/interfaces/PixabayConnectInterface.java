package com.d2dindustries.pictawall.interfaces;

import com.d2dindustries.pictawall.models.PixabayPhotoWrapper;
import com.d2dindustries.pictawall.utils.SharedPhotoSourceStrings;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * A Pixabay specific Retrofit interface that GETs a JSON Object.
 * It also contains future code for searching specific images.
 * Created by l1ttl_000 on 1/22/2017.
 */
public interface PixabayConnectInterface {
    @GET(SharedPhotoSourceStrings.SOCIAL_PIXABAY_GET)
    void getStreams(Callback<PixabayPhotoWrapper> mCallback);

    //TODO: Allow for queries to search for specific images
    @GET(SharedPhotoSourceStrings.SOCIAL_PIXABAY_GET)
    void search(@Query("username") String username,
                    @Query("key") String key,
                    @Query("image_type") String imageType,
                    @Query("q") String query,
                    @Query("page") int page,
                    @Query("per_page") int perPage,
                    Callback<PixabayPhotoWrapper> callback);
}
