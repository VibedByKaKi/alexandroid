package com.google.android.gms.tflite.dynamite.internal;

import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzi {
    private final DynamiteModule zza;
    private final int zzb;

    public zzi(DynamiteModule dynamiteModule, int i) {
        this.zza = dynamiteModule;
        this.zzb = i;
    }

    public final IBinder zza(String str) throws DynamiteModule.LoadingException {
        return this.zza.instantiate(str);
    }

    public final int zzb() {
        return this.zzb;
    }
}
