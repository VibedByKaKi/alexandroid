package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IOUtils {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;

    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int copy(@NonNull Reader reader, @NonNull Writer writer) throws IOException {
        char[] cArr = new char[4096];
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j += read;
        }
        if (j > SieveCacheKt.NodeLinkMask) {
            return -1;
        }
        return (int) j;
    }

    public static void deleteFile(File file, Logger logger) {
        try {
            if (file.delete()) {
                return;
            }
            file.deleteOnExit();
        } catch (Exception e) {
            logger.w("Failed to delete file", e);
        }
    }
}
