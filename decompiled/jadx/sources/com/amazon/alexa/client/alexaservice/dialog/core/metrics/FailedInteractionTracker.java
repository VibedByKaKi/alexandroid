package com.amazon.alexa.client.alexaservice.dialog.core.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.base.device.data.CacheMap;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogFailureReason;
import com.amazon.alexa.client.alexaservice.eventing.events.DownchannelAvailabilityChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.DownchannelConnectivityChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.RecoverableVoiceInteractionEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.StartDialogInteractionEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.UpdateVoiceInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.utils.TimeProvider;
import java.util.EnumSet;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class FailedInteractionTracker {

    @VisibleForTesting
    static final EnumSet<DialogFailureReason> RECOVERABLE_FAILURE_REASONS = EnumSet.of(DialogFailureReason.NETWORK_UNAVAILABLE, DialogFailureReason.AVS_CONNECTION_TIMEOUT, DialogFailureReason.NETWORK_REQUEST_ERROR, DialogFailureReason.AVS_UNAVAILABLE_DOWNCHANNEL);

    @VisibleForTesting
    static final String UNKNOWN_INVOCATION_TYPE = "UNKNOWN";
    private final AlexaClientEventBus alexaClientEventBus;
    private final TimeProvider timeProvider;
    private TrackedFailure trackedFailure;
    private final CacheMap<DialogTurnIdentifier, String> cachedDialogTurnIdToInvocationTypes = new CacheMap<>();
    private final CacheMap<DialogRequestIdentifier, DialogTurnIdentifier> cachedDialogRequestIdToDialogTurnIds = new CacheMap<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TrackedFailure {
        final long failedElapsedRealTime;
        final String invocationType;
        final DialogFailureReason reason;
        boolean reportedAvailable;
        boolean reportedConnected;

        public TrackedFailure(DialogFailureReason dialogFailureReason, String str, long j) {
            this.reason = dialogFailureReason;
            this.invocationType = str;
            this.failedElapsedRealTime = j;
        }
    }

    @Inject
    public FailedInteractionTracker(AlexaClientEventBus alexaClientEventBus, TimeProvider timeProvider) {
        this.alexaClientEventBus = alexaClientEventBus;
        this.timeProvider = timeProvider;
        alexaClientEventBus.register(this);
    }

    private void clear() {
        this.trackedFailure = null;
    }

    private void track(DialogFailureReason dialogFailureReason, String str, long j) {
        if (RECOVERABLE_FAILURE_REASONS.contains(dialogFailureReason)) {
            this.trackedFailure = new TrackedFailure(dialogFailureReason, str, j);
        } else {
            this.trackedFailure = null;
        }
    }

    @Subscribe
    public void on(FinishDialogInteractionEvent.FailureEvent failureEvent) {
        String str;
        if (this.cachedDialogRequestIdToDialogTurnIds.contains(failureEvent.getDialogRequestIdentifier())) {
            DialogTurnIdentifier dialogTurnIdentifier = this.cachedDialogRequestIdToDialogTurnIds.get(failureEvent.getDialogRequestIdentifier());
            if (this.cachedDialogTurnIdToInvocationTypes.contains(dialogTurnIdentifier)) {
                str = this.cachedDialogTurnIdToInvocationTypes.get(dialogTurnIdentifier);
                track(failureEvent.getFailureReason(), str, failureEvent.getCreatedTimeMilliseconds());
            }
        }
        str = "UNKNOWN";
        track(failureEvent.getFailureReason(), str, failureEvent.getCreatedTimeMilliseconds());
    }

    @Subscribe
    public void on(UpdateVoiceInteractionEvent updateVoiceInteractionEvent) {
        if (updateVoiceInteractionEvent.getDialogRequestId() != null) {
            this.cachedDialogRequestIdToDialogTurnIds.put(updateVoiceInteractionEvent.getDialogRequestId(), updateVoiceInteractionEvent.getDialogTurnId());
        } else if (updateVoiceInteractionEvent.getInvocationType() != null) {
            this.cachedDialogTurnIdToInvocationTypes.put(updateVoiceInteractionEvent.getDialogTurnId(), updateVoiceInteractionEvent.getInvocationType());
        }
    }

    @Subscribe
    public void on(StartDialogInteractionEvent startDialogInteractionEvent) {
        clear();
    }

    @Subscribe
    public void on(DownchannelConnectivityChangedEvent downchannelConnectivityChangedEvent) {
        TrackedFailure trackedFailure;
        if (!downchannelConnectivityChangedEvent.isConnected() || (trackedFailure = this.trackedFailure) == null || trackedFailure.reportedConnected) {
            return;
        }
        long elapsedRealTime = this.timeProvider.elapsedRealTime();
        TrackedFailure trackedFailure2 = this.trackedFailure;
        long j = trackedFailure2.failedElapsedRealTime;
        if (elapsedRealTime > j) {
            this.alexaClientEventBus.post(RecoverableVoiceInteractionEvent.DownchannelConnected.create(trackedFailure2.reason, trackedFailure2.invocationType, elapsedRealTime - j));
        }
        this.trackedFailure.reportedConnected = true;
    }

    @Subscribe
    public void on(DownchannelAvailabilityChangedEvent downchannelAvailabilityChangedEvent) {
        TrackedFailure trackedFailure;
        if (!downchannelAvailabilityChangedEvent.isAvailable() || (trackedFailure = this.trackedFailure) == null || trackedFailure.reportedAvailable) {
            return;
        }
        long elapsedRealTime = this.timeProvider.elapsedRealTime();
        TrackedFailure trackedFailure2 = this.trackedFailure;
        long j = trackedFailure2.failedElapsedRealTime;
        if (elapsedRealTime > j) {
            this.alexaClientEventBus.post(RecoverableVoiceInteractionEvent.DownchannelAvailable.create(trackedFailure2.reason, trackedFailure2.invocationType, elapsedRealTime - j));
        }
        this.trackedFailure.reportedAvailable = true;
    }
}
