package com.amazon.alexa.accessory.repositories.hearing;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryHearingEnhancementRepository$$ExternalSyntheticLambda0 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryHearingEnhancementRepository f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MemoryHearingEnhancementRepository$$ExternalSyntheticLambda0(MemoryHearingEnhancementRepository memoryHearingEnhancementRepository, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = memoryHearingEnhancementRepository;
        this.f$1 = i;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getMediaEnhancementCorrectionAmount$2(this.f$1, result);
                break;
            default:
                this.f$0.lambda$getAudiogram$0(this.f$1, result);
                break;
        }
    }
}
