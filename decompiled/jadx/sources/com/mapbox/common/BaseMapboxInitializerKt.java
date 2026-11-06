package com.mapbox.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"gatherSystemInfo", "", "initializerData", "Lcom/mapbox/common/InitializerData;", "context", "Landroid/content/Context;", "t", "", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class BaseMapboxInitializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String gatherSystemInfo(InitializerData initializerData, Context context, Throwable th) {
        Object m25294constructorimpl;
        Object m25294constructorimpl2;
        String str;
        ApplicationInfo applicationInfo;
        try {
            Result.Companion companion = Result.INSTANCE;
            PackageManager packageManager = context.getPackageManager();
            m25294constructorimpl = Result.m25294constructorimpl(packageManager != null ? Boolean.valueOf(packageManager.isInstantApp()) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th2));
        }
        Object obj = m25294constructorimpl;
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 == null || (applicationInfo = packageManager2.getApplicationInfo(context.getPackageName(), 0)) == null) {
                str = null;
            } else {
                String[] list = new File(applicationInfo.nativeLibraryDir).list();
                if (list != null) {
                    str = ArraysKt.joinToString$default(list, null, null, null, null, 63);
                    if (str == null) {
                    }
                }
                str = "";
            }
            m25294constructorimpl2 = Result.m25294constructorimpl(str);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            m25294constructorimpl2 = Result.m25294constructorimpl(ResultKt.createFailure(th3));
        }
        StringBuilder sb = new StringBuilder("Failed to initialize: Attempt=");
        sb.append(initializerData.getCurrentInitAttempt());
        sb.append(", exception=[");
        sb.append(th.getClass().getSimpleName());
        sb.append("], initializer called ");
        sb.append(SystemClock.elapsedRealtime() - initializerData.getFirstInitElapsedTimeMs());
        sb.append(" ms ago, exception.message=[");
        sb.append(th.getMessage());
        sb.append("], exception.cause=[");
        Throwable cause = th.getCause();
        sb.append(cause != null ? cause.getClass().getSimpleName() : null);
        sb.append("], exception.cause.message=[");
        Throwable cause2 = th.getCause();
        sb.append(cause2 != null ? cause2.getMessage() : null);
        sb.append("], extractedNativeLibs=[");
        if (Result.m25300isFailureimpl(m25294constructorimpl2)) {
            m25294constructorimpl2 = null;
        }
        sb.append((String) m25294constructorimpl2);
        sb.append("], isInstantApp=[");
        sb.append(Result.m25300isFailureimpl(obj) ? null : obj);
        sb.append("], isMainThread=[");
        sb.append(Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()));
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
