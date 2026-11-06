package com.google.android.gms.internal.home;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzau extends zzaj {
    static final zzaj zza = new zzau(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzau(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzab.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.home.zzaj, com.google.android.gms.internal.home.zzaf
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final Object[] zzg() {
        return this.zzb;
    }
}
