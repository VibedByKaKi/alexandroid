package javax.measure.unit;

import javax.measure.converter.UnitConverter;
import javax.measure.quantity.Quantity;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class TransformedUnit<Q extends Quantity> extends DerivedUnit<Q> {
    private static final long serialVersionUID = 1;
    private final Unit<Q> _parentUnit;
    private final UnitConverter _toParentUnit;

    public TransformedUnit(Unit<Q> unit, UnitConverter unitConverter) {
        if (unitConverter == UnitConverter.IDENTITY) {
            Single$$ExternalSyntheticBUOutline0.m$3("Identity not allowed");
            throw null;
        }
        this._parentUnit = unit;
        this._toParentUnit = unitConverter;
    }

    @Override // javax.measure.unit.Unit
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedUnit)) {
            return false;
        }
        TransformedUnit transformedUnit = (TransformedUnit) obj;
        return this._parentUnit.equals(transformedUnit._parentUnit) && this._toParentUnit.equals(transformedUnit._toParentUnit);
    }

    public Unit<Q> getParentUnit() {
        return this._parentUnit;
    }

    @Override // javax.measure.unit.Unit
    public Unit<? super Q> getSystemUnit() {
        return this._parentUnit.getSystemUnit();
    }

    @Override // javax.measure.unit.Unit
    public int hashCode() {
        return this._toParentUnit.hashCode() + this._parentUnit.hashCode();
    }

    public UnitConverter toParentUnit() {
        return this._toParentUnit;
    }

    @Override // javax.measure.unit.Unit
    public UnitConverter toSystemUnit() {
        return this._parentUnit.toSystemUnit().concatenate(this._toParentUnit);
    }
}
