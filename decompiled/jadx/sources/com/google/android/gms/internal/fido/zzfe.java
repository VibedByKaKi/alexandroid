package com.google.android.gms.internal.fido;

import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzfe implements Iterator {
    final /* synthetic */ zzff zza;
    private int zzb = 0;

    public zzfe(zzff zzffVar) {
        this.zza = zzffVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zzff zzffVar = this.zza;
        return i < zzffVar.zza() - zzffVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr;
        int i = this.zzb;
        zzff zzffVar = this.zza;
        if (i >= zzffVar.zza() - zzffVar.zzb()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        zzff zzffVar2 = this.zza;
        objArr = zzffVar2.zzb.zzb;
        Object obj = objArr[zzffVar2.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
