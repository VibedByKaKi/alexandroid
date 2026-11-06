package com.amazon.dee.app.elements.bridges;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.systrace.ElementsSystraceAPI;
import com.amazon.dee.app.framework.startup.tool.SystemTrace;
import com.facebook.react.bridge.ReadableMap;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ElementsSystrace implements ElementsSystraceAPI {
    private static final String OPTION_IS_ASYNC_SECTION = "isAsyncSection";
    private static final String TAG = "SystemTrace";

    private String concatThreadInfo(@NonNull String str) {
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, "@");
        m1m.append(Thread.currentThread().getName());
        return m1m.toString();
    }

    @Override // com.amazon.alexa.elements.turbomodules.systrace.ElementsSystraceAPI
    public void beginSection(@NonNull String str, @NonNull ReadableMap readableMap) {
        boolean z = readableMap.hasKey(OPTION_IS_ASYNC_SECTION) && readableMap.getBoolean(OPTION_IS_ASYNC_SECTION);
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "beginSection (async)" : "beginSection");
        sb.append(str);
        Log.i(str2, sb.toString());
        if (z) {
            SystemTrace.beginAsyncSection(str);
        } else {
            SystemTrace.beginSection(str);
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.systrace.ElementsSystraceAPI
    public void endSection(@NonNull String str, @NonNull ReadableMap readableMap) {
        boolean z = readableMap.hasKey(OPTION_IS_ASYNC_SECTION) && readableMap.getBoolean(OPTION_IS_ASYNC_SECTION);
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "endSection (async)" : "endSection");
        sb.append(str);
        Log.i(str2, sb.toString());
        if (z) {
            SystemTrace.endAsyncSection(str);
        } else {
            SystemTrace.endSection(str);
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.systrace.ElementsSystraceAPI
    public boolean isEnabled() {
        return SystemTrace.shouldLogTrace();
    }
}
