package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class SettingsMessageProcessor extends MessageProcessor<SettingsMessageType> {
    private static final String TAG = "SettingsMessageProcessor";
    private final SettingsListener listener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.SettingsMessageProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$SettingsMessageType;

        static {
            int[] iArr = new int[SettingsMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$SettingsMessageType = iArr;
            try {
                iArr[SettingsMessageType.ON_SETTINGS_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private SettingsMessageProcessor(SettingsListener settingsListener) {
        this.listener = settingsListener;
    }

    public static SettingsMessageProcessor create(SettingsListener settingsListener) {
        Preconditions.notNull(settingsListener, "Listener passed for creation is null!");
        return new SettingsMessageProcessor(settingsListener);
    }

    private static Map<String, String> readSettings(Bundle bundle) {
        Serializable serializable = bundle.getSerializable(SettingsArgumentKey.SETTINGS_MAP.name());
        if (serializable instanceof HashMap) {
            return Collections.unmodifiableMap((HashMap) serializable);
        }
        Log.w(TAG, "Settings payload missing or not a HashMap; delivering empty map. Got: ".concat(serializable == null ? "null" : serializable.getClass().getSimpleName()));
        return Collections.EMPTY_MAP;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public SettingsMessageType getMessageType(Message message) {
        try {
            return SettingsMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Unrecognized message type: ", e);
            return SettingsMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(SettingsMessageType settingsMessageType, Bundle bundle, @Nullable Messenger messenger) {
        if (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$SettingsMessageType[settingsMessageType.ordinal()] == 1) {
            this.listener.onSettingsUpdated(readSettings(bundle));
            return;
        }
        Log.w(TAG, "Unsupported message: " + settingsMessageType);
    }
}
