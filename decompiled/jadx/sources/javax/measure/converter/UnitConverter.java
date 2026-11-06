package javax.measure.converter;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class UnitConverter implements Serializable {
    public static final UnitConverter IDENTITY = new Identity();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Compound extends UnitConverter {
        private static final long serialVersionUID = 1;
        private final UnitConverter _first;
        private final UnitConverter _second;

        private Compound(UnitConverter unitConverter, UnitConverter unitConverter2) {
            this._first = unitConverter;
            this._second = unitConverter2;
        }

        @Override // javax.measure.converter.UnitConverter
        public double convert(double d) {
            return this._second.convert(this._first.convert(d));
        }

        @Override // javax.measure.converter.UnitConverter
        public boolean equals(Object obj) {
            if (!(obj instanceof Compound)) {
                return false;
            }
            Compound compound = (Compound) obj;
            return this._first.equals(compound._first) && this._second.equals(compound._second);
        }

        @Override // javax.measure.converter.UnitConverter
        public int hashCode() {
            return this._second.hashCode() + this._first.hashCode();
        }

        @Override // javax.measure.converter.UnitConverter
        public UnitConverter inverse() {
            return new Compound(this._second.inverse(), this._first.inverse());
        }

        @Override // javax.measure.converter.UnitConverter
        public boolean isLinear() {
            return this._first.isLinear() && this._second.isLinear();
        }
    }

    public UnitConverter concatenate(UnitConverter unitConverter) {
        return unitConverter == IDENTITY ? this : new Compound(this);
    }

    public abstract double convert(double d) throws ConversionException;

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract UnitConverter inverse();

    public abstract boolean isLinear();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Identity extends UnitConverter {
        private static final long serialVersionUID = 1;

        private Identity() {
        }

        @Override // javax.measure.converter.UnitConverter
        public boolean equals(Object obj) {
            return this == obj;
        }

        @Override // javax.measure.converter.UnitConverter
        public int hashCode() {
            return 0;
        }

        @Override // javax.measure.converter.UnitConverter
        public boolean isLinear() {
            return true;
        }

        @Override // javax.measure.converter.UnitConverter
        public UnitConverter inverse() {
            return this;
        }

        @Override // javax.measure.converter.UnitConverter
        public UnitConverter concatenate(UnitConverter unitConverter) {
            return unitConverter;
        }

        @Override // javax.measure.converter.UnitConverter
        public double convert(double d) {
            return d;
        }
    }
}
