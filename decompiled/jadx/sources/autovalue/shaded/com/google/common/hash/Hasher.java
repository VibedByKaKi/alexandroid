package autovalue.shaded.com.google.common.hash;

import autovalue.shaded.com.google.common.annotations.Beta;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes15.dex */
public interface Hasher extends PrimitiveSink {
    HashCode hash();

    @Deprecated
    int hashCode();

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBoolean(boolean z);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putByte(byte b);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(ByteBuffer byteBuffer);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(byte[] bArr);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(byte[] bArr, int i, int i2);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putChar(char c);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putDouble(double d);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putFloat(float f);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putInt(int i);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putLong(long j);

    @CanIgnoreReturnValue
    <T> Hasher putObject(@ParametricNullness T t, Funnel<? super T> funnel);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putShort(short s);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putString(CharSequence charSequence, Charset charset);

    @Override // autovalue.shaded.com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putUnencodedChars(CharSequence charSequence);
}
