package javax.measure.converter;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class AddConverter extends UnitConverter {
    private static final long serialVersionUID = 1;
    private final double _offset;

    public AddConverter(double d) {
        if (((float) d) != 0.0d) {
            this._offset = d;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Identity converter not allowed");
            throw null;
        }
    }

    private static UnitConverter valueOf(double d) {
        return ((float) d) == 0.0f ? UnitConverter.IDENTITY : new AddConverter(d);
    }

    @Override // javax.measure.converter.UnitConverter
    public UnitConverter concatenate(UnitConverter unitConverter) {
        return unitConverter instanceof AddConverter ? valueOf(this._offset + ((AddConverter) unitConverter)._offset) : super.concatenate(unitConverter);
    }

    @Override // javax.measure.converter.UnitConverter
    public double convert(double d) {
        return d + this._offset;
    }

    @Override // javax.measure.converter.UnitConverter
    public boolean equals(Object obj) {
        return (obj instanceof AddConverter) && ((float) this._offset) == ((float) ((AddConverter) obj)._offset);
    }

    public double getOffset() {
        return this._offset;
    }

    @Override // javax.measure.converter.UnitConverter
    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits((float) this._offset);
        int i = floatToIntBits + (~(floatToIntBits << 9));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    @Override // javax.measure.converter.UnitConverter
    public UnitConverter inverse() {
        return new AddConverter(-this._offset);
    }

    @Override // javax.measure.converter.UnitConverter
    public boolean isLinear() {
        return false;
    }
}
