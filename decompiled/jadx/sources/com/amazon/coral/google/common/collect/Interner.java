package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@DoNotMock("Use Interners.new*Interner")
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface Interner<E> {
    @CanIgnoreReturnValue
    E intern(E e);
}
