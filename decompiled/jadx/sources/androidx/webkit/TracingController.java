package androidx.webkit;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.TracingControllerImpl;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AnyThread
/* loaded from: classes14.dex */
public abstract class TracingController {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LAZY_HOLDER {
        static final TracingController INSTANCE = new TracingControllerImpl();

        private LAZY_HOLDER() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TracingController() {
    }

    public static TracingController getInstance() {
        return LAZY_HOLDER.INSTANCE;
    }

    public abstract boolean isTracing();

    public abstract void start(TracingConfig tracingConfig);

    public abstract boolean stop(OutputStream outputStream, Executor executor);
}
