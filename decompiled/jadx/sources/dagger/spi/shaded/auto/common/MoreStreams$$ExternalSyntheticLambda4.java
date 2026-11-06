package dagger.spi.shaded.auto.common;

import com.google.common.collect.ImmutableBiMap;
import com.squareup.javapoet.AnnotationSpec;
import dagger.spi.shaded.auto.common.BasicAnnotationProcessor;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MoreStreams$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MoreStreams$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$new$0;
        Class lambda$new$1;
        Stream lambda$getSupportedAnnotationTypes$1;
        switch (this.$r8$classId) {
            case 0:
                return ((ImmutableBiMap.Builder) obj).build();
            case 1:
                lambda$new$0 = BasicAnnotationProcessor.ProcessingStepAsStep.lambda$new$0((Class) obj);
                return lambda$new$0;
            case 2:
                lambda$new$1 = BasicAnnotationProcessor.ProcessingStepAsStep.lambda$new$1((Class) obj);
                return lambda$new$1;
            case 3:
                lambda$getSupportedAnnotationTypes$1 = BasicAnnotationProcessor.lambda$getSupportedAnnotationTypes$1((BasicAnnotationProcessor.Step) obj);
                return lambda$getSupportedAnnotationTypes$1;
            default:
                return ((AnnotationSpec.Builder) obj).build();
        }
    }
}
