package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzdo {
    public static zzdj zza(zzdj zzdjVar) {
        return !(zzdjVar instanceof zzdm) ? zzdjVar instanceof zzdk ? zzdjVar : zzdjVar instanceof Serializable ? new zzdk(zzdjVar) : new zzdm(zzdjVar) : zzdjVar;
    }

    public static zzdj zzb(Object obj) {
        return new zzdn(obj);
    }
}
