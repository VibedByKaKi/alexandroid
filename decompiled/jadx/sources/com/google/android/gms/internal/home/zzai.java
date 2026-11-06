package com.google.android.gms.internal.home;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzai extends zzaj {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaj zzc;

    public zzai(zzaj zzajVar, int i, int i2) {
        this.zzc = zzajVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzab.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    @CheckForNull
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.home.zzaj, java.util.List
    /* renamed from: zzi */
    public final zzaj subList(int i, int i2) {
        zzab.zzf(i, i2, this.zzb);
        zzaj zzajVar = this.zzc;
        int i3 = this.zza;
        return zzajVar.subList(i + i3, i2 + i3);
    }
}
