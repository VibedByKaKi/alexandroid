package com.amazon.rtcmedia.util;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LooperExecutor extends Thread implements Executor {
    private static RtcscLogger mLog = RtcscLogger.getLogger(LooperExecutor.class);
    private Handler handler;
    private final Object looperStartedEvent;
    private boolean running;
    private final List<Runnable> scheduledPeriodicRunnables;
    private long threadId;

    public LooperExecutor(String str) {
        super(str);
        this.looperStartedEvent = new Object();
        this.scheduledPeriodicRunnables = new LinkedList();
        this.handler = null;
        this.running = false;
    }

    public synchronized void cancel(Runnable runnable) {
        if (this.running) {
            this.handler.removeCallbacks(runnable);
        } else {
            mLog.w("Running looper executor without calling requestStart()");
        }
    }

    public synchronized void cancelScheduledTasks() {
        if (!this.running) {
            mLog.w("Trying to cancel schedule tasks for non running executor");
            return;
        }
        Iterator<Runnable> it2 = this.scheduledPeriodicRunnables.iterator();
        while (it2.hasNext()) {
            this.handler.removeCallbacks(it2.next());
        }
        this.scheduledPeriodicRunnables.clear();
    }

    public boolean checkOnLooperThread() {
        return Thread.currentThread().getId() == this.threadId;
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (this.running) {
            this.handler.post(runnable);
        } else {
            mLog.w("Running looper executor without calling requestStart(), class:".concat(runnable.getClass().getName()));
        }
    }

    public synchronized void post(Runnable runnable) {
        if (this.running) {
            this.handler.post(runnable);
        } else {
            mLog.w("Running looper postDelayed without calling requestStart(), class:".concat(runnable.getClass().getName()));
        }
    }

    public synchronized void postDelayedRunnable(Runnable runnable, long j) {
        if (this.running) {
            this.handler.postDelayed(runnable, j);
        } else {
            mLog.w("Trying to post delayed task on non running executor");
        }
    }

    public synchronized void requestStart() {
        if (this.running) {
            return;
        }
        this.running = true;
        this.handler = null;
        start();
        synchronized (this.looperStartedEvent) {
            while (this.handler == null) {
                try {
                    this.looperStartedEvent.wait();
                } catch (InterruptedException unused) {
                    mLog.e("Can not start looper thread");
                    this.running = false;
                }
            }
        }
    }

    public synchronized void requestStop() {
        if (this.running) {
            this.running = false;
            this.handler.post(new Runnable() { // from class: com.amazon.rtcmedia.util.LooperExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    Looper.myLooper().quitSafely();
                    LooperExecutor.mLog.d("Looper thread finished, threadname=" + LooperExecutor.this.getName());
                }
            });
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        synchronized (this.looperStartedEvent) {
            mLog.d("Looper thread started, threadname=" + getName());
            this.handler = new Handler();
            this.threadId = Thread.currentThread().getId();
            this.looperStartedEvent.notify();
        }
        Looper.loop();
    }

    public synchronized void scheduleAtFixedRate(final Runnable runnable, final long j) {
        if (!this.running) {
            mLog.w("Trying to schedule task for non running executor");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.amazon.rtcmedia.util.LooperExecutor.2
            @Override // java.lang.Runnable
            public void run() {
                if (LooperExecutor.this.running) {
                    runnable.run();
                    if (LooperExecutor.this.handler.postDelayed(this, j)) {
                        return;
                    }
                    LooperExecutor.mLog.e("Failed to post a delayed runnable in the chain.");
                }
            }
        };
        this.scheduledPeriodicRunnables.add(runnable2);
        if (!this.handler.postDelayed(runnable2, j)) {
            mLog.e("Failed to post a delayed runnable.");
        }
    }

    public void execute(final String str, final Runnable runnable) {
        final long currentTimeMillis = System.currentTimeMillis();
        mLog.i("posting " + str);
        execute(new Runnable() { // from class: com.amazon.rtcmedia.util.LooperExecutor.3
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis2 = System.currentTimeMillis();
                LooperExecutor.mLog.i("executing " + str + " after " + (currentTimeMillis2 - currentTimeMillis) + "ms");
                runnable.run();
                LooperExecutor.mLog.i("finished " + str + " took " + (System.currentTimeMillis() - currentTimeMillis2) + "ms, executed after " + (currentTimeMillis2 - currentTimeMillis) + "ms wait");
            }
        });
    }
}
