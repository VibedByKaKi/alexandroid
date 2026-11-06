package com.amazon.apl.android.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class FileUtils {
    private FileUtils() {
    }

    public static String readString(String str, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        GZIPInputStream gZIPInputStream = null;
        try {
            GZIPInputStream gZIPInputStream2 = str.endsWith(".gz") ? new GZIPInputStream(inputStream) : null;
            try {
                if (gZIPInputStream2 != null) {
                    inputStream = gZIPInputStream2;
                }
                inputStreamReader = new InputStreamReader(inputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        String sb2 = sb.toString();
                        if (gZIPInputStream2 != null) {
                            gZIPInputStream2.close();
                        }
                        inputStreamReader.close();
                        bufferedReader.close();
                        return sb2;
                    } catch (Throwable th) {
                        gZIPInputStream = gZIPInputStream2;
                        th = th;
                        if (gZIPInputStream != null) {
                            gZIPInputStream.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader == null) {
                            throw th;
                        }
                        bufferedReader.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    gZIPInputStream = gZIPInputStream2;
                    th = th2;
                    bufferedReader = null;
                }
            } catch (Throwable th3) {
                inputStreamReader = null;
                gZIPInputStream = gZIPInputStream2;
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            inputStreamReader = null;
        }
    }
}
