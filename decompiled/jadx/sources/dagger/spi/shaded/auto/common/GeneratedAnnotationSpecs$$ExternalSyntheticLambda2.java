package dagger.spi.shaded.auto.common;

import com.squareup.javapoet.AnnotationSpec;
import dagger.spi.shaded.auto.common.BasicAnnotationProcessor;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class GeneratedAnnotationSpecs$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ GeneratedAnnotationSpecs$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        AnnotationSpec lambda$generatedAnnotationSpec$0;
        AnnotationSpec lambda$generatedAnnotationSpec$1;
        Stream lambda$getSupportedAnnotationTypeElements$0;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$generatedAnnotationSpec$0 = GeneratedAnnotationSpecs.lambda$generatedAnnotationSpec$0((String) obj2, (AnnotationSpec.Builder) obj);
                return lambda$generatedAnnotationSpec$0;
            case 1:
                lambda$generatedAnnotationSpec$1 = GeneratedAnnotationSpecs.lambda$generatedAnnotationSpec$1((String) obj2, (AnnotationSpec.Builder) obj);
                return lambda$generatedAnnotationSpec$1;
            default:
                lambda$getSupportedAnnotationTypeElements$0 = ((BasicAnnotationProcessor) obj2).lambda$getSupportedAnnotationTypeElements$0((BasicAnnotationProcessor.Step) obj);
                return lambda$getSupportedAnnotationTypeElements$0;
        }
    }
}
