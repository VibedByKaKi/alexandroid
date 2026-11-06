package autovalue.shaded.com.google.common.io;

import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.common.annotations.J2ktIncompatible;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import autovalue.shaded.com.google.errorprone.annotations.DoNotMock;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@DoNotMock("Implement it normally")
/* loaded from: classes15.dex */
public interface ByteProcessor<T> {
    @ParametricNullness
    T getResult();

    @CanIgnoreReturnValue
    boolean processBytes(byte[] bArr, int i, int i2) throws IOException;
}
