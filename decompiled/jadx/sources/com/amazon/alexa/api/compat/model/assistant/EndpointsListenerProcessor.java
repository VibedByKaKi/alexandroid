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
public abstract class EndpointsListenerProcessor {
    private static final String TAG = "EndpointsListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.EndpointsListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$EndpointsListenerMessageType;

        static {
            int[] iArr = new int[EndpointsListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$EndpointsListenerMessageType = iArr;
            try {
                iArr[EndpointsListenerMessageType.ON_REQUEST_RESULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$EndpointsListenerMessageType[EndpointsListenerMessageType.ON_ENDPOINTS_UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public EndpointsListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 18)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        EndpointsListenerMessageType fromOrdinal = EndpointsListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$EndpointsListenerMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                return false;
            }
            if (data == null) {
                Log.w(TAG, "EndpointsListener message has no data for onEndpointsUpdated");
                return false;
            }
            onEndpointsUpdated(data.getBundle(EndpointsListenerArgumentType.ENDPOINTS_BUNDLE.name()));
        } else {
            if (data == null) {
                Log.w(TAG, "EndpointsListener message has no data for onRequestResult");
                return false;
            }
            onRequestResult(data.getBundle(EndpointsListenerArgumentType.RESULT_BUNDLE.name()));
        }
        return true;
    }

    public abstract void onEndpointsUpdated(Bundle bundle);

    public abstract void onRequestResult(Bundle bundle);
}
