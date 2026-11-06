package com.amazon.dee.app.elements.bridges;

import com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.AccessoryOpusStreamAdapter;
import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ScreenSnapshotModule$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ ScreenSnapshotModule$$ExternalSyntheticLambda7(AccessoryOpusStreamAdapter accessoryOpusStreamAdapter, Throwable th, boolean z, int i) {
        this.f$0 = accessoryOpusStreamAdapter;
        this.f$2 = th;
        this.f$3 = z;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ScreenSnapshotModule.setWindowPassThrough$lambda$14((ScreenSnapshotModule) this.f$0, this.f$1, (Promise) this.f$2, this.f$3);
                break;
            default:
                AccessoryOpusStreamAdapter.notifyTerminated$lambda$10((AccessoryOpusStreamAdapter) this.f$0, (Throwable) this.f$2, this.f$3, this.f$1);
                break;
        }
    }

    public /* synthetic */ ScreenSnapshotModule$$ExternalSyntheticLambda7(ScreenSnapshotModule screenSnapshotModule, int i, Promise promise, boolean z) {
        this.f$0 = screenSnapshotModule;
        this.f$1 = i;
        this.f$2 = promise;
        this.f$3 = z;
    }
}
