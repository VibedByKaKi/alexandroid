package org.apache.commons.lang3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class DoubleRange extends NumberRange<Double> {
    private static final long serialVersionUID = 1;

    private DoubleRange(Double d, Double d2) {
        super(d, d2, null);
    }

    public static DoubleRange of(double d, double d2) {
        return of(Double.valueOf(d), Double.valueOf(d2));
    }

    public double fit(double d) {
        return ((Double) super.fit((DoubleRange) Double.valueOf(d))).doubleValue();
    }

    public static DoubleRange of(Double d, Double d2) {
        return new DoubleRange(d, d2);
    }
}
