package amazon.speech.simclient.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ServiceResolver {
    private static final String TAG = "ServiceResolver";

    public static ResolveInfo resolveBindIntent(Context context, Intent intent, String str) {
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentServices = packageManager == null ? null : packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        int size = queryIntentServices.size();
        if (str != null) {
            for (int i = size - 1; i >= 0; i--) {
                ServiceInfo serviceInfo = queryIntentServices.get(i).serviceInfo;
                String str2 = serviceInfo.packageName;
                if (!str.equals(serviceInfo.permission) && packageManager.checkPermission(str, str2) != 0) {
                    Log.w(TAG, a$$ExternalSyntheticOutline0.m("Package (", str2, ") has NOT declared support for (", str, MarkdownConstants.RIGHT_PARENTHESIS));
                    queryIntentServices.remove(i);
                }
            }
            size = queryIntentServices.size();
        }
        if (size > 1) {
            for (int i2 = size - 1; i2 >= 0; i2--) {
                try {
                    int i3 = packageManager.getApplicationInfo(queryIntentServices.get(i2).serviceInfo.packageName, 0).flags;
                    if ((i3 & 1) == 0 && (i3 & 128) == 0) {
                        queryIntentServices.remove(i2);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    queryIntentServices.remove(i2);
                }
            }
        }
        if (queryIntentServices.size() > 1) {
            Log.wtf(TAG, "More than one permission-enforced system service can handle intent " + intent + " and permission " + str);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        return queryIntentServices.get(0);
    }
}
