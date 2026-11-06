package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzbh implements Iterator {
    final Iterator zza;

    @CheckForNull
    Collection zzb;
    final /* synthetic */ zzbi zzc;

    public zzbh(zzbi zzbiVar) {
        this.zzc = zzbiVar;
        this.zza = zzbiVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new zzco(key, this.zzc.zzb.zzd(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        zzaz.zzf(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzbr zzbrVar = this.zzc.zzb;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
