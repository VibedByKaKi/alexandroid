package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class AlertsMessageProcessor extends MessageProcessor<AlertsMessageType> {
    private static final String TAG = "AlertsMessageProcessor";
    private final AlertsListener alertsListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.AlertsMessageProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$AlertsMessageType;

        static {
            int[] iArr = new int[AlertsMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$AlertsMessageType = iArr;
            try {
                iArr[AlertsMessageType.ON_ALERT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlertsMessageType[AlertsMessageType.ON_ALERT_FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private AlertsMessageProcessor(AlertsListener alertsListener) {
        this.alertsListener = alertsListener;
    }

    public static AlertsMessageProcessor create(AlertsListener alertsListener) {
        Preconditions.notNull(alertsListener, "null implementation!");
        return new AlertsMessageProcessor(alertsListener);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public AlertsMessageType getMessageType(Message message) {
        try {
            return AlertsMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Unrecognized message type", e);
            return AlertsMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(AlertsMessageType alertsMessageType, Bundle bundle, @Nullable Messenger messenger) {
        String string = Bundles.getString(bundle, AlertsArgumentKey.ALERT_ID);
        AlertType fromOrdinal = AlertType.fromOrdinal(Bundles.getInteger(bundle, AlertsArgumentKey.ALERT_TYPE));
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$AlertsMessageType[alertsMessageType.ordinal()];
        if (i == 1) {
            this.alertsListener.onAlertStarted(string, fromOrdinal);
            return;
        }
        if (i == 2) {
            this.alertsListener.onAlertFinished(string, fromOrdinal);
            return;
        }
        Log.w(TAG, "Unsupported message " + alertsMessageType);
    }
}
