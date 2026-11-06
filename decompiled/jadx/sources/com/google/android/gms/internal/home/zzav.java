package com.google.android.gms.internal.home;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzav extends zzak {
    static final zzav zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzav(objArr, 0, objArr, 0, 0);
    }

    public zzav(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.home.zzaf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zza2 = zzae.zza(obj.hashCode());
        while (true) {
            int i = zza2 & this.zzf;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zza2 = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.home.zzak, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.home.zzak, com.google.android.gms.internal.home.zzaf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.home.zzak, com.google.android.gms.internal.home.zzaf
    /* renamed from: zze */
    public final zzba iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.home.zzak
    public final zzaj zzi() {
        return zzaj.zzk(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.home.zzak
    public final boolean zzm() {
        return true;
    }
}
