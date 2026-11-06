package com.amazon.alexa.handsfree.devices.utils;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BuildPropertyGetter {
    private static final String GETPROP_EXECUTABLE_PATH = "/system/bin/getprop";
    private static final String TAG = "BuildPropertyGetter";
    private final ProcessBuilder mProcessBuilder;

    public BuildPropertyGetter() {
        this(new ProcessBuilder(new String[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readProperty(@androidx.annotation.NonNull java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Error  closing buffer stream"
            java.lang.String r1 = "readProperty System Property: "
            r2 = 0
            java.lang.ProcessBuilder r7 = r7.mProcessBuilder     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r3 = "/system/bin/getprop"
            java.lang.String[] r3 = new java.lang.String[]{r3, r8}     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.ProcessBuilder r7 = r7.command(r3)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r3 = 1
            java.lang.ProcessBuilder r7 = r7.redirectErrorStream(r3)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.Process r7 = r7.start()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.io.InputStream r5 = r7.getInputStream()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r5.append(r8)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r8 = " = "
            r5.append(r8)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r5.append(r4)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r3.close()     // Catch: java.io.IOException -> L4b
            goto L51
        L4b:
            r8 = move-exception
            java.lang.String r1 = com.amazon.alexa.handsfree.devices.utils.BuildPropertyGetter.TAG
            android.util.Log.e(r1, r0, r8)
        L51:
            r7.destroy()
            return r4
        L55:
            r2 = r3
            goto L7f
        L57:
            r8 = move-exception
            goto L55
        L59:
            r8 = move-exception
            goto L66
        L5b:
            r8 = move-exception
            goto L7f
        L5d:
            r8 = move-exception
            r3 = r2
            goto L66
        L60:
            r8 = move-exception
            r7 = r2
            goto L7f
        L63:
            r8 = move-exception
            r7 = r2
            r3 = r7
        L66:
            java.lang.String r1 = com.amazon.alexa.handsfree.devices.utils.BuildPropertyGetter.TAG     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "Failed to readProperty System Property "
            android.util.Log.e(r1, r4, r8)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L79
            r3.close()     // Catch: java.io.IOException -> L73
            goto L79
        L73:
            r8 = move-exception
            java.lang.String r1 = com.amazon.alexa.handsfree.devices.utils.BuildPropertyGetter.TAG
            android.util.Log.e(r1, r0, r8)
        L79:
            if (r7 == 0) goto L7e
            r7.destroy()
        L7e:
            return r2
        L7f:
            if (r2 == 0) goto L8b
            r2.close()     // Catch: java.io.IOException -> L85
            goto L8b
        L85:
            r1 = move-exception
            java.lang.String r2 = com.amazon.alexa.handsfree.devices.utils.BuildPropertyGetter.TAG
            android.util.Log.e(r2, r0, r1)
        L8b:
            if (r7 == 0) goto L90
            r7.destroy()
        L90:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.handsfree.devices.utils.BuildPropertyGetter.readProperty(java.lang.String):java.lang.String");
    }

    public BuildPropertyGetter(@NonNull ProcessBuilder processBuilder) {
        this.mProcessBuilder = processBuilder;
    }
}
