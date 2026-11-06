package com.amazon.alexa.ra.sdk.utils;

import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class LiveModeSocGuard {

    @VisibleForTesting
    static final String[] LIVE_MODE_BLOCKED_SOC_PREFIXES = {"SM8750", "SM8850", "SM8845"};
    private static final String TAG = "LiveModeSocGuard";

    private LiveModeSocGuard() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        r0 = android.os.Build.SOC_MODEL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isLiveModeBlockedSoc() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            java.lang.String r0 = ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0.m12m$1()
            if (r0 == 0) goto L34
            java.lang.String r1 = "unknown"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L18
            goto L34
        L18:
            java.lang.String[] r1 = com.amazon.alexa.ra.sdk.utils.LiveModeSocGuard.LIVE_MODE_BLOCKED_SOC_PREFIXES
            int r3 = r1.length
            r4 = r2
        L1c:
            if (r4 >= r3) goto L34
            r5 = r1[r4]
            boolean r6 = r0.startsWith(r5)
            if (r6 == 0) goto L31
            java.lang.String r1 = com.amazon.alexa.ra.sdk.utils.LiveModeSocGuard.TAG
            java.lang.String r2 = "Live Mode disabled by SoC crash guard: SoC="
            java.lang.String r3 = " matches "
            androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0.m7657m(r2, r0, r3, r5, r1)
            r0 = 1
            return r0
        L31:
            int r4 = r4 + 1
            goto L1c
        L34:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.sdk.utils.LiveModeSocGuard.isLiveModeBlockedSoc():boolean");
    }
}
