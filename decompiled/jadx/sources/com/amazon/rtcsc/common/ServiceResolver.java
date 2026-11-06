package com.amazon.rtcsc.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.utils.RtcscLogger;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ServiceResolver {
    private static RtcscLogger mLog = RtcscLogger.getLogger(BaseClient.class);

    public static ResolveInfo resolveBindIntent(Context context, Intent intent, String str) {
        ServiceInfo serviceInfo;
        String str2;
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentServices = packageManager == null ? null : packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        int size = queryIntentServices.size();
        if (str != null) {
            for (int i = size - 1; i >= 0; i--) {
                ServiceInfo serviceInfo2 = queryIntentServices.get(i).serviceInfo;
                String str3 = serviceInfo2.packageName;
                if (!str.equals(serviceInfo2.permission) && packageManager.checkPermission(str, str3) != 0) {
                    mLog.w(a$$ExternalSyntheticOutline0.m("Package (", str3, ") has NOT declared support for (", str, MarkdownConstants.RIGHT_PARENTHESIS));
                    queryIntentServices.remove(i);
                }
            }
            size = queryIntentServices.size();
        }
        if (size > 0) {
            for (int i2 = size - 1; i2 >= 0; i2--) {
                ResolveInfo resolveInfo = queryIntentServices.get(i2);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && (str2 = serviceInfo.packageName) != null && str2.equals(context.getPackageName())) {
                    mLog.i("Resolving to service inside same package");
                    return resolveInfo;
                }
            }
        }
        if (size > 1) {
            mLog.i("Removing non-system matches");
            for (int i3 = size - 1; i3 >= 0; i3--) {
                try {
                    int i4 = packageManager.getApplicationInfo(queryIntentServices.get(i3).serviceInfo.packageName, 0).flags;
                    if ((i4 & 1) == 0 && (i4 & 128) == 0) {
                        queryIntentServices.remove(i3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    queryIntentServices.remove(i3);
                }
            }
        }
        if (queryIntentServices.size() > 1) {
            mLog.w("More than one permission-enforced system service can handle intent " + intent + " and permission " + str);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        return queryIntentServices.get(0);
    }
}
