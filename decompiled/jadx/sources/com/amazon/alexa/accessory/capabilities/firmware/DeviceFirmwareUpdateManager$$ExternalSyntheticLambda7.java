package com.amazon.alexa.accessory.capabilities.firmware;

import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DeviceFirmwareUpdateManager$$ExternalSyntheticLambda7 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeviceFirmwareUpdateManager f$0;

    public /* synthetic */ DeviceFirmwareUpdateManager$$ExternalSyntheticLambda7(DeviceFirmwareUpdateManager deviceFirmwareUpdateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = deviceFirmwareUpdateManager;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$getDeviceIdsFromInventorySet$9;
        SingleSource lambda$createUpdateRequests$1;
        int i = this.$r8$classId;
        DeviceFirmwareUpdateManager deviceFirmwareUpdateManager = this.f$0;
        Set set = (Set) obj;
        switch (i) {
            case 0:
                lambda$getDeviceIdsFromInventorySet$9 = deviceFirmwareUpdateManager.lambda$getDeviceIdsFromInventorySet$9(set);
                return lambda$getDeviceIdsFromInventorySet$9;
            default:
                lambda$createUpdateRequests$1 = deviceFirmwareUpdateManager.lambda$createUpdateRequests$1(set);
                return lambda$createUpdateRequests$1;
        }
    }
}
