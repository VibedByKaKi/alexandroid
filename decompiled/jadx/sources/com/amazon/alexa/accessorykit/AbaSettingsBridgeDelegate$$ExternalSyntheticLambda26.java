package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.repositories.device.v2.DeviceRepositoryV2;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AbaSettingsBridgeDelegate$$ExternalSyntheticLambda26 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbaSettingsBridgeDelegate f$0;
    public final /* synthetic */ DeviceRepositoryV2 f$1;

    public /* synthetic */ AbaSettingsBridgeDelegate$$ExternalSyntheticLambda26(AbaSettingsBridgeDelegate abaSettingsBridgeDelegate, DeviceRepositoryV2 deviceRepositoryV2, int i) {
        this.$r8$classId = i;
        this.f$0 = abaSettingsBridgeDelegate;
        this.f$1 = deviceRepositoryV2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startSetup$22(this.f$1, (Throwable) obj);
                break;
            default:
                this.f$0.lambda$completeSetup$26(this.f$1, (Throwable) obj);
                break;
        }
    }
}
