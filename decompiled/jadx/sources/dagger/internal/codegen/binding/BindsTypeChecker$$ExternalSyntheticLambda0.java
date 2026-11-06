package dagger.internal.codegen.binding;

import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotation;
import dagger.spi.shaded.androidx.room.compiler.processing.XMethodElement;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class BindsTypeChecker$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ BindsTypeChecker$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$methodParameterTypes$0;
        boolean lambda$getScopesFromScopeMetadata$3;
        boolean lambda$getQualifiersForKotlinProperty$12;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                lambda$methodParameterTypes$0 = BindsTypeChecker.lambda$methodParameterTypes$0(str, (XMethodElement) obj);
                return lambda$methodParameterTypes$0;
            case 1:
                lambda$getScopesFromScopeMetadata$3 = InjectionAnnotations.lambda$getScopesFromScopeMetadata$3(str, (XAnnotation) obj);
                return lambda$getScopesFromScopeMetadata$3;
            default:
                lambda$getQualifiersForKotlinProperty$12 = InjectionAnnotations.lambda$getQualifiersForKotlinProperty$12(str, (XMethodElement) obj);
                return lambda$getQualifiersForKotlinProperty$12;
        }
    }
}
