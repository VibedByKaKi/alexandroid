package com.amazon.alexa.hho.metrics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class HHOMetricsConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Component {
        public static final String NAVIGATION_CAPABILITY_AGENT_CLASSIC_3P_DEEPLINK = "NAVIGATION_CAPABILITY_AGENT_CLASSIC_3P_DEEPLINK";
        public static final String NAVIGATION_CAPABILITY_AGENT_TRANSIT_1P_NAVIGATION = "NAVIGATION_CAPABILITY_AGENT_TRANSIT_1P_NAVIGATION";
        public static final String NAVIGATION_CAPABILITY_AGENT_TRANSIT_3P_DEEPLINK = "NAVIGATION_CAPABILITY_AGENT_TRANSIT_3P_DEEPLINK";
        public static final String STICKY_NOTES = "STICKY_NOTES";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Error {
        public static final String CANCEL_NAVIGATION_ERROR = "CANCEL_NAVIGATION_ERROR";
        public static final String LOCATION_TRACKING_RESUBSCRIPTION_FAILURE = "LOCATION_TRACKING_RESUBSCRIPTION_FAILURE";
        public static final String NOTIFICATION_CENTER_ERROR = "NOTIFICATION_CENTER_ERROR";
        public static final String SET_DESTINATION_ERROR = "SET_DESTINATION_ERROR";
        public static final String START_FOREGROUND_SERVICE_ERROR = "START_FOREGROUND_SERVICE_ERROR";
        public static final String TRANSIT_SERVICE_ERROR = "TRANSIT_SERVICE_ERROR";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Event {
        public static final String CACHE_EVICTED = "CACHE_EVICTED";
        public static final String CANCEL_NAVIGATION = "CANCEL_NAVIGATION";
        public static final String CANCEL_NAVIGATION_LAST_LAUNCHED_APP_MISSING = "CANCEL_NAVIGATION_LAST_LAUNCHED_APP_MISSING";
        public static final String CLEAN_UP_MEDIA = "CLEAN_UP_MEDIA";
        public static final String DEEPLINK_NOTIFICATION_BLOCKED = "DEEPLINK_NOTIFICATION_BLOCKED";
        public static final String EXCEPTION = "EXCEPTION";
        public static final String GET_MEDIA = "GET_MEDIA";
        public static final String GET_MEDIA_FAILURE = "GET_MEDIA_FAILURE";
        public static final String GET_MEDIA_SUCCESS = "GET_MEDIA_SUCCESS";
        public static final String GET_NAVIGATION_SESSION = "GET_NAVIGATION_SESSION";
        public static final String GET_THUMBNAIL = "GET_THUMBNAIL";
        public static final String GET_VIDEO = "GET_VIDEO";
        public static final String LAUNCH_DEEPLINK_DIRECT = "LAUNCH_DEEPLINK_DIRECT";
        public static final String LAUNCH_DEEPLINK_PROVIDER_GOOGLE_MAPS = "LAUNCH_DEEPLINK_PROVIDER_GOOGLE_MAPS";
        public static final String LAUNCH_DEEPLINK_PROVIDER_WAZE = "LAUNCH_DEEPLINK_PROVIDER_WAZE";
        public static final String LAUNCH_DEEPLINK_TRANSPORT_MODE_BIKING = "LAUNCH_DEEPLINK_TRANSPORT_MODE_BIKING";
        public static final String LAUNCH_DEEPLINK_TRANSPORT_MODE_DRIVING = "LAUNCH_DEEPLINK_TRANSPORT_MODE_DRIVING";
        public static final String LAUNCH_DEEPLINK_TRANSPORT_MODE_TRANSIT = "LAUNCH_DEEPLINK_TRANSPORT_MODE_TRANSIT";
        public static final String LAUNCH_DEEPLINK_TRANSPORT_MODE_UNKNOWN = "LAUNCH_DEEPLINK_TRANSPORT_MODE_UNKNOWN";
        public static final String LAUNCH_DEEPLINK_TRANSPORT_MODE_WALKING = "LAUNCH_DEEPLINK_TRANSPORT_MODE_WALKING";
        public static final String LAUNCH_DEEPLINK_VIA_LOCK_SCREEN_NOTIFICATION = "LAUNCH_DEEPLINK_VIA_LOCK_SCREEN_NOTIFICATION";
        public static final String NAVIGATION_SESSION_METRIC_EVENT = "NAVIGATION_SESSION_METRIC_EVENT";
        public static final String OPEN_NAVIGATION_URL_FAILURE = "OPEN_NAVIGATION_URL_FAILURE";
        public static final String OPEN_NAVIGATION_URL_SUCCESS = "OPEN_NAVIGATION_URL_SUCCESS";
        public static final String PREFERRED_MAP_PROVIDER_GOOGLE_MAPS = "PREFERRED_MAP_PROVIDER_GOOGLE_MAPS";
        public static final String PREFERRED_MAP_PROVIDER_WAZE = "PREFERRED_MAP_PROVIDER_WAZE";
        public static final String PREFERRED_NAV_APP_NOT_INSTALLED = "PREFERRED_NAV_APP_NOT_INSTALLED";
        public static final String PREFERRED_NAV_APP_SETTING_UNAVAILABLE = "PREFERRED_NAV_APP_SETTING_UNAVAILABLE";
        public static final String PREFETCH_MEDIA = "PREFETCH_MEDIA";
        public static final String REMOVE_ALL_MEDIA = "REMOVE_ALL_MEDIA";
        public static final String REMOVE_MEDIA = "REMOVE_MEDIA";
        public static final String REROUTE_NAVIGATION_SESSION = "REROUTE_NAVIGATION_SESSION";
        public static final String SET_DESTINATION = "SET_DESTINATION";
        public static final String UPDATE_NAVIGATION_SESSION = "UPDATE_NAVIGATION_SESSION";
        public static final String WAZE_FALLBACK_TO_GOOGLE_MAPS = "WAZE_FALLBACK_TO_GOOGLE_MAPS";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Subcomponent {
        public static final String DEEPLINKING = "DEEPLINKING";
        public static final String DOWNLOADER = "DOWNLOADER";
        public static final String NAVIGATION_NOTIFICATION_MANAGER = "NAVIGATION_NOTIFICATION_MANAGER";
        public static final String NAVIGATION_SESSION_METRICS = "NAVIGATION_SESSION_METRICS";
        public static final String PROVIDER = "PROVIDER";
        public static final String TRANSIT_SERVICE_CLIENT = "TRANSIT_SERVICE_CLIENT";
    }
}
