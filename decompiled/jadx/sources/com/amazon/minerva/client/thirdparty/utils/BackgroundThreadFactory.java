package com.amazon.minerva.client.thirdparty.utils;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BackgroundThreadFactory implements ThreadFactory {
    public static final int BACKGROUND_THREAD_PRIORITY = 4;
    private final String mThreadName;

    public BackgroundThreadFactory(String str) {
        this.mThreadName = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(4);
        thread.setName(this.mThreadName);
        return thread;
    }
}
