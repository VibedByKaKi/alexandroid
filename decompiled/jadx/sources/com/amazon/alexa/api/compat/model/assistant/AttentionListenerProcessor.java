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
public abstract class AttentionListenerProcessor {
    private static final String TAG = "AttentionListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.AttentionListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AttentionListenerMessageType;

        static {
            int[] iArr = new int[AttentionListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AttentionListenerMessageType = iArr;
            try {
                iArr[AttentionListenerMessageType.ON_ATTENTION_STATE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AttentionListenerMessageType[AttentionListenerMessageType.ON_INPUT_SOUND_LEVEL_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AttentionListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 4)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        AttentionListenerMessageType fromOrdinal = AttentionListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$AttentionListenerMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                return false;
            }
            if (data == null) {
                Log.w(TAG, "AttentionListener message has no data for onInputSoundLevelChanged");
                return false;
            }
            onInputSoundLevelChanged(data.getDouble(AttentionListenerArgumentType.LEVEL.name()));
        } else {
            if (data == null) {
                Log.w(TAG, "AttentionListener message has no data for onAttentionStateChanged");
                return false;
            }
            onAttentionStateChanged(data.getString(AttentionListenerArgumentType.STATE.name()), data.getString(AttentionListenerArgumentType.WAKEWORD.name()));
        }
        return true;
    }

    public abstract void onAttentionStateChanged(String str, String str2);

    public abstract void onInputSoundLevelChanged(double d);
}
