package androidx.camera.view;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class PendingValue$$ExternalSyntheticLambda1 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ PendingValue$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$setValue$0;
        Object lambda$tryToProvidePreviewSurface$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$setValue$0 = ((PendingValue) this.f$0).lambda$setValue$0(this.f$1, completer);
                return lambda$setValue$0;
            default:
                lambda$tryToProvidePreviewSurface$1 = ((TextureViewImplementation) this.f$0).lambda$tryToProvidePreviewSurface$1((Surface) this.f$1, completer);
                return lambda$tryToProvidePreviewSurface$1;
        }
    }
}
