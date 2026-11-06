package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzfe extends zzdr implements RandomAccess, zzff {

    @Deprecated
    public static final zzff zza;
    private static final zzfe zzb;
    private final List zzc;

    static {
        zzfe zzfeVar = new zzfe(false);
        zzb = zzfeVar;
        zza = zzfeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfe(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.zzc = arrayList;
    }

    private static String zzh(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzef ? ((zzef) obj).zzl(zzfa.zzb) : zzfa.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof zzff) {
            collection = ((zzff) collection).zzg();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zzh(remove);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zzh(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i) {
        if (i < size()) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzfe(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final zzff zze() {
        return zzc() ? new zzhe(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzef) {
            zzef zzefVar = (zzef) obj;
            String zzl = zzefVar.zzl(zzfa.zzb);
            if (zzefVar.zzh()) {
                this.zzc.set(i, zzl);
            }
            return zzl;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzfa.zzd(bArr);
        if (zzhn.zzb(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final List zzg() {
        return Collections.unmodifiableList(this.zzc);
    }

    public zzfe() {
        this(10);
    }

    private zzfe(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzfe(boolean z) {
        super(false);
        this.zzc = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
