package androidx.core.os;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract /* synthetic */ class ParcelCompat$$ExternalSyntheticOutline0 {
    public static /* synthetic */ void m(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else {
                Path$$ExternalSyntheticBUOutline0.m();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static int m$1(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    public static long m(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static Bundle m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static String m(int i, String str, String str2) {
        return str2.substring(str.length() + i);
    }

    public static String m(long j, String str, int i, String str2) {
        return str + i + str2 + j;
    }

    public static String m(File file, String str) {
        return str + file;
    }

    public static String m(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    public static String m(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static String m(String str, int i, int i2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String m(String str, int i, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
        sb.append(str);
        return sb.toString();
    }

    public static String m(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String m(String str, Type type) {
        return str + type;
    }

    public static String m(Throwable th, StringBuilder sb) {
        sb.append(th.getMessage());
        return sb.toString();
    }

    public static StringBuilder m(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    public static Map m() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static CoroutineScope m(Job job, int i, Object obj, CoroutineDispatcher coroutineDispatcher) {
        return CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(SupervisorKt.SupervisorJob$default(job, i, obj)));
    }

    public static void m(int i, String str, String str2, String str3) {
        Log.i(str3, str + i + str2);
    }

    public static void m(Canvas canvas, int i, int i2, int i3) {
        InlineMarker.finallyStart(i);
        canvas.restoreToCount(i2);
        InlineMarker.finallyEnd(i3);
    }

    public static int m(byte[] bArr, int i, int i2) {
        return (Arrays.hashCode(bArr) + i) * i2;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m7655m(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m7656m(String str, int i, StringBuilder sb) {
        sb.append(i);
        Log.w(str, sb.toString());
    }

    public static void m(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m7657m(String str, String str2, String str3, String str4, String str5) {
        Log.i(str5, str + str2 + str3 + str4);
    }

    public static void m(String str, String str2, StringBuilder sb) {
        sb.append(str);
        Log.i(str2, sb.toString());
    }

    public static void m(Throwable th, Continuation continuation) {
        continuation.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(th)));
    }

    /* renamed from: m, reason: collision with other method in class */
    public static boolean m7658m(String str, String str2, String str3) {
        return Intrinsics.areEqual(str3, str + str2);
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }
}
