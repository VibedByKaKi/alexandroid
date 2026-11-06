package com.google.android.gms.tflite.dynamite.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.apps.common.proguard.UsedByNative;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzd {
    private final long zza;
    private final Object zzb;

    public zzd(long j, Object obj, boolean z) {
        this.zza = j;
        this.zzb = obj;
    }

    @UsedByNative("NativeInitializationHandleInternal_gen.cc")
    public Object getLogger() {
        return this.zzb;
    }

    @UsedByNative("NativeInitializationHandleInternal_gen.cc")
    @VisibleForTesting
    public long getTflApi() {
        return this.zza;
    }

    @UsedByNative("NativeInitializationHandleInternal_gen.cc")
    public boolean shouldUseInitV2() {
        return false;
    }
}
