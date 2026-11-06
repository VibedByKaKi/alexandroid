package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.AlexaDataSink;
import com.amazon.alexa.presence.service.PresenceJobService;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fH\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/api/compat/VoxSdkAlexaDataSinkWrapper;", "Lcom/amazon/alexa/api/compat/model/AlexaDataSink;", "voxSink", "Lcom/amazon/alexa/api/AlexaDataSink;", "<init>", "(Lcom/amazon/alexa/api/AlexaDataSink;)V", "outputStream", "Ljava/io/OutputStream;", "write", "", "b", "", "", "off", "len", PresenceJobService.ACTION_REFRESH_FLUSH_KEY, "close", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxSdkAlexaDataSinkWrapper extends AlexaDataSink {

    @NotNull
    private final OutputStream outputStream;

    public VoxSdkAlexaDataSinkWrapper(@NotNull com.amazon.alexa.api.AlexaDataSink alexaDataSink) {
        alexaDataSink.getClass();
        OutputStream openForWriting = alexaDataSink.openForWriting();
        if (openForWriting == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Data sink openForWriting returned null");
            throw null;
        }
        this.outputStream = openForWriting;
        setNativeHandle(alexaDataSink);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.outputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.outputStream.flush();
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] b) {
        b.getClass();
        this.outputStream.write(b);
    }

    @Override // java.io.OutputStream
    public void write(int b) {
        this.outputStream.write(b);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] b, int off, int len) {
        b.getClass();
        this.outputStream.write(b, off, len);
    }
}
