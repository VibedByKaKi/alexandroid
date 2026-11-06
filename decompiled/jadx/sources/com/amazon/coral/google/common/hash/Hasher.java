package com.amazon.coral.google.common.hash;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@Beta
@CanIgnoreReturnValue
/* loaded from: classes19.dex */
public interface Hasher extends PrimitiveSink {
    HashCode hash();

    @Deprecated
    int hashCode();

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putBoolean(boolean z);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putByte(byte b);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putBytes(ByteBuffer byteBuffer);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putBytes(byte[] bArr);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putBytes(byte[] bArr, int i, int i2);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putChar(char c);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putDouble(double d);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putFloat(float f);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putInt(int i);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putLong(long j);

    <T> Hasher putObject(@ParametricNullness T t, Funnel<? super T> funnel);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putShort(short s);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putString(CharSequence charSequence, Charset charset);

    @Override // com.amazon.coral.google.common.hash.PrimitiveSink
    Hasher putUnencodedChars(CharSequence charSequence);
}
