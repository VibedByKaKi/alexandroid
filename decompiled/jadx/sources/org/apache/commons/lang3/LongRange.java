package org.apache.commons.lang3;

import java.util.stream.LongStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class LongRange extends NumberRange<Long> {
    private static final long serialVersionUID = 1;

    private LongRange(Long l, Long l2) {
        super(l, l2, null);
    }

    public static LongRange of(long j, long j2) {
        return of(Long.valueOf(j), Long.valueOf(j2));
    }

    public long fit(long j) {
        return ((Long) super.fit((LongRange) Long.valueOf(j))).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LongStream toLongStream() {
        return LongStream.rangeClosed(((Long) getMinimum()).longValue(), ((Long) getMaximum()).longValue());
    }

    public static LongRange of(Long l, Long l2) {
        return new LongRange(l, l2);
    }
}
