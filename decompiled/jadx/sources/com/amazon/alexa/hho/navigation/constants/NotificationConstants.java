package com.amazon.alexa.hho.navigation.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class NotificationConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Navigation {
        public static final String DISMISS_NOTIFICATION_ACTION = "com.amazon.alexa.hho.navigation.transit.DISMISS_NOTIFICATION";
        public static final String NOTIFICATION_CHANNEL_DESCRIPTION = "Notification channel for Alexa Navigation feature";
        public static final String NOTIFICATION_CHANNEL_ID = "navigation_capability_agent_channel_id";
        public static final String NOTIFICATION_CHANNEL_NAME = "Alexa Navigation";
        public static final int THIRD_PARTY_DEEPLINKING_NOTIFICATION_ID = 1002;
        public static final int TRANSIT_NAVIGATION_NOTIFICATION_ID = 1001;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TransitDeeplinkUri {
        public static final String AUTHORITY = "alexa.amazon.com";
        public static final String PATH = "transit";
        public static final String SCHEME = "https";
        public static final String SESSION_ID_QUERY_PARAM_KEY = "id";
    }
}
