package com.google.android.gms.tflite;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class NativeSignatureRunnerWrapper {
    private final long zza;
    private final long zzb;
    private boolean zzc = false;

    public NativeSignatureRunnerWrapper(long j, long j2, String str) {
        this.zzb = j2;
        long nativeGetSignatureRunner = nativeGetSignatureRunner(j, str);
        this.zza = nativeGetSignatureRunner;
        if (nativeGetSignatureRunner != -1) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str).length() + 34), "Input error: Signature ", str, " not found."));
        throw null;
    }

    private static native void nativeAllocateTensors(long j, long j2);

    private static native int nativeGetInputIndex(long j, String str);

    private static native int nativeGetOutputIndex(long j, String str);

    private static native long nativeGetSignatureRunner(long j, String str);

    private static native int nativeGetSubgraphIndex(long j);

    private static native String[] nativeInputNames(long j);

    private static native void nativeInvoke(long j, long j2);

    private static native String[] nativeOutputNames(long j);

    private static native boolean nativeResizeInput(long j, long j2, String str, int[] iArr);

    public final int zza() {
        return nativeGetSubgraphIndex(this.zza);
    }

    public final String[] zzb() {
        return nativeInputNames(this.zza);
    }

    public final String[] zzc() {
        return nativeOutputNames(this.zza);
    }

    public final TensorImpl zzd(String str) {
        return TensorImpl.zzb(this.zza, str);
    }

    public final TensorImpl zze(String str) {
        return TensorImpl.zzc(this.zza, str);
    }

    public final int zzf(String str) {
        int nativeGetInputIndex = nativeGetInputIndex(this.zza, str);
        if (nativeGetInputIndex != -1) {
            return nativeGetInputIndex;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str).length() + 30), "Input error: input ", str, " not found."));
        return 0;
    }

    public final int zzg(String str) {
        int nativeGetOutputIndex = nativeGetOutputIndex(this.zza, str);
        if (nativeGetOutputIndex != -1) {
            return nativeGetOutputIndex;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str).length() + 31), "Input error: output ", str, " not found."));
        return 0;
    }

    public final boolean zzh(String str, int[] iArr) {
        this.zzc = false;
        return nativeResizeInput(this.zza, this.zzb, str, iArr);
    }

    public final void zzi() {
        if (this.zzc) {
            return;
        }
        nativeAllocateTensors(this.zza, this.zzb);
        this.zzc = true;
    }

    public final void zzj() {
        nativeInvoke(this.zza, this.zzb);
    }
}
