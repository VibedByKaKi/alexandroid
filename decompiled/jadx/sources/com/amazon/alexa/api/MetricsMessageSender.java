package com.amazon.alexa.api;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.messages.messagesender.AlexaMessageSender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class MetricsMessageSender extends AlexaMessageSender<MetricsMessageType> implements AlexaMetricsListener {
    private static final String TAG = "MetricsMessageSender";
    private final ExtendedClient client;

    public MetricsMessageSender(IBinder iBinder, ExtendedClient extendedClient) {
        super(iBinder);
        this.client = extendedClient;
    }

    @Override // com.amazon.alexa.api.AlexaMetricsListener
    public void onMetricsReport(AlexaMetricsData alexaMetricsData) {
        try {
            sendMessage(MetricsMessageType.ON_METRICS_REPORT, AlexaMetricsData.toBundle(alexaMetricsData));
        } catch (RemoteException e) {
            Log.e(TAG, "Failed to send on metrics report event ", e);
        }
    }
}
