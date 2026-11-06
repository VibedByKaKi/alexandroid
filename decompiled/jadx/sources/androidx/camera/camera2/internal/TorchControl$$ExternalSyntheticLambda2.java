package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class TorchControl$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ TorchControl$$ExternalSyntheticLambda2(FocusMeteringControl focusMeteringControl, boolean z, CallbackToFutureAdapter.Completer completer) {
        this.f$0 = focusMeteringControl;
        this.f$2 = z;
        this.f$1 = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((TorchControl) this.f$0).lambda$enableTorch$1(this.f$1, this.f$2);
                break;
            default:
                ((FocusMeteringControl) this.f$0).lambda$enableExternalFlashAeMode$4(this.f$2, this.f$1);
                break;
        }
    }

    public /* synthetic */ TorchControl$$ExternalSyntheticLambda2(TorchControl torchControl, CallbackToFutureAdapter.Completer completer, boolean z) {
        this.f$0 = torchControl;
        this.f$1 = completer;
        this.f$2 = z;
    }
}
