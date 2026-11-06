package com.amazon.coral.google.common.hash;

import com.amazon.coral.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
final class LongAddables {
    private static final Supplier<LongAddable> SUPPLIER;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        private PureJavaLongAddable() {
        }

        @Override // com.amazon.coral.google.common.hash.LongAddable
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // com.amazon.coral.google.common.hash.LongAddable
        public void increment() {
            getAndIncrement();
        }

        @Override // com.amazon.coral.google.common.hash.LongAddable
        public long sum() {
            return get();
        }
    }

    static {
        Supplier<LongAddable> supplier;
        try {
            new LongAdder();
            supplier = new Supplier<LongAddable>() { // from class: com.amazon.coral.google.common.hash.LongAddables.1
                @Override // com.amazon.coral.google.common.base.Supplier, java.util.function.Supplier
                public LongAddable get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            supplier = new Supplier<LongAddable>() { // from class: com.amazon.coral.google.common.hash.LongAddables.2
                @Override // com.amazon.coral.google.common.base.Supplier, java.util.function.Supplier
                public LongAddable get() {
                    return new PureJavaLongAddable();
                }
            };
        }
        SUPPLIER = supplier;
    }

    public static LongAddable create() {
        return SUPPLIER.get();
    }
}
