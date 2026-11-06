package com.mapbox.common.module;

import androidx.exifinterface.media.ExifInterface;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.Buffer;
import com.mapbox.common.SizedReadStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u0018J5\u0010\u001b\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u001d\u001a\u0002H\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u00020\u00180\u001fH\u0002¢\u0006\u0002\u0010 J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/mapbox/common/module/StreamingDataReader;", "", "commonReadStream", "Lcom/mapbox/common/SizedReadStream;", "maxChunkSize", "", "(Lcom/mapbox/common/SizedReadStream;I)V", "chunkBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "chunkBufferReadPosition", "chunksRead", "", "isSingleChunk", "", "()Z", "size", "getSize", "()J", "bytesInBuffer", "copyBytes", "fromBuffer", "targetBuffer", "fillChunkBuffer", "", "isDataAvailable", "rewind", "writeTo", ExifInterface.GPS_DIRECTION_TRUE, "target", "writeCallback", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "byteBuffer", "channel", "Ljava/nio/channels/WritableByteChannel;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class StreamingDataReader {
    private final ByteBuffer chunkBuffer;
    private int chunkBufferReadPosition;
    private long chunksRead;

    @NotNull
    private final SizedReadStream commonReadStream;
    private final boolean isSingleChunk;
    private final long size;

    public StreamingDataReader(@NotNull SizedReadStream sizedReadStream, int i) {
        sizedReadStream.getClass();
        this.commonReadStream = sizedReadStream;
        this.chunkBuffer = ByteBuffer.allocateDirect(i);
        Long size = sizedReadStream.getSize();
        long longValue = (size == null ? -1L : size).longValue();
        this.size = longValue;
        boolean z = false;
        if (1 <= longValue && longValue <= i) {
            z = true;
        }
        this.isSingleChunk = z;
    }

    private final int bytesInBuffer() {
        return this.chunkBuffer.position() - this.chunkBufferReadPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int copyBytes(ByteBuffer fromBuffer, ByteBuffer targetBuffer) {
        int min = Math.min(fromBuffer.remaining(), targetBuffer.remaining());
        int limit = fromBuffer.limit();
        try {
            fromBuffer.limit(fromBuffer.position() + min);
            targetBuffer.put(fromBuffer);
            return min;
        } finally {
            fromBuffer.limit(limit);
        }
    }

    private final void fillChunkBuffer() {
        int i = 0;
        if (bytesInBuffer() < this.chunkBuffer.capacity() / 4) {
            ByteBuffer byteBuffer = this.chunkBuffer;
            byteBuffer.flip().position(this.chunkBufferReadPosition);
            byteBuffer.compact();
            this.chunkBufferReadPosition = 0;
        }
        while (this.chunkBuffer.hasRemaining() && !this.commonReadStream.getExhausted()) {
            Long value = this.commonReadStream.read(new Buffer(new DataRef(this.chunkBuffer.slice()))).onError(new Duration$$ExternalSyntheticBUOutline0(10)).getValue();
            value.getClass();
            long longValue = value.longValue();
            ByteBuffer byteBuffer2 = this.chunkBuffer;
            int i2 = (int) longValue;
            byteBuffer2.position(byteBuffer2.position() + i2);
            i += i2;
        }
        if (i > 0) {
            this.chunksRead++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fillChunkBuffer$lambda$2(String str) {
        str.getClass();
        throw new IOException(str);
    }

    private final <T> void writeTo(T target, Function2<? super ByteBuffer, ? super T, Unit> writeCallback) {
        fillChunkBuffer();
        ByteBuffer duplicate = this.chunkBuffer.duplicate();
        duplicate.flip().position(this.chunkBufferReadPosition);
        writeCallback.invoke(duplicate, target);
        this.chunkBufferReadPosition = duplicate.position();
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean isDataAvailable() {
        return bytesInBuffer() > 0 || !this.commonReadStream.getExhausted();
    }

    /* renamed from: isSingleChunk, reason: from getter */
    public final boolean getIsSingleChunk() {
        return this.isSingleChunk;
    }

    public final void rewind() {
        if (this.chunksRead <= 1) {
            this.chunkBufferReadPosition = 0;
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Rewind is only supported if we have read at most one chunk");
        }
    }

    public final void writeTo(@NotNull WritableByteChannel channel) {
        channel.getClass();
        writeTo(channel, new Function2<ByteBuffer, WritableByteChannel, Unit>() { // from class: com.mapbox.common.module.StreamingDataReader$writeTo$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer, WritableByteChannel writableByteChannel) {
                invoke2(byteBuffer, writableByteChannel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ByteBuffer byteBuffer, @NotNull WritableByteChannel writableByteChannel) {
                byteBuffer.getClass();
                writableByteChannel.getClass();
                writableByteChannel.write(byteBuffer);
            }
        });
    }

    public final void writeTo(@NotNull ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        writeTo(byteBuffer, new Function2<ByteBuffer, ByteBuffer, Unit>() { // from class: com.mapbox.common.module.StreamingDataReader$writeTo$1
            {
                super(2);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ByteBuffer byteBuffer2, @NotNull ByteBuffer byteBuffer3) {
                byteBuffer2.getClass();
                byteBuffer3.getClass();
                StreamingDataReader.this.copyBytes(byteBuffer2, byteBuffer3);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
                invoke2(byteBuffer2, byteBuffer3);
                return Unit.INSTANCE;
            }
        });
    }
}
