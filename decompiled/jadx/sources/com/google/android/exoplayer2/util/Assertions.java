package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import androidx.fragment.app.Fragment$$ExternalSyntheticBUOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class Assertions {
    private Assertions() {
    }

    @Pure
    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m();
    }

    @Pure
    public static int checkIndex(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        Buffer$$ExternalSyntheticBUOutline0.m();
        return 0;
    }

    @Pure
    public static void checkMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Not in applications main thread");
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String checkNotEmpty(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkNotNull(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @Pure
    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkStateNotNull(@Nullable T t) {
        if (t != null) {
            return t;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    @Pure
    public static void checkArgument(boolean z, Object obj) {
        if (z) {
            return;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
    }

    @Pure
    public static void checkState(boolean z, Object obj) {
        if (z) {
            return;
        }
        Fragment$$ExternalSyntheticBUOutline0.m7725m(obj);
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkStateNotNull(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        Fragment$$ExternalSyntheticBUOutline0.m7725m(obj);
        return null;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String checkNotEmpty(@Nullable String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
        return null;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkNotNull(@Nullable T t) {
        t.getClass();
        return t;
    }
}
