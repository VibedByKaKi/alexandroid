package okio;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.input.UnsynchronizedByteArrayInputStream;
import org.apache.commons.io.output.AbstractByteArrayOutputStream;
import org.apache.commons.io.output.ThresholdingOutputStream;
import org.apache.commons.lang3.function.FailableDoubleFunction;
import org.apache.commons.lang3.function.FailableDoubleToIntFunction;
import org.apache.commons.lang3.function.FailableDoubleToLongFunction;
import org.apache.commons.lang3.function.FailableIntFunction;
import org.apache.commons.lang3.function.FailableIntToDoubleFunction;
import org.apache.commons.lang3.function.FailableIntToFloatFunction;
import org.apache.commons.lang3.function.FailableIntToLongFunction;
import org.apache.commons.lang3.function.FailableLongFunction;
import org.apache.commons.lang3.function.FailableLongToDoubleFunction;
import org.apache.commons.lang3.function.FailableLongToIntFunction;
import org.apache.commons.lang3.function.FailableObjDoubleConsumer;
import org.apache.commons.lang3.function.FailableObjIntConsumer;
import org.apache.commons.lang3.function.FailableObjLongConsumer;
import org.apache.commons.lang3.function.FailableToBooleanFunction;
import org.apache.commons.lang3.function.FailableToDoubleBiFunction;
import org.apache.commons.lang3.function.FailableToDoubleFunction;
import org.apache.commons.lang3.function.FailableToIntBiFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class Path$$ExternalSyntheticBUOutline0 implements IOFunction, AbstractByteArrayOutputStream.InputStreamConstructor, FailableDoubleFunction, FailableDoubleToIntFunction, FailableDoubleToLongFunction, FailableIntFunction, FailableIntToDoubleFunction, FailableIntToFloatFunction, FailableIntToLongFunction, FailableLongFunction, FailableLongToDoubleFunction, FailableLongToIntFunction, FailableObjDoubleConsumer, FailableObjIntConsumer, FailableObjLongConsumer, FailableToBooleanFunction, FailableToDoubleBiFunction, FailableToDoubleFunction, FailableToIntBiFunction {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Path$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(int i, String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + i + ((Object) " parts: ") + obj + ((Object) " in ") + obj2);
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3) {
        throw new IOException(str + obj + obj2 + obj3);
    }

    @Override // org.apache.commons.lang3.function.FailableObjDoubleConsumer
    public void accept(Object obj, double d) {
        FailableObjDoubleConsumer.lambda$static$0(obj, d);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        Object lambda$identity$8;
        OutputStream lambda$static$0;
        switch (this.$r8$classId) {
            case 9:
                lambda$identity$8 = IOFunction.lambda$identity$8(obj);
                return lambda$identity$8;
            default:
                lambda$static$0 = ThresholdingOutputStream.lambda$static$0((ThresholdingOutputStream) obj);
                return lambda$static$0;
        }
    }

    @Override // org.apache.commons.lang3.function.FailableToBooleanFunction
    public boolean applyAsBoolean(Object obj) {
        boolean lambda$static$0;
        lambda$static$0 = FailableToBooleanFunction.lambda$static$0(obj);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableIntToDoubleFunction
    public double applyAsDouble(int i) {
        double lambda$static$0;
        lambda$static$0 = FailableIntToDoubleFunction.lambda$static$0(i);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableIntToFloatFunction
    public float applyAsFloat(int i) {
        float lambda$static$0;
        lambda$static$0 = FailableIntToFloatFunction.lambda$static$0(i);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleToIntFunction
    public int applyAsInt(double d) {
        int lambda$static$0;
        lambda$static$0 = FailableDoubleToIntFunction.lambda$static$0(d);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleToLongFunction
    public int applyAsLong(double d) {
        int lambda$static$0;
        lambda$static$0 = FailableDoubleToLongFunction.lambda$static$0(d);
        return lambda$static$0;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream.InputStreamConstructor
    public InputStream construct(byte[] bArr, int i, int i2) {
        switch (this.$r8$classId) {
            case 10:
                return new ByteArrayInputStream(bArr, i, i2);
            default:
                return new UnsynchronizedByteArrayInputStream(bArr, i, i2);
        }
    }

    @Override // org.apache.commons.lang3.function.FailableObjIntConsumer
    public void accept(Object obj, int i) {
        FailableObjIntConsumer.lambda$static$0(obj, i);
    }

    @Override // org.apache.commons.lang3.function.FailableObjLongConsumer
    public void accept(Object obj, long j) {
        FailableObjLongConsumer.lambda$static$0(obj, j);
    }

    @Override // org.apache.commons.lang3.function.FailableLongToDoubleFunction
    public double applyAsDouble(long j) {
        double lambda$static$0;
        lambda$static$0 = FailableLongToDoubleFunction.lambda$static$0(j);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableLongToIntFunction
    public int applyAsInt(long j) {
        int lambda$static$0;
        lambda$static$0 = FailableLongToIntFunction.lambda$static$0(j);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableIntToLongFunction
    public long applyAsLong(int i) {
        long lambda$static$0;
        lambda$static$0 = FailableIntToLongFunction.lambda$static$0(i);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableToDoubleFunction
    public double applyAsDouble(Object obj) {
        double lambda$static$0;
        lambda$static$0 = FailableToDoubleFunction.lambda$static$0(obj);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableToIntBiFunction
    public int applyAsInt(Object obj, Object obj2) {
        int lambda$static$0;
        lambda$static$0 = FailableToIntBiFunction.lambda$static$0(obj, obj2);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableToDoubleBiFunction
    public double applyAsDouble(Object obj, Object obj2) {
        double lambda$static$0;
        lambda$static$0 = FailableToDoubleBiFunction.lambda$static$0(obj, obj2);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableIntFunction
    public Object apply(int i) {
        Object lambda$static$0;
        lambda$static$0 = FailableIntFunction.lambda$static$0(i);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableLongFunction
    public Object apply(long j) {
        Object lambda$static$0;
        lambda$static$0 = FailableLongFunction.lambda$static$0(j);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleFunction
    public Object apply(double d) {
        Object lambda$static$0;
        lambda$static$0 = FailableDoubleFunction.lambda$static$0(d);
        return lambda$static$0;
    }

    public static /* synthetic */ void m() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void m(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new FileNotFoundException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IOException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }
}
