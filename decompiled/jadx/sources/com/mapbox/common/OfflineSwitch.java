package com.mapbox.common;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class OfflineSwitch {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class OfflineSwitchPeerCleaner implements Runnable {
        private long peer;

        public OfflineSwitchPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineSwitch.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public OfflineSwitch(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @NonNull
    @MainThread
    public static native OfflineSwitch getInstance();

    private static native void nativeSelfRegister();

    @MainThread
    public static native void reset();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OfflineSwitchPeerCleaner(j));
    }

    @MainThread
    public native boolean isMapboxStackConnected();

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void registerObserver(@NonNull OfflineSwitchObserver offlineSwitchObserver);

    @MainThread
    public native void setMapboxStackConnected(boolean z);

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void unregisterObserver(@NonNull OfflineSwitchObserver offlineSwitchObserver);
}
