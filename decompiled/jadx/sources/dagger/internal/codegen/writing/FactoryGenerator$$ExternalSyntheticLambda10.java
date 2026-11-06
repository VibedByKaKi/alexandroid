package dagger.internal.codegen.writing;

import com.squareup.javapoet.AnnotationSpec;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class FactoryGenerator$$ExternalSyntheticLambda10 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnnotationSpec.Builder f$0;

    public /* synthetic */ FactoryGenerator$$ExternalSyntheticLambda10(AnnotationSpec.Builder builder, int i) {
        this.$r8$classId = i;
        this.f$0 = builder;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AnnotationSpec.Builder builder = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                FactoryGenerator.lambda$qualifierMetadataAnnotation$12(builder, str);
                break;
            case 1:
                FactoryGenerator.lambda$scopeMetadataAnnotation$11(builder, str);
                break;
            default:
                MembersInjectorGenerator.lambda$qualifierMetadataAnnotation$2(builder, str);
                break;
        }
    }
}
