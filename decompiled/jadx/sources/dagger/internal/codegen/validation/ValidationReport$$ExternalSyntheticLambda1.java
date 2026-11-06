package dagger.internal.codegen.validation;

import com.google.common.graph.SuccessorsFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ValidationReport$$ExternalSyntheticLambda1 implements SuccessorsFunction {
    @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public final Iterable successors(Object obj) {
        Iterable iterable;
        iterable = ((ValidationReport) obj).subreports;
        return iterable;
    }
}
