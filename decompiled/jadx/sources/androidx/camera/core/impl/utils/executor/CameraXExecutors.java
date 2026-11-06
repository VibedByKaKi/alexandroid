package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class CameraXExecutors {
    private CameraXExecutors() {
    }

    @NonNull
    public static Executor audioExecutor() {
        return AudioExecutor.getInstance();
    }

    @NonNull
    public static Executor directExecutor() {
        return DirectExecutor.getInstance();
    }

    @NonNull
    public static Executor highPriorityExecutor() {
        return HighPriorityExecutor.getInstance();
    }

    @NonNull
    public static Executor ioExecutor() {
        return IoExecutor.getInstance();
    }

    public static boolean isSequentialExecutor(@NonNull Executor executor) {
        return executor instanceof SequentialExecutor;
    }

    @NonNull
    public static ScheduledExecutorService mainThreadExecutor() {
        return MainThreadExecutor.getInstance();
    }

    @NonNull
    public static ScheduledExecutorService myLooperExecutor() {
        return HandlerScheduledExecutorService.currentThreadExecutor();
    }

    @NonNull
    public static ScheduledExecutorService newHandlerExecutor(@NonNull Handler handler) {
        return new HandlerScheduledExecutorService(handler);
    }

    @NonNull
    public static Executor newSequentialExecutor(@NonNull Executor executor) {
        return new SequentialExecutor(executor);
    }
}
