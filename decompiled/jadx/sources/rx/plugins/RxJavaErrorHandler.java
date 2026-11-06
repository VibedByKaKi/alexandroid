package rx.plugins;

import rx.annotations.Beta;
import rx.exceptions.Exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class RxJavaErrorHandler {
    protected static final String ERROR_IN_RENDERING_SUFFIX = ".errorRendering";

    @Beta
    public final String handleOnNextValueRendering(Object obj) {
        try {
            return render(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName().concat(ERROR_IN_RENDERING_SUFFIX);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return obj.getClass().getName().concat(ERROR_IN_RENDERING_SUFFIX);
        }
    }

    @Beta
    public String render(Object obj) throws InterruptedException {
        return null;
    }

    @Deprecated
    public void handleError(Throwable th) {
    }
}
