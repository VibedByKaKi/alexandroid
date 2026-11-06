package com.amazon.dee.app.elements.bridges;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ScreenSnapshotModule$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScreenSnapshotModule f$0;

    public /* synthetic */ ScreenSnapshotModule$$ExternalSyntheticLambda8(ScreenSnapshotModule screenSnapshotModule, int i) {
        this.$r8$classId = i;
        this.f$0 = screenSnapshotModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ScreenSnapshotModule screenSnapshotModule = this.f$0;
        switch (i) {
            case 0:
                ScreenSnapshotModule.backForwardTimeout$lambda$0(screenSnapshotModule);
                break;
            case 1:
                screenSnapshotModule.disarmReveal();
                break;
            default:
                ScreenSnapshotModule.invalidate$lambda$35(screenSnapshotModule);
                break;
        }
    }
}
