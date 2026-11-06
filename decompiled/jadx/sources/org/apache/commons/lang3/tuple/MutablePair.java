package org.apache.commons.lang3.tuple;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MutablePair<L, R> extends Pair<L, R> {
    public static final MutablePair<?, ?>[] EMPTY_ARRAY = new MutablePair[0];
    private static final long serialVersionUID = 4954918890077093841L;
    public L left;
    public R right;

    public MutablePair(L l, R r) {
        this.left = l;
        this.right = r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> MutablePair<L, R>[] emptyArray() {
        return (MutablePair<L, R>[]) EMPTY_ARRAY;
    }

    public static <L, R> MutablePair<L, R> of(Map.Entry<L, R> entry) {
        L l;
        R r;
        if (entry != null) {
            l = entry.getKey();
            r = entry.getValue();
        } else {
            l = null;
            r = null;
        }
        return new MutablePair<>(l, r);
    }

    public static <L, R> MutablePair<L, R> ofNonNull(L l, R r) {
        Objects.requireNonNull(l, "left");
        Objects.requireNonNull(r, "right");
        return of((Object) l, (Object) r);
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public L getLeft() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public R getRight() {
        return this.right;
    }

    public void setLeft(L l) {
        this.left = l;
    }

    public void setRight(R r) {
        this.right = r;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r) {
        R right = getRight();
        setRight(r);
        return right;
    }

    public MutablePair() {
    }

    public static <L, R> MutablePair<L, R> ofNonNull(Map.Entry<L, R> entry) {
        Objects.requireNonNull(entry, "pair");
        return of((Map.Entry) entry);
    }

    public static <L, R> MutablePair<L, R> of(L l, R r) {
        return new MutablePair<>(l, r);
    }
}
