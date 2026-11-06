package com.amazon.alexa.assistant.transport.connection;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¨\u0006\u0007"}, d2 = {"trackingWrites", "Lokhttp3/RequestBody;", "onProgress", "Lkotlin/Function0;", "", "trackingReads", "Ljava/io/InputStream;", "transport_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EventIdleWatchdogKt {
    @NotNull
    public static final InputStream trackingReads(@NotNull final InputStream inputStream, @NotNull final Function0<Unit> function0) {
        inputStream.getClass();
        function0.getClass();
        return new FilterInputStream(inputStream) { // from class: com.amazon.alexa.assistant.transport.connection.EventIdleWatchdogKt$trackingReads$1
            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] b, int off, int len) {
                b.getClass();
                int read = super.read(b, off, len);
                if (read > 0) {
                    function0.invoke();
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                int read = super.read();
                if (read >= 0) {
                    function0.invoke();
                }
                return read;
            }
        };
    }

    @NotNull
    public static final RequestBody trackingWrites(@NotNull final RequestBody requestBody, @NotNull final Function0<Unit> function0) {
        requestBody.getClass();
        function0.getClass();
        return new RequestBody() { // from class: com.amazon.alexa.assistant.transport.connection.EventIdleWatchdogKt$trackingWrites$1
            @Override // okhttp3.RequestBody
            /* renamed from: contentLength */
            public long getContentLength() {
                return RequestBody.this.getContentLength();
            }

            @Override // okhttp3.RequestBody
            /* renamed from: contentType */
            public MediaType get$contentType() {
                return RequestBody.this.get$contentType();
            }

            @Override // okhttp3.RequestBody
            public boolean isDuplex() {
                return RequestBody.this.isDuplex();
            }

            @Override // okhttp3.RequestBody
            public boolean isOneShot() {
                return RequestBody.this.isOneShot();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(final BufferedSink sink) {
                sink.getClass();
                final Function0<Unit> function02 = function0;
                BufferedSink buffer = Okio.buffer(new ForwardingSink(sink) { // from class: com.amazon.alexa.assistant.transport.connection.EventIdleWatchdogKt$trackingWrites$1$writeTo$tracked$1
                    @Override // okio.ForwardingSink, okio.Sink
                    public void write(Buffer source, long byteCount) {
                        source.getClass();
                        super.write(source, byteCount);
                        if (byteCount > 0) {
                            function02.invoke();
                        }
                    }
                });
                RequestBody.this.writeTo(buffer);
                buffer.emit();
            }
        };
    }
}
