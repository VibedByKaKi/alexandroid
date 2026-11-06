package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzhd implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhe zzb;

    public zzhd(zzhe zzheVar) {
        zzff zzffVar;
        this.zzb = zzheVar;
        zzffVar = zzheVar.zza;
        this.zza = zzffVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
