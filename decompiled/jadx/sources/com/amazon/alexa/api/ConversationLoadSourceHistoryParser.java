package com.amazon.alexa.api;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.metrics.ConversationLoadSourceStore;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class ConversationLoadSourceHistoryParser {
    private static final String TAG = "ConversationLoadSourceHistoryParser";

    private ConversationLoadSourceHistoryParser() {
    }

    @Nullable
    public static ConversationLoadSourceStore.History parse(@Nullable Bundle bundle) {
        try {
            return new ConversationLoadSourceStore.History((String[]) require(bundle, AlexaServicesArgumentKey.CONVERSATION_LOAD_SOURCES, String[].class), (long[]) require(bundle, AlexaServicesArgumentKey.CONVERSATION_LOAD_SOURCE_ELAPSED_REALTIME_MS, long[].class), ((Long) require(bundle, AlexaServicesArgumentKey.CONVERSATION_LOAD_SOURCE_REVISION, Long.class)).longValue(), ((Integer) require(bundle, AlexaServicesArgumentKey.CONVERSATION_LOAD_SOURCE_SENDER_PID, Integer.class)).intValue(), (String) require(bundle, AlexaServicesArgumentKey.CONVERSATION_LOAD_SOURCE_SENDER_PROCESS_NAME, String.class), ((Long) require(bundle, AlexaServicesArgumentKey.CONVERSATION_LOAD_SOURCE_SENDER_START_ELAPSED_REALTIME_MS, Long.class)).longValue());
        } catch (RuntimeException e) {
            Log.w(TAG, "Rejected an unreadable conversation load source history: ".concat(e.getClass().getSimpleName()));
            return null;
        }
    }

    private static <T> T require(Bundle bundle, AlexaServicesArgumentKey alexaServicesArgumentKey, Class<T> cls) {
        Object obj = bundle.get(alexaServicesArgumentKey.name());
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3(alexaServicesArgumentKey.name(), "Missing or mistyped ");
        return null;
    }
}
