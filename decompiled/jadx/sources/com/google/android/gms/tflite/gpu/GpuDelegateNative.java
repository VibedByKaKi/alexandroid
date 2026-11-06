package com.google.android.gms.tflite.gpu;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
class GpuDelegateNative {

    @Nullable
    static final Throwable zza;
    private static volatile boolean zzb = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_jni_gms_client");
            e = null;
        } catch (UnsatisfiedLinkError e) {
            e = e;
        }
        zza = e;
    }

    private static native void nativeDoNothing();

    public static void zza() {
        if (zzb) {
            return;
        }
        try {
            nativeDoNothing();
            zzb = true;
        } catch (UnsatisfiedLinkError e) {
            Throwable th = zza;
            if (th == null) {
                th = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native GpuDelegate methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  ".concat(th.toString()));
            unsatisfiedLinkError.initCause(e);
            unsatisfiedLinkError.addSuppressed(th);
            throw unsatisfiedLinkError;
        }
    }
}
