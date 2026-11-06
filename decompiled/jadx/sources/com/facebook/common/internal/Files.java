package com.facebook.common.internal;

import androidx.collection.SieveCacheKt;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.facebook.infer.annotation.Nullsafe;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class Files {
    private Files() {
    }

    public static byte[] readFile(InputStream inputStream, long j) throws IOException {
        if (j <= SieveCacheKt.NodeLinkMask) {
            return j == 0 ? ByteStreams.toByteArray(inputStream) : ByteStreams.toByteArray(inputStream, (int) j);
        }
        throw new OutOfMemoryError(AppLaunchChecker$$ExternalSyntheticOutline0.m("file is too large to fit in a byte array: ", j, " bytes"));
    }

    public static byte[] toByteArray(File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] readFile = readFile(fileInputStream2, fileInputStream2.getChannel().size());
                fileInputStream2.close();
                return readFile;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
