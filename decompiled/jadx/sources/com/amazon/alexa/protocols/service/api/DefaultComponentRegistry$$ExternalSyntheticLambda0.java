package com.amazon.alexa.protocols.service.api;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DefaultComponentRegistry$$ExternalSyntheticLambda0 implements LazyComponent {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultComponentRegistry f$0;
    public final /* synthetic */ Class f$1;

    public /* synthetic */ DefaultComponentRegistry$$ExternalSyntheticLambda0(DefaultComponentRegistry defaultComponentRegistry, Class cls, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultComponentRegistry;
        this.f$1 = cls;
    }

    @Override // com.amazon.alexa.protocols.service.api.LazyComponent, javax.inject.Provider
    public final Object get() {
        Object lambda$getLazy$4;
        List lambda$getLazyList$5;
        switch (this.$r8$classId) {
            case 0:
                lambda$getLazy$4 = this.f$0.lambda$getLazy$4(this.f$1);
                return lambda$getLazy$4;
            default:
                lambda$getLazyList$5 = this.f$0.lambda$getLazyList$5(this.f$1);
                return lambda$getLazyList$5;
        }
    }
}
