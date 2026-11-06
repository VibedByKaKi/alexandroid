package com.amazon.identity.auth.device;

import android.os.Build;
import android.text.TextUtils;
import com.amazon.identity.mobi.common.utils.UrlCommonUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class aa {
    public static boolean a(URL url, ArrayList arrayList) {
        String host = url.getHost();
        if (arrayList == null || arrayList.isEmpty()) {
            return UrlCommonUtils.AMAZON_HOST_PATTERN.matcher(host).find();
        }
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (Pattern.compile((String) it2.next()).matcher(host).find()) {
                return true;
            }
        }
        return false;
    }

    public static void a() {
        "user".equalsIgnoreCase(Build.TYPE);
    }
}
