package io.branch.referral;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class InstantAppUtil {
    private static Boolean isInstantApp;
    private static Context lastApplicationContext;
    private static PackageManagerWrapper packageManagerWrapper;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PackageManagerWrapper {
        private static Method isInstantAppMethod;
        private final PackageManager packageManager;

        public PackageManagerWrapper(PackageManager packageManager) {
            this.packageManager = packageManager;
        }

        public Boolean isInstantApp() {
            if (!InstantAppUtil.isAtLeastO()) {
                return null;
            }
            if (isInstantAppMethod == null) {
                try {
                    isInstantAppMethod = PackageManager.class.getDeclaredMethod("isInstantApp", null);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
            try {
                return (Boolean) isInstantAppMethod.invoke(this.packageManager, null);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return null;
            }
        }
    }

    public static boolean doShowInstallPrompt(@NonNull Activity activity, int i, @Nullable String str) {
        if (activity == null) {
            BranchLogger.v("Unable to show install prompt. Activity is null");
            return false;
        }
        if (!isInstantApp(activity)) {
            BranchLogger.v("Unable to show install prompt. Application is not an instant app");
            return false;
        }
        Intent putExtra = new Intent("android.intent.action.VIEW").setPackage("com.android.vending").addCategory("android.intent.category.DEFAULT").putExtra("callerId", activity.getPackageName()).putExtra("overlay", true);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", activity.getPackageName());
        if (!TextUtils.isEmpty(str)) {
            appendQueryParameter.appendQueryParameter("referrer", str);
        }
        putExtra.setData(appendQueryParameter.build());
        activity.startActivityForResult(putExtra, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastO() {
        return true;
    }

    public static boolean isInstantApp(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        if (isInstantApp != null && applicationContext.equals(lastApplicationContext)) {
            return isInstantApp.booleanValue();
        }
        Boolean bool = null;
        isInstantApp = null;
        if (isAtLeastO()) {
            if (packageManagerWrapper == null || !applicationContext.equals(lastApplicationContext)) {
                packageManagerWrapper = new PackageManagerWrapper(applicationContext.getPackageManager());
            }
            bool = packageManagerWrapper.isInstantApp();
        }
        lastApplicationContext = applicationContext;
        if (bool != null) {
            isInstantApp = bool;
        } else {
            try {
                applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                isInstantApp = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                isInstantApp = Boolean.FALSE;
            }
        }
        return isInstantApp.booleanValue();
    }

    private static boolean isPreReleaseOBuild() {
        String str = Build.VERSION.CODENAME;
        if ("REL".equals(str)) {
            return false;
        }
        return "O".equals(str) || str.startsWith("OMR");
    }
}
