package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zzcv extends zzcn implements Set {

    @CheckForNull
    private transient zzcs zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        return zzds.zzb(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzds.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdu iterator();

    public final zzcs zzf() {
        zzcs zzcsVar = this.zza;
        if (zzcsVar != null) {
            return zzcsVar;
        }
        zzcs zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    public zzcs zzg() {
        Object[] array = toArray();
        int i = zzcs.zzd;
        return zzcs.zzg(array, array.length);
    }
}
