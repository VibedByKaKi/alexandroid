package com.bugsnag.android.performance.internal.instrumentation;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.bugsnag.android.performance.internal.Loopers;
import com.mapbox.bindgen.Cleaner$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0019\u001a\u00020\u00142%\u0010\u001a\u001a!\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010j\u0002`\u0015J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J-\u0010(\u001a\u00020\u00142%\u0010\u001a\u001a!\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010j\u0002`\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b@AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR3\u0010\u000e\u001a'\u0012#\u0012!\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010j\u0002`\u00150\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bugsnag/android/performance/internal/instrumentation/ForegroundState;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "BACKGROUND_TIMEOUT_MS", "", "activityInstanceCount", "", "backgroundSent", "", "value", "isInForeground", "()Z", "setInForeground$bugsnag_android_performance_release", "(Z)V", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "inForeground", "", "Lcom/bugsnag/android/performance/internal/instrumentation/InForegroundCallback;", "sendInBackground", "Ljava/lang/Runnable;", "startedActivityCount", "addForegroundChangedCallback", "inForegroundCallback", "dispatchForegroundChangedCallback", "onActivityCreated", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "removeForegroundChangedCallback", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForegroundState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundState.kt\ncom/bugsnag/android/performance/internal/instrumentation/ForegroundState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1855#2,2:102\n*S KotlinDebug\n*F\n+ 1 ForegroundState.kt\ncom/bugsnag/android/performance/internal/instrumentation/ForegroundState\n*L\n63#1:102,2\n*E\n"})
/* loaded from: classes6.dex */
public final class ForegroundState implements Application.ActivityLifecycleCallbacks {
    public static final long BACKGROUND_TIMEOUT_MS = 700;
    private static int activityInstanceCount;
    private static boolean isInForeground;
    private static int startedActivityCount;

    @NotNull
    public static final ForegroundState INSTANCE = new ForegroundState();
    private static boolean backgroundSent = true;

    @NotNull
    private static final CopyOnWriteArraySet<Function1<Boolean, Unit>> listeners = new CopyOnWriteArraySet<>();

    @NotNull
    private static final Runnable sendInBackground = new Cleaner$$ExternalSyntheticLambda0(13);

    private ForegroundState() {
    }

    private final void dispatchForegroundChangedCallback(boolean inForeground) {
        Iterator<T> it2 = listeners.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(Boolean.valueOf(inForeground));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInBackground$lambda$0() {
        if (backgroundSent) {
            return;
        }
        INSTANCE.setInForeground$bugsnag_android_performance_release(false);
        backgroundSent = true;
    }

    public final void addForegroundChangedCallback(@NotNull Function1<? super Boolean, Unit> inForegroundCallback) {
        inForegroundCallback.getClass();
        listeners.add(inForegroundCallback);
    }

    public final boolean isInForeground() {
        return isInForeground;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        activity.getClass();
        activityInstanceCount++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
        activityInstanceCount = Math.max(0, activityInstanceCount - 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        activity.getClass();
        outState.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
        startedActivityCount++;
        Loopers.INSTANCE.getMainHandler().removeCallbacks(sendInBackground);
        setInForeground$bugsnag_android_performance_release(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
        int max = Math.max(0, startedActivityCount - 1);
        startedActivityCount = max;
        if (max == 0) {
            backgroundSent = false;
            Loopers.INSTANCE.getMainHandler().postDelayed(sendInBackground, 700L);
        }
    }

    public final void removeForegroundChangedCallback(@NotNull Function1<? super Boolean, Unit> inForegroundCallback) {
        inForegroundCallback.getClass();
        listeners.remove(inForegroundCallback);
    }

    @VisibleForTesting
    public final void setInForeground$bugsnag_android_performance_release(boolean z) {
        if (z != isInForeground) {
            isInForeground = z;
            dispatchForegroundChangedCallback(z);
        }
    }
}
