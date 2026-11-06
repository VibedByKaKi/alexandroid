package com.amazon.alexa.assistant.transport.multipart.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/util/Streams;", "", "<init>", "()V", "DEFAULT_BUFFER_SIZE", "", "copy", "", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "closeOutputStream", "", "buffer", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Streams {
    private static final int DEFAULT_BUFFER_SIZE = 8192;

    @NotNull
    public static final Streams INSTANCE = new Streams();

    private Streams() {
    }

    public final long copy(@NotNull InputStream inputStream, @Nullable OutputStream outputStream, boolean closeOutputStream, @Nullable byte[] buffer) throws IOException {
        inputStream.getClass();
        try {
            IOUtils iOUtils = IOUtils.INSTANCE;
            long copyLarge = iOUtils.copyLarge(inputStream, outputStream == null ? NullOutputStream.INSTANCE.getINSTANCE() : outputStream, buffer);
            IOUtils.closeQuietly$default(iOUtils, inputStream, null, 2, null);
            if (closeOutputStream) {
                IOUtils.closeQuietly$default(iOUtils, outputStream, null, 2, null);
            }
            return copyLarge;
        } catch (Throwable th) {
            IOUtils iOUtils2 = IOUtils.INSTANCE;
            IOUtils.closeQuietly$default(iOUtils2, inputStream, null, 2, null);
            if (closeOutputStream) {
                IOUtils.closeQuietly$default(iOUtils2, outputStream, null, 2, null);
            }
            throw th;
        }
    }

    public final long copy(@NotNull InputStream inputStream, @Nullable OutputStream outputStream, boolean closeOutputStream) throws IOException {
        inputStream.getClass();
        return copy(inputStream, outputStream, closeOutputStream, new byte[8192]);
    }
}
