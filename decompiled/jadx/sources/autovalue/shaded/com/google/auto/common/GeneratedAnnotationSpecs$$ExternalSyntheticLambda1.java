package autovalue.shaded.com.google.auto.common;

import autovalue.shaded.com.squareup.javapoet.AnnotationSpec;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class GeneratedAnnotationSpecs$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ GeneratedAnnotationSpecs$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        AnnotationSpec lambda$generatedAnnotationSpec$1;
        AnnotationSpec lambda$generatedAnnotationSpec$0;
        int i = this.$r8$classId;
        String str = this.f$0;
        AnnotationSpec.Builder builder = (AnnotationSpec.Builder) obj;
        switch (i) {
            case 0:
                lambda$generatedAnnotationSpec$1 = GeneratedAnnotationSpecs.lambda$generatedAnnotationSpec$1(str, builder);
                return lambda$generatedAnnotationSpec$1;
            default:
                lambda$generatedAnnotationSpec$0 = GeneratedAnnotationSpecs.lambda$generatedAnnotationSpec$0(str, builder);
                return lambda$generatedAnnotationSpec$0;
        }
    }
}
