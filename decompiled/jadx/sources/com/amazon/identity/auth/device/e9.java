package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class e9 {

    /* renamed from: a, reason: collision with root package name */
    public static String f595a;

    public static synchronized String a(Context context) {
        synchronized (e9.class) {
            try {
                String str = f595a;
                if (str != null) {
                    return str;
                }
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.amazon-customtabtest.com"));
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Intent intent2 = new Intent();
                    intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                    intent2.setPackage(resolveInfo.activityInfo.packageName);
                    if (packageManager.resolveService(intent2, 0) != null) {
                        arrayList.add(resolveInfo.activityInfo.packageName);
                    }
                }
                if (arrayList.isEmpty()) {
                    f595a = null;
                } else if (arrayList.size() == 1) {
                    f595a = (String) arrayList.get(0);
                } else {
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                            if (queryIntentActivities2.size() != 0) {
                                for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                                    IntentFilter intentFilter = resolveInfo2.filter;
                                    if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                        break;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                            Log.e(yf.a("CustomTabsHelper"), "Exception while getting specialized handlers");
                        }
                        if (arrayList.contains(str2)) {
                            f595a = str2;
                        }
                    }
                    if (arrayList.contains("com.android.chrome")) {
                        f595a = "com.android.chrome";
                    } else if (arrayList.contains("com.chrome.beta")) {
                        f595a = "com.chrome.beta";
                    } else if (arrayList.contains("com.chrome.dev")) {
                        f595a = "com.chrome.dev";
                    } else if (arrayList.contains("com.google.android.apps.chrome")) {
                        f595a = "com.google.android.apps.chrome";
                    }
                }
                return f595a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
