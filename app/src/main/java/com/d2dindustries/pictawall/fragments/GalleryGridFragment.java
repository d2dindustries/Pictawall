package com.d2dindustries.pictawall.fragments;

import com.d2dindustries.pictawall.GalleryGridDetailsActivity;
import com.d2dindustries.pictawall.R;
import com.d2dindustries.pictawall.adapters.GalleryPhotoAdapter;
import com.d2dindustries.pictawall.interfaces.GenericConnectInterface;
import com.d2dindustries.pictawall.models.GenericPhotoSource;
import com.d2dindustries.pictawall.models.PixabayPhotoSource;
import com.d2dindustries.pictawall.models.PixabayPhotoWrapper;
import com.d2dindustries.pictawall.utils.RetrofitServiceGenerator;
import com.d2dindustries.pictawall.utils.SharedPhotoSourceStrings;
import com.d2dindustries.pictawall.utils.SharedPreferenceManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * The Main GalleryGridFragment maintains populating
 * images and content into the photo wall.
 * Created by l1ttl_000 on 1/22/2017.
 */
public class GalleryGridFragment extends Fragment implements AdapterView.OnItemClickListener {
    private GalleryPhotoAdapter mAdapter;
    private GridView mGalleryGridView;

    public static GalleryGridFragment getInstance(){
        return new GalleryGridFragment();
    }

    public GalleryGridFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.gallery_grid_view, parent, false);
    }

    @Override
    public void onViewCreated(View v, @Nullable Bundle savedInstanceState){
        super.onViewCreated(v, savedInstanceState);
        mGalleryGridView = (GridView) v.findViewById(R.id.galleryGrid);
        mGalleryGridView.setOnItemClickListener(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAdapter = new GalleryPhotoAdapter(getActivity(), R.layout.gallery_thumbnail);
        mGalleryGridView.setAdapter(mAdapter);

        //TODO: Allow for multiple networks to be shown at once.
        //Future feature could use enqueue multiple non-blocking GET requests.
        //Combining the results would allow for a photo wall that shows content from multiple photo sources.
        //The generic mutable photo model could be built from different source models and then displayed.

        //Note: List is reloaded when switching back to MainActivity. Consider the
        //addition of a refresh button and saving the state between transitions.

        final SharedPreferenceManager sPref = new SharedPreferenceManager(getContext());
        final int sourceId = sPref.getChosenSourceId();
        if(sourceId < 2){//TODO: Remove this as we add BASE/GET URLS to SharedPhotoSourceStrings
            GenericConnectInterface mClient = RetrofitServiceGenerator.createService(
                    SharedPhotoSourceStrings.SOCIAL_ARRAY_BASE[sourceId], GenericConnectInterface.class);
            mClient.getStreams(SharedPhotoSourceStrings.SOCIAL_ARRAY_GET[sourceId]).enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    if (response.isSuccessful()) {
                        Log.d("PhotoSuccess", "Successfully retrieved photos.");

                        //TODO: Combine into a seperate function to reduce repeated code.
                        Type respTypeCur;
                        try {
                            if (sourceId == 0) {
                                respTypeCur = new TypeToken<PixabayPhotoWrapper>() {
                                }.getType();
                                PixabayPhotoWrapper outerArray = new Gson().fromJson(response.body().string(), respTypeCur);
                                for (PixabayPhotoSource p : outerArray.getHits()) {
                                    GenericPhotoSource g = new GenericPhotoSource(p.getThumbnail(), p.getImage(), p.getNetwork(),p.getDate(),p.getLocation());
                                    mAdapter.add(g);
                                }
                            } else {
                                respTypeCur = new TypeToken<List<GenericPhotoSource>>() {
                                }.getType();
                                List<GenericPhotoSource> photoList = new Gson().fromJson(response.body().string(), respTypeCur);
                                for (GenericPhotoSource photo : photoList) {
                                    Log.d("photo", photo.getThumbnail());
                                    mAdapter.add(photo);
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        mAdapter.notifyDataSetChanged();
                    } else {
                        Log.e("PhotoFailure", "Failed to retrieve photos. Check BASE_URL & GET_URL. " + response.raw());
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    Log.e("PhotoFailure", "Failed to reach the server.");
                }
            });
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
        //Shows a detailed photo view when a thumbnail is clicked
        GenericPhotoSource gPhotoSource = (GenericPhotoSource) adapterView.getItemAtPosition(pos);
        Intent intent = new Intent(getActivity(), GalleryGridDetailsActivity.class);
        intent.putExtra(GalleryGridDetailsActivity.EXTRA_PHOTO, gPhotoSource.getImage());
        intent.putExtra(GalleryGridDetailsActivity.EXTRA_DATE, gPhotoSource.getDate());
        intent.putExtra(GalleryGridDetailsActivity.EXTRA_LOC, gPhotoSource.getLocation());
        startActivity(intent);
    }
}
