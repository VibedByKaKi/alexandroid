package com.amazon.alexa.accessory.repositories.cbl;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryCblRepository$$ExternalSyntheticLambda1 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryCblRepository f$0;

    public /* synthetic */ MemoryCblRepository$$ExternalSyntheticLambda1(MemoryCblRepository memoryCblRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryCblRepository;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        int i = this.$r8$classId;
        MemoryCblRepository memoryCblRepository = this.f$0;
        switch (i) {
            case 0:
                memoryCblRepository.lambda$retrieveInitialLoginState$1(result);
                break;
            default:
                memoryCblRepository.lambda$requestCblInformation$2(result);
                break;
        }
    }
}
