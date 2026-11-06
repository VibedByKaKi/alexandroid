package com.amazon.alexa.client.alexaservice.networking.message;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.ApiCallMetadata;
import com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent;
import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageRequest;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SendMessageTaskContainer {
    private static final String TIMEOUT_SCHEDULER_NAME = "send-message-timeout-scheduler";
    private final Map<ApiCallMetadata, RequestIdentifier> apiCallIdMap;
    private final Map<RequestIdentifier, SendMessageEvent> requestIdMap;
    private final ScheduledExecutorService timeoutScheduler;
    private final Map<SendMessageEvent, ScheduledFuture<?>> timeoutTasks;
    private final Queue<RequestIdentifier> workQueue;

    public SendMessageTaskContainer(ScheduledExecutorService scheduledExecutorService) {
        this.requestIdMap = new HashMap();
        this.apiCallIdMap = new HashMap();
        this.workQueue = new LinkedList();
        this.timeoutTasks = new HashMap();
        this.timeoutScheduler = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SendMessageRequest removeInternal(RequestIdentifier requestIdentifier) {
        SendMessageEvent remove = this.requestIdMap.remove(requestIdentifier);
        if (remove == null) {
            OnnxMap$$ExternalSyntheticBUOutline0.m(requestIdentifier, "SendMessageEvent is null for request id: ");
            return null;
        }
        if (remove.hasApiCallIdentifier()) {
            this.apiCallIdMap.remove(remove.getApiCallMetadata());
        }
        ScheduledFuture<?> remove2 = this.timeoutTasks.remove(remove);
        if (remove2 != null && !remove2.isDone()) {
            remove2.cancel(true);
        }
        return SendMessageRequest.create(requestIdentifier, remove);
    }

    public synchronized void add(SendMessageEvent sendMessageEvent, final RequestIdentifier requestIdentifier, final Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            this.workQueue.add(requestIdentifier);
            this.requestIdMap.put(requestIdentifier, sendMessageEvent);
            if (sendMessageEvent.hasApiCallIdentifier()) {
                this.apiCallIdMap.put(sendMessageEvent.getApiCallMetadata(), requestIdentifier);
            }
            this.timeoutTasks.put(sendMessageEvent, this.timeoutScheduler.schedule(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.networking.message.SendMessageTaskContainer.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (SendMessageTaskContainer.this) {
                        try {
                            if (SendMessageTaskContainer.this.workQueue.remove(requestIdentifier)) {
                                SendMessageTaskContainer.this.removeInternal(requestIdentifier);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    runnable.run();
                }
            }, j, timeUnit));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean isEmpty() {
        return this.workQueue.isEmpty();
    }

    public synchronized boolean remove(SendMessageEvent sendMessageEvent) {
        boolean z;
        RequestIdentifier requestIdentifier;
        try {
            Iterator<Map.Entry<RequestIdentifier, SendMessageEvent>> it2 = this.requestIdMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    requestIdentifier = null;
                    break;
                }
                Map.Entry<RequestIdentifier, SendMessageEvent> next = it2.next();
                if (next.getValue().equals(sendMessageEvent)) {
                    z = this.workQueue.remove(next.getKey());
                    requestIdentifier = next.getKey();
                    break;
                }
            }
            if (requestIdentifier != null) {
                removeInternal(requestIdentifier);
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Inject
    public SendMessageTaskContainer() {
        this(ManagedExecutorFactory.newSingleThreadScheduledExecutor(TIMEOUT_SCHEDULER_NAME));
    }

    public synchronized SendMessageRequest remove() {
        return removeInternal(this.workQueue.remove());
    }

    @Nullable
    public synchronized SendMessageRequest remove(ApiCallMetadata apiCallMetadata) {
        RequestIdentifier remove = this.apiCallIdMap.remove(apiCallMetadata);
        if (remove == null) {
            return null;
        }
        this.workQueue.remove(remove);
        return removeInternal(remove);
    }

    @Nullable
    public synchronized SendMessageRequest remove(DialogRequestIdentifier dialogRequestIdentifier) {
        RequestIdentifier create = RequestIdentifier.create(dialogRequestIdentifier);
        if (!this.workQueue.remove(create)) {
            return null;
        }
        return removeInternal(create);
    }
}
