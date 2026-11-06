package javax.measure;

import java.lang.Number;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
class NumericMeasure<N extends Number, Q extends Quantity> extends Measure<N, Q> {
    private static final long serialVersionUID = 1;

    public NumericMeasure(N n, Unit<Q> unit) {
        super(n, unit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.measure.Measurable
    public final double doubleValue(Unit<Q> unit) {
        return unit.equals(getUnit()) ? ((Number) getValue()).doubleValue() : getUnit().getConverterTo(unit).convert(((Number) getValue()).doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.measure.Measurable
    public final long longValue(Unit<Q> unit) throws ArithmeticException {
        if (unit.equals(getUnit())) {
            return ((Number) getValue()).longValue();
        }
        double doubleValue = doubleValue(unit);
        if (doubleValue >= -9.223372036854776E18d && doubleValue <= 9.223372036854776E18d) {
            return Math.round(doubleValue);
        }
        throw new ArithmeticException(doubleValue + " " + unit + " cannot be represented as long");
    }
}
