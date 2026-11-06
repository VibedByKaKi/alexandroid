package com.amazon.identity.auth.device;

import android.net.Uri;
import java.util.HashSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class xq {
    public static String a(String str, HashSet hashSet) {
        Uri parse = Uri.parse(str);
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (String str2 : parse.getQueryParameterNames()) {
            if (!hashSet.contains(str2)) {
                clearQuery.appendQueryParameter(str2, parse.getQueryParameter(str2));
            }
        }
        return clearQuery.build().toString();
    }
}
