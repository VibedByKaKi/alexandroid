package com.google.android.gms.internal.home;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zzaj extends zzaf implements List, RandomAccess {
    private static final zzbb zza = new zzag(zzau.zza, 0);

    public static zzaj zzj(Object[] objArr) {
        return zzk(objArr, objArr.length);
    }

    public static zzaj zzk(Object[] objArr, int i) {
        return i == 0 ? zzau.zza : new zzau(objArr, i);
    }

    public static zzaj zzl(Collection collection) {
        if (!(collection instanceof zzaf)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzas.zzb(array, length);
            return zzk(array, length);
        }
        zzaj zzd = ((zzaf) collection).zzd();
        if (!zzd.zzf()) {
            return zzd;
        }
        Object[] array2 = zzd.toArray();
        return zzk(array2, array2.length);
    }

    public static zzaj zzm() {
        return zzau.zza;
    }

    public static zzaj zzn(Object obj) {
        Object[] objArr = {obj};
        zzas.zzb(objArr, 1);
        return zzk(objArr, 1);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.home.zzaf, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!zzaa.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = iterator();
        Iterator it3 = list.iterator();
        while (it2.hasNext()) {
            if (!it3.hasNext() || !zzaa.zza(it2.next(), it3.next())) {
                return false;
            }
        }
        return !it3.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.home.zzaf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.home.zzaf
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.home.zzaf
    /* renamed from: zze */
    public final zzba iterator() {
        return listIterator(0);
    }

    public zzaj zzh() {
        return size() <= 1 ? this : new zzah(this);
    }

    @Override // java.util.List
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public zzaj subList(int i, int i2) {
        zzab.zzf(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzau.zza : new zzai(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final zzbb listIterator(int i) {
        zzab.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzag(this, i);
    }

    @Override // com.google.android.gms.internal.home.zzaf
    @Deprecated
    public final zzaj zzd() {
        return this;
    }
}
