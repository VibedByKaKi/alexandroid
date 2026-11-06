package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class zzbr extends zzbv implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzbr(Map map) {
        zzaz.zzd(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzr(zzbr zzbrVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzbrVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzbrVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb() {
        throw null;
    }

    public Collection zzc(Collection collection) {
        throw null;
    }

    public Collection zzd(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    public final Collection zzi() {
        return this instanceof zzdq ? new zzbu(this) : new zzbt(this);
    }

    public final Collection zzj(Object obj) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            collection = zza();
        }
        return zzd(obj, collection);
    }

    public final Collection zzk(@CheckForNull Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return zzb();
        }
        Collection zza = zza();
        zza.addAll(collection);
        this.zzb -= collection.size();
        collection.clear();
        return zzc(zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    public final Iterator zzl() {
        return new zzbf(this);
    }

    public final List zzm(Object obj, List list, @CheckForNull zzbo zzboVar) {
        return list instanceof RandomAccess ? new zzbm(this, obj, list, zzboVar) : new zzbq(this, obj, list, zzboVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    public final Map zzo() {
        return new zzbi(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    public final Set zzp() {
        return new zzbl(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final void zzs() {
        Iterator it2 = this.zza.values().iterator();
        while (it2.hasNext()) {
            ((Collection) it2.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final boolean zzt(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection zza = zza();
        if (!zza.add(obj2)) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "New Collection violated the Collection spec");
            return false;
        }
        this.zzb++;
        this.zza.put(obj, zza);
        return true;
    }
}
