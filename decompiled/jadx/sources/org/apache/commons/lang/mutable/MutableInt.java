package org.apache.commons.lang.mutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MutableInt extends Number implements Comparable, Mutable {
    private static final long serialVersionUID = 512176391864L;
    private int value;

    public MutableInt(Number number) {
        this.value = number.intValue();
    }

    public void add(Number number) {
        this.value = number.intValue() + this.value;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        int i = ((MutableInt) obj).value;
        int i2 = this.value;
        if (i2 < i) {
            return -1;
        }
        return i2 == i ? 0 : 1;
    }

    public void decrement() {
        this.value--;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableInt) && this.value == ((MutableInt) obj).intValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return new Integer(this.value);
    }

    public int hashCode() {
        return this.value;
    }

    public void increment() {
        this.value++;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        setValue(((Number) obj).intValue());
    }

    public void subtract(Number number) {
        this.value -= number.intValue();
    }

    public Integer toInteger() {
        return new Integer(intValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public MutableInt(int i) {
        this.value = i;
    }

    public void add(int i) {
        this.value += i;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public void subtract(int i) {
        this.value -= i;
    }

    public MutableInt() {
    }

    public MutableInt(String str) throws NumberFormatException {
        this.value = Integer.parseInt(str);
    }
}
