package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class TelemetryUtils {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TelemetryUtilsPeerCleaner implements Runnable {
        private long peer;

        public TelemetryUtilsPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryUtils.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TelemetryUtils() {
        initialize();
    }

    public static native void cleanNativePeer(long j);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native TelemetryCollectionState getClientServerEventsCollectionState();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native boolean getEventsCollectionState();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native String getUserID();

    private native void initialize();

    private static native void nativeSelfRegister();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void setEventsCollectionState(boolean z, @Nullable TelemetryUtilsResponseCallback telemetryUtilsResponseCallback);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryUtilsPeerCleaner(j));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void registerTelemetryCollectionStateObserver(@NonNull TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void unregisterTelemetryCollectionStateObserver(@NonNull TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    public TelemetryUtils(long j) {
        setPeer(j);
    }
}
