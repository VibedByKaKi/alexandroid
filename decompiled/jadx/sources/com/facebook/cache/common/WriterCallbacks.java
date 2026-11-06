package com.facebook.cache.common;

import com.facebook.common.internal.ByteStreams;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class WriterCallbacks {
    public static WriterCallback from(final InputStream inputStream) {
        return new WriterCallback() { // from class: com.facebook.cache.common.WriterCallbacks.1
            @Override // com.facebook.cache.common.WriterCallback
            public void write(OutputStream outputStream) throws IOException {
                ByteStreams.copy(inputStream, outputStream);
            }
        };
    }

    public static WriterCallback from(final byte[] bArr) {
        return new WriterCallback() { // from class: com.facebook.cache.common.WriterCallbacks.2
            @Override // com.facebook.cache.common.WriterCallback
            public void write(OutputStream outputStream) throws IOException {
                outputStream.write(bArr);
            }
        };
    }
}
