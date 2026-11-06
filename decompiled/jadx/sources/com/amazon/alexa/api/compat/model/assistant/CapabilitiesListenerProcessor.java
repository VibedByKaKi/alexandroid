package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class CapabilitiesListenerProcessor {
    private static final String TAG = "CapabilitiesListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.CapabilitiesListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CapabilitiesListenerMessageType;

        static {
            int[] iArr = new int[CapabilitiesListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CapabilitiesListenerMessageType = iArr;
            try {
                iArr[CapabilitiesListenerMessageType.ON_SEND_EVENT_RESULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public CapabilitiesListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 11)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        CapabilitiesListenerMessageType fromOrdinal = CapabilitiesListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        if (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$CapabilitiesListenerMessageType[fromOrdinal.ordinal()] != 1) {
            Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
            return false;
        }
        if (data == null) {
            Log.w(TAG, "CapabilitiesListener message has no data for onSendEventResult");
            return false;
        }
        onSendEventResult(data.getBundle(CapabilitiesListenerArgumentType.RESULT_BUNDLE.name()));
        return true;
    }

    public abstract void onSendEventResult(Bundle bundle);
}
