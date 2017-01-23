package com.d2dindustries.pictawall.utils;

/**
 * Different Photo Source urls and their different GET requests
 * Created by l1ttl_000 on 1/22/2017.
 */
public class SharedPhotoSourceStrings {

    //Photo source base url and get request currently being shown
    public static int SOCIAL_GENERIC_SOURCE = 1;
    public static String SOCIAL_GENERIC_BASE = "https://pixabay.com/";
    public static String SOCIAL_GENERIC_GET = "api/?key=4330854-a347f45f3a5eeb8e9f9024c78&amp;q=yellow+flowers&amp;image_type=photo";

    //Photo source base urls and their respective get requests
    public static final String SOCIAL_BASIC_BASE = "https://gist.githubusercontent.com/PaulTR/dabbbd590c791a33f6e9/raw/deaf9ebbd69dedf5253ad02b09565138260fbe69/";
    public static final String SOCIAL_BASIC_GET = "gallery.json";
    public static final String SOCIAL_PIXABAY_BASE = "https://pixabay.com/";
    public static final String SOCIAL_PIXABAY_GET = "api/?key=4330854-a347f45f3a5eeb8e9f9024c78&amp;q=yellow+flowers&amp;image_type=photo";

    public static final String[] SOCIAL_ARRAY_BASE = {SOCIAL_BASIC_BASE,SOCIAL_PIXABAY_BASE};
    public static final String[] SOCIAL_ARRAY_GET = {SOCIAL_BASIC_GET,SOCIAL_PIXABAY_GET};
}
