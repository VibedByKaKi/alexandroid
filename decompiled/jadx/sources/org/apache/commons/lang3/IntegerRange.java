package org.apache.commons.lang3;

import java.util.stream.IntStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class IntegerRange extends NumberRange<Integer> {
    private static final long serialVersionUID = 1;

    private IntegerRange(Integer num, Integer num2) {
        super(num, num2, null);
    }

    public static IntegerRange of(int i, int i2) {
        return of(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public int fit(int i) {
        return ((Integer) super.fit((IntegerRange) Integer.valueOf(i))).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntStream toIntStream() {
        return IntStream.rangeClosed(((Integer) getMinimum()).intValue(), ((Integer) getMaximum()).intValue());
    }

    public static IntegerRange of(Integer num, Integer num2) {
        return new IntegerRange(num, num2);
    }
}
