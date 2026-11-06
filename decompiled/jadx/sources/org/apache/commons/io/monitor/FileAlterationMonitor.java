package org.apache.commons.io.monitor;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class FileAlterationMonitor implements Runnable {
    private static final FileAlterationObserver[] EMPTY_ARRAY = new FileAlterationObserver[0];
    private final long interval;
    private final List<FileAlterationObserver> observers;
    private volatile boolean running;
    private Thread thread;
    private ThreadFactory threadFactory;

    public FileAlterationMonitor(long j, Collection<FileAlterationObserver> collection) {
        this(j, (FileAlterationObserver[]) ((Collection) Optional.ofNullable(collection).orElse(Collections.EMPTY_LIST)).toArray(EMPTY_ARRAY));
    }

    public void addObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.observers.add(fileAlterationObserver);
        }
    }

    public long getInterval() {
        return this.interval;
    }

    public Iterable<FileAlterationObserver> getObservers() {
        return this.observers;
    }

    public void removeObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            while (this.observers.remove(fileAlterationObserver)) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.running) {
            Iterator<FileAlterationObserver> it2 = this.observers.iterator();
            while (it2.hasNext()) {
                it2.next().checkAndNotify();
            }
            if (!this.running) {
                return;
            } else {
                try {
                    Thread.sleep(this.interval);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public synchronized void setThreadFactory(ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
    }

    public synchronized void start() throws Exception {
        try {
            if (this.running) {
                throw new IllegalStateException("Monitor is already running");
            }
            Iterator<FileAlterationObserver> it2 = this.observers.iterator();
            while (it2.hasNext()) {
                it2.next().initialize();
            }
            this.running = true;
            ThreadFactory threadFactory = this.threadFactory;
            if (threadFactory != null) {
                this.thread = threadFactory.newThread(this);
            } else {
                this.thread = new Thread(this);
            }
            this.thread.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void stop(long j) throws Exception {
        if (!this.running) {
            throw new IllegalStateException("Monitor is not running");
        }
        this.running = false;
        try {
            this.thread.interrupt();
            this.thread.join(j);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        Iterator<FileAlterationObserver> it2 = this.observers.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
    }

    public FileAlterationMonitor(long j) {
        this.observers = new CopyOnWriteArrayList();
        this.interval = j;
    }

    public FileAlterationMonitor() {
        this(10000L);
    }

    public FileAlterationMonitor(long j, FileAlterationObserver... fileAlterationObserverArr) {
        this(j);
        if (fileAlterationObserverArr != null) {
            for (FileAlterationObserver fileAlterationObserver : fileAlterationObserverArr) {
                addObserver(fileAlterationObserver);
            }
        }
    }

    public synchronized void stop() throws Exception {
        stop(this.interval);
    }
}
