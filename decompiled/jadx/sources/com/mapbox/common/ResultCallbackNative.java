package com.mapbox.common;

import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
final class ResultCallbackNative implements ResultCallback {
    private long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResultCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.ResultCallback
    public native void run(boolean z);
}
