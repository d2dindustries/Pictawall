package com.d2dindustries.pictawall.utils;

import com.d2dindustries.pictawall.R;

/**
 * Various Photo Source URLs and their respective GET requests.
 * Created by l1ttl_000 on 1/22/2017.
 */
public class SharedPhotoSourceStrings {
    //Define Photo Source Base URLs and their respective GET requests
    private static final String SOCIAL_PIXABAY_BASE = "https://pixabay.com/";
    private static final String SOCIAL_PIXABAY_GET = "api/?key=4330854-a347f45f3a5eeb8e9f9024c78&q=dawn&per_page=100&image_type=photo&pretty=true";
    private static final String SOCIAL_JSON_BASE = "https://gist.githubusercontent.com/PaulTR/dabbbd590c791a33f6e9/raw/deaf9ebbd69dedf5253ad02b09565138260fbe69/";
    private static final String SOCIAL_JSON_GET = "gallery.json";
    private static final String SOCIAL_FLICKR_BASE = "";
    private static final String SOCIAL_FLICKR_GET = "";
    private static final String SOCIAL_DRIBBBLE_BASE = "";
    private static final String SOCIAL_DRIBBBLE_GET = "";
    private static final String SOCIAL_GITHUB_BASE = "";
    private static final String SOCIAL_GITHUB_GET = "";
    private static final String SOCIAL_FACEBOOK_BASE = "";
    private static final String SOCIAL_FACEBOOK_GET = "";
    private static final String SOCIAL_SMUGMUG_BASE = "";
    private static final String SOCIAL_SMUGMUG_GET = "";
    private static final String SOCIAL_GOOGLE_BASE = "";
    private static final String SOCIAL_GOOGLE_GET = "";
    private static final String SOCIAL_INSTAGRAM_BASE = "";
    private static final String SOCIAL_INSTAGRAM_GET = "";

    //References to Photo API characteristics and traits
    public static final String[] SOCIAL_ARRAY_NETWORK = {"Pixabay","Basic JSON","Flickr","Dribbble","GitHub","Facebook","SmugMug","Google Photos","Instagram"};
    public static final int[] SOCIAL_ARRAY_COLOR = {R.color.colorPixabay,R.color.colorJSON,R.color.colorFlickr,R.color.colorDribbble,R.color.colorGithub,R.color.colorFacebook,R.color.colorSmugmug,R.color.colorGoogle,R.color.colorInstagram};
    public static final String[] SOCIAL_ARRAY_BASE = {SOCIAL_PIXABAY_BASE,SOCIAL_JSON_BASE,SOCIAL_FLICKR_BASE,SOCIAL_DRIBBBLE_BASE,SOCIAL_GITHUB_BASE,SOCIAL_FACEBOOK_BASE,SOCIAL_SMUGMUG_BASE,SOCIAL_GOOGLE_BASE,SOCIAL_INSTAGRAM_BASE};
    public static final String[] SOCIAL_ARRAY_GET = {SOCIAL_PIXABAY_GET,SOCIAL_JSON_GET,SOCIAL_FLICKR_GET,SOCIAL_DRIBBBLE_GET,SOCIAL_GITHUB_GET,SOCIAL_FACEBOOK_GET,SOCIAL_SMUGMUG_GET,SOCIAL_GOOGLE_GET,SOCIAL_INSTAGRAM_GET};
}
