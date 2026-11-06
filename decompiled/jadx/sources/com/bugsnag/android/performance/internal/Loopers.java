package com.bugsnag.android.performance.internal;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u00020\u00122\u000e\b\u0004\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/performance/internal/Loopers;", "", "()V", "main", "Landroid/os/Looper;", "getMain$annotations", "getMain", "()Landroid/os/Looper;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "isMainThread", "", "newMainHandler", "callback", "Landroid/os/Handler$Callback;", "onMainThread", "", "action", "Lkotlin/Function0;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Loopers {

    @NotNull
    public static final Loopers INSTANCE = new Loopers();

    @NotNull
    private static final Looper main;

    @NotNull
    private static final Handler mainHandler;

    static {
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        main = mainLooper;
        mainHandler = new Handler(mainLooper);
    }

    private Loopers() {
    }

    @NotNull
    public static final Looper getMain() {
        return main;
    }

    @NotNull
    public final Handler getMainHandler() {
        return mainHandler;
    }

    public final boolean isMainThread() {
        return Looper.myLooper() == main;
    }

    @NotNull
    public final Handler newMainHandler(@NotNull Handler.Callback callback) {
        callback.getClass();
        return new Handler(main, callback);
    }

    public final void onMainThread(@NotNull final Function0<Unit> action) {
        action.getClass();
        if (isMainThread()) {
            action.invoke();
        } else {
            getMainHandler().post(new Runnable() { // from class: com.bugsnag.android.performance.internal.Loopers$onMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    action.invoke();
                }
            });
        }
    }

    @NotNull
    public final Handler newMainHandler() {
        return new Handler(main);
    }

    @JvmStatic
    public static /* synthetic */ void getMain$annotations() {
    }
}
