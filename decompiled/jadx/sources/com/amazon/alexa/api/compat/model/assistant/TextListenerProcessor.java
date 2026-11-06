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
public abstract class TextListenerProcessor {
    private static final String TAG = "TextListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.TextListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$TextListenerMessageType;

        static {
            int[] iArr = new int[TextListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$TextListenerMessageType = iArr;
            try {
                iArr[TextListenerMessageType.ON_TEXT_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$TextListenerMessageType[TextListenerMessageType.ON_RECEIVED_CAPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$TextListenerMessageType[TextListenerMessageType.ON_EXPECT_TEXT_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$TextListenerMessageType[TextListenerMessageType.ON_RECEIVED_PLAYBACK_SYNCED_CAPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TextListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 28)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        TextListenerMessageType fromOrdinal = TextListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$TextListenerMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    onExpectTextReceived();
                } else {
                    if (i != 4) {
                        Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                        return false;
                    }
                    if (data == null) {
                        Log.w(TAG, "TextListener message has no data for onReceivedPlaybackSyncedCaption");
                        return false;
                    }
                    onReceivedPlaybackSyncedCaption(data.getBundle(TextListenerArgumentType.CAPTION_BUNDLE.name()));
                }
            } else {
                if (data == null) {
                    Log.w(TAG, "TextListener message has no data for onReceivedCaption");
                    return false;
                }
                onReceivedCaption(data.getBundle(TextListenerArgumentType.CAPTION_BUNDLE.name()));
            }
        } else {
            if (data == null) {
                Log.w(TAG, "TextListener message has no data for onTextReceived");
                return false;
            }
            onTextReceived(data.getBundle(TextListenerArgumentType.TEXT_RESPONSE_BUNDLE.name()));
        }
        return true;
    }

    public abstract void onExpectTextReceived();

    public abstract void onReceivedCaption(Bundle bundle);

    public abstract void onReceivedPlaybackSyncedCaption(Bundle bundle);

    public abstract void onTextReceived(Bundle bundle);
}
