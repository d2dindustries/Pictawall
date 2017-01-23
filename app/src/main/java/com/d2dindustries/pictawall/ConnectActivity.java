package com.d2dindustries.pictawall;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.d2dindustries.pictawall.utils.SharedPhotoSourceStrings;
import com.d2dindustries.pictawall.utils.SharedPreferenceManager;

public class ConnectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        //TODO: Read shared pref and show enabled photo sources by highlighting the buttons

        ImageButton buttonPixabay = (ImageButton) findViewById(R.id.buttonPixabay);
        buttonPixabay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferenceManager s = new SharedPreferenceManager(ConnectActivity.this);
                s.setToolbarColor(R.color.socialColorPixabay);
                s.setToolbarNetwork(getString(R.string.social_pixabay));
                s.setChosenSourceId(1);//TODO: 1 is pixabays id, move to values
                SharedPhotoSourceStrings.SOCIAL_GENERIC_SOURCE = 1;
                SharedPhotoSourceStrings.SOCIAL_GENERIC_BASE = SharedPhotoSourceStrings.SOCIAL_ARRAY_BASE[1];
                SharedPhotoSourceStrings.SOCIAL_GENERIC_GET = SharedPhotoSourceStrings.SOCIAL_ARRAY_GET[1];

                NavUtils.navigateUpFromSameTask(ConnectActivity.this);
            }
        });

        ImageButton buttonDribble = (ImageButton) findViewById(R.id.buttonDribble);
        buttonDribble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferenceManager s = new SharedPreferenceManager(ConnectActivity.this);
                s.setToolbarColor(R.color.socialColorDribbble);
                s.setToolbarNetwork(getString(R.string.social_dribbble));
                s.setChosenSourceId(0);//TODO: move to values
                SharedPhotoSourceStrings.SOCIAL_GENERIC_SOURCE = 0;
                SharedPhotoSourceStrings.SOCIAL_GENERIC_BASE = SharedPhotoSourceStrings.SOCIAL_ARRAY_BASE[0];
                SharedPhotoSourceStrings.SOCIAL_GENERIC_GET = SharedPhotoSourceStrings.SOCIAL_ARRAY_GET[0];

                NavUtils.navigateUpFromSameTask(ConnectActivity.this);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabClose);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavUtils.navigateUpFromSameTask(ConnectActivity.this);
                //TODO: Save Photo Source Choice and Pass to Main Activity
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
