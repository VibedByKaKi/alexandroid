package javax.measure.unit;

import java.util.HashMap;
import javax.measure.converter.UnitConverter;
import javax.measure.quantity.Quantity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class BaseUnit<Q extends Quantity> extends Unit<Q> {
    private static final long serialVersionUID = 1;
    private final String _symbol;

    public BaseUnit(String str) {
        this._symbol = str;
        HashMap<String, Unit> hashMap = Unit.SYMBOL_TO_UNIT;
        synchronized (hashMap) {
            try {
                Unit unit = hashMap.get(str);
                if (unit == null) {
                    hashMap.put(str, this);
                } else {
                    if (unit instanceof BaseUnit) {
                        return;
                    }
                    throw new IllegalArgumentException("Symbol " + str + " is associated to a different unit");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // javax.measure.unit.Unit
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BaseUnit) {
            return this._symbol.equals(((BaseUnit) obj)._symbol);
        }
        return false;
    }

    public final String getSymbol() {
        return this._symbol;
    }

    @Override // javax.measure.unit.Unit
    public int hashCode() {
        return this._symbol.hashCode();
    }

    @Override // javax.measure.unit.Unit
    public UnitConverter toSystemUnit() {
        return UnitConverter.IDENTITY;
    }

    @Override // javax.measure.unit.Unit
    public Unit<? super Q> getSystemUnit() {
        return this;
    }
}
