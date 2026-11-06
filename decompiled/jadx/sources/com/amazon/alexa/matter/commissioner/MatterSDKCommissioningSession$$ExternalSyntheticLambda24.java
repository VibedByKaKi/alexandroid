package com.amazon.alexa.matter.commissioner;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MatterSDKCommissioningSession$$ExternalSyntheticLambda24 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MatterSDKCommissioningSession f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ MatterSDKCommissioningSession$$ExternalSyntheticLambda24(MatterSDKCommissioningSession matterSDKCommissioningSession, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = matterSDKCommissioningSession;
        this.f$1 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onScanNetworksFailure$23(this.f$1);
                break;
            default:
                this.f$0.lambda$onPairingComplete$7(this.f$1);
                break;
        }
    }
}
