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
public abstract class CardsApiProcessor {
    private static final String TAG = "CardsApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.CardsApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsApiMessageType;

        static {
            int[] iArr = new int[CardsApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsApiMessageType = iArr;
            try {
                iArr[CardsApiMessageType.NOTIFY_APL_COMMAND_RESULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsApiMessageType[CardsApiMessageType.NOTIFY_CARD_RENDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsApiMessageType[CardsApiMessageType.REPORT_APL_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CardsApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 12)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        CardsApiMessageType fromOrdinal = CardsApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$CardsApiMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                    return false;
                }
                if (data == null) {
                    Log.w(TAG, "CardsApi message has no data for reportAplState");
                    return false;
                }
                onReportAplState(data.getBundle(CardsApiArgumentType.APL_STATE_BUNDLE.name()));
            } else {
                if (data == null) {
                    Log.w(TAG, "CardsApi message has no data for notifyCardRendered");
                    return false;
                }
                onNotifyCardRendered(data.getString(CardsApiArgumentType.CARD_TOKEN.name()));
            }
        } else {
            if (data == null) {
                Log.w(TAG, "CardsApi message has no data for notifyAplCommandResult");
                return false;
            }
            onNotifyAplCommandResult(data.getBundle(CardsApiArgumentType.RESULT_BUNDLE.name()));
        }
        return true;
    }

    public abstract void onNotifyAplCommandResult(Bundle bundle);

    public abstract void onNotifyCardRendered(String str);

    public abstract void onReportAplState(Bundle bundle);
}
