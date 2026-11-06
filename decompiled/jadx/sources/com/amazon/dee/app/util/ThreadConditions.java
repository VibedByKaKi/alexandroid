package com.amazon.dee.app.util;

import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.imageutils.BitmapUtil$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0007R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/amazon/dee/app/util/ThreadConditions;", "", "<init>", "()V", "value", "Lkotlin/Function0;", "Ljava/lang/Thread;", "mainThreadProvider", "getMainThreadProvider$util", "()Lkotlin/jvm/functions/Function0;", "setMainThreadProvider$util", "(Lkotlin/jvm/functions/Function0;)V", "isOnMainThread", "", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThreadConditions {

    @NotNull
    public static final ThreadConditions INSTANCE = new ThreadConditions();

    @NotNull
    private static Function0<? extends Thread> mainThreadProvider = new BitmapUtil$$ExternalSyntheticLambda0(19);

    private ThreadConditions() {
    }

    @JvmStatic
    public static final boolean isOnMainThread() {
        return Intrinsics.areEqual(Thread.currentThread(), mainThreadProvider.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread mainThreadProvider$lambda$0() {
        return Looper.getMainLooper().getThread();
    }

    @NotNull
    public final Function0<Thread> getMainThreadProvider$util() {
        return mainThreadProvider;
    }

    @VisibleForTesting
    public final void setMainThreadProvider$util(@NotNull Function0<? extends Thread> function0) {
        function0.getClass();
        mainThreadProvider = function0;
    }
}
