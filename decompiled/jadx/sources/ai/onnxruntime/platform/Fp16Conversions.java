package ai.onnxruntime.platform;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.logging.Logger;
import kotlin.jvm.internal.ShortCompanionObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class Fp16Conversions {
    private static final Logger logger = Logger.getLogger(Fp16Conversions.class.getName());

    private Fp16Conversions() {
    }

    public static float bf16ToFloat(short s) {
        return Float.intBitsToFloat(s << 16);
    }

    public static FloatBuffer convertBf16BufferToFloatBuffer(ShortBuffer shortBuffer) {
        int position = shortBuffer.position();
        int remaining = shortBuffer.remaining();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(remaining * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int i = 0; i < remaining; i++) {
            asFloatBuffer.put(i, bf16ToFloat(shortBuffer.get(i + position)));
        }
        return asFloatBuffer;
    }

    public static ShortBuffer convertFloatBufferToBf16Buffer(FloatBuffer floatBuffer) {
        int position = floatBuffer.position();
        int remaining = floatBuffer.remaining();
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(remaining * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        for (int i = 0; i < remaining; i++) {
            asShortBuffer.put(i, floatToBf16(floatBuffer.get(i + position)));
        }
        return asShortBuffer;
    }

    public static ShortBuffer convertFloatBufferToFp16Buffer(FloatBuffer floatBuffer) {
        int position = floatBuffer.position();
        int remaining = floatBuffer.remaining();
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(remaining * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        for (int i = 0; i < remaining; i++) {
            asShortBuffer.put(i, floatToFp16(floatBuffer.get(i + position)));
        }
        return asShortBuffer;
    }

    public static FloatBuffer convertFp16BufferToFloatBuffer(ShortBuffer shortBuffer) {
        int position = shortBuffer.position();
        int remaining = shortBuffer.remaining();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(remaining * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int i = 0; i < remaining; i++) {
            asFloatBuffer.put(i, fp16ToFloat(shortBuffer.get(i + position)));
        }
        return asFloatBuffer;
    }

    public static short floatToBf16(float f) {
        int floatToIntBits = Float.floatToIntBits(f);
        return (short) (((((floatToIntBits >> 16) & 1) + 32767) + floatToIntBits) >> 16);
    }

    public static short floatToFp16(float f) {
        return mlasFloatToFp16(f);
    }

    public static float fp16ToFloat(short s) {
        return mlasFp16ToFloat(s);
    }

    public static short mlasFloatToFp16(float f) {
        short floatToIntBits;
        int floatToIntBits2 = Float.floatToIntBits(f);
        int floatToIntBits3 = Float.floatToIntBits(Float.POSITIVE_INFINITY);
        int i = Integer.MIN_VALUE & floatToIntBits2;
        int i2 = floatToIntBits2 ^ i;
        if (i2 >= 1199570944) {
            floatToIntBits = i2 > floatToIntBits3 ? (short) 32256 : (short) 31744;
        } else {
            floatToIntBits = (short) (i2 < 947912704 ? Float.floatToIntBits(Float.intBitsToFloat(1056964608) + Float.intBitsToFloat(i2)) - 1056964608 : ((i2 - 939520001) + ((i2 >> 13) & 1)) >> 13);
        }
        return (short) (floatToIntBits | ((short) (i >> 16)));
    }

    public static float mlasFp16ToFloat(short s) {
        int i = (s & ShortCompanionObject.MAX_VALUE) << 13;
        int i2 = i & 260046848;
        int i3 = 939524096 + i;
        if (i2 == 260046848) {
            i3 = i + 1879048192;
        } else if (i2 == 0) {
            i3 = Float.floatToIntBits(Float.intBitsToFloat(i + 947912704) - Float.intBitsToFloat(947912704));
        }
        return Float.intBitsToFloat(((s & ShortCompanionObject.MIN_VALUE) << 16) | i3);
    }
}
