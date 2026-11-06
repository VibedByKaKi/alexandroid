package dagger.internal.codegen.writing;

import com.squareup.javapoet.ClassName;
import dagger.internal.codegen.writing.InjectionMethods;
import dagger.internal.codegen.writing.StaticMemberSelects;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class InjectionMethods$ProvisionMethod$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClassName f$0;

    public /* synthetic */ InjectionMethods$ProvisionMethod$$ExternalSyntheticLambda0(ClassName className, int i) {
        this.$r8$classId = i;
        this.f$0 = className;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$requiresInjectionMethod$2;
        boolean lambda$constructorTypeName$1;
        boolean lambda$getExpressionFor$0;
        int i = this.$r8$classId;
        ClassName className = this.f$0;
        XType xType = (XType) obj;
        switch (i) {
            case 0:
                lambda$requiresInjectionMethod$2 = InjectionMethods.ProvisionMethod.lambda$requiresInjectionMethod$2(className, xType);
                return lambda$requiresInjectionMethod$2;
            case 1:
                lambda$constructorTypeName$1 = SimpleMethodRequestRepresentation.lambda$constructorTypeName$1(className, xType);
                return lambda$constructorTypeName$1;
            default:
                lambda$getExpressionFor$0 = StaticMemberSelects.ParameterizedStaticMethod.lambda$getExpressionFor$0(className, xType);
                return lambda$getExpressionFor$0;
        }
    }
}
