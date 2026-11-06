package dagger.internal.codegen.bindinggraphvalidation;

import dagger.internal.codegen.validation.ValidationBindingGraphPlugin;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class CompositeBindingGraphPlugin$$ExternalSyntheticLambda1 implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((ValidationBindingGraphPlugin) obj).onPluginEnd();
    }
}
