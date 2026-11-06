package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class FocusMeteringControl$$ExternalSyntheticLambda5 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FocusMeteringControl f$0;

    public /* synthetic */ FocusMeteringControl$$ExternalSyntheticLambda5(FocusMeteringControl focusMeteringControl, int i) {
        this.$r8$classId = i;
        this.f$0 = focusMeteringControl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$triggerAePrecapture$3;
        Object lambda$cancelFocusAndMetering$13;
        int i = this.$r8$classId;
        FocusMeteringControl focusMeteringControl = this.f$0;
        switch (i) {
            case 0:
                lambda$triggerAePrecapture$3 = focusMeteringControl.lambda$triggerAePrecapture$3(completer);
                return lambda$triggerAePrecapture$3;
            default:
                lambda$cancelFocusAndMetering$13 = focusMeteringControl.lambda$cancelFocusAndMetering$13(completer);
                return lambda$cancelFocusAndMetering$13;
        }
    }
}
