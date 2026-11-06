package com.amazon.alexa.accessory.repositories.system;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemorySystemRepository$$ExternalSyntheticLambda3 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemorySystemRepository f$0;

    public /* synthetic */ MemorySystemRepository$$ExternalSyntheticLambda3(MemorySystemRepository memorySystemRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = memorySystemRepository;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        int i = this.$r8$classId;
        MemorySystemRepository memorySystemRepository = this.f$0;
        switch (i) {
            case 0:
                memorySystemRepository.lambda$retrieveInitialUsers$1(result);
                break;
            case 1:
                memorySystemRepository.lambda$retrieveInitialI18nConfig$6(result);
                break;
            case 2:
                memorySystemRepository.lambda$notifyDeviceBeingRemoved$12(result);
                break;
            default:
                memorySystemRepository.lambda$queryCurrentUser$7(result);
                break;
        }
    }
}
