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
public abstract class CapabilitiesApiProcessor {
    private static final String TAG = "CapabilitiesApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.CapabilitiesApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CapabilitiesApiMessageType;

        static {
            int[] iArr = new int[CapabilitiesApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CapabilitiesApiMessageType = iArr;
            try {
                iArr[CapabilitiesApiMessageType.SEND_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CapabilitiesApiMessageType[CapabilitiesApiMessageType.SEND_EVENT_WITH_RESULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CapabilitiesApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 10)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        CapabilitiesApiMessageType fromOrdinal = CapabilitiesApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$CapabilitiesApiMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                return false;
            }
            if (data == null) {
                Log.w(TAG, "CapabilitiesApi message has no data for sendEventWithResult");
                return false;
            }
            onSendEventWithResult(data.getBundle(CapabilitiesApiArgumentType.EVENT_BUNDLE.name()), data.getString(CapabilitiesApiArgumentType.REQUEST_ID.name()));
        } else {
            if (data == null) {
                Log.w(TAG, "CapabilitiesApi message has no data for sendEvent");
                return false;
            }
            onSendEvent(data.getBundle(CapabilitiesApiArgumentType.EVENT_BUNDLE.name()));
        }
        return true;
    }

    public abstract void onSendEvent(Bundle bundle);

    public abstract void onSendEventWithResult(Bundle bundle, String str);
}
