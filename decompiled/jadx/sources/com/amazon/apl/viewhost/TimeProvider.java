package com.amazon.apl.viewhost;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface TimeProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LocalTimeOffsetListener {
        void onLocalTimeOffsetUpdated(long j);
    }

    void addListener(WeakReference<LocalTimeOffsetListener> weakReference);

    long getLocalTimeOffset();

    long getUTCTime();
}
