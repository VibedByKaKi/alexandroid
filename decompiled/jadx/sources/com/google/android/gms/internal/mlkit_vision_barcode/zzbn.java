package com.google.android.gms.internal.mlkit_vision_barcode;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
class zzbn implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzbo zzc;

    public zzbn(zzbo zzboVar) {
        this.zzc = zzboVar;
        Collection collection = zzboVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zza.remove();
        zzbr zzbrVar = this.zzc.zze;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i - 1;
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb == this.zzb) {
            return;
        }
        OnnxMap$$ExternalSyntheticBUOutline0.m9m();
    }

    public zzbn(zzbo zzboVar, Iterator it2) {
        this.zzc = zzboVar;
        this.zzb = zzboVar.zzb;
        this.zza = it2;
    }
}
