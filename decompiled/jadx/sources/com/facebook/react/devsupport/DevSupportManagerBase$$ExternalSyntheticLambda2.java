package com.facebook.react.devsupport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DevSupportManagerBase$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DevSupportManagerBase f$0;

    public /* synthetic */ DevSupportManagerBase$$ExternalSyntheticLambda2(DevSupportManagerBase devSupportManagerBase, int i) {
        this.$r8$classId = i;
        this.f$0 = devSupportManagerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        DevSupportManagerBase devSupportManagerBase = this.f$0;
        switch (i) {
            case 0:
                devSupportManagerBase.reload();
                break;
            case 1:
                DevSupportManagerBase.toggleElementInspector$lambda$26(devSupportManagerBase);
                break;
            case 2:
                DevSupportManagerBase.access$hideSplitBundleDevLoadingView(devSupportManagerBase);
                break;
            case 3:
                DevSupportManagerBase.access$hideSplitBundleDevLoadingView(devSupportManagerBase);
                break;
            case 4:
                devSupportManagerBase.handleReloadJS();
                break;
            default:
                devSupportManagerBase.showDevOptionsDialog();
                break;
        }
    }
}
