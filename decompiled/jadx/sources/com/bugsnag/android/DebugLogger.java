package com.bugsnag.android;

import android.util.Log;
import com.dee.app.contacts.common.constants.Constants;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/DebugLogger;", "Lcom/bugsnag/android/Logger;", "()V", Constants.LOG_TAG, "", "d", "", "msg", "throwable", "", "e", "i", "w", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class DebugLogger implements Logger {

    @NotNull
    public static final DebugLogger INSTANCE = new DebugLogger();
    private static final String TAG = "Bugsnag";

    private DebugLogger() {
    }

    @Override // com.bugsnag.android.Logger
    public void d(@NotNull String msg, @NotNull Throwable throwable) {
        msg.getClass();
        throwable.getClass();
    }

    @Override // com.bugsnag.android.Logger
    public void e(@NotNull String msg, @NotNull Throwable throwable) {
        msg.getClass();
        throwable.getClass();
        Log.e(TAG, msg, throwable);
    }

    @Override // com.bugsnag.android.Logger
    public void i(@NotNull String msg, @NotNull Throwable throwable) {
        msg.getClass();
        throwable.getClass();
        Log.i(TAG, msg, throwable);
    }

    @Override // com.bugsnag.android.Logger
    public void w(@NotNull String msg, @NotNull Throwable throwable) {
        msg.getClass();
        throwable.getClass();
        Log.w(TAG, msg, throwable);
    }

    @Override // com.bugsnag.android.Logger
    public void d(@NotNull String msg) {
        msg.getClass();
    }

    @Override // com.bugsnag.android.Logger
    public void e(@NotNull String msg) {
        msg.getClass();
        Log.e(TAG, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void i(@NotNull String msg) {
        msg.getClass();
        Log.i(TAG, msg);
    }

    @Override // com.bugsnag.android.Logger
    public void w(@NotNull String msg) {
        msg.getClass();
        Log.w(TAG, msg);
    }
}
