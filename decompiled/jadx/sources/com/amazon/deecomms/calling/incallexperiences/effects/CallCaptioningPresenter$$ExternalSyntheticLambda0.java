package com.amazon.deecomms.calling.incallexperiences.effects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CallCaptioningPresenter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CallCaptioningPresenter f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CallCaptioningPresenter$$ExternalSyntheticLambda0(CallCaptioningPresenter callCaptioningPresenter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = callCaptioningPresenter;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onApplyFailed$4(this.f$1);
                break;
            default:
                this.f$0.lambda$onRemoveFailed$5(this.f$1);
                break;
        }
    }
}
