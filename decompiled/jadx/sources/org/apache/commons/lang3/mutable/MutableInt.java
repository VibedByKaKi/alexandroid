package org.apache.commons.lang3.mutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MutableInt extends Number implements Comparable<MutableInt>, Mutable<Number> {
    private static final long serialVersionUID = 512176391864L;
    private int value;

    public MutableInt(Number number) {
        this.value = number.intValue();
    }

    public void add(Number number) {
        this.value = number.intValue() + this.value;
    }

    public int addAndGet(Number number) {
        int intValue = number.intValue() + this.value;
        this.value = intValue;
        return intValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableInt mutableInt) {
        return Integer.compare(this.value, mutableInt.value);
    }

    public void decrement() {
        this.value--;
    }

    public int decrementAndGet() {
        int i = this.value - 1;
        this.value = i;
        return i;
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

    public int getAndAdd(Number number) {
        int i = this.value;
        this.value = number.intValue() + i;
        return i;
    }

    public int getAndDecrement() {
        int i = this.value;
        this.value = i - 1;
        return i;
    }

    public int getAndIncrement() {
        int i = this.value;
        this.value = i + 1;
        return i;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    @Deprecated
    /* renamed from: getValue */
    public Number getValue2() {
        return Integer.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }

    public void increment() {
        this.value++;
    }

    public int incrementAndGet() {
        int i = this.value + 1;
        this.value = i;
        return i;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public void setValue(Number number) {
        this.value = number.intValue();
    }

    public void subtract(Number number) {
        this.value -= number.intValue();
    }

    public Integer toInteger() {
        return Integer.valueOf(intValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(int i) {
        this.value = i;
    }

    public MutableInt(int i) {
        this.value = i;
    }

    public void add(int i) {
        this.value += i;
    }

    public int addAndGet(int i) {
        int i2 = this.value + i;
        this.value = i2;
        return i2;
    }

    public int getAndAdd(int i) {
        int i2 = this.value;
        this.value = i + i2;
        return i2;
    }

    public void subtract(int i) {
        this.value -= i;
    }

    public MutableInt() {
    }

    public MutableInt(String str) {
        this.value = Integer.parseInt(str);
    }
}
