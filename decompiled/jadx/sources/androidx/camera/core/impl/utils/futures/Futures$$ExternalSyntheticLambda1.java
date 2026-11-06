package androidx.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Futures$$ExternalSyntheticLambda1 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ListenableFuture f$0;

    public /* synthetic */ Futures$$ExternalSyntheticLambda1(ListenableFuture listenableFuture, int i) {
        this.$r8$classId = i;
        this.f$0 = listenableFuture;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$transformAsyncOnCompletion$8;
        Object lambda$nonCancellationPropagating$0;
        int i = this.$r8$classId;
        ListenableFuture listenableFuture = this.f$0;
        switch (i) {
            case 0:
                lambda$transformAsyncOnCompletion$8 = Futures.lambda$transformAsyncOnCompletion$8(listenableFuture, completer);
                return lambda$transformAsyncOnCompletion$8;
            default:
                lambda$nonCancellationPropagating$0 = Futures.lambda$nonCancellationPropagating$0(listenableFuture, completer);
                return lambda$nonCancellationPropagating$0;
        }
    }
}
