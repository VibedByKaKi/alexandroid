package javax.measure;

import java.io.Serializable;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class Measure<V, Q extends Quantity> implements Measurable<Q>, Serializable {
    private Unit<Q> _unit;
    private V _value;

    public Measure(V v, Unit<Q> unit) {
        this._value = v;
        this._unit = unit;
    }

    public static <N extends Number, Q extends Quantity> Measure<N, Q> valueOf(N n, Unit<Q> unit) {
        return new NumericMeasure(n, unit);
    }

    @Override // java.lang.Comparable
    public int compareTo(Measurable<Q> measurable) {
        return Double.compare(doubleValue(this._unit), measurable.doubleValue(this._unit));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Measure)) {
            return false;
        }
        Measure measure = (Measure) obj;
        return this._unit.equals(measure._unit) && this._value.equals(measure._value);
    }

    public final Unit<Q> getUnit() {
        return this._unit;
    }

    public final V getValue() {
        return this._value;
    }

    public int hashCode() {
        return this._value.hashCode() + this._unit.hashCode();
    }

    public String toString() {
        return getValue() + " " + getUnit();
    }
}
