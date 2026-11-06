package com.amazon.identity.auth.device;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.identity.auth.device.utils.AccountConstants;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class u7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f1000a = new AtomicReference(null);

    public static ar a(Context context, Bundle bundle) {
        Uri uri = mc.i;
        ProviderInfo a2 = pq.a(uri, context.getPackageManager());
        if (a2 != null) {
            if (gl.j(context)) {
                return new ar(null);
            }
            if (bundle.getBoolean("skip_security_check", false)) {
                yf.a("CentralApkUtils");
                String str = Build.TYPE;
                "user".equalsIgnoreCase(str);
                String.format(Locale.ENGLISH, "Retrieved central APK info from package manager using content provider %s without verifying signature. The package name is : %s and version is: %d.", uri, a2.packageName, br.a(context, a2.packageName));
                yf.a("CentralApkUtils");
                "user".equalsIgnoreCase(str);
                return new ar(new t7(a2.packageName));
            }
            String str2 = a2.packageName;
            Bundle bundle2 = new Bundle();
            bundle2.putString("central_package_name", str2);
            bundle2.putBoolean("ignore_isolation_mode", true);
            if (bundle.getBoolean("checkIsAmazonDevice")) {
                bundle2.putBoolean("checkIsAmazonDevice", true);
            }
            if (e8.a(context, bundle2)) {
                String.format(Locale.ENGLISH, "Retrieved central APK info from package manager using content provider %s. The package name is : %s and version is: %d.", uri, a2.packageName, br.a(context, a2.packageName));
                yf.a("CentralApkUtils");
                "user".equalsIgnoreCase(Build.TYPE);
                return new ar(new t7(a2.packageName));
            }
        }
        if (bundle.getBoolean("detect_new_central_apk", false)) {
            Log.i(yf.a("CentralApkUtils"), "No central apk detected. This should be a 3P device or under work profile on Streamline devices.");
            return new ar(null);
        }
        AuthenticatorDescription a3 = a(context, true);
        if (a3 == null) {
            Log.i(yf.a("CentralApkUtils"), "No central apk detected. This should be a 3P device.");
            return new ar(null);
        }
        String str3 = a3.packageName;
        br.a(context, str3);
        Locale locale = Locale.ENGLISH;
        yf.a("CentralApkUtils");
        "user".equalsIgnoreCase(Build.TYPE);
        return new ar(new t7(str3));
    }

    public static boolean b(Context context) {
        return a(context) != null;
    }

    public static boolean c(Context context) {
        AuthenticatorDescription authenticatorDescription;
        boolean a2;
        AuthenticatorDescription[] authenticatorTypes = AccountManager.get(context).getAuthenticatorTypes();
        int length = authenticatorTypes.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                Log.i(yf.a("CentralApkUtils"), "Cannot find amazon authenticator. returning null");
                authenticatorDescription = null;
                break;
            }
            authenticatorDescription = authenticatorTypes[i];
            if (AccountConstants.AMAZON_ACCOUNT_TYPE.equals(authenticatorDescription.type)) {
                String str = authenticatorDescription.packageName;
                Bundle bundle = new Bundle();
                bundle.putString("central_package_name", str);
                bundle.putBoolean("ignore_isolation_mode", true);
                a2 = e8.a(context, bundle);
            } else {
                a2 = false;
            }
            if (a2) {
                Log.i(yf.a("CentralApkUtils"), b0.a("SSO was found in package ", authenticatorDescription.packageName));
                break;
            }
            i++;
        }
        return authenticatorDescription != null;
    }

    public static boolean d(Context context) {
        t7 a2 = a(context);
        if (a2 == null) {
            return false;
        }
        boolean equals = TextUtils.equals(context.getPackageName(), a2.f969a);
        if (!equals) {
            yf.a("CentralApkUtils");
            "user".equalsIgnoreCase(Build.TYPE);
        }
        return equals;
    }

    public static boolean e(Context context) {
        return Build.VERSION.SDK_INT >= 34 && "com.amazon.imp".equals(context.getPackageName());
    }

    public static t7 a(Context context) {
        if (gl.a(tn.a(context))) {
            return null;
        }
        AtomicReference atomicReference = f1000a;
        if (atomicReference.get() == null) {
            ar a2 = a(context, new Bundle());
            if (a2.f522a == null && "com.amazon.imp".equals(context.getPackageName())) {
                Log.w(yf.a("CentralApkUtils"), "detectCentralApk returned null while running as com.amazon.imp. Using self-description as fallback.");
                br.a(context, "com.amazon.imp");
                ar arVar = new ar(new t7("com.amazon.imp"));
                while (!atomicReference.compareAndSet(null, arVar) && atomicReference.get() == null) {
                }
            } else {
                while (!atomicReference.compareAndSet(null, a2) && atomicReference.get() == null) {
                }
            }
        }
        return (t7) ((ar) atomicReference.get()).f522a;
    }

    public static AuthenticatorDescription a(Context context, boolean z) {
        boolean a2;
        for (AuthenticatorDescription authenticatorDescription : AccountManager.get(context).getAuthenticatorTypes()) {
            if (AccountConstants.AMAZON_ACCOUNT_TYPE.equals(authenticatorDescription.type)) {
                String str = authenticatorDescription.packageName;
                Bundle bundle = new Bundle();
                bundle.putString("central_package_name", str);
                bundle.putBoolean("ignore_isolation_mode", z);
                a2 = e8.a(context, bundle);
            } else {
                a2 = false;
            }
            if (a2) {
                yf.a("CentralApkUtils");
                "user".equalsIgnoreCase(Build.TYPE);
                return authenticatorDescription;
            }
        }
        Log.i(yf.a("CentralApkUtils"), "Cannot find amazon authenticator. returning null");
        return null;
    }
}
