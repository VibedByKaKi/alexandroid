package com.mapbox.common.location;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.Cancelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class LocationProviderNative implements LocationProvider {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LocationProviderPeerCleaner implements Runnable {
        private long peer;

        public LocationProviderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationProviderNative.cleanNativePeer(this.peer);
        }
    }

    public LocationProviderNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationProviderPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.LocationProvider
    public native void addLocationObserver(@NonNull LocationObserver locationObserver);

    @Override // com.mapbox.common.location.LocationProvider
    @NonNull
    public Cancelable getLastLocation(@NonNull GetLocationCallback getLocationCallback) {
        return null;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public native void removeLocationObserver(@NonNull LocationObserver locationObserver);

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(@NonNull LocationObserver locationObserver, @NonNull Looper looper) {
    }
}
