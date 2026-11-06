package javax.measure.unit;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.HashMap;
import javax.measure.converter.AddConverter;
import javax.measure.converter.ConversionException;
import javax.measure.converter.MultiplyConverter;
import javax.measure.converter.RationalConverter;
import javax.measure.converter.UnitConverter;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Quantity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class Unit<Q extends Quantity> implements Serializable {
    public static final Unit<Dimensionless> ONE = new ProductUnit();
    static final HashMap<String, Unit> SYMBOL_TO_UNIT = new HashMap<>();

    private Unit getBaseUnits() {
        Unit<? super Q> systemUnit = getSystemUnit();
        if (systemUnit instanceof BaseUnit) {
            return systemUnit;
        }
        if (systemUnit instanceof AlternateUnit) {
            return ((AlternateUnit) systemUnit).getParent().getBaseUnits();
        }
        if (!(systemUnit instanceof ProductUnit)) {
            throw new InternalError("System Unit cannot be an instance of " + getClass());
        }
        ProductUnit productUnit = (ProductUnit) systemUnit;
        Unit unit = ONE;
        for (int i = 0; i < productUnit.getUnitCount(); i++) {
            unit = unit.times(productUnit.getUnit(i).getBaseUnits().pow(productUnit.getUnitPow(i)).root(productUnit.getUnitRoot(i)));
        }
        return unit;
    }

    private static UnitConverter transformOf(Unit unit) {
        if (unit instanceof BaseUnit) {
            return Dimension.getModel().getTransform((BaseUnit) unit);
        }
        ProductUnit productUnit = (ProductUnit) unit;
        UnitConverter unitConverter = UnitConverter.IDENTITY;
        for (int i = 0; i < productUnit.getUnitCount(); i++) {
            UnitConverter transformOf = transformOf(productUnit.getUnit(i));
            if (!transformOf.isLinear()) {
                throw new ConversionException(unit + " is non-linear, cannot convert");
            }
            if (productUnit.getUnitRoot(i) != 1) {
                throw new ConversionException(productUnit + " holds a base unit with fractional exponent");
            }
            int unitPow = productUnit.getUnitPow(i);
            if (unitPow < 0) {
                unitPow = -unitPow;
                transformOf = transformOf.inverse();
            }
            for (int i2 = 0; i2 < unitPow; i2++) {
                unitConverter = unitConverter.concatenate(transformOf);
            }
        }
        return unitConverter;
    }

    public static Unit<? extends Quantity> valueOf(CharSequence charSequence) {
        return UnitFormat.getStandardInstance().parse(charSequence, new ParsePosition(0));
    }

    public final CompoundUnit<Q> compound(Unit<Q> unit) {
        return new CompoundUnit<>(this, unit);
    }

    public final Unit<Q> divide(double d) {
        return transform(new MultiplyConverter(1.0d / d));
    }

    public abstract boolean equals(Object obj);

    public final UnitConverter getConverterTo(Unit unit) throws ConversionException {
        if (equals(unit)) {
            return UnitConverter.IDENTITY;
        }
        Unit<? super Q> systemUnit = getSystemUnit();
        Unit<? super Q> systemUnit2 = unit.getSystemUnit();
        if (systemUnit.equals(systemUnit2)) {
            return unit.toSystemUnit().inverse().concatenate(toSystemUnit());
        }
        if (systemUnit.getDimension().equals(systemUnit2.getDimension())) {
            return unit.toSystemUnit().concatenate(transformOf(unit.getBaseUnits())).inverse().concatenate(toSystemUnit().concatenate(transformOf(getBaseUnits())));
        }
        throw new ConversionException(this + " is not compatible with " + unit);
    }

    public final Dimension getDimension() {
        Unit<? super Q> systemUnit = getSystemUnit();
        if (systemUnit instanceof BaseUnit) {
            return Dimension.getModel().getDimension((BaseUnit) systemUnit);
        }
        if (systemUnit instanceof AlternateUnit) {
            return ((AlternateUnit) systemUnit).getParent().getDimension();
        }
        ProductUnit productUnit = (ProductUnit) systemUnit;
        Dimension dimension = Dimension.NONE;
        for (int i = 0; i < productUnit.getUnitCount(); i++) {
            dimension = dimension.times(productUnit.getUnit(i).getDimension().pow(productUnit.getUnitPow(i)).root(productUnit.getUnitRoot(i)));
        }
        return dimension;
    }

    public abstract Unit<? super Q> getSystemUnit();

    public abstract int hashCode();

    public final Unit<? extends Quantity> inverse() {
        return ProductUnit.getQuotientInstance(ONE, this);
    }

    public final boolean isCompatible(Unit unit) {
        return this == unit || getSystemUnit().equals(unit.getSystemUnit()) || getDimension().equals(unit.getDimension());
    }

    public final Unit<Q> plus(double d) {
        return transform(new AddConverter(d));
    }

    public final Unit<? extends Quantity> pow(int i) {
        return i > 0 ? times(pow(i - 1)) : i == 0 ? ONE : ONE.divide(pow(-i));
    }

    public final Unit<? extends Quantity> root(int i) {
        if (i > 0) {
            return ProductUnit.getRootInstance(this, i);
        }
        if (i != 0) {
            return ONE.divide(root(-i));
        }
        Duration$$ExternalSyntheticBUOutline0.m("Root's order of zero");
        return null;
    }

    public final Unit<Q> times(long j) {
        return transform(new RationalConverter(j, 1L));
    }

    public final String toString() {
        return UnitFormat.getStandardInstance().format(this);
    }

    public abstract UnitConverter toSystemUnit();

    public final Unit<Q> transform(UnitConverter unitConverter) {
        if (!(this instanceof TransformedUnit)) {
            return unitConverter == UnitConverter.IDENTITY ? this : new TransformedUnit(this, unitConverter);
        }
        TransformedUnit transformedUnit = (TransformedUnit) this;
        Unit<Q> parentUnit = transformedUnit.getParentUnit();
        UnitConverter concatenate = transformedUnit.toParentUnit().concatenate(unitConverter);
        return concatenate == UnitConverter.IDENTITY ? parentUnit : new TransformedUnit(parentUnit, concatenate);
    }

    public final Unit<Q> times(double d) {
        return transform(new MultiplyConverter(d));
    }

    public final Unit<Q> divide(long j) {
        return transform(new RationalConverter(1L, j));
    }

    public final Unit<? extends Quantity> times(Unit unit) {
        return ProductUnit.getProductInstance(this, unit);
    }

    public final Unit<? extends Quantity> divide(Unit unit) {
        return times(unit.inverse());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Quantity> Unit<T> asType(Class<T> cls) {
        return this;
    }
}
