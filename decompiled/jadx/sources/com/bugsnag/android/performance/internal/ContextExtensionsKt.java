package com.bugsnag.android.performance.internal;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.deecomms.common.Constants;
import com.bugsnag.android.performance.Logger;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0004H\u0001¢\u0006\u0002\b\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0004H\u0001¢\u0006\u0002\b\f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u0004H\u0001¢\u0006\u0002\b\u000f\u001a\"\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000\u001a\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0001\u001a$\u0010\u001a\u001a\u0004\u0018\u0001H\u001b\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\u001d\u001a\u0016\u0010\u001e\u001a\u00020\u001f*\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006 "}, d2 = {"RELEASE_STAGE_DEVELOPMENT", "", "RELEASE_STAGE_PRODUCTION", "releaseStage", "Landroid/content/Context;", "getReleaseStage", "(Landroid/content/Context;)Ljava/lang/String;", "getActivityManager", "Landroid/app/ActivityManager;", "getActivityManagerFrom", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManagerFrom", "getTelephonyManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManagerFrom", "registerReceiverSafe", "Landroid/content/Intent;", Constants.BUNDLE_RECEIVER_TAG, "Landroid/content/BroadcastReceiver;", "filter", "Landroid/content/IntentFilter;", "safeGetNetworkCapabilities", "Landroid/net/NetworkCapabilities;", "network", "Landroid/net/Network;", "safeGetSystemService", ExifInterface.GPS_DIRECTION_TRUE, "name", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "unregisterReceiverSafe", "", "bugsnag-android-performance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextExtensions.kt\ncom/bugsnag/android/performance/internal/ContextExtensionsKt\n*L\n1#1,95:1\n58#1,4:96\n58#1,4:100\n58#1,4:104\n*S KotlinDebug\n*F\n+ 1 ContextExtensions.kt\ncom/bugsnag/android/performance/internal/ContextExtensionsKt\n*L\n78#1:96,4\n81#1:100,4\n84#1:104,4\n*E\n"})
/* loaded from: classes6.dex */
public final class ContextExtensionsKt {

    @NotNull
    public static final String RELEASE_STAGE_DEVELOPMENT = "development";

    @NotNull
    public static final String RELEASE_STAGE_PRODUCTION = "production";

    @JvmName(name = "getActivityManagerFrom")
    @Nullable
    public static final ActivityManager getActivityManagerFrom(@NotNull Context context) {
        context.getClass();
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @JvmName(name = "getConnectivityManagerFrom")
    @Nullable
    public static final ConnectivityManager getConnectivityManagerFrom(@NotNull Context context) {
        context.getClass();
        try {
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @NotNull
    public static final String getReleaseStage(@NotNull Context context) {
        context.getClass();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || (applicationInfo.flags & 2) == 0) ? "production" : "development";
    }

    @JvmName(name = "getTelephonyManagerFrom")
    @Nullable
    public static final TelephonyManager getTelephonyManagerFrom(@NotNull Context context) {
        context.getClass();
        try {
            Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (!(systemService instanceof TelephonyManager)) {
                systemService = null;
            }
            return (TelephonyManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Nullable
    public static final Intent registerReceiverSafe(@NotNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @Nullable IntentFilter intentFilter) {
        context.getClass();
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (RemoteException e) {
            Logger.INSTANCE.w("Failed to register receiver", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Logger.INSTANCE.w("Failed to register receiver", e2);
            return null;
        } catch (SecurityException e3) {
            Logger.INSTANCE.w("Failed to register receiver", e3);
            return null;
        }
    }

    @RequiresApi(21)
    @Nullable
    public static final NetworkCapabilities safeGetNetworkCapabilities(@NotNull ConnectivityManager connectivityManager, @Nullable Network network) {
        connectivityManager.getClass();
        try {
            return connectivityManager.getNetworkCapabilities(network);
        } catch (SecurityException unused) {
            return null;
        }
    }

    private static final /* synthetic */ <T> T safeGetSystemService(Context context, String str) {
        try {
            T t = (T) context.getSystemService(str);
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            return t;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final void unregisterReceiverSafe(@NotNull Context context, @Nullable BroadcastReceiver broadcastReceiver) {
        context.getClass();
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (RemoteException e) {
            Logger.INSTANCE.w("Failed to register receiver", e);
        } catch (IllegalArgumentException e2) {
            Logger.INSTANCE.w("Failed to register receiver", e2);
        } catch (SecurityException e3) {
            Logger.INSTANCE.w("Failed to register receiver", e3);
        }
    }
}
