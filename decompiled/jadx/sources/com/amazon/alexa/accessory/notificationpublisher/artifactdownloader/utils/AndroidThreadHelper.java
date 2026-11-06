package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.utils;

import android.os.Looper;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AndroidThreadHelper {
    private AndroidThreadHelper() {
    }

    public static void assertBackgroundThread() {
        if (isOnBackgroundThread()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Current thread must not be main thread");
    }

    public static void assertMainThread() {
        if (isOnMainThread()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Current thread must be main thread");
    }

    public static boolean isOnBackgroundThread() {
        return !isOnMainThread();
    }

    public static boolean isOnMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
