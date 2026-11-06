package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.mapbox.maps.renderer.MapboxRenderThread$$ExternalSyntheticLambda2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class WakeWordStateListenerProcessor {
    private static final String TAG = "WakeWordStateListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.WakeWordStateListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$WakeWordStateListenerMessageType;

        static {
            int[] iArr = new int[WakeWordStateListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$WakeWordStateListenerMessageType = iArr;
            try {
                iArr[WakeWordStateListenerMessageType.ON_WAKE_WORD_STATE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public WakeWordStateListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new MapboxRenderThread$$ExternalSyntheticLambda2(this, 5)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        WakeWordStateListenerMessageType fromOrdinal = WakeWordStateListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        if (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$WakeWordStateListenerMessageType[fromOrdinal.ordinal()] != 1) {
            Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
            return false;
        }
        if (data == null) {
            Log.w(TAG, "WakeWordStateListener message has no data for onWakeWordStateChanged");
            return false;
        }
        onWakeWordStateChanged(data.getBoolean(WakeWordStateListenerArgumentType.ENABLED.name()));
        return true;
    }

    public abstract void onWakeWordStateChanged(boolean z);
}
