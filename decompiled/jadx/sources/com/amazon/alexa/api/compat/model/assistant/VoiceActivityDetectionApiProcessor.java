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
public abstract class VoiceActivityDetectionApiProcessor {
    private static final String TAG = "VoiceActivityDetectionApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.VoiceActivityDetectionApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionApiMessageType;

        static {
            int[] iArr = new int[VoiceActivityDetectionApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionApiMessageType = iArr;
            try {
                iArr[VoiceActivityDetectionApiMessageType.START_VOICE_ACTIVITY_DETECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionApiMessageType[VoiceActivityDetectionApiMessageType.STOP_VOICE_ACTIVITY_DETECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionApiMessageType[VoiceActivityDetectionApiMessageType.MUTE_VOICE_ACTIVITY_DETECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionApiMessageType[VoiceActivityDetectionApiMessageType.UNMUTE_VOICE_ACTIVITY_DETECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionApiMessageType[VoiceActivityDetectionApiMessageType.STOP_VOICE_ACTIVITY_DETECTION_IF_SILENCED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionApiMessageType[VoiceActivityDetectionApiMessageType.STOP_VOICE_ACTIVITY_DETECTION_WITH_REASON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public VoiceActivityDetectionApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new MapboxRenderThread$$ExternalSyntheticLambda2(this, 2)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        VoiceActivityDetectionApiMessageType fromOrdinal = VoiceActivityDetectionApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$VoiceActivityDetectionApiMessageType[fromOrdinal.ordinal()]) {
            case 1:
                onStartVoiceActivityDetection();
                break;
            case 2:
                onStopVoiceActivityDetection();
                break;
            case 3:
                onMuteVoiceActivityDetection();
                break;
            case 4:
                onUnmuteVoiceActivityDetection();
                break;
            case 5:
                onStopVoiceActivityDetectionIfSilenced();
                break;
            case 6:
                if (data != null) {
                    onStopVoiceActivityDetectionWithReason(data.getString(VoiceActivityDetectionApiArgumentType.REASON.name()));
                    break;
                } else {
                    Log.w(TAG, "VoiceActivityDetectionApi message has no data for stopVoiceActivityDetectionWithReason");
                    break;
                }
            default:
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                break;
        }
        return false;
    }

    public abstract void onMuteVoiceActivityDetection();

    public abstract void onStartVoiceActivityDetection();

    public abstract void onStopVoiceActivityDetection();

    public abstract void onStopVoiceActivityDetectionIfSilenced();

    public abstract void onStopVoiceActivityDetectionWithReason(String str);

    public abstract void onUnmuteVoiceActivityDetection();
}
