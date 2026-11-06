package com.amazon.alexa.assistant.transport.multipart;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/ThrottledInputStream;", "Ljava/io/InputStream;", "inputStream", "chunkSize", "", "<init>", "(Ljava/io/InputStream;I)V", "read", "b", "", "off", "len", "close", "", "available", "Companion", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ThrottledInputStream extends InputStream {
    public static final int DEFAULT_CHUNK_SIZE = 320;
    private final int chunkSize;

    @NotNull
    private final InputStream inputStream;

    public ThrottledInputStream(@NotNull InputStream inputStream, int i) {
        inputStream.getClass();
        this.inputStream = inputStream;
        this.chunkSize = i;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inputStream.close();
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] b, int off, int len) {
        b.getClass();
        return this.inputStream.read(b, off, Math.min(len, this.chunkSize));
    }

    public /* synthetic */ ThrottledInputStream(InputStream inputStream, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, (i2 & 2) != 0 ? 320 : i);
    }

    @Override // java.io.InputStream
    public int read() {
        return this.inputStream.read();
    }
}
