package org.apache.commons.lang.mutable;

import org.apache.commons.lang.math.NumberUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MutableDouble extends Number implements Comparable, Mutable {
    private static final long serialVersionUID = 1587163916;
    private double value;

    public MutableDouble(Number number) {
        this.value = number.doubleValue();
    }

    public void add(Number number) {
        this.value = number.doubleValue() + this.value;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return NumberUtils.compare(this.value, ((MutableDouble) obj).value);
    }

    public void decrement() {
        this.value -= 1.0d;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableDouble) && Double.doubleToLongBits(((MutableDouble) obj).value) == Double.doubleToLongBits(this.value);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) this.value;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return new Double(this.value);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.value);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public void increment() {
        this.value += 1.0d;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    public boolean isInfinite() {
        return Double.isInfinite(this.value);
    }

    public boolean isNaN() {
        return Double.isNaN(this.value);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.value;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        setValue(((Number) obj).doubleValue());
    }

    public void subtract(Number number) {
        this.value -= number.doubleValue();
    }

    public Double toDouble() {
        return new Double(doubleValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public MutableDouble(double d) {
        this.value = d;
    }

    public void add(double d) {
        this.value += d;
    }

    public void setValue(double d) {
        this.value = d;
    }

    public void subtract(double d) {
        this.value -= d;
    }

    public MutableDouble() {
    }

    public MutableDouble(String str) throws NumberFormatException {
        this.value = Double.parseDouble(str);
    }
}
