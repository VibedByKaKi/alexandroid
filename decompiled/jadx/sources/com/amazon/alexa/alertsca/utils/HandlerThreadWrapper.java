package com.amazon.alexa.alertsca.utils;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class HandlerThreadWrapper {
    private final Handler handler;
    private final HandlerThread handlerThread;

    public HandlerThreadWrapper(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
    }

    public void post(Runnable runnable) {
        this.handler.post(runnable);
    }

    public void quitSafely() {
        this.handlerThread.quitSafely();
    }
}
