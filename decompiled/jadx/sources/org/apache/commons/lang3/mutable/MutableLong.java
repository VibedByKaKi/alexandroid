package org.apache.commons.lang3.mutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MutableLong extends Number implements Comparable<MutableLong>, Mutable<Number> {
    private static final long serialVersionUID = 62986528375L;
    private long value;

    public MutableLong(Number number) {
        this.value = number.longValue();
    }

    public void add(Number number) {
        this.value = number.longValue() + this.value;
    }

    public long addAndGet(Number number) {
        long longValue = number.longValue() + this.value;
        this.value = longValue;
        return longValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableLong mutableLong) {
        return Long.compare(this.value, mutableLong.value);
    }

    public void decrement() {
        this.value--;
    }

    public long decrementAndGet() {
        long j = this.value - 1;
        this.value = j;
        return j;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableLong) && this.value == ((MutableLong) obj).longValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public long getAndAdd(Number number) {
        long j = this.value;
        this.value = number.longValue() + j;
        return j;
    }

    public long getAndDecrement() {
        long j = this.value;
        this.value = j - 1;
        return j;
    }

    public long getAndIncrement() {
        long j = this.value;
        this.value = 1 + j;
        return j;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    @Deprecated
    /* renamed from: getValue */
    public Number getValue2() {
        return Long.valueOf(this.value);
    }

    public int hashCode() {
        long j = this.value;
        return (int) (j ^ (j >>> 32));
    }

    public void increment() {
        this.value++;
    }

    public long incrementAndGet() {
        long j = this.value + 1;
        this.value = j;
        return j;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public void setValue(Number number) {
        this.value = number.longValue();
    }

    public void subtract(Number number) {
        this.value -= number.longValue();
    }

    public Long toLong() {
        return Long.valueOf(longValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(long j) {
        this.value = j;
    }

    public MutableLong(long j) {
        this.value = j;
    }

    public void add(long j) {
        this.value += j;
    }

    public long addAndGet(long j) {
        long j2 = this.value + j;
        this.value = j2;
        return j2;
    }

    public long getAndAdd(long j) {
        long j2 = this.value;
        this.value = j + j2;
        return j2;
    }

    public void subtract(long j) {
        this.value -= j;
    }

    public MutableLong() {
    }

    public MutableLong(String str) {
        this.value = Long.parseLong(str);
    }
}
