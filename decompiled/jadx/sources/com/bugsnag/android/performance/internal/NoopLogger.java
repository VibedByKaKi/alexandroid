package com.bugsnag.android.performance.internal;

import com.bugsnag.android.performance.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/performance/internal/NoopLogger;", "Lcom/bugsnag/android/performance/Logger;", "()V", "d", "", "msg", "", "throwable", "", "e", "i", "w", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoopLogger implements Logger {

    @NotNull
    public static final NoopLogger INSTANCE = new NoopLogger();

    private NoopLogger() {
    }

    @Override // com.bugsnag.android.performance.Logger
    public void d(@NotNull String msg, @NotNull Throwable throwable) {
        msg.getClass();
        throwable.getClass();
    }

    @Override // com.bugsnag.android.performance.Logger
    public void e(@NotNull String msg, @NotNull Throwable throwable) {
        msg.getClass();
        throwable.getClass();
    }

    @Override // com.bugsnag.android.performance.Logger
    public void i(@NotNull String msg, @NotNull Throwable throwable) {
        msg.getClass();
        throwable.getClass();
    }

    @Override // com.bugsnag.android.performance.Logger
    public void w(@NotNull String msg, @NotNull Throwable throwable) {
        msg.getClass();
        throwable.getClass();
    }

    @Override // com.bugsnag.android.performance.Logger
    public void d(@NotNull String msg) {
        msg.getClass();
    }

    @Override // com.bugsnag.android.performance.Logger
    public void e(@NotNull String msg) {
        msg.getClass();
    }

    @Override // com.bugsnag.android.performance.Logger
    public void i(@NotNull String msg) {
        msg.getClass();
    }

    @Override // com.bugsnag.android.performance.Logger
    public void w(@NotNull String msg) {
        msg.getClass();
    }
}
