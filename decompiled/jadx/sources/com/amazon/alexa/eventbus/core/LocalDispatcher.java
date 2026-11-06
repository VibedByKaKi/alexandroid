package com.amazon.alexa.eventbus.core;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.component.api.ServiceLifecycle;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.Subscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class LocalDispatcher implements Dispatcher, ServiceLifecycle {

    @VisibleForTesting
    private static final int INTAKE_QUEUE_SIZE = 10000;
    private static final int INTAKE_THREAD_KEEPLIVE_TIME_SECONDS = 10;
    private static final int SHUTDOWN_GRACE_TIME_SECONDS = 5;
    private volatile ExecutorService callbackExecutorService;
    private volatile ExecutorService intakeExecutorService;
    private volatile BlockingQueue<Runnable> intakeQueue;
    private Registry registry;

    public LocalDispatcher(@NonNull Registry registry) {
        this.registry = registry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatch$1(Message message) {
        ExecutorService executorService = this.callbackExecutorService;
        if (executorService == null || executorService.isShutdown()) {
            Single$$ExternalSyntheticBUOutline0.m("LocalDispatcher service not running");
            return;
        }
        Iterator<Subscriber> it2 = this.registry.getSubscribersForMessage(message).iterator();
        while (it2.hasNext()) {
            try {
                executorService.execute(new LocalDispatcher$$ExternalSyntheticLambda0(it2.next(), message, 2));
            } catch (Exception e) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stop$2(ExecutorService executorService, ExecutorService executorService2) {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5L, timeUnit)) {
                executorService.shutdownNow();
            }
            if (executorService2.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService2.shutdownNow();
            Thread.currentThread().interrupt();
        } catch (InterruptedException unused) {
            executorService.shutdownNow();
            executorService2.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.amazon.alexa.eventbus.core.Dispatcher
    public void dispatch(@NonNull Message message) {
        ExecutorService executorService = this.intakeExecutorService;
        if (executorService == null || executorService.isShutdown()) {
            Single$$ExternalSyntheticBUOutline0.m("LocalDispatcher service not running");
            return;
        }
        try {
            executorService.execute(new LocalDispatcher$$ExternalSyntheticLambda0(this, message, 0));
        } catch (RejectedExecutionException e) {
            if (!executorService.isShutdown()) {
                throw e;
            }
            OnnxMap$$ExternalSyntheticBUOutline0.m("LocalDispatcher service not running", e);
        }
    }

    public synchronized void flush() {
        this.intakeQueue.drainTo(new ArrayList(10000));
    }

    @Override // com.amazon.alexa.component.api.ServiceLifecycle
    public synchronized void start() {
        this.intakeQueue = new ArrayBlockingQueue(10000);
        this.intakeExecutorService = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, this.intakeQueue);
        this.callbackExecutorService = Executors.newSingleThreadExecutor();
    }

    @Override // com.amazon.alexa.component.api.ServiceLifecycle
    public synchronized void stop() {
        ExecutorService executorService = this.intakeExecutorService;
        ExecutorService executorService2 = this.callbackExecutorService;
        executorService.shutdown();
        executorService2.shutdown();
        Executors.newSingleThreadExecutor().execute(new LocalDispatcher$$ExternalSyntheticLambda0(executorService, executorService2, 1));
    }
}
