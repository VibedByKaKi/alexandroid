package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
/* loaded from: classes8.dex */
public interface Predicate<T> {
    boolean apply(@ParametricNullness T t);

    boolean equals(Object obj);
}
