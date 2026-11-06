package com.amazon.alexa.accessory.repositories.inputevents;

import com.amazon.alexa.accessory.protocol.Input;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryInputRepository$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryInputRepository f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MemoryInputRepository$$ExternalSyntheticLambda3(MemoryInputRepository memoryInputRepository, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = memoryInputRepository;
        this.f$1 = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getCachedOrRequest$5(this.f$1, (Input.InputBehaviorConfigurationSet) obj);
                break;
            default:
                this.f$0.lambda$resetConfiguration$2(this.f$1, (Input.InputBehaviorConfigurationSet) obj);
                break;
        }
    }
}
