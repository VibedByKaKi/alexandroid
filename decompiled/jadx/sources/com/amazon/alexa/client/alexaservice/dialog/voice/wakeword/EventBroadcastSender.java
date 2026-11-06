package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakewordDetectionEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class EventBroadcastSender {

    @VisibleForTesting
    static final String ACTION = "amazon.alexa.intent.action.REPORT_METRIC";

    @VisibleForTesting
    static final String EXTERNAL_WAKEWORD_OCCUR = "EXTERNAL_WAKEWORD_OCCUR";

    @VisibleForTesting
    static final String EXTRA_NAME = "amazon.alexa.intent.extras.EVENT_NAME";

    @VisibleForTesting
    static final String EXTRA_TIMESTAMP = "amazon.alexa.intent.extras.EVENT_TIMESTAMP";

    @VisibleForTesting
    static final String INGRESS_IN_APP_WAKEWORD_OCCUR = "INGRESS_IN_APP_WAKEWORD_OCCUR";

    @VisibleForTesting
    static final long NO_TIMESTAMP = -1;
    private static final String TAG = "EventBroadcastSender";
    private final Context context;
    private final AlexaClientEventBus eventBus;

    @Inject
    public EventBroadcastSender(Context context, AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    private void sendBroadcastEvent(String str, String str2, long j) {
        Intent intent = new Intent(str);
        intent.putExtra("amazon.alexa.intent.extras.EVENT_NAME", str2);
        intent.putExtra("amazon.alexa.intent.extras.EVENT_TIMESTAMP", j);
        intent.setPackage(this.context.getPackageName());
        this.context.sendBroadcast(intent);
    }

    @Subscribe
    public void on(WakewordDetectionEvent.InAppWakeWordDetectedEvent inAppWakeWordDetectedEvent) {
        sendBroadcastEvent("amazon.alexa.intent.action.REPORT_METRIC", "INGRESS_IN_APP_WAKEWORD_OCCUR", inAppWakeWordDetectedEvent.getWakewordDetectionTimeMs());
    }

    public void teardown() {
        this.eventBus.unregister(this);
    }

    @Subscribe
    public void on(WakewordDetectionEvent.ExternalWakeWordVerifiedEvent externalWakeWordVerifiedEvent) {
        sendBroadcastEvent("amazon.alexa.intent.action.REPORT_METRIC", EXTERNAL_WAKEWORD_OCCUR);
    }

    private void sendBroadcastEvent(String str, String str2) {
        sendBroadcastEvent(str, str2, -1L);
    }
}
