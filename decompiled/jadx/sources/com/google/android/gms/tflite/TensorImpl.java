package com.google.android.gms.tflite;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Tensor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class TensorImpl implements Tensor {
    private long zza;
    private final DataType zzb;
    private int[] zzc;
    private final int[] zzd;
    private final Tensor.QuantizationParams zze;

    private TensorImpl(long j) {
        DataType dataType;
        this.zza = j;
        int dtype = dtype(j);
        switch (dtype) {
            case 1:
                dataType = DataType.FLOAT32;
                break;
            case 2:
                dataType = DataType.INT32;
                break;
            case 3:
                dataType = DataType.UINT8;
                break;
            case 4:
                dataType = DataType.INT64;
                break;
            case 5:
                dataType = DataType.STRING;
                break;
            case 6:
                dataType = DataType.BOOL;
                break;
            case 7:
                dataType = DataType.INT16;
                break;
            case 8:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(dtype).length() + 52);
                sb.append("DataType error: DataType ");
                sb.append(dtype);
                sb.append(" is not recognized in Java.");
                throw new IllegalArgumentException(sb.toString());
            case 9:
                dataType = DataType.INT8;
                break;
        }
        this.zzb = dataType;
        this.zzc = shape(j);
        this.zzd = shapeSignature(j);
        this.zze = new Tensor.QuantizationParams(quantizationScale(j), quantizationZeroPoint(j));
    }

    private static native ByteBuffer buffer(long j);

    private static native long create(long j, int i, int i2);

    private static native long createSignatureInputTensor(long j, String str);

    private static native long createSignatureOutputTensor(long j, String str);

    private static native void delete(long j);

    private static native int dtype(long j);

    private static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    private static native String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    private static native void writeScalar(long j, Object obj);

    public static TensorImpl zza(long j, int i) {
        return new TensorImpl(create(j, i, 0));
    }

    public static TensorImpl zzb(long j, String str) {
        long createSignatureInputTensor = createSignatureInputTensor(j, str);
        if (createSignatureInputTensor != -1) {
            return new TensorImpl(createSignatureInputTensor);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str).length() + 30), "Input error: input ", str, " not found."));
        return null;
    }

    public static TensorImpl zzc(long j, String str) {
        long createSignatureOutputTensor = createSignatureOutputTensor(j, str);
        if (createSignatureOutputTensor != -1) {
            return new TensorImpl(createSignatureOutputTensor);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str).length() + 31), "Input error: output ", str, " not found."));
        return null;
    }

    public static int zzi(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return zzi(Array.get(obj, 0)) + 1;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Array lengths cannot be 0.");
        return 0;
    }

    public static void zzj(Object obj, int i, int[] iArr) {
        int length = iArr.length;
        if (i == length) {
            return;
        }
        int length2 = Array.getLength(obj);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length2;
        } else if (i2 != length2) {
            Buffer$$ExternalSyntheticBUOutline0.m("Mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(length2), Integer.valueOf(i)});
            return;
        }
        int i3 = i + 1;
        if (i3 != length) {
            for (int i4 = 0; i4 < length2; i4++) {
                zzj(Array.get(obj, i4), i3, iArr);
            }
        }
    }

    private final int[] zzk(Object obj) {
        int zzi = zzi(obj);
        if (this.zzb == DataType.STRING) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (Byte.TYPE.equals(cls)) {
                    zzi--;
                }
            }
        }
        int[] iArr = new int[zzi];
        zzj(obj, 0, iArr);
        return iArr;
    }

    private final void zzl(Object obj) {
        DataType dataType;
        DataType dataType2;
        if (obj instanceof ByteBuffer) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (Float.TYPE.equals(cls)) {
                dataType = DataType.FLOAT32;
            } else if (Integer.TYPE.equals(cls)) {
                dataType = DataType.INT32;
            } else if (Short.TYPE.equals(cls)) {
                dataType = DataType.INT16;
            } else if (Byte.TYPE.equals(cls)) {
                DataType dataType3 = this.zzb;
                DataType dataType4 = DataType.STRING;
                if (dataType3 == dataType4) {
                    dataType2 = dataType4;
                } else {
                    dataType = DataType.UINT8;
                }
            } else if (Long.TYPE.equals(cls)) {
                dataType = DataType.INT64;
            } else {
                if (!Boolean.TYPE.equals(cls)) {
                    if (String.class.equals(cls)) {
                        dataType = DataType.STRING;
                    }
                    Single$$ExternalSyntheticBUOutline0.m$3("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
                    return;
                }
                dataType = DataType.BOOL;
            }
            dataType2 = dataType;
        } else {
            if (Float.class.equals(cls) || (obj instanceof FloatBuffer)) {
                dataType = DataType.FLOAT32;
            } else if (Integer.class.equals(cls) || (obj instanceof IntBuffer)) {
                dataType = DataType.INT32;
            } else if (Short.class.equals(cls) || (obj instanceof ShortBuffer)) {
                dataType = DataType.INT16;
            } else if (Byte.class.equals(cls)) {
                dataType = DataType.UINT8;
            } else if (Long.class.equals(cls) || (obj instanceof LongBuffer)) {
                dataType = DataType.INT64;
            } else {
                if (!Boolean.class.equals(cls)) {
                    if (String.class.equals(cls)) {
                        dataType = DataType.STRING;
                    }
                    Single$$ExternalSyntheticBUOutline0.m$3("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
                    return;
                }
                dataType = DataType.BOOL;
            }
            dataType2 = dataType;
        }
        DataType dataType5 = this.zzb;
        if (dataType2 == dataType5 || zzb.zza(dataType2).equals(zzb.zza(dataType5))) {
            return;
        }
        Classes$$ExternalSyntheticBUOutline0.m("Cannot convert between a TensorFlowLite tensor with type ", dataType5, " and a Java object of type ", obj.getClass().getName(), " (which is compatible with the TensorFlowLite type ", dataType2, ").");
    }

    private final ByteBuffer zzm() {
        return buffer(this.zza).order(ByteOrder.nativeOrder());
    }

    @Override // org.tensorflow.lite.Tensor
    public final ByteBuffer asReadOnlyBuffer() {
        return zzm().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
    }

    @Override // org.tensorflow.lite.Tensor
    public final DataType dataType() {
        return this.zzb;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int index() {
        return index(this.zza);
    }

    @Override // org.tensorflow.lite.Tensor
    public final String name() {
        return name(this.zza);
    }

    @Override // org.tensorflow.lite.Tensor
    public final int numBytes() {
        return numBytes(this.zza);
    }

    @Override // org.tensorflow.lite.Tensor
    public final int numDimensions() {
        return this.zzc.length;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int numElements() {
        int i = 1;
        for (int i2 : this.zzc) {
            i *= i2;
        }
        return i;
    }

    @Override // org.tensorflow.lite.Tensor
    public final Tensor.QuantizationParams quantizationParams() {
        return this.zze;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int[] shape() {
        return this.zzc;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int[] shapeSignature() {
        return this.zzd;
    }

    public final void zzd() {
        delete(this.zza);
        this.zza = 0L;
    }

    public final void zze(Object obj) {
        if (obj == null) {
            if (hasDelegateBufferHandle(this.zza)) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            return;
        }
        zzl(obj);
        boolean z = obj instanceof Buffer;
        if (z) {
            Buffer buffer = (Buffer) obj;
            int numBytes = numBytes(this.zza);
            int capacity = obj instanceof ByteBuffer ? buffer.capacity() : buffer.capacity() * this.zzb.byteSize();
            if (numBytes != capacity) {
                Buffer$$ExternalSyntheticBUOutline0.m("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", new Object[]{name(this.zza), Integer.valueOf(numBytes), Integer.valueOf(capacity)});
                return;
            }
        } else {
            int[] zzk = zzk(obj);
            if (!Arrays.equals(zzk, this.zzc)) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Cannot copy to a TensorFlowLite tensor (", name(this.zza), ") with shape ", Arrays.toString(this.zzc), " from a Java object with shape "), Arrays.toString(zzk), "."));
                return;
            }
        }
        if (!z) {
            if (this.zzb == DataType.STRING && this.zzc.length == 0) {
                writeScalar(this.zza, obj);
                return;
            }
            boolean isArray = obj.getClass().isArray();
            long j = this.zza;
            if (isArray) {
                writeMultiDimensionalArray(j, obj);
                return;
            } else {
                writeScalar(j, obj);
                return;
            }
        }
        Buffer buffer2 = (Buffer) obj;
        if (buffer2 instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer2;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.zza, buffer2);
                return;
            } else {
                zzm().put(byteBuffer);
                return;
            }
        }
        if (buffer2 instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer2;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.zza, buffer2);
                return;
            } else {
                zzm().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer2 instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer2;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.zza, buffer2);
                return;
            } else {
                zzm().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer2 instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer2;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.zza, buffer2);
                return;
            } else {
                zzm().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (!(buffer2 instanceof ShortBuffer)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Unexpected input buffer type: ".concat(buffer2.toString()));
            return;
        }
        ShortBuffer shortBuffer = (ShortBuffer) buffer2;
        if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.zza, buffer2);
        } else {
            zzm().asShortBuffer().put(shortBuffer);
        }
    }

    public final void zzf(Object obj) {
        if (obj == null) {
            if (hasDelegateBufferHandle(this.zza)) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            return;
        }
        zzl(obj);
        boolean z = obj instanceof Buffer;
        if (z) {
            Buffer buffer = (Buffer) obj;
            int numBytes = numBytes(this.zza);
            int capacity = obj instanceof ByteBuffer ? buffer.capacity() : buffer.capacity() * this.zzb.byteSize();
            if (numBytes > capacity) {
                Buffer$$ExternalSyntheticBUOutline0.m("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", new Object[]{name(this.zza), Integer.valueOf(numBytes), Integer.valueOf(capacity)});
                return;
            }
        } else {
            int[] zzk = zzk(obj);
            if (!Arrays.equals(zzk, this.zzc)) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Cannot copy from a TensorFlowLite tensor (", name(this.zza), ") with shape ", Arrays.toString(this.zzc), " to a Java object with shape "), Arrays.toString(zzk), "."));
                return;
            }
        }
        if (!z) {
            readMultiDimensionalArray(this.zza, obj);
            return;
        }
        Buffer buffer2 = (Buffer) obj;
        if (buffer2 instanceof ByteBuffer) {
            ((ByteBuffer) buffer2).put(zzm());
            return;
        }
        if (buffer2 instanceof FloatBuffer) {
            ((FloatBuffer) buffer2).put(zzm().asFloatBuffer());
            return;
        }
        if (buffer2 instanceof LongBuffer) {
            ((LongBuffer) buffer2).put(zzm().asLongBuffer());
            return;
        }
        if (buffer2 instanceof IntBuffer) {
            ((IntBuffer) buffer2).put(zzm().asIntBuffer());
        } else if (buffer2 instanceof ShortBuffer) {
            ((ShortBuffer) buffer2).put(zzm().asShortBuffer());
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Unexpected output buffer type: ".concat(buffer2.toString()));
        }
    }

    public final int[] zzg(Object obj) {
        if (obj == null || (obj instanceof Buffer)) {
            return null;
        }
        zzl(obj);
        int[] zzk = zzk(obj);
        if (Arrays.equals(this.zzc, zzk)) {
            return null;
        }
        return zzk;
    }

    public final void zzh() {
        this.zzc = shape(this.zza);
    }
}
