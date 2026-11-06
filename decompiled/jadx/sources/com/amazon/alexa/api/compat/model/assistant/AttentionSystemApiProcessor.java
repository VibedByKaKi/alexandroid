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
public abstract class AttentionSystemApiProcessor {
    private static final String TAG = "AttentionSystemApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.AttentionSystemApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AttentionSystemApiMessageType;

        static {
            int[] iArr = new int[AttentionSystemApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AttentionSystemApiMessageType = iArr;
            try {
                iArr[AttentionSystemApiMessageType.SET_WAKE_SOUND_ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AttentionSystemApiMessageType[AttentionSystemApiMessageType.SET_ENDPOINT_SOUND_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AttentionSystemApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 5)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        AttentionSystemApiMessageType fromOrdinal = AttentionSystemApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$AttentionSystemApiMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                return false;
            }
            if (data == null) {
                Log.w(TAG, "AttentionSystemApi message has no data for setEndpointSoundEnabled");
                return false;
            }
            onSetEndpointSoundEnabled(data.getBoolean(AttentionSystemApiArgumentType.ENABLED.name()));
        } else {
            if (data == null) {
                Log.w(TAG, "AttentionSystemApi message has no data for setWakeSoundEnabled");
                return false;
            }
            onSetWakeSoundEnabled(data.getBoolean(AttentionSystemApiArgumentType.ENABLED.name()));
        }
        return true;
    }

    public abstract void onSetEndpointSoundEnabled(boolean z);

    public abstract void onSetWakeSoundEnabled(boolean z);
}
