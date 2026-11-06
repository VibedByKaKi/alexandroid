package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.coral.google.j2objc.annotations.ReflectionSupport;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@ReflectionSupport(ReflectionSupport.Level.FULL)
/* loaded from: classes19.dex */
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private static final AtomicLongFieldUpdater<AtomicDouble> updater = AtomicLongFieldUpdater.newUpdater(AtomicDouble.class, "value");
    private volatile transient long value;

    public AtomicDouble(double d) {
        this.value = Double.doubleToRawLongBits(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ double lambda$accumulateAndGet$1(DoubleBinaryOperator doubleBinaryOperator, double d, double d2) {
        return doubleBinaryOperator.applyAsDouble(d2, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ double lambda$getAndAccumulate$0(DoubleBinaryOperator doubleBinaryOperator, double d, double d2) {
        return doubleBinaryOperator.applyAsDouble(d2, d);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        set(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(get());
    }

    @CanIgnoreReturnValue
    public final double accumulateAndGet(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Preconditions.checkNotNull(doubleBinaryOperator);
        return updateAndGet(new AtomicDouble$$ExternalSyntheticLambda0(0, d, doubleBinaryOperator));
    }

    @CanIgnoreReturnValue
    public final double addAndGet(double d) {
        return accumulateAndGet(d, new AtomicDouble$$ExternalSyntheticLambda1());
    }

    public final boolean compareAndSet(double d, double d2) {
        return updater.compareAndSet(this, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.value);
    }

    @CanIgnoreReturnValue
    public final double getAndAccumulate(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Preconditions.checkNotNull(doubleBinaryOperator);
        return getAndUpdate(new AtomicDouble$$ExternalSyntheticLambda0(1, d, doubleBinaryOperator));
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(double d) {
        return getAndAccumulate(d, new AtomicDouble$$ExternalSyntheticLambda1());
    }

    public final double getAndSet(double d) {
        return Double.longBitsToDouble(updater.getAndSet(this, Double.doubleToRawLongBits(d)));
    }

    @CanIgnoreReturnValue
    public final double getAndUpdate(DoubleUnaryOperator doubleUnaryOperator) {
        while (true) {
            long j = this.value;
            double longBitsToDouble = Double.longBitsToDouble(j);
            AtomicDouble atomicDouble = this;
            if (updater.compareAndSet(atomicDouble, j, Double.doubleToRawLongBits(doubleUnaryOperator.applyAsDouble(longBitsToDouble)))) {
                return longBitsToDouble;
            }
            this = atomicDouble;
        }
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double d) {
        updater.lazySet(this, Double.doubleToRawLongBits(d));
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    public final void set(double d) {
        this.value = Double.doubleToRawLongBits(d);
    }

    public String toString() {
        return Double.toString(get());
    }

    @CanIgnoreReturnValue
    public final double updateAndGet(DoubleUnaryOperator doubleUnaryOperator) {
        while (true) {
            long j = this.value;
            double applyAsDouble = doubleUnaryOperator.applyAsDouble(Double.longBitsToDouble(j));
            AtomicDouble atomicDouble = this;
            if (updater.compareAndSet(atomicDouble, j, Double.doubleToRawLongBits(applyAsDouble))) {
                return applyAsDouble;
            }
            this = atomicDouble;
        }
    }

    public final boolean weakCompareAndSet(double d, double d2) {
        return updater.weakCompareAndSet(this, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public AtomicDouble() {
    }
}
