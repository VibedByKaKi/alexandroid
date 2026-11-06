package com.amazon.coral;

import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class Strings {
    private Strings() {
    }

    public static String join(String str, Iterable<String> iterable) {
        if (iterable == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("strings cannot be null");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = iterable.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
