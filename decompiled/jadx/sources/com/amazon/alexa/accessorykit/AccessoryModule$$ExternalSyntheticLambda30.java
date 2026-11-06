package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.BuildStageProvider;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import com.amazon.alexa.accessorykit.interprocess.environment.InterprocessAccessoryEnvironmentService;
import io.reactivex.rxjava3.functions.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryModule$$ExternalSyntheticLambda30 implements Predicate, BuildStageProvider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessoryModule$$ExternalSyntheticLambda30(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.accessory.BuildStageProvider
    public BuildStageProvider.BuildStage getBuildStage() {
        BuildStageProvider.BuildStage lambda$createAccessories$2;
        lambda$createAccessories$2 = AccessoriesFactory.lambda$createAccessories$2((InterprocessAccessoryEnvironmentService) this.f$0);
        return lambda$createAccessories$2;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean lambda$getAccountIdForIdentifier$8;
        boolean lambda$getAccountIdForIdentifier$82;
        int i = this.$r8$classId;
        String str = (String) this.f$0;
        DeviceGroup deviceGroup = (DeviceGroup) obj;
        switch (i) {
            case 0:
                lambda$getAccountIdForIdentifier$8 = AccessoryModule.lambda$getAccountIdForIdentifier$8(str, deviceGroup);
                return lambda$getAccountIdForIdentifier$8;
            default:
                lambda$getAccountIdForIdentifier$82 = AbaSettingsBridgeDelegate.lambda$getAccountIdForIdentifier$8(str, deviceGroup);
                return lambda$getAccountIdForIdentifier$82;
        }
    }
}
