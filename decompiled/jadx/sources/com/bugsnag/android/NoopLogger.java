package com.bugsnag.android;

import com.bugsnag.android.Logger;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/NoopLogger;", "Lcom/bugsnag/android/Logger;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class NoopLogger implements Logger {

    @NotNull
    public static final NoopLogger INSTANCE = new NoopLogger();

    private NoopLogger() {
    }

    @Override // com.bugsnag.android.Logger
    public void d(@NotNull String str, @NotNull Throwable th) {
        str.getClass();
        th.getClass();
        Logger.DefaultImpls.d(this, str, th);
    }

    @Override // com.bugsnag.android.Logger
    public void e(@NotNull String str, @NotNull Throwable th) {
        str.getClass();
        th.getClass();
        Logger.DefaultImpls.e(this, str, th);
    }

    @Override // com.bugsnag.android.Logger
    public void i(@NotNull String str, @NotNull Throwable th) {
        str.getClass();
        th.getClass();
        Logger.DefaultImpls.i(this, str, th);
    }

    @Override // com.bugsnag.android.Logger
    public void w(@NotNull String str, @NotNull Throwable th) {
        str.getClass();
        th.getClass();
        Logger.DefaultImpls.w(this, str, th);
    }

    @Override // com.bugsnag.android.Logger
    public void d(@NotNull String str) {
        str.getClass();
        Logger.DefaultImpls.d(this, str);
    }

    @Override // com.bugsnag.android.Logger
    public void e(@NotNull String str) {
        str.getClass();
        Logger.DefaultImpls.e(this, str);
    }

    @Override // com.bugsnag.android.Logger
    public void i(@NotNull String str) {
        str.getClass();
        Logger.DefaultImpls.i(this, str);
    }

    @Override // com.bugsnag.android.Logger
    public void w(@NotNull String str) {
        str.getClass();
        Logger.DefaultImpls.w(this, str);
    }
}
