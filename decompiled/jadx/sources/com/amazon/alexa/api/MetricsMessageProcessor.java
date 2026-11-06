package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class MetricsMessageProcessor extends MessageProcessor<MetricsMessageType> {
    private static final String TAG = "MetricsMessageProcessor";
    private final AlexaMetricsListener alexaMetricsListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.MetricsMessageProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$MetricsMessageType;

        static {
            int[] iArr = new int[MetricsMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$MetricsMessageType = iArr;
            try {
                iArr[MetricsMessageType.ON_METRICS_REPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private MetricsMessageProcessor(AlexaMetricsListener alexaMetricsListener) {
        this.alexaMetricsListener = alexaMetricsListener;
    }

    public static MetricsMessageProcessor create(AlexaMetricsListener alexaMetricsListener) {
        return new MetricsMessageProcessor(alexaMetricsListener);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public MetricsMessageType getMessageType(Message message) {
        try {
            return MetricsMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Unrecognized message type", e);
            return MetricsMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(MetricsMessageType metricsMessageType, Bundle bundle, @Nullable Messenger messenger) {
        if (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$MetricsMessageType[metricsMessageType.ordinal()] == 1) {
            this.alexaMetricsListener.onMetricsReport(AlexaMetricsData.fromBundle(bundle));
            return;
        }
        Log.w(TAG, "Unsupported message " + metricsMessageType);
    }
}
