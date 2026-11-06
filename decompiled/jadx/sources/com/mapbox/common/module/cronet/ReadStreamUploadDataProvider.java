package com.mapbox.common.module.cronet;

import com.mapbox.common.SizedReadStream;
import com.mapbox.common.module.StreamingDataReader;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/mapbox/common/module/cronet/ReadStreamUploadDataProvider;", "Lorg/chromium/net/UploadDataProvider;", "commonReadStream", "Lcom/mapbox/common/SizedReadStream;", "maxChunkSize", "", "(Lcom/mapbox/common/SizedReadStream;I)V", "reader", "Lcom/mapbox/common/module/StreamingDataReader;", "getLength", "", "read", "", "uploadDataSink", "Lorg/chromium/net/UploadDataSink;", "byteBuffer", "Ljava/nio/ByteBuffer;", "rewind", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class ReadStreamUploadDataProvider extends UploadDataProvider {

    @NotNull
    private final StreamingDataReader reader;

    public ReadStreamUploadDataProvider(@NotNull SizedReadStream sizedReadStream, int i) {
        sizedReadStream.getClass();
        this.reader = new StreamingDataReader(sizedReadStream, i);
    }

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() {
        return this.reader.getSize();
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(@Nullable UploadDataSink uploadDataSink, @Nullable ByteBuffer byteBuffer) {
        if (uploadDataSink == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("UploadDataSink is null");
            return;
        }
        if (byteBuffer == null) {
            uploadDataSink.onReadError(new IllegalArgumentException("ByteBuffer is null"));
            return;
        }
        while (byteBuffer.hasRemaining() && this.reader.isDataAvailable()) {
            this.reader.writeTo(byteBuffer);
        }
        uploadDataSink.onReadSucceeded(this.reader.getSize() == -1 && !this.reader.isDataAvailable());
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(@Nullable UploadDataSink uploadDataSink) {
        this.reader.rewind();
    }
}
