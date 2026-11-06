package org.apache.commons.lang3.compare;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class ObjectToStringComparator implements Comparator<Object>, Serializable {
    public static final ObjectToStringComparator INSTANCE = new ObjectToStringComparator();
    private static final long serialVersionUID = 1;

    @Deprecated
    public ObjectToStringComparator() {
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        String obj3 = obj.toString();
        String obj4 = obj2.toString();
        if (obj3 == obj4) {
            return 0;
        }
        if (obj3 == null) {
            return 1;
        }
        if (obj4 == null) {
            return -1;
        }
        return obj3.compareTo(obj4);
    }
}
