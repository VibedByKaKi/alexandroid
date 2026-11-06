package com.google.android.gms.internal.fido;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzfg extends AbstractMap {
    private static final Comparator zza = new zzfd();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd = new zzff(this, -1);
    private Integer zze = null;
    private String zzf = null;

    public zzfg(List list) {
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            zzfc.zza((zzfc) it2.next());
            throw null;
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        Iterator it3 = list.iterator();
        if (it3.hasNext()) {
            zzfc.zza((zzfc) it3.next());
            throw null;
        }
        int[] iArr = {0};
        if (size > 16 && size * 9 > 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        this.zzb = objArr;
        this.zzc = iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }
}
