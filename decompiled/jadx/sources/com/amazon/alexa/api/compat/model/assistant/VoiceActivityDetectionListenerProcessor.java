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
public abstract class VoiceActivityDetectionListenerProcessor {
    private static final String TAG = "VoiceActivityDetectionListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.VoiceActivityDetectionListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionListenerMessageType;

        static {
            int[] iArr = new int[VoiceActivityDetectionListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionListenerMessageType = iArr;
            try {
                iArr[VoiceActivityDetectionListenerMessageType.ON_SPEECH_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionListenerMessageType[VoiceActivityDetectionListenerMessageType.ON_SILENCE_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionListenerMessageType[VoiceActivityDetectionListenerMessageType.ON_VOICE_CHAT_MODE_STATE_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VoiceActivityDetectionListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new MapboxRenderThread$$ExternalSyntheticLambda2(this, 3)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        VoiceActivityDetectionListenerMessageType fromOrdinal = VoiceActivityDetectionListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionListenerMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                    return false;
                }
                if (data == null) {
                    Log.w(TAG, "VoiceActivityDetectionListener message has no data for onVoiceChatModeStateChanged");
                    return false;
                }
                onVoiceChatModeStateChanged(data.getString(VoiceActivityDetectionListenerArgumentType.STATE.name()), data.getString(VoiceActivityDetectionListenerArgumentType.REASON.name()));
            } else {
                if (data == null) {
                    Log.w(TAG, "VoiceActivityDetectionListener message has no data for onSilenceDetected");
                    return false;
                }
                onSilenceDetected(data.getLong(VoiceActivityDetectionListenerArgumentType.TIMESTAMP.name()), data.getLong(VoiceActivityDetectionListenerArgumentType.DURATION.name()));
            }
        } else {
            if (data == null) {
                Log.w(TAG, "VoiceActivityDetectionListener message has no data for onSpeechDetected");
                return false;
            }
            onSpeechDetected(data.getLong(VoiceActivityDetectionListenerArgumentType.TIMESTAMP.name()), data.getFloat(VoiceActivityDetectionListenerArgumentType.CONFIDENCE_LEVEL.name()));
        }
        return true;
    }

    public abstract void onSilenceDetected(long j, long j2);

    public abstract void onSpeechDetected(long j, float f);

    public abstract void onVoiceChatModeStateChanged(String str, String str2);
}
