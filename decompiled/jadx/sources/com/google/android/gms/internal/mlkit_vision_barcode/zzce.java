package com.google.android.gms.internal.mlkit_vision_barcode;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class zzce implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzci zze;

    public /* synthetic */ zzce(zzci zzciVar, zzcd zzcdVar) {
        int i;
        this.zze = zzciVar;
        i = zzciVar.zzf;
        this.zzb = i;
        this.zzc = zzciVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i == this.zzb) {
            return;
        }
        OnnxMap$$ExternalSyntheticBUOutline0.m9m();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.zzc;
        this.zzd = i;
        Object zza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzaz.zzf(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzci zzciVar = this.zze;
        zzciVar.remove(zzci.zzg(zzciVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}
