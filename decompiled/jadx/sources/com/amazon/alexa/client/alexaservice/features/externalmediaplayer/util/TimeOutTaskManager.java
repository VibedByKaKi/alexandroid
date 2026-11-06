package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.util;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.Errors;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.PlayerError;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerErrorEvent;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class TimeOutTaskManager {
    private static final long DEFAULT_TIMEOUT_MS = 10000;
    private static final String TAG = "TimeOutTaskManager";
    private final AlexaClientEventBus alexaClientEventBus;
    private final ScheduledExecutorService executorService;
    private final Map<String, ScheduledFuture<?>> timeOutTasks;

    @Inject
    public TimeOutTaskManager(AlexaClientEventBus alexaClientEventBus, @Named("shared_scheduler") ScheduledExecutorService scheduledExecutorService) {
        this.alexaClientEventBus = alexaClientEventBus;
        this.executorService = scheduledExecutorService;
        this.timeOutTasks = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleTimeOutTask$0(String str, String str2, ExternalPlayerIdentifier externalPlayerIdentifier) {
        Log.e(TAG, "Sending out the timeout error for key = " + str);
        this.alexaClientEventBus.post(ExternalMediaPlayerErrorEvent.create(externalPlayerIdentifier, PlayerError.create(Errors.CapabilityAgentErrors.PLAYER_CONNECTION_TIMEOUT, str2)));
        this.timeOutTasks.remove(str);
    }

    public void cancelTimeOutTask(String str, String str2) {
        if (this.timeOutTasks.containsKey(str)) {
            ScheduledFuture<?> scheduledFuture = this.timeOutTasks.get(str);
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
            }
            this.timeOutTasks.remove(str);
            StringBuilder sb = new StringBuilder("Cancelled the timeout task for key = ");
            sb.append(str);
            sb.append(", reason = ");
            sb.append(str2);
        }
    }

    public void scheduleTimeOutTask(ExternalPlayerIdentifier externalPlayerIdentifier, String str) {
        String value = externalPlayerIdentifier.getValue();
        String str2 = "received new " + str + " directive";
        cancelTimeOutTask(value, str2);
        try {
            ScheduledFuture<?> schedule = this.executorService.schedule(new Schedulers$$ExternalSyntheticLambda1(6, this, value, str2, externalPlayerIdentifier), 10000L, TimeUnit.MILLISECONDS);
            if (schedule != null) {
                this.timeOutTasks.put(value, schedule);
            }
        } catch (RejectedExecutionException e) {
            Log.w(TAG, e.getMessage());
        }
    }

    public void tearDown() {
        Iterator<String> it2 = this.timeOutTasks.keySet().iterator();
        while (it2.hasNext()) {
            cancelTimeOutTask(it2.next(), "Canceling for tearDown");
        }
    }

    @VisibleForTesting
    public TimeOutTaskManager(AlexaClientEventBus alexaClientEventBus, @Named("shared_scheduler") ScheduledExecutorService scheduledExecutorService, Map<String, ScheduledFuture<?>> map) {
        this.alexaClientEventBus = alexaClientEventBus;
        this.executorService = scheduledExecutorService;
        this.timeOutTasks = map;
    }
}
