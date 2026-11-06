package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ComponentRuntime$$ExternalSyntheticLambda0 implements Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComponentRegistrar f$0;

    public /* synthetic */ ComponentRuntime$$ExternalSyntheticLambda0(ComponentRegistrar componentRegistrar, int i) {
        this.$r8$classId = i;
        this.f$0 = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar lambda$toProviders$1;
        ComponentRegistrar lambda$addComponentRegistrar$0;
        int i = this.$r8$classId;
        ComponentRegistrar componentRegistrar = this.f$0;
        switch (i) {
            case 0:
                lambda$toProviders$1 = ComponentRuntime.lambda$toProviders$1(componentRegistrar);
                return lambda$toProviders$1;
            default:
                lambda$addComponentRegistrar$0 = ComponentRuntime.Builder.lambda$addComponentRegistrar$0(componentRegistrar);
                return lambda$addComponentRegistrar$0;
        }
    }
}
