package kotlinx.io.internal.jvm;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0001\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¨\u0006\u0007"}, d2 = {"limitChangeError", "", "negativeShiftError", "delta", "", "wrongBufferPositionChangeError", "size", "kotlinx-io"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class ErrorsKt {
    @PublishedApi
    @NotNull
    public static final Void limitChangeError() {
        throw new IllegalStateException("Limit change is now allowed");
    }

    @PublishedApi
    @NotNull
    public static final Void negativeShiftError(int i) {
        throw new IllegalStateException(a$$ExternalSyntheticOutline0.m(i, "Wrong buffer position change: negative shift "));
    }

    @PublishedApi
    @NotNull
    public static final Void wrongBufferPositionChangeError(int i, int i2) {
        throw new IllegalStateException("Wrong buffer position change: " + i + ". Position should be moved forward only by at most size bytes (size = " + i2 + ')');
    }
}
