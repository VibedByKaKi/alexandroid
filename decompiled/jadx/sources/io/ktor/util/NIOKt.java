package io.ktor.util;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import io.ktor.http.auth.HttpAuthHeader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.text.Charsets;
import kotlinx.io.pool.ObjectPool;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a\u001e\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0003H\u0007\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0001H\u0007¨\u0006\u000f"}, d2 = {"copy", "Ljava/nio/ByteBuffer;", "size", "", "pool", "Lkotlinx/io/pool/ObjectPool;", "decodeString", "", HttpAuthHeader.Parameters.Charset, "Ljava/nio/charset/Charset;", "moveTo", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY, "limit", "moveToByteArray", "", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class NIOKt {
    @InternalAPI
    @NotNull
    public static final ByteBuffer copy(@NotNull ByteBuffer byteBuffer, @NotNull ObjectPool<ByteBuffer> objectPool, int i) {
        byteBuffer.getClass();
        objectPool.getClass();
        ByteBuffer borrow = objectPool.borrow();
        borrow.limit(i);
        ByteBuffer slice = byteBuffer.slice();
        slice.getClass();
        moveTo$default(slice, borrow, 0, 2, null);
        borrow.flip();
        return borrow;
    }

    @InternalAPI
    @NotNull
    public static /* synthetic */ ByteBuffer copy$default(ByteBuffer byteBuffer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = byteBuffer.remaining();
        }
        return copy(byteBuffer, i);
    }

    @InternalAPI
    @NotNull
    public static final String decodeString(@NotNull ByteBuffer byteBuffer, @NotNull Charset charset) {
        byteBuffer.getClass();
        charset.getClass();
        String charBuffer = charset.decode(byteBuffer).toString();
        charBuffer.getClass();
        return charBuffer;
    }

    @InternalAPI
    @NotNull
    public static /* synthetic */ String decodeString$default(ByteBuffer byteBuffer, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return decodeString(byteBuffer, charset);
    }

    @InternalAPI
    public static final int moveTo(@NotNull ByteBuffer byteBuffer, @NotNull ByteBuffer byteBuffer2, int i) {
        byteBuffer.getClass();
        byteBuffer2.getClass();
        int min = Math.min(i, Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
        if (min == byteBuffer.remaining()) {
            byteBuffer2.put(byteBuffer);
            return min;
        }
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(limit);
        return min;
    }

    @InternalAPI
    public static /* synthetic */ int moveTo$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return moveTo(byteBuffer, byteBuffer2, i);
    }

    @InternalAPI
    @NotNull
    public static final byte[] moveToByteArray(@NotNull ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @InternalAPI
    @NotNull
    public static /* synthetic */ ByteBuffer copy$default(ByteBuffer byteBuffer, ObjectPool objectPool, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = byteBuffer.remaining();
        }
        return copy(byteBuffer, objectPool, i);
    }

    @InternalAPI
    @NotNull
    public static final ByteBuffer copy(@NotNull ByteBuffer byteBuffer, int i) {
        byteBuffer.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(i);
        ByteBuffer slice = byteBuffer.slice();
        slice.getClass();
        allocate.getClass();
        moveTo$default(slice, allocate, 0, 2, null);
        allocate.clear();
        return allocate;
    }
}
