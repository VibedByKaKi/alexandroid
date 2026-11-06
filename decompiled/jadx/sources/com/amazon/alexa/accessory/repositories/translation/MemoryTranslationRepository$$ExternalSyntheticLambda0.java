package com.amazon.alexa.accessory.repositories.translation;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryTranslationRepository$$ExternalSyntheticLambda0 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryTranslationRepository f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ MemoryTranslationRepository$$ExternalSyntheticLambda0(MemoryTranslationRepository memoryTranslationRepository, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryTranslationRepository;
        this.f$1 = str;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$resumeTranslation$3(this.f$1, result);
                break;
            case 1:
                this.f$0.lambda$startTranslation$0(this.f$1, result);
                break;
            default:
                this.f$0.lambda$pauseTranslation$2(this.f$1, result);
                break;
        }
    }
}
