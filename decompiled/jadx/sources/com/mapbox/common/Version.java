package com.mapbox.common;

import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class Version {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class VersionPeerCleaner implements Runnable {
        private long peer;

        public VersionPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Version.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Version(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native String getCommonSDKRevisionString();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native String getCommonSDKVersionString();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native int getMajorVersion();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native int getMinorVersion();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native int getPatchVersion();

    private static native void nativeSelfRegister();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new VersionPeerCleaner(j));
    }
}
