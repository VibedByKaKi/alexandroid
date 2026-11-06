package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0007¨\u0006\b"}, d2 = {"fileReadStream", "Lcom/mapbox/common/SizedReadStream;", "path", "", "memoryReadStream", "str", "asReadStream", "Ljava/io/InputStream;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class PlatformStreamFactoryKt {
    @NotNull
    public static final SizedReadStream asReadStream(@NotNull final InputStream inputStream) {
        inputStream.getClass();
        return new SizedReadStream(inputStream) { // from class: com.mapbox.common.PlatformStreamFactoryKt$asReadStream$1
            final /* synthetic */ InputStream $stream;
            private boolean exhausted;
            private long processed;

            @Nullable
            private Long size;

            {
                Object m25294constructorimpl;
                this.$stream = inputStream;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m25294constructorimpl = Result.m25294constructorimpl(Long.valueOf(inputStream.available()));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
                }
                Long l = null;
                Long l2 = (Long) (Result.m25300isFailureimpl(m25294constructorimpl) ? null : m25294constructorimpl);
                if (l2 != null && l2.longValue() > 0) {
                    l = l2;
                }
                this.size = l;
            }

            @Override // com.mapbox.common.SizedReadStream
            @Nullable
            /* renamed from: getTotalSize, reason: from getter */
            public Long getSize() {
                return this.size;
            }

            @Override // com.mapbox.common.ReadStream
            /* renamed from: isExhausted, reason: from getter */
            public boolean getExhausted() {
                return this.exhausted;
            }

            @Override // com.mapbox.common.ReadStream
            public boolean isReadable() {
                return true;
            }

            @Override // com.mapbox.common.ReadStream
            @NotNull
            public Expected<String, Long> read(@NotNull Buffer commonBuffer) {
                commonBuffer.getClass();
                try {
                    ByteBuffer buffer = commonBuffer.getData().getBuffer();
                    buffer.getClass();
                    long j = 0;
                    while (true) {
                        if (j >= buffer.capacity()) {
                            break;
                        }
                        int read = this.$stream.read();
                        if (read == -1) {
                            this.exhausted = true;
                            break;
                        }
                        buffer.put((byte) read);
                        j++;
                    }
                    this.processed += j;
                    Expected<String, Long> createValue = ExpectedFactory.createValue(Long.valueOf(j));
                    createValue.getClass();
                    return createValue;
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown stream error";
                    }
                    Expected<String, Long> createError = ExpectedFactory.createError(message);
                    createError.getClass();
                    return createError;
                }
            }

            @Override // com.mapbox.common.ReadStream
            /* renamed from: readBytes, reason: from getter */
            public long getProcessed() {
                return this.processed;
            }
        };
    }

    @NotNull
    public static final SizedReadStream fileReadStream(@NotNull String str) {
        str.getClass();
        return asReadStream(new FileInputStream(new File(str)));
    }

    @NotNull
    public static final SizedReadStream memoryReadStream(@NotNull String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return asReadStream(new ByteArrayInputStream(bytes));
    }
}
