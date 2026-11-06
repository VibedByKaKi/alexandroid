package com.amazon.alexa.client.alexaservice.dialog.core;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaAudioMetadata;
import com.amazon.alexa.api.AlexaDialogTurnMetricsCallback;
import com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy;
import com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks;
import com.amazon.alexa.api.AlexaDialogTurnStopCallback;
import com.amazon.alexa.api.UserPerceivedLatencyData;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.UpdateTextInteractionEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.UpdateVoiceInteractionEvent;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentIdentifier;
import com.amazon.alexa.client.alexaservice.ui.core.LaunchSource;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.utils.concurrent.ExecutorFactory;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DialogTurn {
    private static final long RECORDING_TIMEOUT_IN_SECONDS = 50;
    private static final String TAG = "DialogTurn";
    private AlexaAudioMetadata alexaAudioMetadata;
    private final AlexaClientEventBus alexaClientEventBus;
    private DialogRequestIdentifier dialogRequestIdentifier;
    private final DialogTurnData dialogTurnData;
    private final DialogTurnIdentifier dialogTurnIdentifier;
    private DialogTurnState dialogTurnState;
    private final ScheduledExecutorService executorService;
    private boolean hasInternalResponseBeenCoordinated;
    private final String invocationType;
    private boolean isRecording;
    private boolean isResponseReserved;
    private volatile boolean isUplReported;
    private volatile boolean isWaitingForUpl;
    private LaunchSource launchSource;
    private final AlexaDialogTurnMetricsCallback metricsCallback;
    private final boolean mustCoordinateResponses;
    private Future<?> recordingTimeoutAction;
    private volatile boolean shouldWaitForUpl;
    private final AlexaDialogTurnStopCallback stopCallback;
    private final ReservationTimestamps timestamps;
    private final AtomicReference<TurnFinishListener> turnFinishListener;
    private final DialogTurnLifecycle turnLifecycle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DialogTurnState {
        UNKNOWN,
        CREATED,
        STARTED,
        FINISHED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface TurnFinishListener {
        void onTurnFinished();
    }

    @VisibleForTesting
    public DialogTurn(AlexaClientEventBus alexaClientEventBus, String str, LaunchSource launchSource, DialogTurnData dialogTurnData, DialogTurnLifecycle dialogTurnLifecycle, DialogTurnIdentifier dialogTurnIdentifier, AlexaDialogTurnStopCallback alexaDialogTurnStopCallback, boolean z, @Nullable AlexaDialogTurnMetricsCallback alexaDialogTurnMetricsCallback, ScheduledExecutorService scheduledExecutorService) {
        this.timestamps = new ReservationTimestamps();
        this.dialogTurnState = DialogTurnState.UNKNOWN;
        this.alexaClientEventBus = alexaClientEventBus;
        this.invocationType = str;
        this.launchSource = launchSource;
        this.dialogTurnIdentifier = dialogTurnIdentifier;
        this.dialogTurnData = dialogTurnData;
        this.turnLifecycle = dialogTurnLifecycle;
        this.stopCallback = alexaDialogTurnStopCallback;
        this.mustCoordinateResponses = z;
        this.metricsCallback = alexaDialogTurnMetricsCallback;
        this.dialogTurnState = DialogTurnState.CREATED;
        this.isRecording = true;
        this.executorService = scheduledExecutorService;
        this.dialogRequestIdentifier = DialogRequestIdentifier.NONE;
        this.turnFinishListener = new AtomicReference<>();
    }

    private void doFinish(@Nullable TurnFinishListener turnFinishListener) {
        if (isFinished()) {
            Log.w(TAG, "Finishing an already finished turn");
            if (turnFinishListener != null) {
                turnFinishListener.onTurnFinished();
                return;
            }
            return;
        }
        if (isStarted()) {
            stopRecording(RecordingEvent.StopRecordingSource.OTHER);
            this.turnLifecycle.onDialogTurnFinished(this.dialogTurnIdentifier);
            this.dialogTurnData.finish();
        } else {
            this.turnLifecycle.onDialogTurnStarted(this.dialogTurnIdentifier);
            stopRecording(RecordingEvent.StopRecordingSource.OTHER);
            this.turnLifecycle.onDialogTurnFinished(this.dialogTurnIdentifier);
            this.dialogTurnData.cleanup();
        }
        this.executorService.shutdownNow();
        this.dialogTurnState = DialogTurnState.FINISHED;
        if (turnFinishListener != null) {
            turnFinishListener.onTurnFinished();
        }
        Objects.toString(getDialogTurnIdentifier());
    }

    private boolean hasResponseToReserve() {
        return this.dialogTurnState == DialogTurnState.STARTED && !this.isResponseReserved;
    }

    private boolean tryToReserveResponse(boolean z) {
        if (!hasResponseToReserve()) {
            return false;
        }
        this.isResponseReserved = true;
        finish();
        this.timestamps.setReservationTimestamp();
        this.alexaClientEventBus.post(ResponseCoordinationMetricEvent.ResponseReservedEvent.create(this.invocationType, this.dialogRequestIdentifier, z));
        return true;
    }

    public synchronized void finish(@Nullable TurnFinishListener turnFinishListener) {
        try {
            Objects.toString(getDialogTurnIdentifier());
            if (isShouldWaitForUpl()) {
                this.isWaitingForUpl = true;
                this.turnFinishListener.set(turnFinishListener);
            } else {
                doFinish(turnFinishListener);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public AlexaAudioMetadata getAlexaAudioMetadata() {
        return this.alexaAudioMetadata;
    }

    public synchronized AttachmentIdentifier getAttachmentIdentifier() {
        return this.dialogTurnData.getAudioAttachmentId();
    }

    public synchronized AttachmentIdentifier getDataAttachmentIdentifier() {
        return this.dialogTurnData.getExtraDataAttachmentId();
    }

    public synchronized DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    public synchronized DialogTurnData getDialogTurnData() {
        return this.dialogTurnData;
    }

    public synchronized DialogTurnIdentifier getDialogTurnIdentifier() {
        return this.dialogTurnIdentifier;
    }

    public String getInvocationType() {
        return this.invocationType;
    }

    public synchronized LaunchSource getLaunchSource() {
        return this.launchSource;
    }

    public synchronized boolean hasExtraData() {
        return this.dialogTurnData.hasExtraData();
    }

    public synchronized boolean hasInternalResponseBeenCoordinated() {
        boolean z;
        if (this.mustCoordinateResponses) {
            z = this.hasInternalResponseBeenCoordinated;
        }
        return z;
    }

    public synchronized boolean isFinished() {
        return this.dialogTurnState == DialogTurnState.FINISHED;
    }

    public synchronized boolean isRecording() {
        return this.isRecording;
    }

    @VisibleForTesting
    public boolean isShouldWaitForUpl() {
        return this.shouldWaitForUpl;
    }

    public synchronized boolean isStarted() {
        return this.dialogTurnState == DialogTurnState.STARTED;
    }

    public boolean isTextTurn() {
        DialogTurnData dialogTurnData = this.dialogTurnData;
        return dialogTurnData != null && dialogTurnData.hasTextMessage();
    }

    public synchronized void onReserveResponse(long j, AlexaDialogTurnResponseCoordinationPolicy alexaDialogTurnResponseCoordinationPolicy, AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks) {
        String str = TAG;
        Objects.toString(alexaDialogTurnResponseCoordinationPolicy);
        if (!this.mustCoordinateResponses) {
            Log.e(str, "Received a response reservation, when the dialog turn does not require coordination");
            alexaDialogTurnResponseReservationCallbacks.onDisputed(System.currentTimeMillis());
            return;
        }
        this.timestamps.setExternalDecisionTimestamp(j);
        this.timestamps.setInternalResponseTimestamp();
        boolean tryToReserveResponse = tryToReserveResponse(false);
        ReservationTimestamps reservationTimestamps = this.timestamps;
        if (tryToReserveResponse) {
            alexaDialogTurnResponseReservationCallbacks.onAgreed(reservationTimestamps.getInternalResponseTimestamp());
        } else {
            alexaDialogTurnResponseReservationCallbacks.onDisputed(reservationTimestamps.getInternalResponseTimestamp());
        }
        this.alexaClientEventBus.post(ResponseCoordinationMetricEvent.ShallowExternalReservationEvent.create(this.invocationType, this.dialogRequestIdentifier, tryToReserveResponse));
    }

    public synchronized boolean reserveResponseShallow(long j, ShallowResponseCoordinationCallbacks shallowResponseCoordinationCallbacks) {
        this.hasInternalResponseBeenCoordinated = true;
        if (!this.mustCoordinateResponses) {
            shallowResponseCoordinationCallbacks.onIgnored();
            return true;
        }
        shallowResponseCoordinationCallbacks.onInitialized(this.timestamps);
        this.timestamps.setInternalDecisionTimestamp(j);
        if (!tryToReserveResponse(true)) {
            shallowResponseCoordinationCallbacks.onResponseAlreadyReserved();
            return false;
        }
        this.turnLifecycle.onDialogTurnReserveResponse(this.dialogTurnIdentifier, j, AlexaDialogTurnResponseCoordinationPolicy.SHALLOW, shallowResponseCoordinationCallbacks);
        shallowResponseCoordinationCallbacks.onReserveResponseSent();
        return true;
    }

    public void setAlexaAudioMetadata(AlexaAudioMetadata alexaAudioMetadata) {
        this.alexaAudioMetadata = alexaAudioMetadata;
    }

    public void setLaunchSource(LaunchSource launchSource) {
        this.launchSource = launchSource;
    }

    public void setReservedResponseStarted(long j) {
        this.alexaClientEventBus.post(ResponseCoordinationMetricEvent.ExternalReservedResponseStartedEvent.create(this.invocationType, this.dialogRequestIdentifier, this.timestamps.getExternalDecisionTimestamp(), j));
    }

    public synchronized void setUserPerceivedLatencyData(UserPerceivedLatencyData userPerceivedLatencyData) {
        try {
            userPerceivedLatencyData.getUserPerceivedLatency();
            Objects.toString(getDialogTurnIdentifier());
            AlexaDialogTurnMetricsCallback alexaDialogTurnMetricsCallback = this.metricsCallback;
            if (alexaDialogTurnMetricsCallback != null) {
                alexaDialogTurnMetricsCallback.onUserPerceivedLatencyData(userPerceivedLatencyData);
                this.isUplReported = true;
            }
            this.shouldWaitForUpl = false;
            if (this.isWaitingForUpl) {
                this.isWaitingForUpl = false;
                doFinish(this.turnFinishListener.getAndSet(null));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void start(DialogRequestIdentifier dialogRequestIdentifier) {
        try {
            if (this.dialogTurnState == DialogTurnState.CREATED) {
                this.dialogRequestIdentifier = dialogRequestIdentifier;
                boolean isTextTurn = isTextTurn();
                AlexaClientEventBus alexaClientEventBus = this.alexaClientEventBus;
                DialogTurnIdentifier dialogTurnIdentifier = this.dialogTurnIdentifier;
                if (isTextTurn) {
                    alexaClientEventBus.post(UpdateTextInteractionEvent.create(dialogTurnIdentifier, dialogRequestIdentifier));
                } else {
                    alexaClientEventBus.post(UpdateVoiceInteractionEvent.create(dialogTurnIdentifier, dialogRequestIdentifier));
                    this.recordingTimeoutAction = this.executorService.schedule(new RecordingTimeoutRunnable(this, 0), 50L, TimeUnit.SECONDS);
                }
                this.turnLifecycle.onDialogTurnStarted(this.dialogTurnIdentifier);
                if (this.mustCoordinateResponses) {
                    Objects.toString(this.dialogTurnIdentifier);
                    this.turnLifecycle.onDialogTurnResponsePending(this.dialogTurnIdentifier, new DialogTurnResponseCoordinator(this));
                    this.alexaClientEventBus.post(ResponseCoordinationMetricEvent.ResponseMustBeCoordinatedEvent.create(this.invocationType, dialogRequestIdentifier));
                }
                this.dialogTurnState = DialogTurnState.STARTED;
            } else {
                Log.e(TAG, "Attempting to start a dialog turn when in state: " + this.dialogTurnState + ". Turn: " + getDialogTurnIdentifier());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void stopRecording(RecordingEvent.StopRecordingSource stopRecordingSource) {
        try {
            if (this.isRecording) {
                this.stopCallback.stopRecording();
                Future<?> future = this.recordingTimeoutAction;
                if (future != null) {
                    future.cancel(true);
                }
                this.dialogTurnData.finish();
                this.isRecording = false;
                this.alexaClientEventBus.post(RecordingEvent.StoppedEvent.create(stopRecordingSource, this.dialogRequestIdentifier));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void teardown() {
        this.dialogTurnData.teardown();
    }

    public void waitForUpl() {
        if (this.metricsCallback == null || this.isUplReported) {
            return;
        }
        Objects.toString(getDialogTurnIdentifier());
        this.shouldWaitForUpl = true;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RecordingTimeoutRunnable implements Runnable {
        private final DialogTurn dialogTurn;

        private RecordingTimeoutRunnable(DialogTurn dialogTurn) {
            this.dialogTurn = dialogTurn;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.dialogTurn) {
                try {
                    if (this.dialogTurn.isRecording()) {
                        this.dialogTurn.stopRecording(RecordingEvent.StopRecordingSource.OTHER);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ RecordingTimeoutRunnable(DialogTurn dialogTurn, int i) {
            this(dialogTurn);
        }
    }

    public synchronized void finish() {
        finish(null);
    }

    public DialogTurn(AlexaClientEventBus alexaClientEventBus, String str, LaunchSource launchSource, DialogTurnData dialogTurnData, DialogTurnLifecycle dialogTurnLifecycle, DialogTurnIdentifier dialogTurnIdentifier, AlexaDialogTurnStopCallback alexaDialogTurnStopCallback, boolean z, @Nullable AlexaDialogTurnMetricsCallback alexaDialogTurnMetricsCallback) {
        this(alexaClientEventBus, str, launchSource, dialogTurnData, dialogTurnLifecycle, dialogTurnIdentifier, alexaDialogTurnStopCallback, z, alexaDialogTurnMetricsCallback, ExecutorFactory.newSingleThreadScheduledExecutor("recording-timeout-" + dialogTurnIdentifier));
    }
}
