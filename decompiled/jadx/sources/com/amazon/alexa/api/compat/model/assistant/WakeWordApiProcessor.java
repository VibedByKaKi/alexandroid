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
public abstract class WakeWordApiProcessor {
    private static final String TAG = "WakeWordApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.WakeWordApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$WakeWordApiMessageType;

        static {
            int[] iArr = new int[WakeWordApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$WakeWordApiMessageType = iArr;
            try {
                iArr[WakeWordApiMessageType.START_LISTENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$WakeWordApiMessageType[WakeWordApiMessageType.START_LISTENING_WITH_EXTRAS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$WakeWordApiMessageType[WakeWordApiMessageType.STOP_LISTENING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WakeWordApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new MapboxRenderThread$$ExternalSyntheticLambda2(this, 4)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        WakeWordApiMessageType fromOrdinal = WakeWordApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$WakeWordApiMessageType[fromOrdinal.ordinal()];
        if (i == 1) {
            onStartListening();
        } else if (i != 2) {
            if (i != 3) {
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                return false;
            }
            onStopListening();
        } else {
            if (data == null) {
                Log.w(TAG, "WakeWordApi message has no data for startListeningWithExtras");
                return false;
            }
            onStartListeningWithExtras(data.getBundle(WakeWordApiArgumentType.DIALOG_EXTRAS.name()));
        }
        return true;
    }

    public abstract void onStartListening();

    public abstract void onStartListeningWithExtras(Bundle bundle);

    public abstract void onStopListening();
}
