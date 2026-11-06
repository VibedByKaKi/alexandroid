package com.amazon.alexa.protocols.service.api;

import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.DefaultComponentRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DefaultComponentRegistry$$ExternalSyntheticLambda2 implements DefaultComponentRegistry.ProviderOfConstructionResult {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultComponentRegistry f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DefaultComponentRegistry$$ExternalSyntheticLambda2(DefaultComponentRegistry defaultComponentRegistry, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultComponentRegistry;
        this.f$1 = obj;
    }

    @Override // com.amazon.alexa.protocols.service.api.DefaultComponentRegistry.ProviderOfConstructionResult
    public final DefaultComponentRegistry.ConstructionResult provide() {
        DefaultComponentRegistry.ConstructionResult lambda$bindConcreteFactory$3;
        DefaultComponentRegistry.ConstructionResult lambda$bindFactory$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$bindConcreteFactory$3 = this.f$0.lambda$bindConcreteFactory$3((ComponentRegistry.ConcreteComponentFactory) this.f$1);
                return lambda$bindConcreteFactory$3;
            default:
                lambda$bindFactory$2 = this.f$0.lambda$bindFactory$2((String) this.f$1);
                return lambda$bindFactory$2;
        }
    }
}
