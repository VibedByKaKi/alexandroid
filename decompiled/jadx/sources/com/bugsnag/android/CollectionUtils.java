package com.bugsnag.android;

import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CollectionUtils {
    public static <T> boolean containsNullElements(@Nullable Collection<T> collection) {
        if (collection == null) {
            return true;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (it2.next() == null) {
                return true;
            }
        }
        return false;
    }
}
