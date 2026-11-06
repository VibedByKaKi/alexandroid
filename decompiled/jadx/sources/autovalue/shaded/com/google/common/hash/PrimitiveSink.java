package autovalue.shaded.com.google.common.hash;

import autovalue.shaded.com.google.common.annotations.Beta;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes15.dex */
public interface PrimitiveSink {
    @CanIgnoreReturnValue
    PrimitiveSink putBoolean(boolean z);

    @CanIgnoreReturnValue
    PrimitiveSink putByte(byte b);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(ByteBuffer byteBuffer);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(byte[] bArr);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(byte[] bArr, int i, int i2);

    @CanIgnoreReturnValue
    PrimitiveSink putChar(char c);

    @CanIgnoreReturnValue
    PrimitiveSink putDouble(double d);

    @CanIgnoreReturnValue
    PrimitiveSink putFloat(float f);

    @CanIgnoreReturnValue
    PrimitiveSink putInt(int i);

    @CanIgnoreReturnValue
    PrimitiveSink putLong(long j);

    @CanIgnoreReturnValue
    PrimitiveSink putShort(short s);

    @CanIgnoreReturnValue
    PrimitiveSink putString(CharSequence charSequence, Charset charset);

    @CanIgnoreReturnValue
    PrimitiveSink putUnencodedChars(CharSequence charSequence);
}
