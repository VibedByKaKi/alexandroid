package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import androidx.fragment.app.Fragment$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import javax.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 56 + 1);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "checkMainThread: current thread ", valueOf, " IS NOT the main thread ", valueOf2);
        sb.append(MarkdownConstants.EXCLAMATION_MARK);
        Log.e("Asserts", sb.toString());
        Single$$ExternalSyntheticBUOutline0.m$2(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 55 + 1);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "checkNotMainThread: current thread ", valueOf, " IS the main thread ", valueOf2);
        sb.append(MarkdownConstants.EXCLAMATION_MARK);
        Log.e("Asserts", sb.toString());
        Single$$ExternalSyntheticBUOutline0.m$2(str);
    }

    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj) {
        if (obj != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("null reference");
    }

    @KeepForSdk
    public static void checkNull(@Nullable Object obj) {
        if (obj == null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("non-null reference");
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull Object obj) {
        if (z) {
            return;
        }
        Fragment$$ExternalSyntheticBUOutline0.m7725m(obj);
    }

    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj, @NonNull Object obj2) {
        if (obj != null) {
            return;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj2);
    }

    @KeepForSdk
    public static void checkNull(@Nullable Object obj, @NonNull Object obj2) {
        if (obj == null) {
            return;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj2);
    }
}
