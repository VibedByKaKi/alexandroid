package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceRepositoryV2;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryInteractor$$ExternalSyntheticLambda7 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AccessoryInteractor$$ExternalSyntheticLambda7(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((AccessoryInteractor) this.f$0).lambda$linkAccessoryClient$2((Accessory) this.f$1);
                break;
            case 1:
                ((AbaSettingsBridgeDelegate) this.f$0).lambda$startSetup$21((DeviceRepositoryV2) this.f$1);
                break;
            default:
                ((AbaSettingsBridgeDelegate) this.f$0).lambda$completeSetup$25((DeviceRepositoryV2) this.f$1);
                break;
        }
    }
}
