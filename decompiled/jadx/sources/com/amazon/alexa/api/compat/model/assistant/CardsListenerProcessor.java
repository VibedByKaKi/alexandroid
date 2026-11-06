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
public abstract class CardsListenerProcessor {
    private static final String TAG = "CardsListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.CardsListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsListenerMessageType;

        static {
            int[] iArr = new int[CardsListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsListenerMessageType = iArr;
            try {
                iArr[CardsListenerMessageType.ON_APL_COMMAND_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsListenerMessageType[CardsListenerMessageType.ON_RECEIVED_RENDER_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsListenerMessageType[CardsListenerMessageType.ON_PLAYER_INFO_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CardsListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 13)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        CardsListenerMessageType fromOrdinal = CardsListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsListenerMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                    return false;
                }
                if (data == null) {
                    Log.w(TAG, "CardsListener message has no data for onPlayerInfoCard");
                    return false;
                }
                onPlayerInfoCard(data.getBundle(CardsListenerArgumentType.METADATA_BUNDLE.name()));
            } else {
                if (data == null) {
                    Log.w(TAG, "CardsListener message has no data for onReceivedRenderCard");
                    return false;
                }
                onReceivedRenderCard(data.getString(CardsListenerArgumentType.CARD_DATA.name()));
            }
        } else {
            if (data == null) {
                Log.w(TAG, "CardsListener message has no data for onAplCommandReceived");
                return false;
            }
            onAplCommandReceived(data.getBundle(CardsListenerArgumentType.COMMAND_BUNDLE.name()));
        }
        return true;
    }

    public abstract void onAplCommandReceived(Bundle bundle);

    public abstract void onPlayerInfoCard(Bundle bundle);

    public abstract void onReceivedRenderCard(String str);
}
