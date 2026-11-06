package kotlinx.io.core;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¨\u0006\u0007"}, d2 = {"ByteReadPacket", "Lkotlinx/io/core/ByteReadPacket;", "array", "", "offset", "", "length", "kotlinx-io"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class ByteReadPacketKt {
    @NotNull
    public static final ByteReadPacket ByteReadPacket(@NotNull final byte[] bArr, int i, int i2) {
        bArr.getClass();
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        wrap.getClass();
        return ByteReadPacketExtensionsKt.ByteReadPacket(wrap, new Function1<ByteBuffer, Unit>() { // from class: kotlinx.io.core.ByteReadPacketKt$ByteReadPacket$$inlined$ByteReadPacket$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                invoke2(byteBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ByteBuffer byteBuffer) {
                byteBuffer.getClass();
            }
        });
    }

    @NotNull
    public static /* synthetic */ ByteReadPacket ByteReadPacket$default(final byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        bArr.getClass();
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        wrap.getClass();
        return ByteReadPacketExtensionsKt.ByteReadPacket(wrap, new Function1<ByteBuffer, Unit>() { // from class: kotlinx.io.core.ByteReadPacketKt$ByteReadPacket$$inlined$ByteReadPacket$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                invoke2(byteBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ByteBuffer byteBuffer) {
                byteBuffer.getClass();
            }
        });
    }
}
