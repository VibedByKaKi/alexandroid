package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class MapboxOptionsImpl {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MapboxOptionsImplPeerCleaner implements Runnable {
        private long peer;

        public MapboxOptionsImplPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapboxOptionsImpl.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MapboxOptionsImpl(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @NonNull
    public static native String getAccessToken();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native String getTokenForService(@NonNull String str);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native boolean getUseStaging(@NonNull String str);

    private static native void nativeSelfRegister();

    public static native void setAccessToken(@NonNull String str);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapboxOptionsImplPeerCleaner(j));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void setStagingAccessToken(@NonNull String str);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void setTokenForService(@NonNull String str, @NonNull String str2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void setUseStaging(@NonNull String str, boolean z);
}
