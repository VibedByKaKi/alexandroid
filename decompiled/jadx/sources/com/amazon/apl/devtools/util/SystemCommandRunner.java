package com.amazon.apl.devtools.util;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SystemCommandRunner {
    private static final String TAG = "SystemCommandRunner";

    public static List<String> executeCommand(String... strArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        Process start = new ProcessBuilder(strArr).redirectErrorStream(true).start();
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            return arrayList;
                        }
                        arrayList.add(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                Log.e(TAG, "Unable to read line from stream.", e);
                throw e;
            }
        } finally {
            start.destroy();
        }
    }
}
