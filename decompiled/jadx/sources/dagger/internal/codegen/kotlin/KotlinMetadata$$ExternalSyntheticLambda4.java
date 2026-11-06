package dagger.internal.codegen.kotlin;

import com.squareup.javapoet.ClassName;
import dagger.internal.codegen.kotlin.KotlinMetadata;
import dagger.spi.shaded.androidx.room.compiler.processing.XFieldElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XMethodElement;
import java.util.Set;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class KotlinMetadata$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ KotlinMetadata$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        XMethodElement lambda$getSyntheticAnnotationMethod$0;
        Set lambda$getSyntheticPropertyAnnotations$0;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$getSyntheticAnnotationMethod$0 = KotlinMetadata.lambda$getSyntheticAnnotationMethod$0((XFieldElement) obj2, (KotlinMetadata.MethodForAnnotations) obj);
                return lambda$getSyntheticAnnotationMethod$0;
            default:
                lambda$getSyntheticPropertyAnnotations$0 = KotlinMetadataUtil.lambda$getSyntheticPropertyAnnotations$0((ClassName) obj2, (XMethodElement) obj);
                return lambda$getSyntheticPropertyAnnotations$0;
        }
    }
}
