package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.identity.auth.device.framework.IsolatedModeSwitcher;
import com.amazon.identity.auth.device.framework.r;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class pq {
    public static volatile vn f;

    /* renamed from: a, reason: collision with root package name */
    public final String f886a;
    public final PackageManager b;
    public final boolean c;
    public final Context d;
    public volatile HashSet e;

    public pq(Context context, boolean z) {
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("context cannot be null");
            throw null;
        }
        if (f == null) {
            Log.i(yf.a("TrustedPackageManager"), "Trying to use default signature based package trust logic. This should be on 3P device");
            vn vnVar = new vn();
            synchronized (pq.class) {
                f = vnVar;
                Log.i(yf.a("TrustedPackageManager"), "Setting package trust logic as: signature based package trust logic");
            }
        }
        this.d = context;
        this.f886a = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        this.b = packageManager;
        if (z) {
            this.e = r.a(context, packageManager, true);
            this.c = false;
            return;
        }
        HashSet hashSet = r.f660a;
        if (hashSet == null) {
            r.f660a = r.a(context, packageManager, false);
            hashSet = r.f660a;
        }
        this.e = hashSet;
        this.c = IsolatedModeSwitcher.isAppInStaticIsolatedMode(context);
    }

    public final boolean a(int i) {
        int checkSignatures;
        String[] packagesForUid;
        int myUid = Process.myUid();
        boolean z = true;
        if (i == myUid) {
            return true;
        }
        if (this.c) {
            yf.a("TrustedPackageManager");
            "user".equalsIgnoreCase(Build.TYPE);
            return false;
        }
        try {
            checkSignatures = this.b.checkSignatures(i, myUid);
        } catch (Exception e) {
            a(e);
            checkSignatures = this.b.checkSignatures(i, myUid);
        }
        if (checkSignatures == 0) {
            return true;
        }
        if (this.e == null) {
            return false;
        }
        try {
            packagesForUid = this.b.getPackagesForUid(i);
        } catch (Exception e2) {
            a(e2);
            packagesForUid = this.b.getPackagesForUid(i);
        }
        if (packagesForUid == null) {
            Log.e(yf.a("TrustedPackageManager"), "Package name not found for the uid");
            return false;
        }
        int length = packagesForUid.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            try {
                Signature[] signatureArr = a(packagesForUid[i2], 64, this.b).signatures;
                HashSet hashSet = this.e;
                if (hashSet != null) {
                    for (Signature signature : signatureArr) {
                        if (hashSet.contains(signature)) {
                            break loop0;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e(yf.a("TrustedPackageManager"), "Package name not found");
            }
            i2++;
        }
        if (!z) {
            Locale locale = Locale.US;
            Log.e(yf.a("TrustedPackageManager"), a$$ExternalSyntheticOutline0.m(checkSignatures, "Other uid and my uid are do not have matching signatures (result: ", "). The trusted app check also failed."));
        }
        return z;
    }

    public final HashSet b() {
        List<PackageInfo> installedPackages;
        try {
            installedPackages = this.b.getInstalledPackages(0);
        } catch (Exception e) {
            a(e);
            installedPackages = this.b.getInstalledPackages(0);
        }
        HashSet hashSet = new HashSet();
        for (PackageInfo packageInfo : installedPackages) {
            String str = packageInfo.packageName;
            vn vnVar = f;
            Context context = this.d;
            vnVar.getClass();
            if (vn.a(context, str, false, new Bundle())) {
                hashSet.add(packageInfo.packageName);
            }
        }
        return hashSet;
    }

    public final ArrayList c() {
        ProviderInfo[] providerInfoArr;
        ApplicationInfo applicationInfo;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = b().iterator();
        while (it2.hasNext()) {
            try {
                PackageInfo a2 = a((String) it2.next(), 8, this.b);
                if (a2 != null && (providerInfoArr = a2.providers) != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (providerInfo != null && providerInfo.enabled && (applicationInfo = providerInfo.applicationInfo) != null && applicationInfo.enabled) {
                            arrayList.add(providerInfo);
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w(yf.a("TrustedPackageManager"), "Caught NameNotFoundException querying for package that existed a moment ago", e);
            }
        }
        return arrayList;
    }

    public final ArrayList a(int i, Intent intent) {
        List<ResolveInfo> queryIntentServices;
        try {
            queryIntentServices = this.b.queryIntentServices(intent, i);
        } catch (Exception e) {
            a(e);
            queryIntentServices = this.b.queryIntentServices(intent, i);
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentServices) {
            String str = resolveInfo.serviceInfo.packageName;
            vn vnVar = f;
            Context context = this.d;
            vnVar.getClass();
            if (vn.a(context, str, false, new Bundle())) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public final PackageInfo a(String str) {
        vn vnVar = f;
        Context context = this.d;
        vnVar.getClass();
        if (vn.a(context, str, true, new Bundle())) {
            return a(str, 8, this.b);
        }
        Log.e(yf.a("TrustedPackageManager"), "Package is not trusted");
        AtomicFile$$ExternalSyntheticBUOutline0.m("Package is not trusted");
        return null;
    }

    public static ProviderInfo a(Uri uri, PackageManager packageManager) {
        try {
            return packageManager.resolveContentProvider(uri.getAuthority(), 0);
        } catch (Exception e) {
            a(e);
            return packageManager.resolveContentProvider(uri.getAuthority(), 0);
        }
    }

    public static PackageInfo a(String str, int i, PackageManager packageManager) {
        try {
            return packageManager.getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException e) {
            throw e;
        } catch (Exception e2) {
            a(e2);
            return packageManager.getPackageInfo(str, i);
        }
    }

    public static void a(Exception exc) {
        yf.c("TrustedPackageManager", "PackageManager call failed; retrying. Error Message : " + exc.getMessage(), "PackageManagerError");
    }

    public final String a() {
        Context context = this.d;
        int callingUid = Binder.getCallingUid();
        try {
            return context.getPackageManager().getNameForUid(callingUid);
        } catch (Exception e) {
            Log.e(yf.a("TrustedPackageManager"), b0.a("Cannot get calling package name. Error Message : ", e.getMessage()));
            Locale locale = Locale.US;
            return a$$ExternalSyntheticOutline0.m(callingUid, "Unknown (Uid=", MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }
}
