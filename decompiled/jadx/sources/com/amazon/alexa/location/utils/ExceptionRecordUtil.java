package com.amazon.alexa.location.utils;

import android.util.Log;
import com.amazon.alexa.crashreporting.api.CrashReporter;
import com.amazon.alexa.protocols.service.api.LazyComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ExceptionRecordUtil {
    private ExceptionRecordUtil() {
    }

    public static void recordExceptions(String str, String str2, Throwable th, LazyComponent<CrashReporter> lazyComponent) {
        Log.e(str, str2 + " fails", th);
        lazyComponent.get().reportNonFatal(new LocationHandledException(th));
    }
}
