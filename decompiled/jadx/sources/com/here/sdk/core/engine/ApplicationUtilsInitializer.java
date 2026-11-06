package com.here.sdk.core.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.here.sdk.core.engine.ApplicationUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ApplicationUtilsInitializer {
    private static final String LOG_TAG = "ApplicationUtilsInitializer";

    private ApplicationUtilsInitializer() {
    }

    public static void initialize(@NonNull Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str == null) {
            str = "Unknown";
        }
        ApplicationUtils.setApplicationInformation(new ApplicationUtils.ApplicationInformation(str));
    }
}
