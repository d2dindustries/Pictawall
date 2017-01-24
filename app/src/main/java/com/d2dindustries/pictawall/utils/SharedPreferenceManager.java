package com.d2dindustries.pictawall.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Deals with managing and handling all saved data.
 * Created by l1ttl_000 on 1/21/2017.
 */
public class SharedPreferenceManager {
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    private final int PREF_SOCIAL_GENERIC_SOURCE = 0;
    private final String PREF_NAME = "pictawall-prefs";
    private final String PREF_SHOW_WELCOME_SCREEN = "showWelcomeScreen";

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
        return prefs.getBoolean(PREF_SHOW_WELCOME_SCREEN, false);
    }

    public void setChosenSourceId(int sourceID) {
        editor.putInt(""+PREF_SOCIAL_GENERIC_SOURCE, sourceID);
        editor.apply();
    }

    public int getChosenSourceId() {
        return prefs.getInt(""+PREF_SOCIAL_GENERIC_SOURCE, 0);
    }
}