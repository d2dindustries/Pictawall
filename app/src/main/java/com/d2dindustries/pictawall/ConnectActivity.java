package com.d2dindustries.pictawall;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import com.d2dindustries.pictawall.utils.SharedPreferenceManager;

/**
 * Manages selecting a Photo Source API.
 * Created by l1ttl_000 on 1/22/2017.
 */
public class ConnectActivity extends AppCompatActivity implements View.OnClickListener{
    private SharedPreferenceManager sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        sharedPref = new SharedPreferenceManager(ConnectActivity.this);
        //TODO: Show enabled Photo Source state by highlighting the buttons

        ImageButton buttonPixabay = (ImageButton) findViewById(R.id.buttonPixabay);
        ImageButton buttonJSON = (ImageButton) findViewById(R.id.buttonJSON);
        ImageButton buttonFlickr = (ImageButton) findViewById(R.id.buttonFlickr);
        ImageButton buttonDribbble = (ImageButton) findViewById(R.id.buttonDribbble);
        ImageButton buttonGithub = (ImageButton) findViewById(R.id.buttonGithub);
        ImageButton buttonFacebook = (ImageButton) findViewById(R.id.buttonFacebook);
        ImageButton buttonSmugmug = (ImageButton) findViewById(R.id.buttonSmugmug);
        ImageButton buttonGoogle = (ImageButton) findViewById(R.id.buttonGoogle);
        ImageButton buttonInstagram = (ImageButton) findViewById(R.id.buttonInstagram);
        buttonPixabay.setOnClickListener(this);
        buttonJSON.setOnClickListener(this);
        buttonFlickr.setOnClickListener(this);
        buttonDribbble.setOnClickListener(this);
        buttonGithub.setOnClickListener(this);
        buttonFacebook.setOnClickListener(this);
        buttonSmugmug.setOnClickListener(this);
        buttonGoogle.setOnClickListener(this);
        buttonInstagram.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabClose);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavUtils.navigateUpFromSameTask(ConnectActivity.this);
                //TODO: Save Photo Source choice and Pass to Main Activity
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

    @Override
    public void onClick(View view) {
        int sourceId = 0;
        switch (view.getId()) {
            case R.id.buttonPixabay:
                sourceId = 0;
                break;
            case R.id.buttonJSON:
                sourceId = 1;
                break;
            case R.id.buttonFlickr:
                sourceId = 2;
                break;
            case R.id.buttonDribbble:
                sourceId = 3;
                break;
            case R.id.buttonGithub:
                sourceId = 4;
                break;
            case R.id.buttonFacebook:
                sourceId = 5;
                break;
            case R.id.buttonSmugmug:
                sourceId = 6;
                break;
            case R.id.buttonGoogle:
                sourceId = 7;
                break;
            case R.id.buttonInstagram:
                sourceId = 8;
                break;

            default:
                break;
        }
        sharedPref.setChosenSourceId(sourceId);//Set the id of currently showing Photo API
        NavUtils.navigateUpFromSameTask(ConnectActivity.this);
    }
}
