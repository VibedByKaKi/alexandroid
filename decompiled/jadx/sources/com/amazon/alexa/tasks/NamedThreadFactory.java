package com.amazon.alexa.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class NamedThreadFactory implements ThreadFactory {
    private final ThreadGroup mGroup;
    private final String mName;
    private final AtomicInteger mThreadNumber;
    private final int mThreadPriority;

    public NamedThreadFactory(String str, int i) {
        this.mThreadNumber = new AtomicInteger(1);
        this.mName = str;
        SecurityManager securityManager = System.getSecurityManager();
        this.mGroup = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.mThreadPriority = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@NonNull Runnable runnable) {
        Thread thread = new Thread(this.mGroup, runnable, this.mName + " #" + this.mThreadNumber.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int priority = thread.getPriority();
        int i = this.mThreadPriority;
        if (priority != i) {
            thread.setPriority(i);
        }
        return thread;
    }

    public NamedThreadFactory(String str) {
        this(str, 4);
    }
}
