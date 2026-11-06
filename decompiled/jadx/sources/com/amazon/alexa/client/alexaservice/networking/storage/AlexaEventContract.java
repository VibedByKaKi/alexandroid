package com.amazon.alexa.client.alexaservice.networking.storage;

import android.provider.BaseColumns;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class AlexaEventContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AlexaEventEntry implements BaseColumns {
        static final String ALEXA_EVENT_TABLE_NAME = "alexaEvents";
        static final String COLUMN_NAME_EVENT_HEADER = "eventHeader";
        static final String COLUMN_NAME_EVENT_PAYLOAD = "eventPayload";
        static final String COLUMN_NAME_REQUEST_ID = "requestId";
    }

    private AlexaEventContract() {
    }
}
