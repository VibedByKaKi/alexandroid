package com.facebook.react.bridge;

import android.os.Handler;
import android.os.Looper;
import com.facebook.imageutils.BitmapUtil$$ExternalSyntheticLambda0;
import com.facebook.react.common.build.ReactBuildConfig;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/bridge/UiThreadUtil;", "", "<init>", "()V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "Lkotlin/Lazy;", "getUiThreadHandler", "isOnUiThread", "", "assertOnUiThread", "", "assertNotOnUiThread", "runOnUiThread", "runnable", "Ljava/lang/Runnable;", "delayInMs", "", "removeOnUiThread", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiThreadUtil {

    @NotNull
    public static final UiThreadUtil INSTANCE = new UiThreadUtil();

    /* renamed from: mainHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mainHandler = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new BitmapUtil$$ExternalSyntheticLambda0(29));

    private UiThreadUtil() {
    }

    @JvmStatic
    public static final void assertNotOnUiThread() {
        if (ReactBuildConfig.DEBUG) {
            SoftAssertions.assertCondition(!isOnUiThread(), "Expected not to run on UI thread!");
        }
    }

    @JvmStatic
    public static final void assertOnUiThread() {
        if (ReactBuildConfig.DEBUG) {
            SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
        }
    }

    private final Handler getMainHandler() {
        return (Handler) mainHandler.getValue();
    }

    @JvmStatic
    @NotNull
    public static final Handler getUiThreadHandler() {
        return INSTANCE.getMainHandler();
    }

    @JvmStatic
    public static final boolean isOnUiThread() {
        return Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mainHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    @JvmStatic
    public static final void removeOnUiThread(@NotNull Runnable runnable) {
        runnable.getClass();
        INSTANCE.getMainHandler().removeCallbacks(runnable);
    }

    @JvmStatic
    public static final boolean runOnUiThread(@NotNull Runnable runnable) {
        runnable.getClass();
        return INSTANCE.getMainHandler().postDelayed(runnable, 0L);
    }

    @JvmStatic
    public static final boolean runOnUiThread(@NotNull Runnable runnable, long delayInMs) {
        runnable.getClass();
        return INSTANCE.getMainHandler().postDelayed(runnable, delayInMs);
    }
}
