package kotlinx.io.core;

import com.amazon.alexa.presence.service.PresenceJobService;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\u0010\u0014\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u00022\u00060\u0003j\u0002`\u0004J$\u0010\u000b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0012H&J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H&J \u0010\u001e\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000fH&J \u0010\u001e\u001a\u00020\u00122\u0006\u0010!\u001a\u00020%2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000fH&J \u0010\u001e\u001a\u00020\u00122\u0006\u0010!\u001a\u00020&2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000fH&J \u0010\u001e\u001a\u00020\u00122\u0006\u0010!\u001a\u00020'2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000fH&J \u0010\u001e\u001a\u00020\u00122\u0006\u0010!\u001a\u00020(2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000fH&J \u0010\u001e\u001a\u00020\u00122\u0006\u0010!\u001a\u00020)2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000fH&J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010!\u001a\u00020*2\u0006\u0010$\u001a\u00020\u000fH&J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000fH&J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020.H&R\u0018\u0010\u0005\u001a\u00020\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006/"}, d2 = {"Lkotlinx/io/core/Output;", "Ljava/io/Closeable;", "Lkotlinx/io/core/Closeable;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "byteOrder", "Lkotlinx/io/core/ByteOrder;", "getByteOrder", "()Lkotlinx/io/core/ByteOrder;", "setByteOrder", "(Lkotlinx/io/core/ByteOrder;)V", "append", "csq", "", "start", "", "end", "close", "", "fill", "n", "", "v", "", PresenceJobService.ACTION_REFRESH_FLUSH_KEY, "writeByte", "writeDouble", "", "writeFloat", "", "writeFully", "bb", "Ljava/nio/ByteBuffer;", "src", "", "offset", "length", "", "", "", "", "", "Lkotlinx/io/core/IoBuffer;", "writeInt", "writeLong", "writeShort", "", "kotlinx-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public interface Output extends Closeable, Appendable {
    @NotNull
    Appendable append(@NotNull char[] csq, int start, int end);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void fill(long n, byte v);

    void flush();

    @NotNull
    ByteOrder getByteOrder();

    void setByteOrder(@NotNull ByteOrder byteOrder);

    void writeByte(byte v);

    void writeDouble(double v);

    void writeFloat(float v);

    void writeFully(@NotNull ByteBuffer bb);

    void writeFully(@NotNull IoBuffer src, int length);

    void writeFully(@NotNull byte[] src, int offset, int length);

    void writeFully(@NotNull double[] src, int offset, int length);

    void writeFully(@NotNull float[] src, int offset, int length);

    void writeFully(@NotNull int[] src, int offset, int length);

    void writeFully(@NotNull long[] src, int offset, int length);

    void writeFully(@NotNull short[] src, int offset, int length);

    void writeInt(int v);

    void writeLong(long v);

    void writeShort(short v);
}
