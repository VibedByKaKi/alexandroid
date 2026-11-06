package com.amazon.alexa.accessory.internal.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ListUtils {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ListDifference<T> {
        public final List<T> added;
        public final List<T> removed;

        public ListDifference(List<T> list, List<T> list2) {
            Preconditions.notNull(list, "removed");
            Preconditions.notNull(list2, "added");
            this.removed = Collections.unmodifiableList(list);
            this.added = Collections.unmodifiableList(list2);
        }
    }

    private ListUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> ListDifference<T> diff(List<T> list, List<T> list2) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet(list2);
        for (T t : list) {
            if (!hashSet.remove(t)) {
                arrayList.add(t);
            }
        }
        return new ListDifference<>(arrayList, new ArrayList(hashSet));
    }
}
