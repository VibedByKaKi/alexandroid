package com.amazon.dee.app.ui.main;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class BranchRoutingCoordinator$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BranchRoutingCoordinator f$0;

    public /* synthetic */ BranchRoutingCoordinator$$ExternalSyntheticLambda0(BranchRoutingCoordinator branchRoutingCoordinator, int i) {
        this.$r8$classId = i;
        this.f$0 = branchRoutingCoordinator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BranchRoutingCoordinator branchRoutingCoordinator = this.f$0;
        switch (i) {
            case 0:
                branchRoutingCoordinator.onBranchIdentityChanged$impl();
                break;
            case 1:
                branchRoutingCoordinator.finishStartupOnMainThread();
                break;
            default:
                branchRoutingCoordinator.recordBranchIdentityMappingAfterAuthentication$impl();
                break;
        }
    }
}
