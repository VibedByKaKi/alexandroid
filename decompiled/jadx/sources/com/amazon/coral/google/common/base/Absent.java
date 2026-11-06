package com.amazon.coral.google.common.base;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import java.util.Collections;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
final class Absent<T> extends Optional<T> {
    static final Absent<Object> INSTANCE = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static <T> Optional<T> withType() {
        return INSTANCE;
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.EMPTY_SET;
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
        return (T) Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.amazon.coral.google.common.base.Optional
    @CheckForNull
    public T orNull() {
        return null;
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    @Override // com.amazon.coral.google.common.base.Optional
    public T or(T t) {
        return (T) Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }
}
