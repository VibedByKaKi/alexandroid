package javax.measure.unit;

import java.io.Serializable;
import javax.measure.converter.ConversionException;
import javax.measure.converter.UnitConverter;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Quantity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class ProductUnit<Q extends Quantity> extends DerivedUnit<Q> {
    private static final long serialVersionUID = 1;
    private final Element[] _elements;
    private int _hashCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Element implements Serializable {
        private static final long serialVersionUID = 1;
        private final int _pow;
        private final int _root;
        private final Unit _unit;

        private Element(Unit unit, int i, int i2) {
            this._unit = unit;
            this._pow = i;
            this._root = i2;
        }

        public int getPow() {
            return this._pow;
        }

        public int getRoot() {
            return this._root;
        }

        public Unit getUnit() {
            return this._unit;
        }
    }

    public ProductUnit(Unit unit) {
        this._elements = ((ProductUnit) unit)._elements;
    }

    private static int gcd(int i, int i2) {
        return i2 == 0 ? i : gcd(i2, i % i2);
    }

    private static Unit<? extends Quantity> getInstance(Element[] elementArr, Element[] elementArr2) {
        int i;
        Element[] elementArr3 = new Element[elementArr.length + elementArr2.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= elementArr.length) {
                break;
            }
            Unit unit = elementArr[i2]._unit;
            int i5 = elementArr[i2]._pow;
            int i6 = elementArr[i2]._root;
            int i7 = 0;
            while (true) {
                if (i7 >= elementArr2.length) {
                    i = 0;
                    break;
                }
                if (unit.equals(elementArr2[i7]._unit)) {
                    int i8 = elementArr2[i7]._pow;
                    int i9 = elementArr2[i7]._root;
                    i = i8;
                    i4 = i9;
                    break;
                }
                i7++;
            }
            int i10 = (i * i6) + (i5 * i4);
            int i11 = i6 * i4;
            if (i10 != 0) {
                int gcd = gcd(Math.abs(i10), i11);
                elementArr3[i3] = new Element(unit, i10 / gcd, i11 / gcd);
                i3++;
            }
            i2++;
        }
        for (int i12 = 0; i12 < elementArr2.length; i12++) {
            Unit unit2 = elementArr2[i12]._unit;
            int i13 = 0;
            while (true) {
                if (i13 >= elementArr.length) {
                    elementArr3[i3] = elementArr2[i12];
                    i3++;
                    break;
                }
                if (unit2.equals(elementArr[i13]._unit)) {
                    break;
                }
                i13++;
            }
        }
        if (i3 == 0) {
            return Unit.ONE;
        }
        if (i3 == 1 && elementArr3[0]._pow == elementArr3[0]._root) {
            return elementArr3[0]._unit;
        }
        Element[] elementArr4 = new Element[i3];
        for (int i14 = 0; i14 < i3; i14++) {
            elementArr4[i14] = elementArr3[i14];
        }
        return new ProductUnit(elementArr4);
    }

    public static Unit<? extends Quantity> getPowInstance(Unit unit, int i) {
        Element[] elementArr;
        if (unit instanceof ProductUnit) {
            Element[] elementArr2 = ((ProductUnit) unit)._elements;
            elementArr = new Element[elementArr2.length];
            for (int i2 = 0; i2 < elementArr2.length; i2++) {
                int gcd = gcd(Math.abs(elementArr2[i2]._pow * i), elementArr2[i2]._root);
                elementArr[i2] = new Element(elementArr2[i2]._unit, (elementArr2[i2]._pow * i) / gcd, elementArr2[i2]._root / gcd);
            }
        } else {
            elementArr = new Element[]{new Element(unit, i, 1)};
        }
        return getInstance(elementArr, new Element[0]);
    }

    public static Unit<? extends Quantity> getProductInstance(Unit unit, Unit unit2) {
        int i = 1;
        return getInstance(unit instanceof ProductUnit ? ((ProductUnit) unit)._elements : new Element[]{new Element(unit, i, i)}, unit2 instanceof ProductUnit ? ((ProductUnit) unit2)._elements : new Element[]{new Element(unit2, i, i)});
    }

    public static Unit<? extends Quantity> getQuotientInstance(Unit unit, Unit unit2) {
        Element[] elementArr;
        int i = 1;
        Element[] elementArr2 = unit instanceof ProductUnit ? ((ProductUnit) unit)._elements : new Element[]{new Element(unit, i, i)};
        if (unit2 instanceof ProductUnit) {
            Element[] elementArr3 = ((ProductUnit) unit2)._elements;
            elementArr = new Element[elementArr3.length];
            for (int i2 = 0; i2 < elementArr3.length; i2++) {
                elementArr[i2] = new Element(elementArr3[i2]._unit, -elementArr3[i2]._pow, elementArr3[i2]._root);
            }
        } else {
            elementArr = new Element[]{new Element(unit2, -1, i)};
        }
        return getInstance(elementArr2, elementArr);
    }

    public static Unit<? extends Quantity> getRootInstance(Unit unit, int i) {
        Element[] elementArr;
        if (unit instanceof ProductUnit) {
            Element[] elementArr2 = ((ProductUnit) unit)._elements;
            elementArr = new Element[elementArr2.length];
            for (int i2 = 0; i2 < elementArr2.length; i2++) {
                int gcd = gcd(Math.abs(elementArr2[i2]._pow), elementArr2[i2]._root * i);
                elementArr[i2] = new Element(elementArr2[i2]._unit, elementArr2[i2]._pow / gcd, (elementArr2[i2]._root * i) / gcd);
            }
        } else {
            elementArr = new Element[]{new Element(unit, 1, i)};
        }
        return getInstance(elementArr, new Element[0]);
    }

    private boolean isSystemUnit() {
        int i = 0;
        while (true) {
            Element[] elementArr = this._elements;
            if (i >= elementArr.length) {
                return true;
            }
            Unit unit = elementArr[i]._unit;
            if (!unit.getSystemUnit().equals(unit)) {
                return false;
            }
            i++;
        }
    }

    @Override // javax.measure.unit.Unit
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductUnit) {
            Element[] elementArr = ((ProductUnit) obj)._elements;
            if (this._elements.length == elementArr.length) {
                for (int i = 0; i < this._elements.length; i++) {
                    for (int i2 = 0; i2 < elementArr.length; i2++) {
                        if (this._elements[i]._unit.equals(elementArr[i2]._unit)) {
                            if (this._elements[i]._pow != elementArr[i2]._pow || this._elements[i]._root != elementArr[i2]._root) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // javax.measure.unit.Unit
    public Unit<? super Q> getSystemUnit() {
        if (isSystemUnit()) {
            return this;
        }
        Unit<Dimensionless> unit = Unit.ONE;
        int i = 0;
        while (true) {
            Element[] elementArr = this._elements;
            if (i >= elementArr.length) {
                return unit;
            }
            unit = (Unit<? super Q>) unit.times(elementArr[i]._unit.getSystemUnit().pow(this._elements[i]._pow).root(this._elements[i]._root));
            i++;
        }
    }

    public Unit<? extends Quantity> getUnit(int i) {
        return this._elements[i].getUnit();
    }

    public int getUnitCount() {
        return this._elements.length;
    }

    public int getUnitPow(int i) {
        return this._elements[i].getPow();
    }

    public int getUnitRoot(int i) {
        return this._elements[i].getRoot();
    }

    @Override // javax.measure.unit.Unit
    public int hashCode() {
        int i = this._hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Element[] elementArr = this._elements;
            if (i2 >= elementArr.length) {
                this._hashCode = i3;
                return i3;
            }
            i3 += ((this._elements[i2]._pow * 3) - (this._elements[i2]._root * 2)) * elementArr[i2]._unit.hashCode();
            i2++;
        }
    }

    @Override // javax.measure.unit.Unit
    public UnitConverter toSystemUnit() {
        if (isSystemUnit()) {
            return UnitConverter.IDENTITY;
        }
        UnitConverter unitConverter = UnitConverter.IDENTITY;
        int i = 0;
        while (true) {
            Element[] elementArr = this._elements;
            if (i >= elementArr.length) {
                return unitConverter;
            }
            UnitConverter systemUnit = elementArr[i]._unit.toSystemUnit();
            boolean isLinear = systemUnit.isLinear();
            Element[] elementArr2 = this._elements;
            if (!isLinear) {
                throw new ConversionException(elementArr2[i]._unit + " is non-linear, cannot convert");
            }
            int i2 = elementArr2[i]._root;
            Element[] elementArr3 = this._elements;
            if (i2 != 1) {
                throw new ConversionException(elementArr3[i]._unit + " holds a base unit with fractional exponent");
            }
            int i3 = elementArr3[i]._pow;
            if (i3 < 0) {
                i3 = -i3;
                systemUnit = systemUnit.inverse();
            }
            for (int i4 = 0; i4 < i3; i4++) {
                unitConverter = unitConverter.concatenate(systemUnit);
            }
            i++;
        }
    }

    public ProductUnit() {
        this._elements = new Element[0];
    }

    private ProductUnit(Element[] elementArr) {
        this._elements = elementArr;
    }
}
