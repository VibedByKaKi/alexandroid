package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.repositories.firmware.FirmwareProvider;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.HashSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirmwareProvider f$0;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda5(FirmwareProvider firmwareProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareProvider;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        FirmwareProvider firmwareProvider = this.f$0;
        switch (i) {
            case 0:
                firmwareProvider.provideOtaGroupName((HashSet) obj);
                break;
            case 1:
                firmwareProvider.provideInventoryUpdate((HashSet) obj);
                break;
            case 2:
                firmwareProvider.provideInventoryUpdateError((Throwable) obj);
                break;
            default:
                firmwareProvider.provideInformation((HashSet) obj);
                break;
        }
    }
}
