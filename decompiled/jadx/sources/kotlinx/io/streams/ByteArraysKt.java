package kotlinx.io.streams;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlinx.io.pool.DefaultPool;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"ByteArrayPool", "Lkotlinx/io/pool/DefaultPool;", "", "getByteArrayPool", "()Lkotlinx/io/pool/DefaultPool;", "ByteArrayPoolBufferSize", "", "kotlinx-io"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class ByteArraysKt {

    @NotNull
    private static final DefaultPool<byte[]> ByteArrayPool;
    public static final int ByteArrayPoolBufferSize = 4096;

    static {
        final int i = 128;
        ByteArrayPool = new DefaultPool<byte[]>(i) { // from class: kotlinx.io.streams.ByteArraysKt$ByteArrayPool$1
            @Override // kotlinx.io.pool.DefaultPool
            public final void validateInstance(@NotNull byte[] instance) {
                instance.getClass();
                if (instance.length == 4096) {
                    super.validateInstance((ByteArraysKt$ByteArrayPool$1) instance);
                } else {
                    Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(new StringBuilder("Unable to recycle buffer of wrong size: "), instance.length, " != 4096"));
                }
            }

            @Override // kotlinx.io.pool.DefaultPool
            @NotNull
            public final byte[] produceInstance() {
                return new byte[4096];
            }
        };
    }

    @NotNull
    public static final DefaultPool<byte[]> getByteArrayPool() {
        return ByteArrayPool;
    }
}
