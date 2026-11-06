package com.amazon.clouddrive.android.core.interfaces;

import androidx.annotation.AnyThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AppInfo {
    @AnyThread
    String getAppVersionCode();

    @AnyThread
    String getAppVersionName();

    @AnyThread
    String getApplicationId();

    @AnyThread
    String getHttpUserAgent();

    @AnyThread
    String getServiceAppName();

    @AnyThread
    String getServiceApplicationId();

    @AnyThread
    default String getSetupSourceServiceAppName() {
        return getServiceAppName();
    }

    @AnyThread
    boolean isDebugBuild();
}
