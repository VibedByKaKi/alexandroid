package com.amazon.alexa.accessory.repositories.firmware;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryFirmwareRepository$$ExternalSyntheticLambda0 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryFirmwareRepository f$0;

    public /* synthetic */ MemoryFirmwareRepository$$ExternalSyntheticLambda0(MemoryFirmwareRepository memoryFirmwareRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryFirmwareRepository;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        int i = this.$r8$classId;
        MemoryFirmwareRepository memoryFirmwareRepository = this.f$0;
        switch (i) {
            case 0:
                memoryFirmwareRepository.lambda$initiateFirmwareTransfer$2(result);
                break;
            default:
                memoryFirmwareRepository.lambda$queryInventoryUpdateSet$1(result);
                break;
        }
    }
}
