package com.amazon.alexa.client.alexaservice.base.metrics;

import com.amazon.alexa.api.AlexaMetadataBundleKey;
import com.amazon.alexa.api.UiEventName;
import com.amazon.alexa.client.alexaservice.dialog.voice.metrics.EndOfSpeechOffsetReceivedEvent;
import com.amazon.alexa.client.alexaservice.dialog.voice.metrics.RecordingSpeechStartAtEnhancedEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogRequestIdChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.PersonalityUserPerceivedLatencyEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.UiEventReceivedEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.Objects;
import javax.inject.Inject;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UserPerceivedLatencyPersonalityTracker {
    private static final String TAG = "UserPerceivedLatencyPersonalityTracker";
    private final AlexaClientEventBus alexaClientEventBus;
    private long calculatedStartRecordingElapsedRealTimeMillis;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private long endOfSpeechOffsetMillis;
    private boolean isFinished;
    private boolean isPersonalityUplReported;
    private long personalityAnimationRenderStartTimeMillis;

    @Inject
    public UserPerceivedLatencyPersonalityTracker(AlexaClientEventBus alexaClientEventBus, DialogRequestIdentifier dialogRequestIdentifier) {
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.alexaClientEventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    private boolean areStartAndEndTimeStampsValid() {
        return this.calculatedStartRecordingElapsedRealTimeMillis > 0 && this.endOfSpeechOffsetMillis > 0 && this.personalityAnimationRenderStartTimeMillis > 0;
    }

    private boolean canRecordPersonalityUpl() {
        return (!areStartAndEndTimeStampsValid() || this.isFinished || this.isPersonalityUplReported) ? false : true;
    }

    private void finish() {
        Objects.toString(this.dialogRequestIdentifier);
        this.alexaClientEventBus.unregister(this);
        this.isFinished = true;
    }

    private long getEventTimeStamp(UiEventReceivedEvent uiEventReceivedEvent) {
        if (uiEventReceivedEvent.getEventData() == null) {
            return 0L;
        }
        return uiEventReceivedEvent.getEventData().getLong(AlexaMetadataBundleKey.EVENT_REALTIME_MS.name());
    }

    private void recordPersonalityUserPerceivedLatency() {
        if (canRecordPersonalityUpl()) {
            long j = this.personalityAnimationRenderStartTimeMillis - (this.calculatedStartRecordingElapsedRealTimeMillis + this.endOfSpeechOffsetMillis);
            this.dialogRequestIdentifier.getValue();
            this.alexaClientEventBus.post(PersonalityUserPerceivedLatencyEvent.create(this.dialogRequestIdentifier, j));
            this.isPersonalityUplReported = true;
            finish();
        }
    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void on(UiEventReceivedEvent uiEventReceivedEvent) {
        if (UiEventName.PERSONALITY_RENDERED_EVENT.equals(uiEventReceivedEvent.getUiEventName())) {
            this.personalityAnimationRenderStartTimeMillis = getEventTimeStamp(uiEventReceivedEvent);
            recordPersonalityUserPerceivedLatency();
        }
    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public synchronized void on(EndOfSpeechOffsetReceivedEvent endOfSpeechOffsetReceivedEvent) {
        this.endOfSpeechOffsetMillis = endOfSpeechOffsetReceivedEvent.getEndOfSpeechOffsetMilliseconds();
        recordPersonalityUserPerceivedLatency();
    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void on(RecordingSpeechStartAtEnhancedEvent recordingSpeechStartAtEnhancedEvent) {
        this.calculatedStartRecordingElapsedRealTimeMillis = recordingSpeechStartAtEnhancedEvent.getRecordingSpeechStartAt();
        recordPersonalityUserPerceivedLatency();
    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public synchronized void on(DialogRequestIdChangedEvent dialogRequestIdChangedEvent) {
        if (!this.dialogRequestIdentifier.equals(dialogRequestIdChangedEvent.getDialogRequestIdentifier())) {
            finish();
        }
    }
}
