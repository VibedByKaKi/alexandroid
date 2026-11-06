package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class eg {
    public static Bundle a(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            Log.w(yf.a("MetaDataUtils"), "Could not get application meta data for installed package.");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(yf.a("MetaDataUtils"), "Could not get meta data for the application", e);
            return null;
        }
    }

    public static String a(Context context, String str, String str2) {
        Bundle a2 = a(context, str);
        if (a2 == null) {
            return null;
        }
        return a2.getString(str2);
    }
}
