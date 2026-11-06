package com.amazon.scxml.internal;

import com.facebook.react.bridge.BaseJavaModule;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda4;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0014\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/scxml/internal/DispatchQueue;", "", "<init>", "()V", "queueSemaphore", "Ljava/util/concurrent/Semaphore;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "timer", "Ljava/util/Timer;", "executeSemaphore", "workQueue", "Ljava/util/LinkedList;", "Lkotlin/Function0;", "", "processNextWorkItem", BaseJavaModule.METHOD_TYPE_ASYNC, "completion", "asyncAfter", "timeout", "", BaseJavaModule.METHOD_TYPE_SYNC, "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DispatchQueue {

    @NotNull
    private final Semaphore queueSemaphore = new Semaphore(1, true);
    private final ExecutorService executor = Executors.newCachedThreadPool();

    @NotNull
    private final Timer timer = new Timer();

    @NotNull
    private final Semaphore executeSemaphore = new Semaphore(1, false);

    @NotNull
    private final LinkedList<Function0<Unit>> workQueue = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit async$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processNextWorkItem() {
        this.queueSemaphore.acquire();
        try {
            if (this.workQueue.isEmpty()) {
                return;
            }
            if (this.executeSemaphore.tryAcquire()) {
                Function0<Unit> removeFirst = this.workQueue.removeFirst();
                this.queueSemaphore.release();
                this.executor.submit(new LifecycleUtils$$ExternalSyntheticLambda4(removeFirst, this, 7));
            }
        } finally {
            this.queueSemaphore.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processNextWorkItem$lambda$0(Function0 function0, DispatchQueue dispatchQueue) {
        try {
            function0.invoke();
        } finally {
            dispatchQueue.executeSemaphore.release();
            dispatchQueue.processNextWorkItem();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sync$lambda$3(Function0 function0, CountDownLatch countDownLatch) {
        try {
            function0.invoke();
            countDownLatch.countDown();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    public final void async(@NotNull Function0<Unit> completion) {
        completion.getClass();
        this.queueSemaphore.acquire();
        try {
            this.workQueue.add(new DispatchQueue$$ExternalSyntheticLambda0(completion, 0));
            this.queueSemaphore.release();
            processNextWorkItem();
        } catch (Throwable th) {
            this.queueSemaphore.release();
            throw th;
        }
    }

    public final void asyncAfter(double timeout, @NotNull final Function0<Unit> completion) {
        completion.getClass();
        this.timer.schedule(new TimerTask() { // from class: com.amazon.scxml.internal.DispatchQueue$asyncAfter$$inlined$schedule$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Semaphore semaphore;
                Semaphore semaphore2;
                LinkedList linkedList;
                Semaphore semaphore3;
                semaphore = DispatchQueue.this.queueSemaphore;
                semaphore.acquire();
                try {
                    linkedList = DispatchQueue.this.workQueue;
                    final Function0 function0 = completion;
                    linkedList.add(new Function0<Unit>() { // from class: com.amazon.scxml.internal.DispatchQueue$asyncAfter$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function0.invoke();
                        }
                    });
                    semaphore3 = DispatchQueue.this.queueSemaphore;
                    semaphore3.release();
                    DispatchQueue.this.processNextWorkItem();
                } catch (Throwable th) {
                    semaphore2 = DispatchQueue.this.queueSemaphore;
                    semaphore2.release();
                    throw th;
                }
            }
        }, (long) (timeout * 1000));
    }

    public final void sync(@NotNull Function0<Unit> completion) {
        completion.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.queueSemaphore.acquire();
        try {
            this.workQueue.add(new EventQueue$$ExternalSyntheticLambda0(completion, countDownLatch, 20));
            this.queueSemaphore.release();
            processNextWorkItem();
            countDownLatch.await();
        } catch (Throwable th) {
            this.queueSemaphore.release();
            throw th;
        }
    }
}
