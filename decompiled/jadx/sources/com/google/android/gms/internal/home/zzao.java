package com.google.android.gms.internal.home;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzao extends zzba {
    boolean zza;
    final /* synthetic */ Object zzb;

    public zzao(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.zza = true;
        return this.zzb;
    }
}
