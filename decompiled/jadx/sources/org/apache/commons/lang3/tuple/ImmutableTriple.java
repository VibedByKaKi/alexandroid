package org.apache.commons.lang3.tuple;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ImmutableTriple<L, M, R> extends Triple<L, M, R> {
    public static final ImmutableTriple<?, ?, ?>[] EMPTY_ARRAY = new ImmutableTriple[0];
    private static final ImmutableTriple NULL = new ImmutableTriple(null, null, null);
    private static final long serialVersionUID = 1;
    public final L left;
    public final M middle;
    public final R right;

    public ImmutableTriple(L l, M m, R r) {
        this.left = l;
        this.middle = m;
        this.right = r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, M, R> ImmutableTriple<L, M, R>[] emptyArray() {
        return (ImmutableTriple<L, M, R>[]) EMPTY_ARRAY;
    }

    public static <L, M, R> ImmutableTriple<L, M, R> nullTriple() {
        return NULL;
    }

    public static <L, M, R> ImmutableTriple<L, M, R> of(L l, M m, R r) {
        return ((m != null) || (l != null) || r != null) ? new ImmutableTriple<>(l, m, r) : nullTriple();
    }

    public static <L, M, R> ImmutableTriple<L, M, R> ofNonNull(L l, M m, R r) {
        Objects.requireNonNull(l, "left");
        Objects.requireNonNull(m, "middle");
        Objects.requireNonNull(r, "right");
        return of((Object) l, (Object) m, (Object) r);
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public L getLeft() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public M getMiddle() {
        return this.middle;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public R getRight() {
        return this.right;
    }
}
