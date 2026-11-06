package com.amazon.deecomms.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class NamedThreadFactory implements ThreadFactory {
    private final String mName;
    private final AtomicInteger mThreadNum = new AtomicInteger(1);

    public NamedThreadFactory(String str) {
        this.mName = str;
    }

    public String getName() {
        return this.mName;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format("%s#%d", this.mName, Integer.valueOf(this.mThreadNum.getAndIncrement())));
    }
}
