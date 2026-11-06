package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class FocusMeteringControl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FocusMeteringControl f$0;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$1;

    public /* synthetic */ FocusMeteringControl$$ExternalSyntheticLambda1(FocusMeteringControl focusMeteringControl, CallbackToFutureAdapter.Completer completer, int i) {
        this.$r8$classId = i;
        this.f$0 = focusMeteringControl;
        this.f$1 = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$cancelFocusAndMetering$12(this.f$1);
                break;
            default:
                this.f$0.lambda$triggerAePrecapture$2(this.f$1);
                break;
        }
    }
}
