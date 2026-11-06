package kotlinx.coroutines.io.jvm.javaio;

import kotlin.Metadata;
import kotlinx.io.pool.DefaultPool;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ByteArrayPool", "Lkotlinx/io/pool/DefaultPool;", "", "getByteArrayPool", "()Lkotlinx/io/pool/DefaultPool;", "kotlinx-coroutines-io"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class ByteArrayPoolKt {

    @NotNull
    private static final DefaultPool<byte[]> ByteArrayPool;

    static {
        final int i = 128;
        ByteArrayPool = new DefaultPool<byte[]>(i) { // from class: kotlinx.coroutines.io.jvm.javaio.ByteArrayPoolKt$ByteArrayPool$1
            @Override // kotlinx.io.pool.DefaultPool
            @NotNull
            public byte[] produceInstance() {
                return new byte[4096];
            }
        };
    }

    @NotNull
    public static final DefaultPool<byte[]> getByteArrayPool() {
        return ByteArrayPool;
    }
}
