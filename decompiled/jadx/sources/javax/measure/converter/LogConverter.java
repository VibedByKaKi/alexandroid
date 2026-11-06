package javax.measure.converter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class LogConverter extends UnitConverter {
    private static final long serialVersionUID = 1;
    private final double _base;
    private final double _invLogBase;
    private final Inverse _inverse = new Inverse();
    private final double _logBase;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Inverse extends UnitConverter {
        private static final long serialVersionUID = 1;

        private Inverse() {
        }

        @Override // javax.measure.converter.UnitConverter
        public double convert(double d) {
            return Math.exp(LogConverter.this._logBase * d);
        }

        @Override // javax.measure.converter.UnitConverter
        public boolean equals(Object obj) {
            return (obj instanceof Inverse) && LogConverter.this.equals(((Inverse) obj).inverse());
        }

        @Override // javax.measure.converter.UnitConverter
        public int hashCode() {
            return -LogConverter.this.hashCode();
        }

        @Override // javax.measure.converter.UnitConverter
        public UnitConverter inverse() {
            return LogConverter.this;
        }

        @Override // javax.measure.converter.UnitConverter
        public boolean isLinear() {
            return false;
        }
    }

    public LogConverter(double d) {
        this._base = d;
        double log = Math.log(d);
        this._logBase = log;
        this._invLogBase = 1.0d / log;
    }

    @Override // javax.measure.converter.UnitConverter
    public double convert(double d) {
        return Math.log(d) * this._invLogBase;
    }

    @Override // javax.measure.converter.UnitConverter
    public boolean equals(Object obj) {
        return (obj instanceof LogConverter) && ((float) this._base) == ((float) ((LogConverter) obj)._base);
    }

    public double getBase() {
        return this._base;
    }

    @Override // javax.measure.converter.UnitConverter
    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits((float) this._base);
        int i = floatToIntBits + (~(floatToIntBits << 9));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    @Override // javax.measure.converter.UnitConverter
    public UnitConverter inverse() {
        return this._inverse;
    }

    @Override // javax.measure.converter.UnitConverter
    public boolean isLinear() {
        return false;
    }
}
