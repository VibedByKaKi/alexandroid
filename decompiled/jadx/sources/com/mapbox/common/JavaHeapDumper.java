package com.mapbox.common;

import android.os.Debug;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0007J\r\u0010\u0016\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\u000b\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mapbox/common/JavaHeapDumper;", "", "()V", "COOLDOWN_MS", "", "heapBytesOverrideForTest", "getHeapBytesOverrideForTest$common_release$annotations", "getHeapBytesOverrideForTest$common_release", "()Ljava/lang/Long;", "setHeapBytesOverrideForTest$common_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "lastDumpTime", "memoryThresholdBytes", "previousHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "checkAndDump", "", "disable", "dump", "enable", "newMemoryThreshold", "resetCooldownForTest", "resetCooldownForTest$common_release", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class JavaHeapDumper {
    private static final long COOLDOWN_MS = 300000;

    @NotNull
    public static final JavaHeapDumper INSTANCE = new JavaHeapDumper();

    @Nullable
    private static Long heapBytesOverrideForTest;
    private static volatile long lastDumpTime;
    private static volatile long memoryThresholdBytes;

    @Nullable
    private static volatile Thread.UncaughtExceptionHandler previousHandler;

    private JavaHeapDumper() {
    }

    @JvmStatic
    public static final void checkAndDump() {
        if (SystemClock.elapsedRealtime() - lastDumpTime < 300000) {
            return;
        }
        Runtime runtime = Runtime.getRuntime();
        if (runtime.maxMemory() <= 0) {
            return;
        }
        long j = runtime.totalMemory();
        Long l = heapBytesOverrideForTest;
        long longValue = l != null ? l.longValue() : memoryThresholdBytes;
        if (longValue <= 0 || j < longValue) {
            return;
        }
        StringBuilder m = a$$ExternalSyntheticOutline0.m("Memory use ", j, " exceeds (or equals) threshold ");
        m.append(longValue);
        m.append(", dumping heap");
        Log.warning(m.toString(), "memory");
        INSTANCE.dump();
    }

    @JvmStatic
    public static final void disable() {
        memoryThresholdBytes = 0L;
        Thread.setDefaultUncaughtExceptionHandler(previousHandler);
        previousHandler = null;
    }

    private final void dump() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Debug.dumpHprofData(MapboxSDKCommon.INSTANCE.getContext().getCacheDir() + "/heap_" + elapsedRealtime + ".hprof");
            lastDumpTime = elapsedRealtime;
        } catch (Throwable th) {
            Log.warning("Failed to write Java heap dump: " + th.getMessage(), "memory");
        }
    }

    @JvmStatic
    public static final void enable(long newMemoryThreshold) {
        long j = memoryThresholdBytes;
        memoryThresholdBytes = newMemoryThreshold;
        if (j == 0) {
            previousHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new JavaHeapDumper$$ExternalSyntheticLambda0(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enable$lambda$1(Thread thread, Throwable th) {
        if (th instanceof OutOfMemoryError) {
            JavaHeapDumper javaHeapDumper = INSTANCE;
            try {
                Result.Companion companion = Result.INSTANCE;
                javaHeapDumper.dump();
                Result.m25294constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m25294constructorimpl(ResultKt.createFailure(th2));
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = previousHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @Nullable
    public final Long getHeapBytesOverrideForTest$common_release() {
        return heapBytesOverrideForTest;
    }

    @VisibleForTesting(otherwise = 2)
    public final void resetCooldownForTest$common_release() {
        lastDumpTime = SystemClock.elapsedRealtime() - 300001;
    }

    public final void setHeapBytesOverrideForTest$common_release(@Nullable Long l) {
        heapBytesOverrideForTest = l;
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getHeapBytesOverrideForTest$common_release$annotations() {
    }
}
