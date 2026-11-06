package com.mapbox.common.experimental;

import androidx.annotation.NonNull;
import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@MapboxExperimental
/* loaded from: classes8.dex */
public class NetworkStatusUpdater {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NetworkStatusUpdaterPeerCleaner implements Runnable {
        private long peer;

        public NetworkStatusUpdaterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStatusUpdater.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public NetworkStatusUpdater(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new NetworkStatusUpdaterPeerCleaner(j));
    }

    @MapboxExperimental
    public native void updateNetworkStatus(@NonNull NetworkStatusUpdate networkStatusUpdate);
}
