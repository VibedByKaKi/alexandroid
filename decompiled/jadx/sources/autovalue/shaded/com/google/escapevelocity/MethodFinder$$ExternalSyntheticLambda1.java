package autovalue.shaded.com.google.escapevelocity;

import autovalue.shaded.com.google.escapevelocity.ReferenceNode;
import java.lang.reflect.Method;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MethodFinder$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MethodFinder$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Method lambda$uncachedPublicMethodsWithName$1;
        Object lambda$evaluate$0;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$uncachedPublicMethodsWithName$1 = MethodFinder.lambda$uncachedPublicMethodsWithName$1((Class) obj2, (Method) obj);
                return lambda$uncachedPublicMethodsWithName$1;
            default:
                lambda$evaluate$0 = ReferenceNode.MethodReferenceNode.lambda$evaluate$0((EvaluationContext) obj2, (ExpressionNode) obj);
                return lambda$evaluate$0;
        }
    }
}
