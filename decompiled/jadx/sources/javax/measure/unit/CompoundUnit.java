package javax.measure.unit;

import javax.measure.converter.UnitConverter;
import javax.measure.quantity.Quantity;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class CompoundUnit<Q extends Quantity> extends DerivedUnit<Q> {
    private static final long serialVersionUID = 1;
    private final Unit<Q> _first;
    private final Unit<Q> _next;

    public CompoundUnit(Unit<Q> unit, Unit<Q> unit2) {
        if (!unit.getSystemUnit().equals(unit2.getSystemUnit())) {
            Single$$ExternalSyntheticBUOutline0.m$3("Both units do not have the same system unit");
            throw null;
        }
        if (!(unit instanceof CompoundUnit)) {
            this._first = unit;
            this._next = unit2;
        } else {
            CompoundUnit compoundUnit = (CompoundUnit) unit;
            this._first = compoundUnit._first;
            this._next = new CompoundUnit(compoundUnit._next, unit2);
        }
    }

    @Override // javax.measure.unit.Unit
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompoundUnit)) {
            return false;
        }
        CompoundUnit compoundUnit = (CompoundUnit) obj;
        return this._first.equals(compoundUnit._first) && this._next.equals(compoundUnit._next);
    }

    public Unit<Q> getFirst() {
        return this._first;
    }

    public Unit<Q> getNext() {
        return this._next;
    }

    @Override // javax.measure.unit.Unit
    public Unit<? super Q> getSystemUnit() {
        return this._first.getSystemUnit();
    }

    @Override // javax.measure.unit.Unit
    public int hashCode() {
        return this._next.hashCode() ^ this._first.hashCode();
    }

    @Override // javax.measure.unit.Unit
    public UnitConverter toSystemUnit() {
        return this._first.toSystemUnit();
    }
}
