package dagger.internal.codegen.validation;

import dagger.internal.codegen.validation.ComponentValidator;
import dagger.spi.BindingGraphPlugin;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ExternalBindingGraphPlugins$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((BindingGraphPlugin) obj).onPluginEnd();
                break;
            case 1:
                ((ComponentValidator.ElementValidator.ComponentMethodValidator) obj).validateMethod();
                break;
            default:
                ((dagger.spi.model.BindingGraphPlugin) obj).onPluginEnd();
                break;
        }
    }
}
