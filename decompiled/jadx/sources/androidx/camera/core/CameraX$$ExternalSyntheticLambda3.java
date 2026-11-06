package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraX$$ExternalSyntheticLambda3 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CameraX$$ExternalSyntheticLambda3(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$initialSurfaceRecreationCompleter$6;
        switch (this.$r8$classId) {
            case 0:
                return ((CameraX) this.f$0).lambda$initInternal$0((Context) this.f$1, completer);
            default:
                lambda$initialSurfaceRecreationCompleter$6 = ((SurfaceRequest) this.f$0).lambda$initialSurfaceRecreationCompleter$6((AtomicReference) this.f$1, completer);
                return lambda$initialSurfaceRecreationCompleter$6;
        }
    }
}
