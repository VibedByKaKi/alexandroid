package javax.measure.converter;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class MultiplyConverter extends UnitConverter {
    private static final long serialVersionUID = 1;
    private final double _factor;

    public MultiplyConverter(double d) {
        if (((float) d) != 1.0d) {
            this._factor = d;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Identity converter not allowed");
            throw null;
        }
    }

    private static UnitConverter valueOf(double d) {
        return ((float) d) == 1.0f ? UnitConverter.IDENTITY : new MultiplyConverter(d);
    }

    @Override // javax.measure.converter.UnitConverter
    public UnitConverter concatenate(UnitConverter unitConverter) {
        if (unitConverter instanceof MultiplyConverter) {
            return valueOf(this._factor * ((MultiplyConverter) unitConverter)._factor);
        }
        if (!(unitConverter instanceof RationalConverter)) {
            return super.concatenate(unitConverter);
        }
        RationalConverter rationalConverter = (RationalConverter) unitConverter;
        return valueOf((this._factor * rationalConverter.getDividend()) / rationalConverter.getDivisor());
    }

    @Override // javax.measure.converter.UnitConverter
    public double convert(double d) {
        return this._factor * d;
    }

    @Override // javax.measure.converter.UnitConverter
    public boolean equals(Object obj) {
        return (obj instanceof MultiplyConverter) && ((float) this._factor) == ((float) ((MultiplyConverter) obj)._factor);
    }

    public double getFactor() {
        return this._factor;
    }

    @Override // javax.measure.converter.UnitConverter
    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits((float) this._factor);
        int i = floatToIntBits + (~(floatToIntBits << 9));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    @Override // javax.measure.converter.UnitConverter
    public UnitConverter inverse() {
        return new MultiplyConverter(1.0d / this._factor);
    }

    @Override // javax.measure.converter.UnitConverter
    public boolean isLinear() {
        return true;
    }
}
