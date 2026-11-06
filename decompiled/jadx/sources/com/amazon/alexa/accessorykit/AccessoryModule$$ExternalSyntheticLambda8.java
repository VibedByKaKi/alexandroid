package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.repositories.device.v2.DeviceRepositoryV2;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryModule$$ExternalSyntheticLambda8 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryModule f$0;
    public final /* synthetic */ DeviceRepositoryV2 f$1;

    public /* synthetic */ AccessoryModule$$ExternalSyntheticLambda8(AccessoryModule accessoryModule, DeviceRepositoryV2 deviceRepositoryV2, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryModule;
        this.f$1 = deviceRepositoryV2;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$completeSetup$25(this.f$1);
                break;
            default:
                this.f$0.lambda$startSetup$21(this.f$1);
                break;
        }
    }
}
