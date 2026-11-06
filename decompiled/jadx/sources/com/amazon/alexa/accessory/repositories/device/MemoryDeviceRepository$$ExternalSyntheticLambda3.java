package com.amazon.alexa.accessory.repositories.device;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryDeviceRepository$$ExternalSyntheticLambda3 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryDeviceRepository f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ MemoryDeviceRepository$$ExternalSyntheticLambda3(MemoryDeviceRepository memoryDeviceRepository, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryDeviceRepository;
        this.f$1 = z;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$requestOverrideAssistant$3(this.f$1, result);
                break;
            default:
                this.f$0.lambda$requestCompleteSetup$2(this.f$1, result);
                break;
        }
    }
}
