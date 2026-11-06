package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzcg extends zzbs {
    final /* synthetic */ zzci zza;
    private final Object zzb;
    private int zzc;

    public zzcg(zzci zzciVar, int i) {
        this.zza = zzciVar;
        this.zzb = zzci.zzg(zzciVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int zzw;
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzax.zza(this.zzb, zzci.zzg(this.zza, this.zzc))) {
            zzw = this.zza.zzw(this.zzb);
            this.zzc = zzw;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzci.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        zzci zzciVar = this.zza;
        if (i == -1) {
            zzciVar.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzci.zzj(zzciVar, i);
        zzci.zzn(zzciVar, this.zzc, obj);
        return zzj;
    }
}
