package com.mapbox.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.dee.app.contacts.common.constants.Constants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0007J,\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mapbox/common/LifecycleUtils;", "", "()V", Constants.LOG_TAG, "", "threadPool", "Ljava/util/concurrent/ExecutorService;", "getAppLifecycleStateFromActivityManager", "Lcom/mapbox/common/LifecycleState;", "context", "Landroid/content/Context;", "buildVersion", "", "getAppStateLollipopAndHigher", "getAppStatePreLollipop", "getAppStateQAndHigher", "getLifecycleState", "", "looper", "Landroid/os/Looper;", "callback", "Lkotlin/Function1;", "hasServiceRunningInForeground", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class LifecycleUtils {

    @NotNull
    public static final LifecycleUtils INSTANCE = new LifecycleUtils();

    @NotNull
    private static final String TAG = "LifecycleUtils";

    @NotNull
    private static ExecutorService threadPool;

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
        newFixedThreadPool.getClass();
        threadPool = newFixedThreadPool;
    }

    private LifecycleUtils() {
    }

    @RequiresApi(api = 21)
    private final LifecycleState getAppStateLollipopAndHigher(Context context) {
        Object m25294constructorimpl;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        LifecycleState lifecycleState = LifecycleState.BACKGROUND;
        for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (appTask.getTaskInfo().id != -1) {
                    lifecycleState = LifecycleState.FOREGROUND;
                }
                m25294constructorimpl = Result.m25294constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
            if (m25297exceptionOrNullimpl != null) {
                Log.error("Failed to get task properties: " + m25297exceptionOrNullimpl, TAG);
            }
        }
        return lifecycleState;
    }

    private final LifecycleState getAppStatePreLollipop(Context context) {
        Object m25294constructorimpl;
        Unit unit;
        ComponentName componentName;
        String packageName;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        String packageName2 = context.getApplicationContext().getPackageName();
        LifecycleState lifecycleState = LifecycleState.UNKNOWN;
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(32);
        for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (runningTaskInfo == null || (componentName = runningTaskInfo.topActivity) == null || (packageName = componentName.getPackageName()) == null) {
                    unit = null;
                } else {
                    if (Intrinsics.areEqual(packageName, packageName2)) {
                        lifecycleState = LifecycleState.FOREGROUND;
                    }
                    unit = Unit.INSTANCE;
                }
                m25294constructorimpl = Result.m25294constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
            if (m25297exceptionOrNullimpl != null) {
                Log.error("Failed to get task properties: " + m25297exceptionOrNullimpl, TAG);
            }
        }
        return (runningTasks.size() >= 32 || lifecycleState != LifecycleState.UNKNOWN) ? lifecycleState : LifecycleState.BACKGROUND;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.mapbox.common.LifecycleState] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @RequiresApi(api = 29)
    private final LifecycleState getAppStateQAndHigher(Context context) {
        Object m25294constructorimpl;
        String str = TAG;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Log.info("Task: " + appTask.getTaskInfo(), str);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
                str = str;
            }
            if (appTask.getTaskInfo().isRunning) {
                str = LifecycleState.FOREGROUND;
                return str;
            }
            m25294constructorimpl = Result.m25294constructorimpl(Unit.INSTANCE);
            str = str;
            Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
            if (m25297exceptionOrNullimpl != null) {
                Log.error("Failed to get task properties: " + m25297exceptionOrNullimpl, str);
            }
        }
        return LifecycleState.BACKGROUND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24(Context context, Looper looper, Function1 function1) {
        Object m25294constructorimpl;
        Object obj;
        context.getClass();
        function1.getClass();
        LifecycleUtils lifecycleUtils = INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            int i = 0;
            if (!lifecycleUtils.hasServiceRunningInForeground(context)) {
                LifecycleState appLifecycleStateFromActivityManager = lifecycleUtils.getAppLifecycleStateFromActivityManager(context);
                if (looper != null) {
                    obj = Boolean.valueOf(new Handler(looper).post(new LifecycleUtils$$ExternalSyntheticLambda4(function1, appLifecycleStateFromActivityManager, i)));
                } else {
                    function1.invoke(appLifecycleStateFromActivityManager);
                    obj = Unit.INSTANCE;
                }
            } else if (looper != null) {
                obj = Boolean.valueOf(new Handler(looper).post(new LifecycleUtils$$ExternalSyntheticLambda3(function1, i)));
            } else {
                function1.invoke(LifecycleState.FOREGROUND);
                obj = Unit.INSTANCE;
            }
            m25294constructorimpl = Result.m25294constructorimpl(obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl != null) {
            Log.error("Failed to get application state: " + m25297exceptionOrNullimpl, TAG);
            if (looper != null) {
                new Handler(looper).post(new LifecycleUtils$$ExternalSyntheticLambda3(function1, 3));
            } else {
                function1.invoke(LifecycleState.UNKNOWN);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(Function1 function1) {
        function1.getClass();
        function1.invoke(LifecycleState.FOREGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$19$lambda$18(Function1 function1, LifecycleState lifecycleState) {
        function1.getClass();
        lifecycleState.getClass();
        function1.invoke(lifecycleState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(Function1 function1) {
        function1.getClass();
        function1.invoke(LifecycleState.UNKNOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15(Context context, Looper looper, Function1 function1) {
        context.getClass();
        function1.getClass();
        boolean hasServiceRunningInForeground = INSTANCE.hasServiceRunningInForeground(context);
        if (looper != null) {
            new Handler(looper).post(new LifecycleUtils$$ExternalSyntheticLambda2(function1, hasServiceRunningInForeground, 0));
        } else {
            function1.invoke(Boolean.valueOf(hasServiceRunningInForeground));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13(Function1 function1, boolean z) {
        function1.getClass();
        function1.invoke(Boolean.valueOf(z));
    }

    @SuppressLint({"ObsoleteSdkInt"})
    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final LifecycleState getAppLifecycleStateFromActivityManager(int buildVersion, @NotNull Context context) {
        context.getClass();
        return buildVersion >= 29 ? getAppStateQAndHigher(context) : buildVersion >= 21 ? getAppStateLollipopAndHigher(context) : getAppStatePreLollipop(context);
    }

    @Deprecated(message = "Use asynchronous method")
    @NotNull
    public final LifecycleState getLifecycleState(@NotNull Context context) {
        context.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            return hasServiceRunningInForeground(context) ? LifecycleState.FOREGROUND : getAppLifecycleStateFromActivityManager(context);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(Result.m25294constructorimpl(ResultKt.createFailure(th)));
            if (m25297exceptionOrNullimpl != null) {
                Log.error("Failed to get application state: " + m25297exceptionOrNullimpl, TAG);
            }
            return LifecycleState.UNKNOWN;
        }
    }

    @Deprecated(message = "Use asynchronous method")
    public final boolean hasServiceRunningInForeground(@NotNull Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        context.getClass();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String packageName = context.getPackageName();
        if (activityManager != null && (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) != null) {
            List<ActivityManager.RunningServiceInfo> list = runningServices;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : list) {
                if (runningServiceInfo != null && Intrinsics.areEqual(runningServiceInfo.service.getPackageName(), packageName) && runningServiceInfo.foreground) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    @NotNull
    public final LifecycleState getAppLifecycleStateFromActivityManager(@NotNull Context context) {
        context.getClass();
        return getAppLifecycleStateFromActivityManager(Build.VERSION.SDK_INT, context);
    }

    public final void getLifecycleState(@NotNull Context context, @Nullable Looper looper, @NotNull Function1<? super LifecycleState, Unit> callback) {
        context.getClass();
        callback.getClass();
        threadPool.submit(new LifecycleUtils$$ExternalSyntheticLambda0(context, looper, callback, 1));
    }

    public final void hasServiceRunningInForeground(@NotNull Context context, @Nullable Looper looper, @NotNull Function1<? super Boolean, Unit> callback) {
        context.getClass();
        callback.getClass();
        threadPool.submit(new LifecycleUtils$$ExternalSyntheticLambda0(context, looper, callback, 0));
    }
}
