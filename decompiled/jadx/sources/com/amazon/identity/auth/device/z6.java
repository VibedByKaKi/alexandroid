package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class z6 {
    public static LinkedHashSet a(Context context, String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(str, 64).signatures) {
                linkedHashSet.add(Base64.encodeToString(signature.toByteArray(), 2));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(yf.a("BootstrapUtils"), "NameNotFoundException");
        } catch (SecurityException unused2) {
            Log.e(yf.a("BootstrapUtils"), "SecurityException");
        }
        return linkedHashSet;
    }
}
