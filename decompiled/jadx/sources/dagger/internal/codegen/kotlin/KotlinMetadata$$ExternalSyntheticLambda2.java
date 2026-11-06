package dagger.internal.codegen.kotlin;

import dagger.internal.codegen.kotlin.KotlinMetadata;
import dagger.spi.shaded.androidx.room.compiler.processing.XFieldElement;
import java.util.Optional;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class KotlinMetadata$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KotlinMetadata f$0;

    public /* synthetic */ KotlinMetadata$$ExternalSyntheticLambda2(KotlinMetadata kotlinMetadata, int i) {
        this.$r8$classId = i;
        this.f$0 = kotlinMetadata;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional lambda$getPropertyGetterUncached$3;
        Optional propertyGetterUncached;
        Optional annotationMethodUncached;
        KotlinMetadata.MethodForAnnotations lambda$getAnnotationMethodUncached$2;
        int i = this.$r8$classId;
        KotlinMetadata kotlinMetadata = this.f$0;
        switch (i) {
            case 0:
                lambda$getPropertyGetterUncached$3 = kotlinMetadata.lambda$getPropertyGetterUncached$3((String) obj);
                return lambda$getPropertyGetterUncached$3;
            case 1:
                propertyGetterUncached = kotlinMetadata.getPropertyGetterUncached((XFieldElement) obj);
                return propertyGetterUncached;
            case 2:
                annotationMethodUncached = kotlinMetadata.getAnnotationMethodUncached((XFieldElement) obj);
                return annotationMethodUncached;
            default:
                lambda$getAnnotationMethodUncached$2 = kotlinMetadata.lambda$getAnnotationMethodUncached$2((String) obj);
                return lambda$getAnnotationMethodUncached$2;
        }
    }
}
