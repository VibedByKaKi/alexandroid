package com.amazon.deecomms.calling.incallexperiences.effects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CallCaptionMenuPresenter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CallCaptionMenuPresenter f$0;

    public /* synthetic */ CallCaptionMenuPresenter$$ExternalSyntheticLambda0(CallCaptionMenuPresenter callCaptionMenuPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = callCaptionMenuPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CallCaptionMenuPresenter callCaptionMenuPresenter = this.f$0;
        switch (i) {
            case 0:
                callCaptionMenuPresenter.lambda$onRemoved$3();
                break;
            case 1:
                callCaptionMenuPresenter.lambda$new$0();
                break;
            case 2:
                callCaptionMenuPresenter.lambda$onApplied$2();
                break;
            default:
                callCaptionMenuPresenter.lambda$showButton$1();
                break;
        }
    }
}
