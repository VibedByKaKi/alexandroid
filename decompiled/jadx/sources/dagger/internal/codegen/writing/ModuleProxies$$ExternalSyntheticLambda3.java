package dagger.internal.codegen.writing;

import dagger.internal.codegen.writing.ComponentImplementation;
import dagger.spi.shaded.androidx.room.compiler.processing.XConstructorElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XMethodElement;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ModuleProxies$$ExternalSyntheticLambda3 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ ModuleProxies$$ExternalSyntheticLambda3(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$newModuleInstance$3;
        boolean lambda$validateMethodNameDoesNotOverrideGeneratedCreator$5;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                lambda$newModuleInstance$3 = ModuleProxies.lambda$newModuleInstance$3(str, (XConstructorElement) obj);
                return lambda$newModuleInstance$3;
            default:
                lambda$validateMethodNameDoesNotOverrideGeneratedCreator$5 = ComponentImplementation.ShardImplementation.lambda$validateMethodNameDoesNotOverrideGeneratedCreator$5(str, (XMethodElement) obj);
                return lambda$validateMethodNameDoesNotOverrideGeneratedCreator$5;
        }
    }
}
