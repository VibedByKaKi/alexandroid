package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.util.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
final class AWSIotClientIdHelper {
    private static final String PERSISTENCE_FILE = "CLIENT_ID";
    private static String clientId;

    private AWSIotClientIdHelper() {
    }

    public static String generateClientId() {
        return UUID.randomUUID().toString();
    }

    public static synchronized String getPersistedClientId(String str) throws IOException {
        String str2;
        synchronized (AWSIotClientIdHelper.class) {
            try {
                File file = new File(str, PERSISTENCE_FILE);
                if (clientId == null) {
                    if (!file.exists()) {
                        persistId(file, generateClientId());
                    }
                    clientId = readPersistedId(file);
                }
                str2 = clientId;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    private static void persistId(File file, String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(str.getBytes(StringUtils.UTF8));
        fileOutputStream.close();
    }

    private static String readPersistedId(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr, StringUtils.UTF8);
    }

    public static void reset() {
        clientId = null;
    }
}
