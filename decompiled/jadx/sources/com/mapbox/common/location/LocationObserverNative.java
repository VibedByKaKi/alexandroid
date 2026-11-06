package com.mapbox.common.location;

import androidx.annotation.NonNull;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class LocationObserverNative implements LocationObserver {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LocationObserverPeerCleaner implements Runnable {
        private long peer;

        public LocationObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationObserverNative.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LocationObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.location.LocationObserver
    public native void onLocationUpdateReceived(@NonNull List<Location> list);
}
