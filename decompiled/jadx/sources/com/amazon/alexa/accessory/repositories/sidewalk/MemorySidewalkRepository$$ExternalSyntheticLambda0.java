package com.amazon.alexa.accessory.repositories.sidewalk;

import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemorySidewalkRepository$$ExternalSyntheticLambda0 implements SingleOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemorySidewalkRepository f$0;

    public /* synthetic */ MemorySidewalkRepository$$ExternalSyntheticLambda0(MemorySidewalkRepository memorySidewalkRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = memorySidewalkRepository;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public final void subscribe(SingleEmitter singleEmitter) {
        int i = this.$r8$classId;
        MemorySidewalkRepository memorySidewalkRepository = this.f$0;
        switch (i) {
            case 0:
                memorySidewalkRepository.lambda$getOutputStream$1(singleEmitter);
                break;
            default:
                memorySidewalkRepository.lambda$getInputStream$0(singleEmitter);
                break;
        }
    }
}
