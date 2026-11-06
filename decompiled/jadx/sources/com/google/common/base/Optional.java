package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotMock("Use Optional.of(value) or Optional.absent()")
@GwtCompatible(serializable = true)
/* loaded from: classes8.dex */
public abstract class Optional<T> implements Serializable {

    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    @IgnoreJRERequirement
    public static <T> Optional<T> fromJavaUtil(java.util.Optional<T> optional) {
        if (optional == null) {
            return null;
        }
        return fromNullable(optional.orElse(null));
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? absent() : new Present(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$presentInstances$0(Iterable iterable) {
        return new AbstractIterator<T>(iterable) { // from class: com.google.common.base.Optional.1
            private final Iterator<? extends Optional<? extends T>> iterator;
            final /* synthetic */ Iterable val$optionals;

            {
                this.val$optionals = iterable;
                this.iterator = (Iterator) Preconditions.checkNotNull(iterable.iterator());
            }

            @Override // com.google.common.base.AbstractIterator
            public T computeNext() {
                while (this.iterator.hasNext()) {
                    Optional<? extends T> next = this.iterator.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return endOfData();
            }
        };
    }

    public static <T> Optional<T> of(T t) {
        return new Present(Preconditions.checkNotNull(t));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterable() { // from class: com.google.common.base.Optional$$ExternalSyntheticLambda0
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterator lambda$presentInstances$0;
                lambda$presentInstances$0 = Optional.lambda$presentInstances$0(iterable);
                return lambda$presentInstances$0;
            }
        };
    }

    @IgnoreJRERequirement
    public static <T> java.util.Optional<T> toJavaUtil(Optional<T> optional) {
        if (optional == null) {
            return null;
        }
        return optional.toJavaUtil();
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);

    @IgnoreJRERequirement
    public java.util.Optional<T> toJavaUtil() {
        return java.util.Optional.ofNullable(orNull());
    }
}
