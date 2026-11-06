package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class SurfaceOutputImpl$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SurfaceOutputImpl$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$new$0;
        Object lambda$new$02;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$new$0 = ((SurfaceOutputImpl) obj).lambda$new$0(completer);
                return lambda$new$0;
            default:
                lambda$new$02 = ((SurfaceEdge.SettableSurface) obj).lambda$new$0(completer);
                return lambda$new$02;
        }
    }
}
