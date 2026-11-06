package dagger.internal.codegen.processingstep;

import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ModuleProcessingStep$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TypeCheckingProcessingStep f$0;

    public /* synthetic */ ModuleProcessingStep$$ExternalSyntheticLambda2(TypeCheckingProcessingStep typeCheckingProcessingStep, int i) {
        this.$r8$classId = i;
        this.f$0 = typeCheckingProcessingStep;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        TypeCheckingProcessingStep typeCheckingProcessingStep = this.f$0;
        switch (i) {
            case 0:
                ((ModuleProcessingStep) typeCheckingProcessingStep).generateForMethodsIn((XTypeElement) obj);
                break;
            default:
                typeCheckingProcessingStep.lambda$processOver$1((String) obj);
                break;
        }
    }
}
