package com.d2dindustries.pictawall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Manages populating the Gallery Details.
 * Created by l1ttl_000 on 1/21/2017.
 */
public class GalleryGridDetailsActivity extends AppCompatActivity {
    public static String EXTRA_PHOTO = "extra_photo";
    public static String EXTRA_DATE = "extra_date";
    public static String EXTRA_LOC = "extra_location";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_details);
        ImageView mainImageView = (ImageView) findViewById(R.id.imageViewMainPhoto);
        ImageView mainDateImage = (ImageView) findViewById(R.id.imageViewDate);
        ImageView mainLocationImage = (ImageView) findViewById(R.id.imageViewLocation);
        TextView mainDateTitle = (TextView) findViewById(R.id.textViewDateTitle);
        TextView mainLocationTitle = (TextView) findViewById(R.id.textViewLocationTitle);
        TextView mainDate = (TextView) findViewById(R.id.textViewDate);
        TextView mainLocation = (TextView) findViewById(R.id.textViewLocation);

        if(getIntent() != null && getIntent().getExtras() != null){
            if(getIntent().getExtras().containsKey(EXTRA_PHOTO)){
                Glide.with(this).load(getIntent().getExtras().getString(EXTRA_PHOTO)).placeholder(R.drawable.thumbnail_placeholder).animate(R.anim.fade_in).into(mainImageView);
            }
            if(getIntent().getExtras().containsKey(EXTRA_DATE)){
                mainDate.setText(getIntent().getExtras().getString(EXTRA_DATE));
            }else{
                mainDateImage.setVisibility(View.INVISIBLE);
                mainDateTitle.setVisibility(View.INVISIBLE);
            }
            if(getIntent().getExtras().containsKey(EXTRA_LOC)){
                mainLocation.setText(getIntent().getExtras().getString(EXTRA_LOC));
            }else{
                mainLocationImage.setVisibility(View.INVISIBLE);
                mainLocationTitle.setVisibility(View.INVISIBLE);
            }
        }
    }
}
