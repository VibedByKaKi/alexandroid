package com.bugsnag.android.performance.internal;

import android.app.ActivityManager;
import android.app.Application;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\u0010\b\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"processInfo", "Landroid/app/ActivityManager$RunningAppProcessInfo;", "getProcessInfo", "()Landroid/app/ActivityManager$RunningAppProcessInfo;", "isInForeground", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)Ljava/lang/Boolean;", "bugsnag-android-performance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForegroundTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundTracker.kt\ncom/bugsnag/android/performance/internal/ForegroundTrackerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1747#2,3:37\n*S KotlinDebug\n*F\n+ 1 ForegroundTracker.kt\ncom/bugsnag/android/performance/internal/ForegroundTrackerKt\n*L\n17#1:37,3\n*E\n"})
/* loaded from: classes6.dex */
public final class ForegroundTrackerKt {
    private static final ActivityManager.RunningAppProcessInfo getProcessInfo() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Nullable
    public static final Boolean isInForeground(@Nullable Application application) {
        List<ActivityManager.AppTask> appTasks;
        boolean z = true;
        try {
            if (application == null) {
                if (getProcessInfo().importance > 125) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            ActivityManager activityManagerFrom = ContextExtensionsKt.getActivityManagerFrom(application);
            if (activityManagerFrom != null && (appTasks = activityManagerFrom.getAppTasks()) != null) {
                List<ActivityManager.AppTask> list = appTasks;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((ActivityManager.AppTask) it2.next()).getTaskInfo().numActivities > 0) {
                            break;
                        }
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static /* synthetic */ Boolean isInForeground$default(Application application, int i, Object obj) {
        if ((i & 1) != 0) {
            application = null;
        }
        return isInForeground(application);
    }
}
