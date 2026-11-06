package com.amazon.clouddrive.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Optional<T> {
    private static final Optional NONE = new None();
    private final boolean mHasValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class None extends Optional {
        private None() {
            super(false);
        }

        @Override // com.amazon.clouddrive.utils.Optional
        public Object get() {
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Some<V> extends Optional<V> {
        private final V item;

        private Some(V v) {
            super(true);
            this.item = v;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Some.class == obj.getClass()) {
                V v = this.item;
                V v2 = ((Some) obj).item;
                if (v == null ? v2 == null : v.equals(v2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.amazon.clouddrive.utils.Optional
        public V get() {
            return this.item;
        }

        public int hashCode() {
            V v = this.item;
            if (v != null) {
                return v.hashCode();
            }
            return 0;
        }
    }

    public Optional(boolean z) {
        this.mHasValue = z;
    }

    public static <V> Optional<V> absent() {
        return NONE;
    }

    public static <V> Optional<V> fromNullable(V v) {
        return v == null ? absent() : new Some(v);
    }

    public static <V> Optional<V> of(V v) {
        return new Some(v);
    }

    public abstract T get();

    public final boolean isPresent() {
        return this.mHasValue;
    }
}
