package com.amazon.alexa.utils.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class NamedThreadFactory implements ThreadFactory {
    private final String name;
    private final AtomicInteger threadNumber = new AtomicInteger(0);

    public NamedThreadFactory(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.name + "-" + this.threadNumber.getAndIncrement());
        thread.setDaemon(true);
        return thread;
    }
}
