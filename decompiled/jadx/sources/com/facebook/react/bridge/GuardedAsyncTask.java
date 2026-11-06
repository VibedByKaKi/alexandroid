package com.facebook.react.bridge;

import android.os.AsyncTask;
import io.branch.rnbranch.RNBranchModule;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0014\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ#\u0010\f\u001a\u0004\u0018\u00010\u00042\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0005¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00112\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H$¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/bridge/GuardedAsyncTask;", "Params", "Progress", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "exceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "<init>", "(Lcom/facebook/react/bridge/JSExceptionHandler;)V", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "doInBackground", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, "", "([Ljava/lang/Object;)Ljava/lang/Void;", "doInBackgroundGuarded", "", "([Ljava/lang/Object;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {

    @JvmField
    @NotNull
    public static final Executor THREAD_POOL_EXECUTOR;

    @NotNull
    private final JSExceptionHandler exceptionHandler;

    static {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        executor.getClass();
        THREAD_POOL_EXECUTOR = executor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GuardedAsyncTask(@org.jetbrains.annotations.NotNull com.facebook.react.bridge.ReactContext r1) {
        /*
            r0 = this;
            r1.getClass()
            com.facebook.react.bridge.JSExceptionHandler r1 = r1.getExceptionHandler()
            r1.getClass()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.GuardedAsyncTask.<init>(com.facebook.react.bridge.ReactContext):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    @Deprecated(message = "AsyncTask is deprecated.")
    @Nullable
    public final Void doInBackground(@NotNull Params... params) {
        params.getClass();
        try {
            doInBackgroundGuarded(Arrays.copyOf(params, params.length));
            return null;
        } catch (RuntimeException e) {
            this.exceptionHandler.handleException(e);
            return null;
        }
    }

    public abstract void doInBackgroundGuarded(@NotNull Params... params);

    public GuardedAsyncTask(@NotNull JSExceptionHandler jSExceptionHandler) {
        jSExceptionHandler.getClass();
        this.exceptionHandler = jSExceptionHandler;
    }
}
