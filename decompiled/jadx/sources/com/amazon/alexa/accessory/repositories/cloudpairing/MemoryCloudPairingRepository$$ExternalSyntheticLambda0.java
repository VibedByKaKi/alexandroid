package com.amazon.alexa.accessory.repositories.cloudpairing;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.protocol.Cloudpairing;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryCloudPairingRepository$$ExternalSyntheticLambda0 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryCloudPairingRepository f$0;
    public final /* synthetic */ Cloudpairing.Seed f$1;

    public /* synthetic */ MemoryCloudPairingRepository$$ExternalSyntheticLambda0(MemoryCloudPairingRepository memoryCloudPairingRepository, Cloudpairing.Seed seed, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryCloudPairingRepository;
        this.f$1 = seed;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getCloudPairingStatus$0(this.f$1, result);
                break;
            default:
                this.f$0.lambda$removeCloudPairingKeys$4(this.f$1, result);
                break;
        }
    }
}
