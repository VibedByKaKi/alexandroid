package com.amazon.coral.google.common.io;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
@GwtIncompatible
@DoNotMock("Implement it normally")
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface ByteProcessor<T> {
    @ParametricNullness
    T getResult();

    @CanIgnoreReturnValue
    boolean processBytes(byte[] bArr, int i, int i2) throws IOException;
}
