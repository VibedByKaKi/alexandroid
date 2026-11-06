package com.amazon.alexa.client.alexaservice.dialog.text;

import android.os.SystemClock;
import android.util.Log;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.CancelAVSHttpClientCallEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.SendMessageNetworkRequestInvokeEvent;
import com.amazon.alexa.client.alexaservice.networking.message.request.StreamingMultipartRequestBody;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.eventing.Event$$ExternalSyntheticLambda2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class StreamingTextStateManager {
    static final long CLIENT_TIMEOUT_MS = 55000;
    private static final String TAG = "StreamingTextStateManager";
    private final AlexaClientEventBus eventBus;
    private final ScheduledExecutorService scheduler;
    private volatile ScheduledFuture<?> timeoutFuture;
    private final AtomicBoolean isStreamingActive = new AtomicBoolean(false);
    private final AtomicLong streamingStartTime = new AtomicLong(0);
    private final AtomicReference<DialogRequestIdentifier> streamingDialogRequestId = new AtomicReference<>(null);
    private final AtomicReference<StreamingMultipartRequestBody> activeBody = new AtomicReference<>(null);
    private final AtomicReference<SendTextStreamingMessageCallback> activeCallback = new AtomicReference<>(null);

    @Inject
    public StreamingTextStateManager(@Named("shared_scheduler") ScheduledExecutorService scheduledExecutorService, AlexaClientEventBus alexaClientEventBus) {
        this.scheduler = scheduledExecutorService;
        this.eventBus = alexaClientEventBus;
    }

    private void cancelTimeout() {
        if (this.timeoutFuture == null || this.timeoutFuture.isDone()) {
            return;
        }
        this.timeoutFuture.cancel(false);
        this.timeoutFuture = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startStreaming$0(StreamingMultipartRequestBody streamingMultipartRequestBody) {
        Log.w(TAG, "Streaming session timed out after 55000ms, auto-abandoning");
        streamingMultipartRequestBody.abandon();
        abandonStreaming();
    }

    private void reset() {
        this.isStreamingActive.set(false);
        this.streamingStartTime.set(0L);
        this.streamingDialogRequestId.set(null);
        this.activeBody.set(null);
        this.activeCallback.set(null);
    }

    public synchronized void abandonStreaming() {
        try {
            if (this.isStreamingActive.get()) {
                StreamingMultipartRequestBody streamingMultipartRequestBody = this.activeBody.get();
                if (streamingMultipartRequestBody != null) {
                    streamingMultipartRequestBody.abandon();
                }
                this.eventBus.post(CancelAVSHttpClientCallEvent.create());
                cancelTimeout();
                reset();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void completeStreaming(String str) {
        try {
            DialogRequestIdentifier dialogRequestIdentifier = this.streamingDialogRequestId.get();
            if (dialogRequestIdentifier != null) {
                dialogRequestIdentifier.getValue();
            }
            StreamingMultipartRequestBody streamingMultipartRequestBody = this.activeBody.get();
            if (streamingMultipartRequestBody != null) {
                streamingMultipartRequestBody.supplyComplete(str);
            }
            if (this.isStreamingActive.get()) {
                this.eventBus.post(SendMessageNetworkRequestInvokeEvent.create(dialogRequestIdentifier, SystemClock.elapsedRealtime()));
            }
            cancelTimeout();
            reset();
        } catch (Throwable th) {
            throw th;
        }
    }

    public SendTextStreamingMessageCallback getStreamingCallback() {
        return this.activeCallback.get();
    }

    public DialogRequestIdentifier getStreamingDialogRequestId() {
        return this.streamingDialogRequestId.get();
    }

    public boolean isActiveForDifferentDialog(DialogRequestIdentifier dialogRequestIdentifier) {
        DialogRequestIdentifier dialogRequestIdentifier2;
        return (!this.isStreamingActive.get() || (dialogRequestIdentifier2 = this.streamingDialogRequestId.get()) == null || dialogRequestIdentifier2.equals(dialogRequestIdentifier)) ? false : true;
    }

    public boolean isStreamingActive() {
        return this.isStreamingActive.get();
    }

    public synchronized void startStreaming(StreamingMultipartRequestBody streamingMultipartRequestBody, DialogRequestIdentifier dialogRequestIdentifier, SendTextStreamingMessageCallback sendTextStreamingMessageCallback) {
        cancelTimeout();
        this.isStreamingActive.set(true);
        this.streamingStartTime.set(SystemClock.elapsedRealtime());
        this.streamingDialogRequestId.set(dialogRequestIdentifier);
        this.activeBody.set(streamingMultipartRequestBody);
        this.activeCallback.set(sendTextStreamingMessageCallback);
        this.timeoutFuture = this.scheduler.schedule(new Event$$ExternalSyntheticLambda2(this, streamingMultipartRequestBody, 4), 55000L, TimeUnit.MILLISECONDS);
    }

    public void updateStreamingText(String str) {
        StreamingMultipartRequestBody streamingMultipartRequestBody = this.activeBody.get();
        if (streamingMultipartRequestBody != null) {
            streamingMultipartRequestBody.updateText(str);
        }
    }
}
