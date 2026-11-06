package org.apache.commons.lang3.tuple;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MutableTriple<L, M, R> extends Triple<L, M, R> {
    public static final MutableTriple<?, ?, ?>[] EMPTY_ARRAY = new MutableTriple[0];
    private static final long serialVersionUID = 1;
    public L left;
    public M middle;
    public R right;

    public MutableTriple(L l, M m, R r) {
        this.left = l;
        this.middle = m;
        this.right = r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, M, R> MutableTriple<L, M, R>[] emptyArray() {
        return (MutableTriple<L, M, R>[]) EMPTY_ARRAY;
    }

    public static <L, M, R> MutableTriple<L, M, R> of(L l, M m, R r) {
        return new MutableTriple<>(l, m, r);
    }

    public static <L, M, R> MutableTriple<L, M, R> ofNonNull(L l, M m, R r) {
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

    public void setLeft(L l) {
        this.left = l;
    }

    public void setMiddle(M m) {
        this.middle = m;
    }

    public void setRight(R r) {
        this.right = r;
    }

    public MutableTriple() {
    }
}
