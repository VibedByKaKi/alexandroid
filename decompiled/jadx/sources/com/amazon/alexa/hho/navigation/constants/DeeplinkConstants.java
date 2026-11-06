package com.amazon.alexa.hho.navigation.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class DeeplinkConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GoogleMapsUniversalDeeplink {
        public static final String BASE_URI = "https://www.google.com/maps";

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class GoogleMapsTravelMode {
            public static final String BICYCLING = "bicycling";
            public static final String DRIVING = "driving";
            public static final String TRANSIT = "transit";
            public static final String WALKING = "walking";
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Uri {
            public static final String API_QUERY_PARAM_KEY = "api";
            public static final String API_QUERY_PARAM_VALUE = "1";
            public static final String AUTHORITY = "www.google.com";
            public static final String DESTINATION_COORDINATES_QUERY_PARAM_VALUE_FORMAT = "%f,%f";
            public static final String DESTINATION_QUERY_PARAM_KEY = "destination";
            public static final String DIR_ACTION_NAVIGATE_VALUE = "navigate";
            public static final String DIR_ACTION_QUERY_PARAM_KEY = "dir_action";
            public static final String PATH = "maps/dir/";
            public static final String SCHEME = "https";
            public static final String TRAVEL_MODE_QUERY_PARAM_KEY = "travelmode";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class WazeUniversalDeeplink {
        public static final String BASE_URI = "https://waze.com/ul";

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Uri {
            public static final String ACTION_QUERY_PARAM_KEY = "a";
            public static final String ACTION_STOP_NAVIGATE_VALUE = "stop_navigate";
            public static final String AUTHORITY = "waze.com";
            public static final String COORDINATES_QUERY_PARAM_KEY = "ll";
            public static final String COORDINATES_QUERY_PARAM_VALUE_FORMAT = "%f,%f";
            public static final String NAVIGATE_QUERY_PARAM_KEY = "navigate";
            public static final String NAVIGATE_QUERY_PARAM_VALUE = "yes";
            public static final String PATH = "ul";
            public static final String SCHEME = "https";
        }
    }
}
