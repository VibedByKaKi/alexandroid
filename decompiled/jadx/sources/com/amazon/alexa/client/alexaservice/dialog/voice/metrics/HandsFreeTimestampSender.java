package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogEvent;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.utils.device.AlexaHandsFreeDeviceInformation;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class HandsFreeTimestampSender {
    static final String EXTRA_IDENTIFIER = "identifier";
    static final String EXTRA_TIMESTAMP = "timestamp";
    static final String EXTRA_TIMESTAMP_NAME = "timestampName";
    static final String LATENCY_RECEIVER_CLASS_NAME = "com.amazon.alexa.handsfree.latencyreporter.LatencyReceiver";
    static final ComponentName LATENCY_RECEIVER_COMPONENT_NAME = new ComponentName("com.amazon.dee.app", LATENCY_RECEIVER_CLASS_NAME);
    static final String LATENCY_RECEIVER_PACKAGE_NAME = "com.amazon.dee.app";
    static final String LATENCY_RECEIVER_PERMISSION = "com.amazon.alexa.handsfree.latencyreporter.LATENCY_PERMISSION";
    static final String REPORT_TIMESTAMP_DATA_ACTION = "com.amazon.alexa.handsfree.intent.action.REPORT_TIMESTAMP_DATA_EVENT";
    private static final String TAG = "HandsFreeTimestampSender";
    private final AlexaHandsFreeDeviceInformation alexaHandsFreeDeviceInformation;
    private final Context context;
    private final TimeProvider timeProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TimestampName {
        NEW_DIALOG_REQUEST_TIME,
        AUDIO_START_TIME,
        PRYON_START_TIME,
        PRYON_FINISH_TIME,
        PRYON_RESET_TIME
    }

    public HandsFreeTimestampSender(@NonNull AlexaClientEventBus alexaClientEventBus, @NonNull Context context, @NonNull TimeProvider timeProvider, AlexaHandsFreeDeviceInformation alexaHandsFreeDeviceInformation) {
        this.context = context;
        this.timeProvider = timeProvider;
        this.alexaHandsFreeDeviceInformation = alexaHandsFreeDeviceInformation;
        if (isDeviceHandsFree()) {
            alexaClientEventBus.register(this);
        }
    }

    public boolean isDeviceHandsFree() {
        return this.alexaHandsFreeDeviceInformation.isCurrentDeviceHandsFree();
    }

    @Subscribe
    public void on(@NonNull WakeWordMetricEvent.ValidationLatencyEvent validationLatencyEvent) {
        send(TimestampName.PRYON_START_TIME, null, validationLatencyEvent.getStartTimestamp());
        send(TimestampName.PRYON_FINISH_TIME, null, this.timeProvider.currentTimeMillis());
    }

    public void send(@NonNull TimestampName timestampName, @Nullable String str, long j) {
        if (isDeviceHandsFree()) {
            Intent intent = new Intent(REPORT_TIMESTAMP_DATA_ACTION);
            intent.setComponent(LATENCY_RECEIVER_COMPONENT_NAME);
            intent.putExtra(EXTRA_TIMESTAMP_NAME, timestampName.name());
            intent.putExtra("identifier", str);
            intent.putExtra("timestamp", j);
            this.context.sendBroadcast(intent, LATENCY_RECEIVER_PERMISSION);
        }
    }

    @Inject
    public HandsFreeTimestampSender(@NonNull AlexaClientEventBus alexaClientEventBus, @NonNull Context context, AlexaHandsFreeDeviceInformation alexaHandsFreeDeviceInformation) {
        this(alexaClientEventBus, context, new TimeProvider(), alexaHandsFreeDeviceInformation);
    }

    @Subscribe
    public void on(@NonNull WakeWordMetricEvent.PryonResetEvent pryonResetEvent) {
        send(TimestampName.PRYON_RESET_TIME, null, pryonResetEvent.getPryonResetTime());
    }

    @Subscribe
    public void on(@NonNull DialogEvent.NewDialogRequestedEvent newDialogRequestedEvent) {
        send(TimestampName.NEW_DIALOG_REQUEST_TIME, null, this.timeProvider.currentTimeMillis());
    }
}
