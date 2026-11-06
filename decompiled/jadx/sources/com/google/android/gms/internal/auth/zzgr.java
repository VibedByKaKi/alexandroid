package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzgr implements Iterator {
    final /* synthetic */ zzgv zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.zzb + 1;
        list = this.zza.zzb;
        if (i < list.size()) {
            return true;
        }
        map = this.zza.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        list = this.zza.zzb;
        if (i >= list.size()) {
            return (Map.Entry) zza().next();
        }
        list2 = this.zza.zzb;
        return (Map.Entry) list2.get(this.zzb);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzc) {
            Single$$ExternalSyntheticBUOutline0.m$2("remove() was called before next()");
            return;
        }
        this.zzc = false;
        this.zza.zzn();
        int i = this.zzb;
        list = this.zza.zzb;
        if (i >= list.size()) {
            zza().remove();
            return;
        }
        zzgv zzgvVar = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 - 1;
        zzgvVar.zzl(i2);
    }
}
