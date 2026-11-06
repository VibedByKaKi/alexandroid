package com.amazon.alexa.client.alexaservice.base.metrics.client;

import android.provider.BaseColumns;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ClientMetricsContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ClientMetricsEntry implements BaseColumns {
        public static final String COLUMN_NAME_API_CALL_ID = "apiCallId";
        public static final String COLUMN_NAME_CLIENT_PACKAGE_NAME = "clientPackageName";
        public static final String COLUMN_NAME_DIALOG_TURN_ID = "dialogTurnId";
        public static final String COLUMN_NAME_EVENT_ID = "eventId";
        public static final String COLUMN_NAME_EVENT_NAME = "eventName";
        public static final String COLUMN_NAME_EVENT_VALUE = "eventValue";
        public static final String COLUMN_NAME_INVOCATION_TYPE = "invocationType";
        public static final String COLUMN_NAME_LATENCY = "latency";
        public static final String COLUMN_NAME_SOFTWARE_VERSION = "softwareVersion";
        public static final String COLUMN_NAME_SOURCE_PACKAGE_NAME = "sourcePackageName";
        public static final String COLUMN_NAME_TIMESTAMP = "eventTimestamp";
        public static final String GENERIC_METRICS_TABLE_NAME = "genericClientMetrics";
        public static final String TEXT_INTERACTION_METRICS_TABLE_NAME = "textClientMetrics";
        public static final String VOICE_INTERACTION_METRICS_TABLE_NAME = "clientMetrics";
    }

    private ClientMetricsContract() {
    }
}
