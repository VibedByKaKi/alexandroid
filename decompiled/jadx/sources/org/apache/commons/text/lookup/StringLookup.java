package org.apache.commons.text.lookup;

import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface StringLookup extends UnaryOperator<String> {
    @Deprecated
    String lookup(String str);

    @Override // java.util.function.Function
    default String apply(String str) {
        return lookup(str);
    }
}
