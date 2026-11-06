package com.google.android.gms.internal.fido;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzca extends zzcc {
    private final transient zzcc zza;

    public zzca(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    private final int zzl(int i) {
        return (this.zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.zza(i, this.zza.size(), "index");
        return this.zza.get(zzl(i));
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzl(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzl(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final zzcc zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzcc subList(int i, int i2) {
        zzbm.zze(i, i2, this.zza.size());
        zzcc zzccVar = this.zza;
        return zzccVar.subList(zzccVar.size() - i2, this.zza.size() - i).zzf();
    }
}
