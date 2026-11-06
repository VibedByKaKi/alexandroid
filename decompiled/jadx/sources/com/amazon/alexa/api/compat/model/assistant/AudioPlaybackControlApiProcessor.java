package com.amazon.alexa.api.compat.model.assistant;

import android.app.PendingIntent;
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
public abstract class AudioPlaybackControlApiProcessor {
    private static final String TAG = "AudioPlaybackControlApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.AudioPlaybackControlApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioPlaybackControlApiMessageType;

        static {
            int[] iArr = new int[AudioPlaybackControlApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioPlaybackControlApiMessageType = iArr;
            try {
                iArr[AudioPlaybackControlApiMessageType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioPlaybackControlApiMessageType[AudioPlaybackControlApiMessageType.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioPlaybackControlApiMessageType[AudioPlaybackControlApiMessageType.NEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioPlaybackControlApiMessageType[AudioPlaybackControlApiMessageType.PREVIOUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioPlaybackControlApiMessageType[AudioPlaybackControlApiMessageType.STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioPlaybackControlApiMessageType[AudioPlaybackControlApiMessageType.SET_MEDIA_NOTIFICATION_CONTENT_INTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public AudioPlaybackControlApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 7)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        AudioPlaybackControlApiMessageType fromOrdinal = AudioPlaybackControlApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioPlaybackControlApiMessageType[fromOrdinal.ordinal()]) {
            case 1:
                onPlay();
                break;
            case 2:
                onPause();
                break;
            case 3:
                onNext();
                break;
            case 4:
                onPrevious();
                break;
            case 5:
                onStop();
                break;
            case 6:
                if (data != null) {
                    onSetMediaNotificationContentIntent((PendingIntent) data.getParcelable(AudioPlaybackControlApiArgumentType.PENDING_INTENT.name()));
                    break;
                } else {
                    Log.w(TAG, "AudioPlaybackControlApi message has no data for setMediaNotificationContentIntent");
                    break;
                }
            default:
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                break;
        }
        return false;
    }

    public abstract void onNext();

    public abstract void onPause();

    public abstract void onPlay();

    public abstract void onPrevious();

    public abstract void onSetMediaNotificationContentIntent(PendingIntent pendingIntent);

    public abstract void onStop();
}
