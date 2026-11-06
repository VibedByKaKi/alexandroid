package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotOptimize
@TargetApi(18)
/* loaded from: classes7.dex */
class Api18TraceUtils {
    private static final int MAX_SECTION_NAME_LENGTH = 127;

    public static void beginTraceSection(String str, @Nullable String str2, String str3) {
        String m$1 = a$$ExternalSyntheticOutline0.m$1(str, str2, str3);
        if (m$1.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
            m.append(str2.substring(0, length));
            m.append(str3);
            m$1 = m.toString();
        }
        Trace.beginSection(m$1);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
