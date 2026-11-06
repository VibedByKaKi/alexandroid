package kotlinx.io.core;

import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0014\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0013H&J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0013H&J\b\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020&H&J\u001a\u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0013H&J \u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J \u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H&J\u001a\u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0013H&J\b\u0010(\u001a\u00020\u0013H&J\b\u0010)\u001a\u00020\u0010H&J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020\u0013H&R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006-"}, d2 = {"Lkotlinx/io/core/Input;", "Ljava/io/Closeable;", "Lkotlinx/io/core/Closeable;", "byteOrder", "Lkotlinx/io/core/ByteOrder;", "getByteOrder", "()Lkotlinx/io/core/ByteOrder;", "setByteOrder", "(Lkotlinx/io/core/ByteOrder;)V", "endOfInput", "", "getEndOfInput", "()Z", "close", "", ClientCookie.DISCARD_ATTR, "", "n", "peekTo", "", "buffer", "Lkotlinx/io/core/IoBuffer;", "readAvailable", "dst", "Ljava/nio/ByteBuffer;", "length", "", "offset", "", "", "", "", "", "readByte", "", "readDouble", "", "readFloat", "", "readFully", "readInt", "readLong", "readShort", "", "tryPeek", "kotlinx-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public interface Input extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long discard(long n);

    @NotNull
    ByteOrder getByteOrder();

    boolean getEndOfInput();

    int peekTo(@NotNull IoBuffer buffer);

    int readAvailable(@NotNull ByteBuffer dst, int length);

    int readAvailable(@NotNull IoBuffer dst, int length);

    int readAvailable(@NotNull byte[] dst, int offset, int length);

    int readAvailable(@NotNull double[] dst, int offset, int length);

    int readAvailable(@NotNull float[] dst, int offset, int length);

    int readAvailable(@NotNull int[] dst, int offset, int length);

    int readAvailable(@NotNull long[] dst, int offset, int length);

    int readAvailable(@NotNull short[] dst, int offset, int length);

    byte readByte();

    double readDouble();

    float readFloat();

    void readFully(@NotNull ByteBuffer dst, int length);

    void readFully(@NotNull IoBuffer dst, int length);

    void readFully(@NotNull byte[] dst, int offset, int length);

    void readFully(@NotNull double[] dst, int offset, int length);

    void readFully(@NotNull float[] dst, int offset, int length);

    void readFully(@NotNull int[] dst, int offset, int length);

    void readFully(@NotNull long[] dst, int offset, int length);

    void readFully(@NotNull short[] dst, int offset, int length);

    int readInt();

    long readLong();

    short readShort();

    void setByteOrder(@NotNull ByteOrder byteOrder);

    int tryPeek();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public static final class DefaultImpls {
        public static /* synthetic */ int readAvailable$default(Input input, ByteBuffer byteBuffer, int i, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: readAvailable");
                return 0;
            }
            if ((i2 & 2) != 0) {
                i = byteBuffer.remaining();
            }
            return input.readAvailable(byteBuffer, i);
        }

        public static /* synthetic */ void readFully$default(Input input, IoBuffer ioBuffer, int i, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: readFully");
                return;
            }
            if ((i2 & 2) != 0) {
                i = ioBuffer.getWriteRemaining();
            }
            input.readFully(ioBuffer, i);
        }

        public static /* synthetic */ void readFully$default(Input input, ByteBuffer byteBuffer, int i, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: readFully");
                return;
            }
            if ((i2 & 2) != 0) {
                i = byteBuffer.remaining();
            }
            input.readFully(byteBuffer, i);
        }
    }
}
