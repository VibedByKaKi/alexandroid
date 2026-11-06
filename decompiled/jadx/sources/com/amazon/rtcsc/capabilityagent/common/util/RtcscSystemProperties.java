package com.amazon.rtcsc.capabilityagent.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RtcscSystemProperties {
    private static final String GETPROP_EXECUTABLE_PATH = "/system/bin/getprop";
    private static final String TAG = "RtcscSystemProperties";

    private RtcscSystemProperties() {
    }

    public static String read(String str) {
        Process process;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                process = new ProcessBuilder(new String[0]).command(GETPROP_EXECUTABLE_PATH, str).redirectErrorStream(true).start();
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    readLine = "";
                }
                RtcscLogger.d(TAG, "read System Property: " + str + "=" + readLine, new Object[0]);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                process.destroy();
                return readLine;
            } catch (Exception e2) {
                e = e2;
                bufferedReader2 = bufferedReader;
                RtcscLogger.e(TAG, "Failed to read System Property " + str, e);
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused2) {
                    }
                }
                if (process != null) {
                    process.destroy();
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused3) {
                    }
                }
                if (process == null) {
                    throw th;
                }
                process.destroy();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            process = null;
        } catch (Throwable th3) {
            th = th3;
            process = null;
        }
    }
}
