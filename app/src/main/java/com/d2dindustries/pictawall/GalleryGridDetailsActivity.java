package com.d2dindustries.pictawall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GalleryGridDetailsActivity extends AppCompatActivity {
    public static String EXTRA_PHOTO = "extra_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_details);
        ImageView mainImageView = (ImageView) findViewById(R.id.imageViewMainPhoto);

        if(getIntent() != null && getIntent().getExtras() != null){
            if(getIntent().getExtras().containsKey(EXTRA_PHOTO)){
                Glide.with(this).load(getIntent().getExtras().getString(EXTRA_PHOTO)).placeholder(R.drawable.thumbnail_placeholder).into(mainImageView);
            }
        }
    }
}
