package com.amazon.alexa.assistant.transport.multipart.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ*\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\f\u0012\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0018\u00010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/util/IOUtils;", "", "<init>", "()V", "EOF", "", "copyLarge", "", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "buffer", "", "closeQuietly", "", "closeable", "Ljava/io/Closeable;", "consumer", "Ljava/util/function/Consumer;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIOUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOUtils.kt\ncom/amazon/alexa/assistant/transport/multipart/util/IOUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes17.dex */
public final class IOUtils {
    private static final int EOF = -1;

    @NotNull
    public static final IOUtils INSTANCE = new IOUtils();

    private IOUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void closeQuietly$default(IOUtils iOUtils, java.io.Closeable closeable, Consumer consumer, int i, Object obj) {
        if ((i & 2) != 0) {
            consumer = null;
        }
        iOUtils.closeQuietly(closeable, consumer);
    }

    public final void closeQuietly(@Nullable java.io.Closeable closeable, @Nullable Consumer<Exception> consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                if (consumer != null) {
                    consumer.accept(e);
                }
            }
        }
    }

    public final long copyLarge(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, @Nullable byte[] buffer) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j = 0;
        while (true) {
            int read = inputStream.read(buffer);
            Unit unit = Unit.INSTANCE;
            if (-1 == read) {
                return j;
            }
            outputStream.write(buffer, 0, read);
            j += read;
        }
    }
}
