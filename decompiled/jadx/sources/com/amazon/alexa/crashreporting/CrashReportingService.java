package com.amazon.alexa.crashreporting;

import com.amazon.alexa.component.api.ServiceLifecycle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CrashReportingService extends ServiceLifecycle {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface CrashObserver {
        void onCrash();
    }

    void addObserver(CrashObserver crashObserver);

    void putMetadata(String str, String str2);

    void reportNonFatal(Throwable th);

    void setAccount(String str, String str2, String str3);
}
