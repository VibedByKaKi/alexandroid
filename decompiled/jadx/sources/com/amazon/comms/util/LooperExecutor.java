package com.amazon.comms.util;

import android.os.Handler;
import android.os.Looper;
import com.amazon.comms.log.CommsLogger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LooperExecutor extends Thread implements Executor {
    private static final CommsLogger log = CommsLogger.getLogger(LooperExecutor.class);
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
            log.w("Running looper executor without calling requestStart()");
        }
    }

    public synchronized void cancelScheduledTasks() {
        if (!this.running) {
            log.w("Trying to cancel schedule tasks for non running executor");
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
    public void execute(Runnable runnable) {
        synchronized (this) {
            try {
                if (!this.running) {
                    log.w("Running looper executor without calling requestStart(), class:".concat(runnable.getClass().getName()));
                    return;
                }
                boolean z = Thread.currentThread().getId() == this.threadId;
                if (z) {
                    runnable.run();
                } else {
                    synchronized (this) {
                        this.handler.post(runnable);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void post(Runnable runnable) {
        if (this.running) {
            this.handler.post(runnable);
        } else {
            log.w("Running looper postDelayed without calling requestStart(), class:".concat(runnable.getClass().getName()));
        }
    }

    public synchronized void postDelayedRunnable(Runnable runnable, long j) {
        if (this.running) {
            this.handler.postDelayed(runnable, j);
        } else {
            log.w("Trying to post delayed task on non running executor");
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
                    log.e("Can not start looper thread");
                    this.running = false;
                }
            }
        }
    }

    public synchronized void requestStop() {
        if (this.running) {
            this.running = false;
            this.handler.post(new Runnable() { // from class: com.amazon.comms.util.LooperExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    Looper.myLooper().quitSafely();
                    LooperExecutor.log.d("Looper thread finished, threadname=" + LooperExecutor.this.getName());
                }
            });
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        synchronized (this.looperStartedEvent) {
            log.d("Looper thread started, threadname=" + getName());
            this.handler = new Handler();
            this.threadId = Thread.currentThread().getId();
            this.looperStartedEvent.notify();
        }
        Looper.loop();
    }

    public synchronized void scheduleAtFixedRate(final Runnable runnable, final long j) {
        if (!this.running) {
            log.w("Trying to schedule task for non running executor");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.amazon.comms.util.LooperExecutor.2
            @Override // java.lang.Runnable
            public void run() {
                if (LooperExecutor.this.running) {
                    runnable.run();
                    if (LooperExecutor.this.handler.postDelayed(this, j)) {
                        return;
                    }
                    LooperExecutor.log.e("Failed to post a delayed runnable in the chain.");
                }
            }
        };
        this.scheduledPeriodicRunnables.add(runnable2);
        if (!this.handler.postDelayed(runnable2, j)) {
            log.e("Failed to post a delayed runnable.");
        }
    }

    public void execute(final String str, final Runnable runnable) {
        final long currentTimeMillis = System.currentTimeMillis();
        log.i("posting " + str);
        execute(new Runnable() { // from class: com.amazon.comms.util.LooperExecutor.3
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis2 = System.currentTimeMillis();
                LooperExecutor.log.i("executing " + str + " after " + (currentTimeMillis2 - currentTimeMillis) + "ms");
                runnable.run();
                LooperExecutor.log.i("finished " + str + " took " + (System.currentTimeMillis() - currentTimeMillis2) + "ms, executed after " + (currentTimeMillis2 - currentTimeMillis) + "ms wait");
            }
        });
    }
}
