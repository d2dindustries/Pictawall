package com.d2dindustries.pictawall.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.d2dindustries.pictawall.R;

/**
 * Created by l1ttl_000 on 1/21/2017.
 */

public class SharedPreferenceManager {
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    private static final int PREF_SOCIAL_GENERIC_SOURCE = 0;
    private static final String PREF_NAME = "pictawall-prefs";
    private static final String PREF_SHOW_WELCOME_SCREEN = "showWelcomeScreen";
    private static final String PREF_TOOLBAR_NETWORK = "Basic Source";
    private static final int PREF_TOOLBAR_COLOR = R.color.colorPrimary;

    public SharedPreferenceManager(Context contextVal) {
        int PRIVATE_MODE = 0;
        prefs = contextVal.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = prefs.edit();
    }

    public void setShowWelcomeScreen(boolean showWelcome) {
        editor.putBoolean(PREF_SHOW_WELCOME_SCREEN, showWelcome);
        editor.apply();
    }

    public boolean getShowWelcomeScreen() {
        return prefs.getBoolean(PREF_SHOW_WELCOME_SCREEN, true);
    }

    public void setChosenSourceId(int sourceID) {
        editor.putInt(""+PREF_SOCIAL_GENERIC_SOURCE, sourceID);
        editor.apply();
    }

    public int getChosenSourceId() {
        return prefs.getInt(""+PREF_SOCIAL_GENERIC_SOURCE, 0);
    }

    public void setToolbarNetwork(String networkVal) {
        editor.putString(PREF_TOOLBAR_NETWORK, networkVal);
        editor.apply();
    }

    public String getToolbarNetwork() {
        return prefs.getString(PREF_TOOLBAR_NETWORK, "Basic Source");
    }

    public void setToolbarColor(int networkVal) {
        editor.putInt(""+PREF_TOOLBAR_COLOR, networkVal);
        editor.apply();
    }

    public int getToolbarColor() {
        return prefs.getInt(""+PREF_TOOLBAR_COLOR, R.color.colorPrimary);
    }

}