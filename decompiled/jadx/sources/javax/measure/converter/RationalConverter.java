package javax.measure.converter;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class RationalConverter extends UnitConverter {
    private static final long serialVersionUID = 1;
    private final long _dividend;
    private final long _divisor;

    public RationalConverter(long j, long j2) {
        if (j2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Negative divisor");
            throw null;
        }
        if (j == j2) {
            Single$$ExternalSyntheticBUOutline0.m$3("Identity converter not allowed");
            throw null;
        }
        this._dividend = j;
        this._divisor = j2;
    }

    private static long gcd(long j, long j2) {
        return j2 == 0 ? j : gcd(j2, j % j2);
    }

    private static UnitConverter valueOf(long j, long j2) {
        return (j == 1 && j2 == 1) ? UnitConverter.IDENTITY : new RationalConverter(j, j2);
    }

    @Override // javax.measure.converter.UnitConverter
    public UnitConverter concatenate(UnitConverter unitConverter) {
        if (!(unitConverter instanceof RationalConverter)) {
            return unitConverter instanceof MultiplyConverter ? unitConverter.concatenate(this) : super.concatenate(unitConverter);
        }
        RationalConverter rationalConverter = (RationalConverter) unitConverter;
        long j = this._dividend;
        long j2 = rationalConverter._dividend;
        long j3 = j * j2;
        long j4 = this._divisor;
        long j5 = rationalConverter._divisor;
        long j6 = j4 * j5;
        double d = j * j2;
        double d2 = j4 * j5;
        if (j3 != d || j6 != d2) {
            return new MultiplyConverter(d / d2);
        }
        long gcd = gcd(j3, j6);
        return valueOf(j3 / gcd, j6 / gcd);
    }

    @Override // javax.measure.converter.UnitConverter
    public double convert(double d) {
        return (d * this._dividend) / this._divisor;
    }

    @Override // javax.measure.converter.UnitConverter
    public boolean equals(Object obj) {
        if (!(obj instanceof RationalConverter)) {
            return false;
        }
        RationalConverter rationalConverter = (RationalConverter) obj;
        return this._dividend == rationalConverter._dividend && this._divisor == rationalConverter._divisor;
    }

    public long getDividend() {
        return this._dividend;
    }

    public long getDivisor() {
        return this._divisor;
    }

    @Override // javax.measure.converter.UnitConverter
    public int hashCode() {
        long j = this._dividend - this._divisor;
        int i = (int) (j ^ (j >>> 32));
        int i2 = i + (~(i << 9));
        int i3 = i2 ^ (i2 >>> 14);
        int i4 = i3 + (i3 << 4);
        return i4 ^ (i4 >>> 10);
    }

    @Override // javax.measure.converter.UnitConverter
    public UnitConverter inverse() {
        long j = this._dividend;
        long j2 = this._divisor;
        return j < 0 ? new RationalConverter(-j2, -j) : new RationalConverter(j2, j);
    }

    @Override // javax.measure.converter.UnitConverter
    public boolean isLinear() {
        return true;
    }
}
