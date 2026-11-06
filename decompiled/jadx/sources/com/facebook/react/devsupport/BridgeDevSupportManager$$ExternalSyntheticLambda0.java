package com.facebook.react.devsupport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class BridgeDevSupportManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BridgeDevSupportManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                BridgeDevSupportManager.handleReloadJS$lambda$1$lambda$0((BridgeDevSupportManager) obj);
                break;
            case 1:
                ((DefaultDevLoadingViewImplementation) obj).hideInternal();
                break;
            case 2:
                ((DoubleTapReloadRecognizer) obj).doRefresh = false;
                break;
            case 3:
                PausedInDebuggerOverlayDialogManager.hidePausedInDebuggerOverlay$lambda$4((PausedInDebuggerOverlayDialogManager) obj);
                break;
            default:
                ((RedBoxDialogSurfaceDelegate) obj).show();
                break;
        }
    }
}
