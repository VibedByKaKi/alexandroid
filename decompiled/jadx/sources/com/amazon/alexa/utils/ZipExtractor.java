package com.amazon.alexa.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ZipExtractor {
    private static final int BUFFER_SIZE = 4096;
    private static final String TAG = "ZipExtractor";

    private static void extractFile(ZipInputStream zipInputStream, String str) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
        } catch (Throwable th) {
            th = th;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = zipInputStream.read(bArr);
                if (read == -1) {
                    bufferedOutputStream.close();
                    return;
                }
                bufferedOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            th = th2;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            throw th;
        }
    }

    private static String getFileNameOnly(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] split = str.split("/");
        return split.length > 0 ? split[split.length - 1] : split[0];
    }

    public static void unzip(String str, String str2, String str3) throws IOException {
        ZipInputStream zipInputStream;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            zipInputStream = new ZipInputStream(new FileInputStream(str));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    String str4 = File.separator;
                    String str5 = str2 + str4 + nextEntry.getName();
                    if (!nextEntry.isDirectory() && nextEntry.getName().contains(str3)) {
                        extractFile(zipInputStream, str2 + str4 + getFileNameOnly(str5));
                    }
                    zipInputStream.closeEntry();
                }
                zipInputStream.close();
            } catch (Throwable th) {
                th = th;
                if (zipInputStream != null) {
                    zipInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zipInputStream = null;
        }
    }
}
