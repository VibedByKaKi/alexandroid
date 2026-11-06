package org.openjdk.tools.sjavac.comp;

import java.util.function.Function;
import java.util.stream.Stream;
import org.openjdk.javax.lang.model.element.TypeParameterElement;
import org.openjdk.tools.javac.util.Dependencies;
import org.openjdk.tools.javac.util.GraphUtils;
import org.openjdk.tools.sjavac.comp.dependencies.NewDependencyCollector;
import org.openjdk.tools.sjavac.pubapi.PubApiTypeParam;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class PubapiVisitor$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PubapiVisitor$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        PubApiTypeParam lambda$getTypeParameters$0;
        Stream lambda$getAllDependencies$3;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$getTypeParameters$0 = ((PubapiVisitor) obj2).lambda$getTypeParameters$0((TypeParameterElement) obj);
                return lambda$getTypeParameters$0;
            default:
                lambda$getAllDependencies$3 = NewDependencyCollector.lambda$getAllDependencies$3((Dependencies.GraphDependencies.CompletionNode) obj2, (GraphUtils.DependencyKind) obj);
                return lambda$getAllDependencies$3;
        }
    }
}
