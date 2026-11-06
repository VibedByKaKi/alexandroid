package com.amazon.alexa.voice.ui.ra;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RaShareInRouter {
    private static final String ACTION_SHOW_RA_UI = "amazon.intent.action.SHOW_RA_UI";
    private static final String ANIMATION_TYPE = "animation_type";
    private static final String DEEPLINK_ACTIVITY = "com.amazon.dee.app.ui.main.DeeplinkActivity";
    private static final String EXTRA_RA_USER_INTERFACE_OPTIONS = "ra_ui_options";
    private static final String NEW_CONVERSATION_ROUTE = "alexa-conversations/new";

    @VisibleForTesting
    static final String RA_ACTIVITY = "com.amazon.alexa.ra.ui.RaActivity";
    private static final String SLIDE = "slide";
    private static final String TAG = "RaShareInRouter";
    private static final String TEXT_MIME_TYPE_TYPE = "text/";

    @SuppressLint({"NewApi"})
    private boolean isRaActivityOpenUsingNewApi(@NonNull Context context) {
        ComponentName componentName;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        Iterator<ActivityManager.AppTask> it2 = activityManager.getAppTasks().iterator();
        while (it2.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it2.next().getTaskInfo();
            if (taskInfo != null && (componentName = taskInfo.topActivity) != null && componentName.getClassName().equals("com.amazon.alexa.ra.ui.RaActivity")) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    private boolean isRaActivityOpenUsingOldApi(@NonNull Context context) {
        ComponentName componentName;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(Integer.MAX_VALUE)) {
            if (runningTaskInfo != null && (componentName = runningTaskInfo.topActivity) != null && componentName.getClassName().equals("com.amazon.alexa.ra.ui.RaActivity")) {
                return true;
            }
        }
        return false;
    }

    private Intent startDeepLinkActivity(@NonNull String str, @NonNull Context context, @NonNull String str2, long j) {
        Intent createIntent = createIntent(DEEPLINK_ACTIVITY, context);
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("alexa-conversations/new?referer=", str2, "&uri=", str, "&startTimestamp=");
        m.append(j);
        Uri parse = Uri.parse(m.toString());
        createIntent.setPackage(context.getPackageName());
        createIntent.setFlags(268435456);
        createIntent.setAction("android.intent.action.VIEW");
        createIntent.setData(parse);
        return createIntent;
    }

    private Intent startRaActivity(@NonNull String str, @NonNull Context context, @NonNull String str2, long j) {
        Intent createIntent = createIntent("com.amazon.alexa.ra.ui.RaActivity", context);
        RaUiOptions build = new RaUiOptions.Builder().setReferer(str2).setStartTimeStamp(j).setShareInUri(str).build();
        createIntent.setPackage(context.getPackageName());
        createIntent.setFlags(268435456);
        createIntent.setAction("amazon.intent.action.SHOW_RA_UI");
        createIntent.putExtra("ra_ui_options", build);
        createIntent.putExtra("animation_type", "slide");
        return createIntent;
    }

    @VisibleForTesting
    public Intent createIntent(@NonNull String str, @NonNull Context context) {
        try {
            return new Intent(context, Class.forName(str));
        } catch (ClassNotFoundException e) {
            AtomicFile$$ExternalSyntheticBUOutline0.m(e, e.getCause(), "Activity not found: ");
            return null;
        }
    }

    @VisibleForTesting
    public boolean isRaActivityOpen(@NonNull Context context) {
        return sdkInt() >= 29 ? isRaActivityOpenUsingNewApi(context) : isRaActivityOpenUsingOldApi(context);
    }

    @VisibleForTesting
    public int sdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public boolean shouldUseRaSharing(@Nullable String str) {
        return (str == null || str.isEmpty() || str.toLowerCase(Locale.US).startsWith(TEXT_MIME_TYPE_TYPE)) ? false : true;
    }

    public Intent startActivity(@NonNull String str, @NonNull Context context, @NonNull String str2, long j) {
        try {
            Intent startDeepLinkActivity = startDeepLinkActivity(str, context, str2, j);
            context.startActivity(startDeepLinkActivity);
            return startDeepLinkActivity;
        } catch (Exception e) {
            Log.e(TAG, "Unable to start activity for share-in " + e);
            return null;
        }
    }
}
