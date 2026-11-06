package com.amazon.identity.auth.device;

import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.CredentialManager;
import com.amazon.identity.auth.device.features.Feature;
import com.amazon.identity.auth.device.framework.IsolatedModeSwitcher;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class gl {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f684a;
    public static final HashSet b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;
    public static volatile Boolean e;
    public static volatile Boolean f;
    public static volatile Boolean g;
    public static volatile Boolean h;
    public static volatile Boolean i;
    public static volatile Boolean j;
    public static volatile Boolean k;
    public static volatile Boolean l;
    public static volatile Boolean m;
    public static volatile Boolean n;
    public static volatile Boolean o;

    static {
        HashSet hashSet = new HashSet();
        f684a = hashSet;
        hashSet.addAll(Arrays.asList("com.amazon.dcp", "com.amazon.sso", "com.amazon.canary", "com.amazon.fv"));
        HashSet hashSet2 = new HashSet();
        b = hashSet2;
        hashSet2.addAll(Arrays.asList("com.amazon.imp"));
        new AtomicReference(null);
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r6, android.net.Uri r7) {
        /*
            java.util.concurrent.ConcurrentHashMap r0 = com.amazon.identity.auth.device.gl.c
            java.lang.Object r1 = r0.get(r7)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L52
            r1 = 0
            if (r7 != 0) goto Le
            goto L40
        Le:
            com.amazon.identity.auth.device.pq r2 = new com.amazon.identity.auth.device.pq
            r2.<init>(r6, r1)
            android.content.pm.PackageManager r6 = r2.b
            android.content.pm.ProviderInfo r6 = com.amazon.identity.auth.device.pq.a(r7, r6)
            r3 = 1
            if (r6 != 0) goto L1d
            goto L3c
        L1d:
            java.lang.String r4 = r6.packageName
            com.amazon.identity.auth.device.vn r5 = com.amazon.identity.auth.device.pq.f
            android.content.Context r2 = r2.d
            r5.getClass()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            boolean r2 = com.amazon.identity.auth.device.vn.a(r2, r4, r3, r5)
            if (r2 != 0) goto L3d
            java.lang.String r6 = "Package does not qualify as a trusted package."
            java.lang.String r2 = "TrustedPackageManager"
            java.lang.String r2 = com.amazon.identity.auth.device.yf.a(r2)
            android.util.Log.e(r2, r6)
        L3c:
            r6 = 0
        L3d:
            if (r6 == 0) goto L40
            r1 = r3
        L40:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r6 = r0.putIfAbsent(r7, r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 != 0) goto L51
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L52
        L51:
            r1 = r6
        L52:
            boolean r6 = r1.booleanValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.gl.a(android.content.Context, android.net.Uri):boolean");
    }

    public static synchronized boolean b() {
        Boolean bool;
        synchronized (gl.class) {
            Boolean bool2 = k;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            try {
                yf.b("PlatformUtils", "Android credential exists: " + CredentialManager.class.getCanonicalName(), "CredentialManagerInitialization:Success");
                bool = Boolean.TRUE;
            } catch (Throwable unused) {
                yf.c("PlatformUtils", "Could not initialize Passkey JS bridge because CredentialManager could not be initialized", "CredentialManagerInitialization:Exception");
                bool = Boolean.FALSE;
            }
            k = bool;
            return bool.booleanValue();
        }
    }

    public static String c(Context context) {
        String str;
        u3 u3Var = (u3) tn.a(context).getSystemService("dcp_device_info");
        u3Var.getClass();
        try {
            str = u3Var.c();
        } catch (Exception e2) {
            Log.e(yf.a("SSODeviceInfo"), "Exception when trying to get DSN", e2);
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("Cannot get DSN, use randomly generated: ");
            String str2 = u3.b;
            sb.append(str2);
            Log.e(yf.a("SSODeviceInfo"), sb.toString());
            str = str2;
        }
        yf.a("PlatformUtils");
        "user".equalsIgnoreCase(Build.TYPE);
        return str;
    }

    public static boolean d() {
        if (Build.MANUFACTURER.equalsIgnoreCase("Amazon")) {
            return true;
        }
        try {
            Class.forName("com.amazon.acos.util.AmazonBuild");
            yf.a("PlatformUtils");
            "user".equalsIgnoreCase(Build.TYPE);
            return true;
        } catch (ClassNotFoundException unused) {
            yf.a("PlatformUtils");
            "user".equalsIgnoreCase(Build.TYPE);
            return false;
        }
    }

    public static boolean e(Context context) {
        AuthenticatorDescription a2 = u7.a(context, false);
        if (a2 == null || !a2.packageName.equals("com.amazon.fv") || br.a(context, a2.packageName).intValue() < 5) {
            return false;
        }
        Log.i(yf.a("PlatformUtils"), "Device has Grover with version 3 or later");
        return true;
    }

    public static boolean f(Context context) {
        return u7.a(context, false) != null;
    }

    public static boolean g() {
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = Boolean.FALSE;
        try {
            Class<?> cls = Class.forName("com.amazon.android.os.MultipleProfileHelper");
            cls.getMethod("myProfileId", null);
            cls.getMethod("getCallingProfileId", null);
            cls.getMethod("getForegroundProfileId", null);
            Class cls2 = Integer.TYPE;
            cls.getMethod("isSameApp", cls2, cls2);
            bool2 = Boolean.TRUE;
            yf.a("PlatformUtils");
            "user".equalsIgnoreCase(Build.TYPE);
        } catch (ClassNotFoundException unused) {
            yf.a("PlatformUtils");
            "user".equalsIgnoreCase(Build.TYPE);
        } catch (NoSuchMethodException unused2) {
            yf.a("PlatformUtils");
            "user".equalsIgnoreCase(Build.TYPE);
        }
        e = bool2;
        return bool2.booleanValue();
    }

    public static boolean h(Context context) {
        Boolean bool = o;
        if (bool != null) {
            return bool.booleanValue();
        }
        AtomicReference atomicReference = u7.f1000a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("skip_security_check", true);
        bundle.putBoolean("detect_new_central_apk", true);
        boolean d2 = a((t7) u7.a(context, bundle).f522a) ? true : d();
        o = Boolean.valueOf(d2);
        return d2;
    }

    public static boolean i(Context context) {
        return g(context) && a(u7.a(context));
    }

    public static boolean j(Context context) {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager == null) {
            Log.e(yf.a("PlatformUtils"), "Cannot get UserManager. Something must be wrong.");
            return false;
        }
        boolean isManagedProfile = userManager.isManagedProfile();
        yf.a("PlatformUtils");
        "user".equalsIgnoreCase(Build.TYPE);
        return isManagedProfile;
    }

    public static boolean k(Context context) {
        String a2 = b4.a(context);
        return a2 != null && a2.startsWith("D01E") && Build.MODEL.toLowerCase(Locale.US).equals("kindle fire");
    }

    public static boolean l(Context context) {
        t7 a2 = u7.a(context);
        if (a2 == null) {
            return false;
        }
        return f684a.contains(a2.f969a);
    }

    public static boolean m(Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("checkIsAmazonDevice", true);
        if (!(a((t7) u7.a(context, bundle).f522a) ? true : d())) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("checkIsAmazonDevice", true);
        return a((t7) u7.a(context, bundle2).f522a);
    }

    public static boolean n(Context context) {
        Boolean bool = n;
        if (bool != null) {
            yf.a("PlatformUtils");
            "user".equalsIgnoreCase(Build.TYPE);
            return bool.booleanValue();
        }
        boolean z = g(context) && Build.VERSION.SDK_INT >= 34;
        Boolean valueOf = Boolean.valueOf(z);
        yf.a("PlatformUtils");
        "user".equalsIgnoreCase(Build.TYPE);
        n = valueOf;
        return z;
    }

    public static boolean o(Context context) {
        return le.a(context, "EncryptionStatusNamespace").f789a.getBoolean("SHOULD_ENCRYPT", true);
    }

    public static boolean p(Context context) {
        return le.a(context, "EncryptionKeyStatusNamespace").f789a.getBoolean("SHOULD_ENCRYPT_ENCRYPTION_KEY_V2", true);
    }

    public static boolean q(Context context) {
        return !m(context) && IsolatedModeSwitcher.isAppInIsolatedMode(context);
    }

    public static boolean r(Context context) {
        Boolean bool = h;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = Boolean.FALSE;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && packageManager.hasSystemFeature("com.fireos.sdk.minerva") && packageManager.hasSystemFeature("com.fireos.sdk.minerva", 2)) {
            bool2 = Boolean.TRUE;
        }
        h = bool2;
        return bool2.booleanValue();
    }

    public static boolean s(Context context) {
        Boolean bool = g;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = Boolean.FALSE;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || !packageManager.hasSystemFeature("com.fireos.sdk.amazon_profile_service")) {
            if (n(context)) {
                try {
                    Class.forName("com.amazon.android.amazonprofile.AmazonProfileManager");
                    Log.i(yf.a("PlatformUtils"), "AmazonProfileManager is supported on Streamline devices");
                    bool2 = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    Log.w(yf.a("PlatformUtils"), "AmazonProfileManager is not supported on Streamline devices");
                }
            }
        } else if (packageManager.hasSystemFeature("com.fireos.sdk.amazon_profile_service", 4)) {
            bool2 = Boolean.TRUE;
        }
        g = bool2;
        return bool2.booleanValue();
    }

    public static boolean t(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager != null && packageManager.hasSystemFeature("com.amazon.feature.cloudstreaming");
    }

    public static synchronized boolean f() {
        synchronized (gl.class) {
        }
        return true;
    }

    public static boolean d(Context context) {
        AuthenticatorDescription a2 = u7.a(context, false);
        return a2 != null && a2.packageName.equals("com.amazon.canary");
    }

    public static boolean e() {
        try {
            return Build.MANUFACTURER.toLowerCase(Locale.US).contains("huawei");
        } catch (Exception unused) {
            Log.i(yf.a("PlatformUtils"), "Not able to identify if it's HarmonyOS");
            return false;
        }
    }

    public static boolean b(tn tnVar) {
        if (!s(tnVar)) {
            return false;
        }
        Boolean bool = i;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = Boolean.FALSE;
        PackageManager packageManager = tnVar.getPackageManager();
        if (packageManager != null && packageManager.hasSystemFeature("com.fireos.sdk.amazon_profile_service", 11)) {
            bool2 = Boolean.valueOf(packageManager.checkPermission("com.amazon.permission.SET_PROFILE", tnVar.getPackageName()) == 0);
        }
        i = bool2;
        return bool2.booleanValue();
    }

    public static boolean b(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.MANAGE_USERS", context.getPackageName()) != 0) {
            yf.a("PlatformUtils");
            "user".equalsIgnoreCase(Build.TYPE);
            return false;
        }
        return g(context);
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 31) {
            return UserManager.isHeadlessSystemUserMode();
        }
        return false;
    }

    public static boolean g(Context context) {
        if (a(u7.a(context))) {
            yf.a("ClientSideAmazonPlatformDependencyImpl");
            "user".equalsIgnoreCase(Build.TYPE);
            return true;
        }
        yf.a("ClientSideAmazonPlatformDependencyImpl");
        "user".equalsIgnoreCase(Build.TYPE);
        return false;
    }

    public static boolean a(t7 t7Var) {
        if (t7Var == null) {
            return false;
        }
        return !f684a.contains(t7Var.f969a);
    }

    public static boolean a(tn tnVar) {
        com.amazon.identity.auth.device.features.a a2;
        synchronized (tnVar) {
            a2 = com.amazon.identity.auth.device.features.a.a(new dc(tnVar));
        }
        return a2.a(Feature.IsolateApplication);
    }

    public static synchronized boolean a(Context context) {
        Boolean bool;
        synchronized (gl.class) {
            Boolean bool2 = j;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            try {
                int i2 = Fido2ApiClient.$r8$clinit;
                if (Fido.getFido2ApiClient(context) == null) {
                    yf.b("PlatformUtils", "Could not initialize FidoAuthenticatorJSBridge because Fido client could not be initialized", "FidoClientInitialization:Error");
                    bool = Boolean.FALSE;
                } else {
                    jg.a("FidoClientInitialization:Success");
                    bool = Boolean.TRUE;
                }
            } catch (Exception unused) {
                yf.a("PlatformUtils", "Could not initialize FidoAuthenticatorJSBridge because Fido client could not be initialized", "FidoClientInitialization:Error");
                bool = Boolean.FALSE;
            }
            j = bool;
            return bool.booleanValue();
        }
    }

    public static synchronized boolean a() {
        Boolean bool;
        synchronized (gl.class) {
            Boolean bool2 = m;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            try {
                yf.a("PlatformUtils");
                "user".equalsIgnoreCase(Build.TYPE);
                bool = Boolean.TRUE;
            } catch (Throwable unused) {
                yf.c("PlatformUtils", "Could not find AndroidxCore dependency in client app", "UnavailableAndroidxCoreDependency");
                bool = Boolean.FALSE;
            }
            m = bool;
            return bool.booleanValue();
        }
    }
}
