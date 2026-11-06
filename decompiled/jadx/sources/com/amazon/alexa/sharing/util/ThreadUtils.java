package com.amazon.alexa.sharing.util;

import android.os.Looper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ThreadUtils {
    public void checkNotMainThread() {
        if (isRunningOnMainThread()) {
            throw new IllegalAccessError("UI Thread should not execute this.");
        }
    }

    public boolean isRunningOnMainThread() {
        return Looper.getMainLooper() != null && Looper.getMainLooper() == Looper.myLooper();
    }
}
