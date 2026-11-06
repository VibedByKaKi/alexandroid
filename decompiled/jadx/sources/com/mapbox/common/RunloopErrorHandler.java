package com.mapbox.common;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/common/RunloopErrorHandler;", "", "()V", Constants.LOG_TAG, "", "postErrorToMainLooper", "", "error", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
final class RunloopErrorHandler {

    @NotNull
    public static final RunloopErrorHandler INSTANCE = new RunloopErrorHandler();

    @NotNull
    public static final String TAG = "run_loop";

    private RunloopErrorHandler() {
    }

    @JvmStatic
    @Keep
    public static final void postErrorToMainLooper(@NotNull Throwable error) {
        error.getClass();
        Log.error("Please check the following Java stacktrace for more information related to the exception: " + error.getMessage(), TAG);
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunloopErrorHandler$$ExternalSyntheticLambda0(error, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postErrorToMainLooper$lambda$0(Throwable th) {
        th.getClass();
        throw th;
    }
}
