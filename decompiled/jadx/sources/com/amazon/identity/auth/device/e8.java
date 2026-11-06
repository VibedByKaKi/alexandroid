package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class e8 {
    public static boolean a(Context context, Bundle bundle) {
        String string = bundle.getString("central_package_name");
        if (TextUtils.equals(string, context.getPackageName())) {
            yf.a("ClientToCentralTrustLogicImpl");
            "user".equalsIgnoreCase(Build.TYPE);
            return true;
        }
        boolean z = bundle.getBoolean("ignore_isolation_mode");
        Log.i(yf.a("ClientToCentralTrustLogicImpl"), "Current package is: " + context.getPackageName() + ". Going to check central package's signature:" + string + ", since it is AOSP MAP library");
        pq pqVar = new pq(context, z);
        vn vnVar = pq.f;
        Context context2 = pqVar.d;
        vnVar.getClass();
        if (vn.a(context2, string, true, bundle)) {
            return true;
        }
        Log.e(yf.a("ClientToCentralTrustLogicImpl"), s0.a("Central package signature check failed! This probably means someone is squatting or a platform bug in the signature check. The account authenticator's package name is: ", string));
        return false;
    }
}
