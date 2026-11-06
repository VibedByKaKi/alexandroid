package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.dee.app.metrics.MetricsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BI\u0012B\u0010\u0002\u001a>\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\u0010\fJ\u0018\u0010\u0012\u001a\n \u0013*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J)\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016RJ\u0010\u0002\u001a>\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/bugsnag/android/ActivityBreadcrumbCollector;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "cb", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "message", "", "", MetricsConstants.NativeFetch.METHOD, "", "(Lkotlin/jvm/functions/Function2;)V", "prevState", "getPrevState", "()Ljava/lang/String;", "setPrevState", "(Ljava/lang/String;)V", "getActivityName", "kotlin.jvm.PlatformType", "activity", "Landroid/app/Activity;", "leaveBreadcrumb", "activityName", "lifecycleCallback", "hasBundle", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ActivityBreadcrumbCollector implements Application.ActivityLifecycleCallbacks {
    private final Function2<String, Map<String, ? extends Object>, Unit> cb;

    @Nullable
    private String prevState;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityBreadcrumbCollector(@NotNull Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        function2.getClass();
        this.cb = function2;
    }

    private final String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private final void leaveBreadcrumb(String activityName, String lifecycleCallback, Boolean hasBundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hasBundle != null) {
            linkedHashMap.put("hasBundle", hasBundle);
        }
        String str = this.prevState;
        if (str != null) {
            linkedHashMap.put(VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, str);
        }
        this.cb.invoke(activityName + '#' + lifecycleCallback, linkedHashMap);
        this.prevState = lifecycleCallback;
    }

    public static /* synthetic */ void leaveBreadcrumb$default(ActivityBreadcrumbCollector activityBreadcrumbCollector, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        activityBreadcrumbCollector.leaveBreadcrumb(str, str2, bool);
    }

    @Nullable
    public final String getPrevState() {
        return this.prevState;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        activity.getClass();
        String activityName = getActivityName(activity);
        activityName.getClass();
        leaveBreadcrumb(activityName, "onCreate()", Boolean.valueOf(savedInstanceState != null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
        String activityName = getActivityName(activity);
        activityName.getClass();
        leaveBreadcrumb$default(this, activityName, "onDestroy()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
        String activityName = getActivityName(activity);
        activityName.getClass();
        leaveBreadcrumb$default(this, activityName, "onPause()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        activity.getClass();
        String activityName = getActivityName(activity);
        activityName.getClass();
        leaveBreadcrumb$default(this, activityName, "onResume()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        activity.getClass();
        outState.getClass();
        String activityName = getActivityName(activity);
        activityName.getClass();
        leaveBreadcrumb$default(this, activityName, "onSaveInstanceState()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
        String activityName = getActivityName(activity);
        activityName.getClass();
        leaveBreadcrumb$default(this, activityName, "onStart()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
        String activityName = getActivityName(activity);
        activityName.getClass();
        leaveBreadcrumb$default(this, activityName, "onStop()", null, 4, null);
    }

    public final void setPrevState(@Nullable String str) {
        this.prevState = str;
    }
}
