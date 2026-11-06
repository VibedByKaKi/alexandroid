package com.amazon.minerva.transport.direct;

import com.amazon.deecomms.util.LogsUtil$$ExternalSyntheticLambda0;
import com.amazon.minerva.transport.direct.UploadResult;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class DirectTransport {
    static final long BASE_DELAY_MS = 1000;
    private static final int DEFAULT_MAX_QUEUED_BATCHES = 64;
    private static final int DEFAULT_TIMEOUT_MS = 15000;
    static final long MAX_DELAY_MS = 4000;
    static final int MAX_RETRIES = 3;
    private final ThreadPoolExecutor executorService;
    private final AtomicBoolean isShutdown;
    private final int timeoutMs;
    private static final String TAG = "DirectTransport";
    private static final Logger LOG = Logger.getLogger(TAG);

    public DirectTransport(int i, int i2) {
        this.isShutdown = new AtomicBoolean(false);
        if (i2 <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("maxQueuedBatches must be greater than 0");
            throw null;
        }
        this.timeoutMs = i;
        this.executorService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(i2));
    }

    public static long calculateBackoffDelay(int i) {
        long min = Math.min((1 << (i - 1)) * 1000, 4000L) / 2;
        return ThreadLocalRandom.current().nextLong(1 + min) + min;
    }

    private void enqueueAttempt(Batch batch, CompletableFuture<UploadResult> completableFuture) {
        try {
            this.executorService.submit(new LogsUtil$$ExternalSyntheticLambda0(this, 24, batch, completableFuture));
        } catch (RejectedExecutionException unused) {
            LOG.log(Level.WARNING, "Batch discarded — executor shut down or queue full");
            completableFuture.complete(new UploadResult(UploadResult.Category.UNEXPECTED, 0, "Executor shut down or queue full"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enqueueAttempt$0(Batch batch, CompletableFuture completableFuture) {
        UploadResult uploadResult = null;
        for (int i = 0; i <= 3; i++) {
            try {
                uploadResult = HttpTransport.execute(batch, this.timeoutMs);
                if (uploadResult.getCategory() == UploadResult.Category.SUCCESS) {
                    completableFuture.complete(uploadResult);
                    return;
                }
                if (uploadResult.getCategory() != UploadResult.Category.CLIENT_ERROR && uploadResult.getCategory() != UploadResult.Category.UNEXPECTED) {
                    if (i < 3) {
                        Thread.sleep(calculateBackoffDelay(i + 1));
                    }
                }
                LOG.log(Level.WARNING, "Batch dropped — non-retryable: " + String.valueOf(uploadResult.getCategory()));
                completableFuture.complete(uploadResult);
                return;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                LOG.log(Level.WARNING, "Retry interrupted — batch dropped");
                completableFuture.complete(new UploadResult(UploadResult.Category.UNEXPECTED, 0, "Retry interrupted"));
                return;
            } catch (Exception e) {
                LOG.log(Level.WARNING, "Unexpected error during batch upload", (Throwable) e);
                completableFuture.complete(new UploadResult(UploadResult.Category.UNEXPECTED, 0, e.getMessage()));
                return;
            }
        }
        LOG.log(Level.WARNING, "Batch dropped after 3 retries");
        completableFuture.complete(uploadResult);
    }

    public void shutdown() {
        if (this.isShutdown.compareAndSet(false, true)) {
            this.executorService.shutdown();
        }
    }

    public CompletableFuture<UploadResult> upload(Batch batch) {
        CompletableFuture<UploadResult> completableFuture = new CompletableFuture<>();
        try {
            if (this.isShutdown.get()) {
                LOG.log(Level.WARNING, "Batch discarded — pusher is shut down");
                completableFuture.complete(new UploadResult(UploadResult.Category.UNEXPECTED, 0, "Pusher is shut down"));
                return completableFuture;
            }
            if (batch != null) {
                enqueueAttempt(batch, completableFuture);
                return completableFuture;
            }
            LOG.log(Level.WARNING, "Batch discarded — batch must not be null");
            completableFuture.complete(new UploadResult(UploadResult.Category.UNEXPECTED, 0, "Batch must not be null"));
            return completableFuture;
        } catch (Exception e) {
            LOG.log(Level.WARNING, "Unexpected error in upload", (Throwable) e);
            completableFuture.complete(new UploadResult(UploadResult.Category.UNEXPECTED, 0, e.getMessage()));
            return completableFuture;
        }
    }

    public DirectTransport(int i) {
        this(i, 64);
    }

    public DirectTransport() {
        this(15000);
    }
}
