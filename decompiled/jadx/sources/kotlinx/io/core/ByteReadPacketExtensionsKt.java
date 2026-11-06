package kotlinx.io.core;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.io.pool.ObjectPool;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b\u001a*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¨\u0006\u0010"}, d2 = {"ByteReadPacket", "Lkotlinx/io/core/ByteReadPacket;", "bb", "Ljava/nio/ByteBuffer;", "release", "Lkotlin/Function1;", "", "array", "", "offset", "", "length", "block", "poolFor", "Lkotlinx/io/pool/ObjectPool;", "Lkotlinx/io/core/IoBuffer;", "kotlinx-io"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class ByteReadPacketExtensionsKt {
    @NotNull
    public static final ByteReadPacket ByteReadPacket(@NotNull ByteBuffer byteBuffer, @NotNull Function1<? super ByteBuffer, Unit> function1) {
        byteBuffer.getClass();
        function1.getClass();
        ObjectPool<IoBuffer> poolFor = poolFor(byteBuffer, function1);
        IoBuffer borrow = poolFor.borrow();
        borrow.resetForRead();
        return new ByteReadPacket(borrow, poolFor);
    }

    @NotNull
    public static /* synthetic */ ByteReadPacket ByteReadPacket$default(byte[] bArr, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        bArr.getClass();
        function1.getClass();
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        wrap.getClass();
        return ByteReadPacket(wrap, new ByteReadPacketExtensionsKt$ByteReadPacket$1(function1, bArr));
    }

    private static final ObjectPool<IoBuffer> poolFor(ByteBuffer byteBuffer, Function1<? super ByteBuffer, Unit> function1) {
        return new SingleByteBufferPool(byteBuffer, function1);
    }

    @NotNull
    public static final ByteReadPacket ByteReadPacket(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super byte[], Unit> function1) {
        bArr.getClass();
        function1.getClass();
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        wrap.getClass();
        return ByteReadPacket(wrap, new ByteReadPacketExtensionsKt$ByteReadPacket$1(function1, bArr));
    }

    @NotNull
    public static /* synthetic */ ByteReadPacket ByteReadPacket$default(ByteBuffer byteBuffer, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<ByteBuffer, Unit>() { // from class: kotlinx.io.core.ByteReadPacketExtensionsKt$ByteReadPacket$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer2) {
                    invoke2(byteBuffer2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ByteBuffer byteBuffer2) {
                    byteBuffer2.getClass();
                }
            };
        }
        return ByteReadPacket(byteBuffer, function1);
    }
}
