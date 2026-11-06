package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.primitives.ImmutableLongArray;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Double.doubleToRawLongBits(dArr[i]);
        }
        this.longs = new AtomicLongArray(jArr);
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
        int readInt = objectInputStream.readInt();
        ImmutableLongArray.Builder builder = ImmutableLongArray.builder();
        for (int i = 0; i < readInt; i++) {
            builder.add(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.longs = new AtomicLongArray(builder.build().toArray());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = length();
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeDouble(get(i));
        }
    }

    @CanIgnoreReturnValue
    public final double accumulateAndGet(int i, double d, DoubleBinaryOperator doubleBinaryOperator) {
        Preconditions.checkNotNull(doubleBinaryOperator);
        return updateAndGet(i, new AtomicDouble$$ExternalSyntheticLambda0(3, d, doubleBinaryOperator));
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i, double d) {
        return accumulateAndGet(i, d, new AtomicDouble$$ExternalSyntheticLambda1());
    }

    public final boolean compareAndSet(int i, double d, double d2) {
        return this.longs.compareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public final double get(int i) {
        return Double.longBitsToDouble(this.longs.get(i));
    }

    @CanIgnoreReturnValue
    public final double getAndAccumulate(int i, double d, DoubleBinaryOperator doubleBinaryOperator) {
        Preconditions.checkNotNull(doubleBinaryOperator);
        return getAndUpdate(i, new AtomicDouble$$ExternalSyntheticLambda0(2, d, doubleBinaryOperator));
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i, double d) {
        return getAndAccumulate(i, d, new AtomicDouble$$ExternalSyntheticLambda1());
    }

    public final double getAndSet(int i, double d) {
        return Double.longBitsToDouble(this.longs.getAndSet(i, Double.doubleToRawLongBits(d)));
    }

    @CanIgnoreReturnValue
    public final double getAndUpdate(int i, DoubleUnaryOperator doubleUnaryOperator) {
        while (true) {
            long j = this.longs.get(i);
            double longBitsToDouble = Double.longBitsToDouble(j);
            int i2 = i;
            if (this.longs.compareAndSet(i2, j, Double.doubleToRawLongBits(doubleUnaryOperator.applyAsDouble(longBitsToDouble)))) {
                return longBitsToDouble;
            }
            i = i2;
        }
    }

    public final void lazySet(int i, double d) {
        this.longs.lazySet(i, Double.doubleToRawLongBits(d));
    }

    public final int length() {
        return this.longs.length();
    }

    public final void set(int i, double d) {
        this.longs.set(i, Double.doubleToRawLongBits(d));
    }

    public String toString() {
        int length = length();
        int i = length - 1;
        if (i == -1) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length * 19);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int i2 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.longs.get(i2)));
            if (i2 == i) {
                sb.append(AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            i2++;
        }
    }

    @CanIgnoreReturnValue
    public final double updateAndGet(int i, DoubleUnaryOperator doubleUnaryOperator) {
        while (true) {
            long j = this.longs.get(i);
            double applyAsDouble = doubleUnaryOperator.applyAsDouble(Double.longBitsToDouble(j));
            int i2 = i;
            if (this.longs.compareAndSet(i2, j, Double.doubleToRawLongBits(applyAsDouble))) {
                return applyAsDouble;
            }
            i = i2;
        }
    }

    public final boolean weakCompareAndSet(int i, double d, double d2) {
        return this.longs.weakCompareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public AtomicDoubleArray(int i) {
        this.longs = new AtomicLongArray(i);
    }
}
