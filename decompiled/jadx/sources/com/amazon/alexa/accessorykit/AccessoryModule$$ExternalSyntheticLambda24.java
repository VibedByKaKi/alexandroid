package com.amazon.alexa.accessorykit;

import com.facebook.react.bridge.Promise;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryModule$$ExternalSyntheticLambda24 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Promise f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ AccessoryModule$$ExternalSyntheticLambda24(Promise promise, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = promise;
        this.f$1 = z;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AccessoryModule.lambda$completeSetup$28(this.f$0, this.f$1);
                break;
            default:
                AbaSettingsBridgeDelegate.lambda$completeSetup$28(this.f$0, this.f$1);
                break;
        }
    }
}
