package androidx.camera.view;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewViewImplementation;
import androidx.camera.view.SurfaceViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class TextureViewImplementation$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TextureViewImplementation$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((CallbackToFutureAdapter.Completer) obj2).set((SurfaceRequest.Result) obj);
                break;
            default:
                SurfaceViewImplementation.SurfaceRequestCallback.lambda$tryToComplete$0((PreviewViewImplementation.OnSurfaceNotInUseListener) obj2, (SurfaceRequest.Result) obj);
                break;
        }
    }
}
