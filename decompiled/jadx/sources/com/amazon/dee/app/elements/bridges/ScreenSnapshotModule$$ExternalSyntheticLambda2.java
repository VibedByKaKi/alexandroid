package com.amazon.dee.app.elements.bridges;

import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ScreenSnapshotModule$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScreenSnapshotModule f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ ScreenSnapshotModule$$ExternalSyntheticLambda2(ScreenSnapshotModule screenSnapshotModule, Promise promise, int i) {
        this.$r8$classId = i;
        this.f$0 = screenSnapshotModule;
        this.f$1 = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ScreenSnapshotModule.forwardBack$lambda$29(this.f$0, this.f$1);
                break;
            default:
                this.f$0.captureChromeOnMainThread(this.f$1);
                break;
        }
    }
}
