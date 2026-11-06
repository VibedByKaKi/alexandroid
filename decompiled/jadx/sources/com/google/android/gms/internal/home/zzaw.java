package com.google.android.gms.internal.home;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzaw extends zzal {
    static final zzaw zzc = new zzaw(zzaj.zzm(), zzar.zza);
    final transient zzaj zzd;

    public zzaw(zzaj zzajVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzajVar;
    }

    @Override // com.google.android.gms.internal.home.zzal, java.util.NavigableSet
    @CheckForNull
    public final Object ceiling(Object obj) {
        int zzw = zzw(obj, true);
        if (zzw == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(zzw);
    }

    @Override // com.google.android.gms.internal.home.zzaf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzal) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzaq) {
            collection = ((zzaq) collection).zza();
        }
        if (!zzaz.zza(((zzal) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzbb listIterator = this.zzd.listIterator(0);
        Iterator it2 = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = listIterator.next();
        while (true) {
            try {
                int compare = ((zzal) this).zza.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    }
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.home.zzak, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zzaz.zza(((zzal) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it2 = set.iterator();
        try {
            zzbb listIterator = this.zzd.listIterator(0);
            while (listIterator.hasNext()) {
                E next = listIterator.next();
                Object next2 = it2.next();
                if (next2 == null || ((zzal) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.home.zzal, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.zzd.get(0);
        }
        Single$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // com.google.android.gms.internal.home.zzal, java.util.NavigableSet
    @CheckForNull
    public final Object floor(Object obj) {
        int zzv = zzv(obj, true) - 1;
        if (zzv == -1) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // com.google.android.gms.internal.home.zzal, java.util.NavigableSet
    @CheckForNull
    public final Object higher(Object obj) {
        int zzw = zzw(obj, false);
        if (zzw == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(zzw);
    }

    @Override // com.google.android.gms.internal.home.zzal, com.google.android.gms.internal.home.zzak, com.google.android.gms.internal.home.zzaf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.home.zzal, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        return this.zzd.get(r1.size() - 1);
    }

    @Override // com.google.android.gms.internal.home.zzal, java.util.NavigableSet
    @CheckForNull
    public final Object lower(Object obj) {
        int zzv = zzv(obj, false) - 1;
        if (zzv == -1) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zza(Object[] objArr, int i) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.home.zzak, com.google.android.gms.internal.home.zzaf
    public final zzaj zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.home.zzal, com.google.android.gms.internal.home.zzak, com.google.android.gms.internal.home.zzaf
    /* renamed from: zze */
    public final zzba iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    @CheckForNull
    public final Object[] zzg() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.home.zzal
    public final zzal zzo() {
        Comparator reverseOrder = Collections.reverseOrder(((zzal) this).zza);
        return isEmpty() ? zzal.zzt(reverseOrder) : new zzaw(this.zzd.zzh(), reverseOrder);
    }

    @Override // com.google.android.gms.internal.home.zzal
    public final zzal zzp(Object obj, boolean z) {
        return zzx(0, zzv(obj, z));
    }

    @Override // com.google.android.gms.internal.home.zzal
    public final zzal zzr(Object obj, boolean z, Object obj2, boolean z2) {
        return zzs(obj, z).zzp(obj2, z2);
    }

    @Override // com.google.android.gms.internal.home.zzal
    public final zzal zzs(Object obj, boolean z) {
        return zzx(zzw(obj, z), this.zzd.size());
    }

    @Override // com.google.android.gms.internal.home.zzal, java.util.NavigableSet
    /* renamed from: zzu */
    public final zzba descendingIterator() {
        return this.zzd.zzh().listIterator(0);
    }

    public final int zzv(Object obj, boolean z) {
        zzaj zzajVar = this.zzd;
        obj.getClass();
        int binarySearch = Collections.binarySearch(zzajVar, obj, ((zzal) this).zza);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int zzw(Object obj, boolean z) {
        zzaj zzajVar = this.zzd;
        obj.getClass();
        int binarySearch = Collections.binarySearch(zzajVar, obj, ((zzal) this).zza);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final zzaw zzx(int i, int i2) {
        if (i == 0) {
            if (i2 == this.zzd.size()) {
                return this;
            }
            i = 0;
        }
        return i < i2 ? new zzaw(this.zzd.subList(i, i2), ((zzal) this).zza) : zzal.zzt(((zzal) this).zza);
    }
}
