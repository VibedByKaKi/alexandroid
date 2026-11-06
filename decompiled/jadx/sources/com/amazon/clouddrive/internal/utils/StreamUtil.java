package com.amazon.clouddrive.internal.utils;

import com.amazon.clouddrive.exceptions.InvalidParameter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class StreamUtil {
    public static long copyInputStreamToOutputStream(InputStream inputStream, OutputStream outputStream, int i, long j) throws IOException, InterruptedException, InvalidParameter {
        ThreadUtil.checkIfInterrupted();
        byte[] bArr = new byte[i];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, i);
            if (read <= 0) {
                return j2;
            }
            j2 += read;
            if (j2 > j) {
                return j2;
            }
            ThreadUtil.checkIfInterrupted();
            outputStream.write(bArr, 0, read);
            ThreadUtil.checkIfInterrupted();
        }
    }
}
