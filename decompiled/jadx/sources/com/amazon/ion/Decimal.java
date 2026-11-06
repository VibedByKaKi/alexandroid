package com.amazon.ion;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Decimal extends BigDecimal {
    private static final long serialVersionUID = 1;
    public static final Decimal ZERO = new Decimal(0);
    public static final Decimal NEGATIVE_ZERO = new NegativeZero(0);

    public static BigDecimal bigDecimalValue(BigDecimal bigDecimal) {
        return (bigDecimal == null || bigDecimal.getClass() == BigDecimal.class) ? bigDecimal : new BigDecimal(bigDecimal.unscaledValue(), bigDecimal.scale());
    }

    public static boolean equals(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return isNegativeZero(bigDecimal) == isNegativeZero(bigDecimal2) && bigDecimal.equals(bigDecimal2);
    }

    public static boolean isNegativeZero(BigDecimal bigDecimal) {
        return bigDecimal.getClass() == NegativeZero.class;
    }

    public static Decimal negativeZero(int i) {
        return new NegativeZero(i);
    }

    public static Decimal valueOf(String str) {
        boolean startsWith = str.startsWith("-");
        Decimal decimal = new Decimal(str);
        return (startsWith && decimal.signum() == 0) ? new NegativeZero(decimal.scale()) : decimal;
    }

    private Decimal(BigInteger bigInteger, int i) {
        super(bigInteger, i);
    }

    private Decimal(BigInteger bigInteger, int i, MathContext mathContext) {
        super(bigInteger, i, mathContext);
    }

    private Decimal(BigInteger bigInteger) {
        super(bigInteger);
    }

    public static Decimal negativeZero(int i, MathContext mathContext) {
        return new NegativeZero(i, mathContext);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NegativeZero extends Decimal {
        private static final long serialVersionUID = 1;

        private NegativeZero(int i) {
            super(BigInteger.ZERO, i);
        }

        @Override // java.math.BigDecimal
        public BigDecimal abs() {
            return new BigDecimal(unscaledValue(), scale());
        }

        @Override // java.math.BigDecimal, java.lang.Number
        public double doubleValue() {
            double doubleValue = super.doubleValue();
            return Double.compare(0.0d, doubleValue) <= 0 ? doubleValue * (-1.0d) : doubleValue;
        }

        @Override // java.math.BigDecimal, java.lang.Number
        public float floatValue() {
            float floatValue = super.floatValue();
            return Float.compare(0.0f, floatValue) <= 0 ? floatValue * (-1.0f) : floatValue;
        }

        @Override // java.math.BigDecimal
        public String toEngineeringString() {
            return "-" + super.toEngineeringString();
        }

        @Override // java.math.BigDecimal
        public String toPlainString() {
            return "-" + super.toPlainString();
        }

        @Override // java.math.BigDecimal
        public String toString() {
            return "-" + super.toString();
        }

        private NegativeZero(int i, MathContext mathContext) {
            super(BigInteger.ZERO, i, mathContext);
        }

        @Override // java.math.BigDecimal
        public BigDecimal abs(MathContext mathContext) {
            return new BigDecimal(unscaledValue(), scale(), mathContext);
        }
    }

    private Decimal(BigInteger bigInteger, MathContext mathContext) {
        super(bigInteger, mathContext);
    }

    private Decimal(int i) {
        super(i);
    }

    private Decimal(int i, MathContext mathContext) {
        super(i, mathContext);
    }

    private Decimal(long j) {
        super(j);
    }

    private Decimal(long j, MathContext mathContext) {
        super(j, mathContext);
    }

    public final boolean isNegativeZero() {
        return getClass() == NegativeZero.class;
    }

    private Decimal(double d) {
        super(d);
    }

    private Decimal(double d, MathContext mathContext) {
        super(d, mathContext);
    }

    private Decimal(char[] cArr, int i, int i2) {
        super(cArr, i, i2);
    }

    private Decimal(char[] cArr, int i, int i2, MathContext mathContext) {
        super(cArr, i, i2, mathContext);
    }

    private Decimal(char[] cArr) {
        super(cArr);
    }

    private Decimal(char[] cArr, MathContext mathContext) {
        super(cArr, mathContext);
    }

    private Decimal(String str) {
        super(str);
    }

    private Decimal(String str, MathContext mathContext) {
        super(str, mathContext);
    }

    public final BigDecimal bigDecimalValue() {
        return new BigDecimal(unscaledValue(), scale());
    }

    public static Decimal valueOf(BigInteger bigInteger, int i, MathContext mathContext) {
        return new Decimal(bigInteger, i, mathContext);
    }

    public static Decimal valueOf(BigInteger bigInteger) {
        return new Decimal(bigInteger);
    }

    public static Decimal valueOf(BigInteger bigInteger, MathContext mathContext) {
        return new Decimal(bigInteger, mathContext);
    }

    public static Decimal valueOf(int i) {
        return new Decimal(i);
    }

    public static Decimal valueOf(int i, MathContext mathContext) {
        return new Decimal(i, mathContext);
    }

    public static Decimal valueOf(long j) {
        return new Decimal(j);
    }

    public static Decimal valueOf(long j, MathContext mathContext) {
        return new Decimal(j, mathContext);
    }

    public static Decimal valueOf(double d) {
        if (Double.compare(d, -0.0d) == 0) {
            return new NegativeZero(1);
        }
        return new Decimal(Double.toString(d));
    }

    public static Decimal valueOf(double d, MathContext mathContext) {
        if (Double.compare(d, -0.0d) == 0) {
            return new NegativeZero(1, mathContext);
        }
        return new Decimal(Double.toString(d), mathContext);
    }

    public static Decimal valueOf(BigDecimal bigDecimal) {
        if (bigDecimal != null && !(bigDecimal instanceof Decimal)) {
            return new Decimal(bigDecimal.unscaledValue(), bigDecimal.scale());
        }
        return (Decimal) bigDecimal;
    }

    public static Decimal valueOf(BigDecimal bigDecimal, MathContext mathContext) {
        return new Decimal(bigDecimal.unscaledValue(), bigDecimal.scale(), mathContext);
    }

    public static Decimal valueOf(BigInteger bigInteger, int i) {
        return new Decimal(bigInteger, i);
    }

    public static Decimal valueOf(String str, MathContext mathContext) {
        boolean startsWith = str.startsWith("-");
        Decimal decimal = new Decimal(str, mathContext);
        return (startsWith && decimal.signum() == 0) ? new NegativeZero(decimal.scale(), mathContext) : decimal;
    }
}
