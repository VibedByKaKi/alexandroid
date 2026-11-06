package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class AndroidPredicates {
    private AndroidPredicates() {
    }

    public static <T> Predicate<T> False() {
        return new Predicate<T>() { // from class: com.facebook.common.internal.AndroidPredicates.2
            @Override // com.facebook.common.internal.Predicate
            public boolean apply(T t) {
                return false;
            }
        };
    }

    public static <T> Predicate<T> True() {
        return new Predicate<T>() { // from class: com.facebook.common.internal.AndroidPredicates.1
            @Override // com.facebook.common.internal.Predicate
            public boolean apply(T t) {
                return true;
            }
        };
    }
}
