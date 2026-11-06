package com.amazon.clouddrive.model;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ObjectComparator {
    private ObjectComparator() {
        throw new UnsupportedOperationException("Do not instantiate!");
    }

    public static int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        if (obj instanceof Comparable) {
            int compareTo = ((Comparable) obj).compareTo(obj2);
            if (compareTo != 0) {
                return compareTo;
            }
            return 0;
        }
        if (obj.equals(obj2)) {
            return 0;
        }
        int hashCode = obj.hashCode();
        int hashCode2 = obj2.hashCode();
        if (hashCode < hashCode2) {
            return -1;
        }
        return hashCode > hashCode2 ? 1 : 0;
    }

    public static int compareCollections(Collection collection, Collection collection2) {
        if (collection == collection2) {
            return 0;
        }
        if (collection == null) {
            return -1;
        }
        if (collection2 == null) {
            return 1;
        }
        int compare = compare(Integer.valueOf(collection.size()), Integer.valueOf(collection2.size()));
        if (compare != 0) {
            return compare;
        }
        Iterator it2 = collection.iterator();
        Iterator it3 = collection2.iterator();
        while (it2.hasNext()) {
            int compare2 = compare(it2.next(), it3.next());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }
}
