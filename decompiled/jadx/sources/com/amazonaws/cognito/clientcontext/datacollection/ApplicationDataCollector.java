package com.amazonaws.cognito.clientcontext.datacollection;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ApplicationDataCollector extends DataCollector {
    private static final int ALL_FLAGS_OFF = 0;
    private static final String TAG = "ApplicationDataCollector";

    private String getAppName(Context context) {
        return (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
    }

    private String getAppTargetSdk(Context context) {
        return String.valueOf(context.getApplicationInfo().targetSdkVersion);
    }

    private String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(TAG, "Unable to get app version. Provided package name could not be found.");
            return "";
        }
    }

    @Override // com.amazonaws.cognito.clientcontext.datacollection.DataCollector
    public Map<String, String> collect(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("ApplicationName", getAppName(context));
        hashMap.put(DataRecordKey.APP_TARGET_SDK, getAppTargetSdk(context));
        hashMap.put("ApplicationVersion", getAppVersion(context));
        return hashMap;
    }
}
