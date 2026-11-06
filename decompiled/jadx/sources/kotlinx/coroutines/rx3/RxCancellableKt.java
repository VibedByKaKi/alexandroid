package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"handleUndeliverableException", "", "cause", "", "context", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RxCancellableKt {
    public static final void handleUndeliverableException(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.onError(th);
        } catch (Throwable th2) {
            ExceptionsKt.addSuppressed(th, th2);
            CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, th);
        }
    }
}
