package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class FeatureTelemetryCounter {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FeatureTelemetryCounterPeerCleaner implements Runnable {
        private long peer;

        public FeatureTelemetryCounterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeatureTelemetryCounter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public FeatureTelemetryCounter(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native FeatureTelemetryCounter create(@NonNull String str);

    private static native void nativeSelfRegister();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new FeatureTelemetryCounterPeerCleaner(j));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native String getName();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native int getValue();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void increment();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void reset();
}
