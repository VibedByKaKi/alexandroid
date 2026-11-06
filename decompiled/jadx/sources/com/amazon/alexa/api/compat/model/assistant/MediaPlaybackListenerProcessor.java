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
public abstract class MediaPlaybackListenerProcessor {
    private static final String TAG = "MediaPlaybackListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.MediaPlaybackListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$MediaPlaybackListenerMessageType;

        static {
            int[] iArr = new int[MediaPlaybackListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$MediaPlaybackListenerMessageType = iArr;
            try {
                iArr[MediaPlaybackListenerMessageType.ON_MEDIA_METADATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$MediaPlaybackListenerMessageType[MediaPlaybackListenerMessageType.ON_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$MediaPlaybackListenerMessageType[MediaPlaybackListenerMessageType.ON_STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MediaPlaybackListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 23)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        MediaPlaybackListenerMessageType fromOrdinal = MediaPlaybackListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$MediaPlaybackListenerMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i == 2) {
                onStarted();
            } else {
                if (i != 3) {
                    Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                    return false;
                }
                onStopped();
            }
        } else {
            if (data == null) {
                Log.w(TAG, "MediaPlaybackListener message has no data for onMediaMetadata");
                return false;
            }
            onMediaMetadata(data.getBundle(MediaPlaybackListenerArgumentType.METADATA_BUNDLE.name()));
        }
        return true;
    }

    public abstract void onMediaMetadata(Bundle bundle);

    public abstract void onStarted();

    public abstract void onStopped();
}
