package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class CancelableNative implements Cancelable {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CancelablePeerCleaner implements Runnable {
        private long peer;

        public CancelablePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CancelableNative.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public CancelableNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CancelablePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.Cancelable
    public native void cancel();
}
