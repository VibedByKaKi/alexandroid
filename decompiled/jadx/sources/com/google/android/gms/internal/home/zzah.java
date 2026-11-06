package com.google.android.gms.internal.home;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzah extends zzaj {
    private final transient zzaj zza;

    public zzah(zzaj zzajVar) {
        this.zza = zzajVar;
    }

    private final int zzp(int i) {
        return (this.zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.home.zzaj, com.google.android.gms.internal.home.zzaf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzab.zza(i, this.zza.size(), "index");
        return this.zza.get(zzp(i));
    }

    @Override // com.google.android.gms.internal.home.zzaj, java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzp(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.home.zzaj, java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzp(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.home.zzaj
    public final zzaj zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.home.zzaj, java.util.List
    /* renamed from: zzi */
    public final zzaj subList(int i, int i2) {
        zzab.zzf(i, i2, this.zza.size());
        zzaj zzajVar = this.zza;
        return zzajVar.subList(zzajVar.size() - i2, this.zza.size() - i).zzh();
    }
}
