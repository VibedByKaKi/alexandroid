package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class TorchControl$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ TorchControl$$ExternalSyntheticLambda0(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$enableTorch$2;
        Object lambda$enableExternalFlashAeMode$5;
        switch (this.$r8$classId) {
            case 0:
                lambda$enableTorch$2 = ((TorchControl) this.f$0).lambda$enableTorch$2(this.f$1, completer);
                return lambda$enableTorch$2;
            default:
                lambda$enableExternalFlashAeMode$5 = ((FocusMeteringControl) this.f$0).lambda$enableExternalFlashAeMode$5(this.f$1, completer);
                return lambda$enableExternalFlashAeMode$5;
        }
    }
}
