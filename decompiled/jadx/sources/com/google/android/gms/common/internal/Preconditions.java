package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import androidx.fragment.app.Fragment$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d, double d2, double d3, @NonNull String str) {
        if (d < d2) {
            Single$$ExternalSyntheticBUOutline0.m$3(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
            return 0.0d;
        }
        if (d <= d3) {
            return d;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
        return 0.0d;
    }

    @KeepForSdk
    public static long checkArgumentNonnegative(long j) {
        if (j >= 0) {
            return j;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Given value is negative");
        return 0L;
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "Must be called on ", name2, " thread, but got ", name);
            PathKt$$ExternalSyntheticBUOutline0.m(".", sb);
        }
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (com.google.android.gms.common.util.zze.zza()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(str);
    }

    @NonNull
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Given String is empty or null");
        return null;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(@NonNull String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || !java.util.Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (com.google.android.gms.common.util.zze.zza()) {
            Single$$ExternalSyntheticBUOutline0.m$2(str);
        }
    }

    @NonNull
    @KeepForSdk
    public static <T> T checkNotNull(@NonNull T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Given Long is zero");
        return 0L;
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static String zza(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i = 0;
        int i2 = 0;
        while (i < 3 && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < 3) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < 3; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(MarkdownConstants.RIGHT_BRACKET);
        }
        return sb.toString();
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @NonNull Object obj) {
        if (z) {
            return;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
    }

    @NonNull
    @KeepForSdk
    public static <T> T checkNotNull(@Nullable T t) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("null reference");
        return null;
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull Object obj) {
        if (z) {
            return;
        }
        Fragment$$ExternalSyntheticBUOutline0.m7725m(obj);
    }

    @KeepForSdk
    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m();
    }

    @NonNull
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str, @NonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
        return null;
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
    }

    @IntRange(from = 0)
    @KeepForSdk
    public static int checkArgumentNonnegative(int i, @NonNull String str) {
        if (i >= 0) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
        return 0;
    }

    @KeepForSdk
    public static int checkNotZero(int i, @NonNull Object obj) {
        if (i != 0) {
            return i;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
        return 0;
    }

    @IntRange(from = 0)
    @KeepForSdk
    public static int checkArgumentNonnegative(int i) {
        if (i >= 0) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Given value is negative");
        return 0;
    }

    @KeepForSdk
    public static int checkNotZero(int i) {
        if (i != 0) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Given Integer is zero");
        return 0;
    }

    @KeepForSdk
    public static long checkArgumentNonnegative(long j, @NonNull String str) {
        if (j >= 0) {
            return j;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
        return 0L;
    }

    @KeepForSdk
    public static long checkNotZero(long j, @NonNull Object obj) {
        if (j != 0) {
            return j;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
        return 0L;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f, float f2, float f3, @NonNull String str) {
        if (f < f2) {
            Single$$ExternalSyntheticBUOutline0.m$3(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
            return 0.0f;
        }
        if (f <= f3) {
            return f;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
        return 0.0f;
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i, int i2, int i3, @NonNull String str) {
        if (i < i2) {
            Single$$ExternalSyntheticBUOutline0.m$3(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
            return 0;
        }
        if (i <= i3) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        return 0;
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j, long j2, long j3, @NonNull String str) {
        if (j < j2) {
            Single$$ExternalSyntheticBUOutline0.m$3(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
            return 0L;
        }
        if (j <= j3) {
            return j;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
        return 0L;
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler, @NonNull String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(str);
    }
}
