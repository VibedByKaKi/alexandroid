package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/imageutils/StreamProcessor;", "", "<init>", "()V", "readPackedInt", "", "stream", "Ljava/io/InputStream;", "numBytes", "isLittleEndian", "", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamProcessor {

    @NotNull
    public static final StreamProcessor INSTANCE = new StreamProcessor();

    private StreamProcessor() {
    }

    @JvmStatic
    public static final int readPackedInt(@NotNull InputStream stream, int numBytes, boolean isLittleEndian) throws IOException {
        int i;
        stream.getClass();
        int i2 = 0;
        for (int i3 = 0; i3 < numBytes; i3++) {
            int read = stream.read();
            if (read == -1) {
                Buffer$$ExternalSyntheticBUOutline0.m$2("no more bytes");
                return 0;
            }
            if (isLittleEndian) {
                i = (read & 255) << (i3 * 8);
            } else {
                i2 <<= 8;
                i = read & 255;
            }
            i2 |= i;
        }
        return i2;
    }
}
