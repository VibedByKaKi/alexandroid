package org.jetbrains.kotlin.library.impl;

import com.dee.app.metrics.MetricsConstants;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/ReadBuffer;", "", "()V", "int", "", "getInt", "()I", "long", "", "getLong", "()J", "position", "getPosition", "setPosition", "(I)V", "size", "getSize", MetricsConstants.Method.CACHE_GET, "", "result", "", "offset", "length", "DirectFileBuffer", "MemoryBuffer", "NIOReader", "WeakFileBuffer", "Lorg/jetbrains/kotlin/library/impl/ReadBuffer$NIOReader;", "Lorg/jetbrains/kotlin/library/impl/ReadBuffer$WeakFileBuffer;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReadBuffer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/ReadBuffer$DirectFileBuffer;", "Lorg/jetbrains/kotlin/library/impl/ReadBuffer$NIOReader;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DirectFileBuffer extends NIOReader {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectFileBuffer(@NotNull File file) {
            super(IrFileReadersKt.getBuffer(FilesKt.readBytes(file)));
            file.getClass();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/ReadBuffer$MemoryBuffer;", "Lorg/jetbrains/kotlin/library/impl/ReadBuffer$NIOReader;", "bytes", "", "([B)V", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MemoryBuffer extends NIOReader {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemoryBuffer(@NotNull byte[] bArr) {
            super(IrFileReadersKt.getBuffer(bArr));
            bArr.getClass();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\b¨\u0006\u001a"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/ReadBuffer$NIOReader;", "Lorg/jetbrains/kotlin/library/impl/ReadBuffer;", "buffer", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "int", "", "getInt", "()I", "long", "", "getLong", "()J", "value", "position", "getPosition", "setPosition", "(I)V", "size", "getSize", MetricsConstants.Method.CACHE_GET, "", "result", "", "offset", "length", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class NIOReader extends ReadBuffer {

        @NotNull
        private final ByteBuffer buffer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NIOReader(@NotNull ByteBuffer byteBuffer) {
            super(null);
            byteBuffer.getClass();
            this.buffer = byteBuffer;
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public void get(@NotNull byte[] result, int offset, int length) {
            result.getClass();
            this.buffer.get(result, offset, length);
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public int getInt() {
            return this.buffer.getInt();
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public long getLong() {
            return this.buffer.getLong();
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public int getPosition() {
            return this.buffer.position();
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public int getSize() {
            return this.buffer.limit();
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public void setPosition(int i) {
            this.buffer.position(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0017H\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/ReadBuffer$WeakFileBuffer;", "Lorg/jetbrains/kotlin/library/impl/ReadBuffer;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "int", "", "getInt", "()I", "long", "", "getLong", "()J", "pos", "value", "position", "getPosition", "setPosition", "(I)V", "size", "getSize", "weakBuffer", "Ljava/lang/ref/SoftReference;", "Ljava/nio/ByteBuffer;", "ensureBuffer", MetricsConstants.Method.CACHE_GET, "", "result", "", "offset", "length", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nReadBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadBuffer.kt\norg/jetbrains/kotlin/library/impl/ReadBuffer$WeakFileBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
    public static final class WeakFileBuffer extends ReadBuffer {

        @NotNull
        private final File file;
        private int pos;

        @NotNull
        private SoftReference<ByteBuffer> weakBuffer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakFileBuffer(@NotNull File file) {
            super(null);
            file.getClass();
            this.file = file;
            this.weakBuffer = new SoftReference<>(null);
        }

        private final ByteBuffer ensureBuffer() {
            ByteBuffer byteBuffer = this.weakBuffer.get();
            if (byteBuffer != null) {
                return byteBuffer;
            }
            ByteBuffer buffer = IrFileReadersKt.getBuffer(FilesKt.readBytes(this.file));
            buffer.position(this.pos);
            this.weakBuffer = new SoftReference<>(buffer);
            return buffer;
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public void get(@NotNull byte[] result, int offset, int length) {
            result.getClass();
            ByteBuffer ensureBuffer = ensureBuffer();
            this.pos += length;
            ensureBuffer.get(result, offset, length);
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public int getInt() {
            ByteBuffer ensureBuffer = ensureBuffer();
            this.pos += 4;
            return ensureBuffer.getInt();
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public long getLong() {
            ByteBuffer ensureBuffer = ensureBuffer();
            this.pos += 8;
            return ensureBuffer.getLong();
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public int getPosition() {
            int i = this.pos;
            ensureBuffer().position();
            return i;
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public int getSize() {
            return (int) this.file.length();
        }

        @Override // org.jetbrains.kotlin.library.impl.ReadBuffer
        public void setPosition(int i) {
            ByteBuffer ensureBuffer = ensureBuffer();
            this.pos = i;
            ensureBuffer.position(i);
        }
    }

    public /* synthetic */ ReadBuffer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void get(@NotNull byte[] result, int offset, int length);

    public abstract int getInt();

    public abstract long getLong();

    public abstract int getPosition();

    public abstract int getSize();

    public abstract void setPosition(int i);

    private ReadBuffer() {
    }
}
