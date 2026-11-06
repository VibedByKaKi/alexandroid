package com.mapbox.common.location;

import android.app.PendingIntent;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.Cancelable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096 J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096 J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096 J\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096 J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/mapbox/common/location/DeviceLocationProviderNative;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "peer", "", "(J)V", "getPeer", "()J", "setPeer", "addLocationObserver", "", "observer", "Lcom/mapbox/common/location/LocationObserver;", "looper", "Landroid/os/Looper;", "getLastLocation", "Lcom/mapbox/common/Cancelable;", "callback", "Lcom/mapbox/common/location/GetLocationCallback;", "getName", "", "removeLocationObserver", "removeLocationUpdates", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "requestLocationUpdates", "Companion", "DeviceLocationProviderPeerCleaner", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class DeviceLocationProviderNative implements DeviceLocationProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/DeviceLocationProviderNative$DeviceLocationProviderPeerCleaner;", "Ljava/lang/Runnable;", "peer", "", "(J)V", "run", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DeviceLocationProviderPeerCleaner implements Runnable {
        private final long peer;

        public DeviceLocationProviderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceLocationProviderNative.INSTANCE.cleanNativePeer(this.peer);
        }
    }

    public DeviceLocationProviderNative(long j) {
        this.peer = j;
        CleanerService.register(this, new DeviceLocationProviderPeerCleaner(j));
    }

    @JvmStatic
    public static final native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.LocationProvider
    public native void addLocationObserver(@NotNull LocationObserver observer);

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(@NotNull LocationObserver observer, @NotNull Looper looper) {
        observer.getClass();
        looper.getClass();
        throw new RuntimeException("There should be no native DeviceLocationProvider");
    }

    @Override // com.mapbox.common.location.LocationProvider
    @NotNull
    public native Cancelable getLastLocation(@NotNull GetLocationCallback callback);

    @Override // com.mapbox.common.location.DeviceLocationProvider
    @Nullable
    public native String getName();

    public final long getPeer() {
        return this.peer;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public native void removeLocationObserver(@NotNull LocationObserver observer);

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(@NotNull PendingIntent pendingIntent) {
        pendingIntent.getClass();
        throw new RuntimeException("There should be no native DeviceLocationProvider");
    }

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public void requestLocationUpdates(@NotNull PendingIntent pendingIntent) {
        pendingIntent.getClass();
        throw new RuntimeException("There should be no native DeviceLocationProvider");
    }

    public final void setPeer(long j) {
        this.peer = j;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087 ¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/DeviceLocationProviderNative$Companion;", "", "()V", "cleanNativePeer", "", "peer", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void cleanNativePeer(long peer) {
            DeviceLocationProviderNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }
}
