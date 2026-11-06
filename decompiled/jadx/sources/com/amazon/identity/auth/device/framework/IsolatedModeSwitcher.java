package com.amazon.identity.auth.device.framework;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.smarthomecameras.constants.MobilyticsConstants;
import com.amazon.identity.auth.device.a0;
import com.amazon.identity.auth.device.bi;
import com.amazon.identity.auth.device.bootstrapSSO.BootstrapSSOService;
import com.amazon.identity.auth.device.dc;
import com.amazon.identity.auth.device.eg;
import com.amazon.identity.auth.device.features.Feature;
import com.amazon.identity.auth.device.g8;
import com.amazon.identity.auth.device.gl;
import com.amazon.identity.auth.device.h8;
import com.amazon.identity.auth.device.jg;
import com.amazon.identity.auth.device.le;
import com.amazon.identity.auth.device.t7;
import com.amazon.identity.auth.device.u7;
import com.amazon.identity.auth.device.x0;
import com.amazon.identity.auth.device.xn;
import com.amazon.identity.auth.device.y0;
import com.amazon.identity.auth.device.yf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class IsolatedModeSwitcher {

    /* renamed from: a, reason: collision with root package name */
    static volatile Boolean f642a = null;
    static volatile Boolean b = null;
    static volatile boolean c = false;
    private static volatile Boolean d;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SealedIsolationSource {
        DE_READ,
        CE_FALLBACK_WITH_MIGRATION,
        CE_DIRECT
    }

    private IsolatedModeSwitcher() {
    }

    private static void clearClientDrivenIsolation() {
        c = false;
    }

    public static synchronized boolean clientDrivenSwitchAppToIsolatedMode(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            if (isAppInSealedIsolatedMode(context)) {
                Log.i(yf.a("IsolatedModeSwitcher"), "Sealed isolation mode cannot be switched to client driven runtime isolation mode anymore.");
                return false;
            }
            if (!doesAppSupportClientDrivenRuntimeIsolation(context)) {
                return false;
            }
            HashSet hashSet = gl.f684a;
            if (u7.b(context)) {
                yf.a("IsolatedModeSwitcher");
                "user".equalsIgnoreCase(Build.TYPE);
                return false;
            }
            if (isAppInRuntimeIsolatedMode(context)) {
                recordClientDrivenIsolation();
                yf.a("IsolatedModeSwitcher");
                "user".equalsIgnoreCase(Build.TYPE);
                return false;
            }
            try {
                switchAppToIsolatedMode(context);
                recordClientDrivenIsolation();
                return true;
            } catch (Exception e) {
                Log.e(yf.a("IsolatedModeSwitcher"), "An error occurred while switching isolation modes", e);
                return false;
            }
        }
    }

    public static synchronized boolean clientDrivenSwitchAppToSSOMode(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            if (isAppInSealedIsolatedMode(context)) {
                Log.i(yf.a("IsolatedModeSwitcher"), "Sealed isolation mode cannot be switched to client driven sso mode anymore.");
                return false;
            }
            if (!doesAppSupportClientDrivenRuntimeIsolation(context)) {
                return false;
            }
            HashSet hashSet = gl.f684a;
            if (u7.b(context)) {
                yf.a("IsolatedModeSwitcher");
                "user".equalsIgnoreCase(Build.TYPE);
                return false;
            }
            clearClientDrivenIsolation();
            if (!isAppInRuntimeIsolatedMode(context)) {
                yf.a("IsolatedModeSwitcher");
                "user".equalsIgnoreCase(Build.TYPE);
                return false;
            }
            try {
                switchAppToSSOMode(context);
                return true;
            } catch (Exception e) {
                Log.e(yf.a("IsolatedModeSwitcher"), "An error occurred while switching isolation modes", e);
                return false;
            }
        }
    }

    private static synchronized void doSwitchAppToSealedIsolatedMode(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            Log.i(yf.a("IsolatedModeSwitcher"), "The application is being switching to sealed isolated mode.");
            y0 a2 = y0.a(context);
            ArrayList a3 = a2.a(a2.e.c());
            writeSealedIsolatedModeStateIntoStorage(context);
            preActionOnSwitch(context, true);
            com.amazon.identity.auth.device.features.a.a(new dc(context)).a(Feature.IsolateApplication, context);
            xn.a(context);
            f642a = null;
            d = null;
            b = null;
            h8.b(context).a();
            yf.a("IsolatedModeSwitcher", "Finish generating local common info (version: %d) for sealed isolated mode.", 1);
            sendAccountRemovalBroadCastToSelf(context, a3);
            Log.i(yf.a("IsolatedModeSwitcher"), "The application is sealed to isolated mode, until uninstall/reinstall or clean the app data");
        }
    }

    private static boolean doesAppNeedToSwitchToSSOMode(Context context) {
        if (isAppInRuntimeIsolatedMode(context)) {
            if (isClientDrivenIsolationInEffect()) {
                Log.i(yf.a("IsolatedModeSwitcher"), "Client-driven isolation in effect; skipping auto-switch to SSO mode.");
                return false;
            }
            if (y0.a(context).b(context.getPackageName()) == null) {
                Log.i(yf.a("IsolatedModeSwitcher"), "No account detected in isolated mode.");
                return true;
            }
        }
        return false;
    }

    public static boolean doesAppSupportClientDrivenRuntimeIsolation(Context context) {
        if (isAppInSealedIsolatedMode(context)) {
            Log.i(yf.a("IsolatedModeSwitcher"), "Sealed isolation mode does not support client driven runtime isolation mode anymore.");
            return false;
        }
        Bundle a2 = eg.a(context, context.getPackageName());
        boolean booleanValue = (a2 == null ? Boolean.FALSE : Boolean.valueOf(a2.getBoolean("Client_App_Driven_Runtime_Isolation", false))).booleanValue();
        if (booleanValue) {
            Log.i(yf.a("IsolatedModeSwitcher"), "App supports client driven runtime isolation.");
            return booleanValue;
        }
        Log.i(yf.a("IsolatedModeSwitcher"), "App does not support client driven runtime isolation.");
        return booleanValue;
    }

    public static boolean doesAppSupportRuntimeIsolatedMode(Context context) {
        if (f642a == null) {
            f642a = Boolean.valueOf((TextUtils.isEmpty(eg.a(context, context.getPackageName(), "MAPRuntimeIsolateForAccountPool")) || isAppInSealedIsolatedMode(context)) ? false : true);
        }
        if (f642a.booleanValue()) {
            Log.i(yf.a("IsolatedModeSwitcher"), "Application supports runtime isolated mode switch.");
        }
        return f642a.booleanValue();
    }

    private static void emitSealedIsolationMetrics(SealedIsolationSource sealedIsolationSource) {
        int i = c.f646a[sealedIsolationSource.ordinal()];
        if (i == 1) {
            jg.a("SealedIsolation.DE.ReadSuccess");
        } else {
            if (i != 2) {
                return;
            }
            jg.a("SealedIsolation.CE.FallbackRead");
            jg.a("SealedIsolation.DE.MigrationComplete");
        }
    }

    public static synchronized boolean isAppInIsolatedMode(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            if (isAppInStaticIsolatedMode(context)) {
                Log.i(yf.a("IsolatedModeSwitcher"), "The application is in static isolated mode");
                return true;
            }
            if (isAppInRuntimeIsolatedMode(context)) {
                Log.i(yf.a("IsolatedModeSwitcher"), "The application is in runtime isolated mode");
                return true;
            }
            if (!isAppInSealedIsolatedMode(context)) {
                return false;
            }
            Log.i(yf.a("IsolatedModeSwitcher"), "The application is switched to sealed isolated mode");
            return true;
        }
    }

    public static boolean isAppInRuntimeIsolatedMode(Context context) {
        if (isAppInSealedIsolatedMode(context) || !(doesAppSupportRuntimeIsolatedMode(context) || doesAppSupportClientDrivenRuntimeIsolation(context))) {
            return false;
        }
        boolean z = le.b(context, "runtime_isolated_mode").f789a.getBoolean("isolated", false);
        Log.i(yf.a("IsolatedModeSwitcher"), AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Restoring current runtime isolated mode: ", z));
        return z;
    }

    public static boolean isAppInSealedIsolatedMode(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            try {
                if (gl.m(context)) {
                    return false;
                }
                if (b == null) {
                    b = Boolean.valueOf(readSealedIsolationFlag(context).f648a);
                }
                return b.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isAppInStaticIsolatedMode(Context context) {
        Bundle a2 = eg.a(context, context.getPackageName());
        if ((a2 == null ? Boolean.FALSE : Boolean.valueOf(a2.getBoolean("MAPIsolateApplication", false))).booleanValue()) {
            return true;
        }
        if (d != null) {
            return d.booleanValue();
        }
        String packageName = context.getPackageName();
        ArrayList arrayList = new ArrayList();
        String a3 = eg.a(context, packageName, "MAPIsolateApplicationOnDevice");
        if (!TextUtils.isEmpty(a3)) {
            for (String str : a3.split("\\|")) {
                arrayList.add(str);
            }
        }
        if (g8.a(arrayList)) {
            return false;
        }
        Log.i(yf.a("IsolatedModeSwitcher"), "App needs isolation on devices: " + arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (str2.equalsIgnoreCase("FireOS") && gl.m(context)) {
                return setAppInStaticIsolatedModeAndReturn(true, "FireOS");
            }
            if (str2.equalsIgnoreCase("Canary") && bi.b(context, "com.amazon.canary") && u7.c(context)) {
                return setAppInStaticIsolatedModeAndReturn(true, "Canary");
            }
            if (str2.equalsIgnoreCase("Grover") && bi.b(context, "com.amazon.fv") && u7.c(context)) {
                return setAppInStaticIsolatedModeAndReturn(true, "Grover");
            }
            if (str2.equalsIgnoreCase(MobilyticsConstants.PROVIDER_3P_SUFFIX)) {
                AtomicReference atomicReference = u7.f1000a;
                if (((t7) u7.a(context, new Bundle()).f522a) == null) {
                    return setAppInStaticIsolatedModeAndReturn(true, MobilyticsConstants.PROVIDER_3P_SUFFIX);
                }
            }
        }
        return setAppInStaticIsolatedModeAndReturn(false, null);
    }

    private static boolean isClientDrivenIsolationInEffect() {
        return c;
    }

    private static void preActionOnSwitch(Context context, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) BootstrapSSOService.class), z ? 2 : 1, 1);
        } catch (IllegalArgumentException unused) {
            yf.a("Component Class %s not found in manifest", "BootstrapSSOService");
        }
    }

    private static d readSealedIsolationFlag(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().createDeviceProtectedStorageContext().getSharedPreferences("runtime_isolated_mode", 0);
        if (sharedPreferences.contains("sealed_isolated")) {
            boolean z = sharedPreferences.getBoolean("sealed_isolated", false);
            Log.i(yf.a("IsolatedModeSwitcher"), AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Current sealed isolated mode (from DE): ", z));
            return new d(z, SealedIsolationSource.DE_READ);
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager == null || !userManager.isUserUnlocked()) {
            Log.w(yf.a("IsolatedModeSwitcher"), "User locked and DE empty, attempting CE access (may throw)");
            boolean z2 = le.b(context, "runtime_isolated_mode").f789a.getBoolean("sealed_isolated", false);
            Log.i(yf.a("IsolatedModeSwitcher"), AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Current sealed isolated mode (from CE): ", z2));
            return new d(z2, SealedIsolationSource.CE_DIRECT);
        }
        boolean z3 = context.getSharedPreferences("runtime_isolated_mode", 0).getBoolean("sealed_isolated", false);
        if (!sharedPreferences.edit().putBoolean("sealed_isolated", z3).commit()) {
            Log.e(yf.a("LocalKeyValueStore"), "Failed to set key sealed_isolated in the local key value store runtime_isolated_mode");
        }
        Log.i(yf.a("IsolatedModeSwitcher"), AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Migrated sealed isolated mode CE->DE: ", z3));
        return new d(z3, SealedIsolationSource.CE_FALLBACK_WITH_MIGRATION);
    }

    private static void recordClientDrivenIsolation() {
        c = true;
    }

    private static void sendAccountRemovalBroadCastToSelf(Context context, List<x0> list) {
        y0 a2 = y0.a(context);
        HashSet c2 = a2.e.c();
        ArrayList arrayList = new ArrayList();
        for (x0 x0Var : list) {
            if (!c2.contains(x0Var.f1056a)) {
                arrayList.add(x0Var);
            }
        }
        a2.a(arrayList, context.getPackageName(), new Bundle());
    }

    private static boolean setAppInStaticIsolatedModeAndReturn(boolean z, String str) {
        if (z && !TextUtils.isEmpty(str)) {
            Locale locale = Locale.ENGLISH;
            Log.i(yf.a("IsolatedModeSwitcher"), a0.a("Current platform is ", str, ", entering static isolation mode"));
        }
        d = Boolean.valueOf(z);
        return z;
    }

    private static synchronized void switchAppToIsolatedMode(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            Log.i(yf.a("IsolatedModeSwitcher"), "The application is entering isolated mode.");
            preActionOnSwitch(context, true);
            writeIsolatedModeStateIntoStorage(context, true);
            com.amazon.identity.auth.device.features.a.a(new dc(context)).a(Feature.IsolateApplication, context);
            xn.a(context);
            h8.b(context).a();
            yf.a("IsolatedModeSwitcher", "Finish generating local common info (version: %d) for isolated mode.", 1);
        }
    }

    public static synchronized void switchAppToIsolatedModeIfNecessary(Context context, String str) {
        synchronized (IsolatedModeSwitcher.class) {
            if (isAppInSealedIsolatedMode(context)) {
                Log.i(yf.a("IsolatedModeSwitcher"), "Sealed isolation mode cannot be switched to runtime isolation mode anymore.");
                return;
            }
            if (doesAppSupportRuntimeIsolatedMode(context)) {
                if (!TextUtils.isEmpty(str)) {
                    String a2 = eg.a(context, context.getPackageName(), "MAPRuntimeIsolateForAccountPool");
                    yf.a("The account is in account pool: %s. Runtime isolated mode needed for account pool: %s.", str, a2);
                    if (!TextUtils.equals(str, a2)) {
                        Log.i(yf.a("IsolatedModeSwitcher"), "Keep application in SSO mode.");
                        return;
                    }
                    switchAppToIsolatedMode(context);
                    jg.a("EnterRuntimeIsolatedMode:" + a2);
                }
            }
        }
    }

    public static synchronized void switchAppToSSOMode(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            Log.i(yf.a("IsolatedModeSwitcher"), "The application is entering SSO mode.");
            clearClientDrivenIsolation();
            preActionOnSwitch(context, false);
            writeIsolatedModeStateIntoStorage(context, false);
            com.amazon.identity.auth.device.features.a.a(new dc(context)).a(Feature.IsolateApplication, context);
            xn.a(context);
            jg.a("ExitRuntimeIsolatedMode");
        }
    }

    public static synchronized void switchAppToSSOModeIfNecessary(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            try {
                if (doesAppNeedToSwitchToSSOMode(context)) {
                    switchAppToSSOMode(context);
                } else {
                    yf.a("IsolatedModeSwitcher");
                    "user".equalsIgnoreCase(Build.TYPE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized boolean switchAppToSealedIsolatedMode(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            if (gl.m(context)) {
                yf.a("IsolatedModeSwitcher");
                "user".equalsIgnoreCase(Build.TYPE);
                return false;
            }
            if (isAppInStaticIsolatedMode(context)) {
                context.getPackageName();
                yf.a("IsolatedModeSwitcher");
                "user".equalsIgnoreCase(Build.TYPE);
                return false;
            }
            if (isAppInSealedIsolatedMode(context)) {
                yf.a("IsolatedModeSwitcher");
                "user".equalsIgnoreCase(Build.TYPE);
                return false;
            }
            if (isAppInRuntimeIsolatedMode(context)) {
                yf.b("IsolatedModeSwitcher", "Runtime isolation mode isswitching to sealed isolation mode", "RuntimeToSealedIsolation");
            }
            try {
                doSwitchAppToSealedIsolatedMode(context);
                Log.i(yf.a("IsolatedModeSwitcher"), "Successfully switch to sealed isolation mode");
                return true;
            } catch (Exception e) {
                Log.e(yf.a("IsolatedModeSwitcher"), "An error occurred while switching to seled isolation mode", e);
                return false;
            }
        }
    }

    private static void writeIsolatedModeStateIntoStorage(Context context, boolean z) {
        le.b(context, "runtime_isolated_mode").a("isolated", Boolean.valueOf(z));
    }

    private static synchronized void writeSealedIsolatedModeStateIntoStorage(Context context) {
        synchronized (IsolatedModeSwitcher.class) {
            try {
                le b2 = le.b(context, "runtime_isolated_mode");
                Boolean bool = Boolean.TRUE;
                b2.a("sealed_isolated", bool);
                if (!context.getApplicationContext().createDeviceProtectedStorageContext().getSharedPreferences("runtime_isolated_mode", 0).edit().putBoolean("sealed_isolated", true).commit()) {
                    Log.e(yf.a("LocalKeyValueStore"), "Failed to set key sealed_isolated in the local key value store runtime_isolated_mode");
                }
                jg.a("SealedIsolation.Write.DualWrite");
                b = bool;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
