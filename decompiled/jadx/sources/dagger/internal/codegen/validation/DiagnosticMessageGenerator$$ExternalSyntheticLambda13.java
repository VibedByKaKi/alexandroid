package dagger.internal.codegen.validation;

import dagger.spi.model.BindingGraph;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class DiagnosticMessageGenerator$$ExternalSyntheticLambda13 implements ToIntFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DiagnosticMessageGenerator f$0;

    public /* synthetic */ DiagnosticMessageGenerator$$ExternalSyntheticLambda13(DiagnosticMessageGenerator diagnosticMessageGenerator, int i) {
        this.$r8$classId = i;
        this.f$0 = diagnosticMessageGenerator;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        int lambda$rootComponentFirst$6;
        int lambda$nearestComponentSupertypeFirst$10;
        int i = this.$r8$classId;
        DiagnosticMessageGenerator diagnosticMessageGenerator = this.f$0;
        BindingGraph.DependencyEdge dependencyEdge = (BindingGraph.DependencyEdge) obj;
        switch (i) {
            case 0:
                lambda$rootComponentFirst$6 = diagnosticMessageGenerator.lambda$rootComponentFirst$6(dependencyEdge);
                return lambda$rootComponentFirst$6;
            default:
                lambda$nearestComponentSupertypeFirst$10 = diagnosticMessageGenerator.lambda$nearestComponentSupertypeFirst$10(dependencyEdge);
                return lambda$nearestComponentSupertypeFirst$10;
        }
    }
}
