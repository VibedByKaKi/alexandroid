package dagger.internal.codegen.validation;

import dagger.internal.codegen.validation.ComponentValidator;
import dagger.spi.model.DependencyRequest;
import dagger.spi.shaded.androidx.room.compiler.processing.XMethodElement;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ComponentValidator$ElementValidator$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComponentValidator.ElementValidator f$0;

    public /* synthetic */ ComponentValidator$ElementValidator$$ExternalSyntheticLambda2(ComponentValidator.ElementValidator elementValidator, int i) {
        this.$r8$classId = i;
        this.f$0 = elementValidator;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DependencyRequest dependencyRequest;
        ComponentValidator.ElementValidator.ComponentMethodValidator lambda$validateComponentMethods$1;
        int i = this.$r8$classId;
        ComponentValidator.ElementValidator elementValidator = this.f$0;
        XMethodElement xMethodElement = (XMethodElement) obj;
        switch (i) {
            case 0:
                dependencyRequest = elementValidator.dependencyRequest(xMethodElement);
                return dependencyRequest;
            default:
                lambda$validateComponentMethods$1 = elementValidator.lambda$validateComponentMethods$1(xMethodElement);
                return lambda$validateComponentMethods$1;
        }
    }
}
