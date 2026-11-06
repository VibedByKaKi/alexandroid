package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzdb {
    public static boolean zza(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zzcq.zza;
            }
        } else {
            if (!(iterable instanceof zzda)) {
                return false;
            }
            comparator2 = ((zzda) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
