package autovalue.shaded.com.google.escapevelocity;

import autovalue.shaded.com.google.escapevelocity.ReferenceNode;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MethodFinder$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MethodFinder$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$uncachedPublicMethodsWithName$0;
        boolean lambda$evaluate$1;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$uncachedPublicMethodsWithName$0 = MethodFinder.lambda$uncachedPublicMethodsWithName$0((String) obj2, (Method) obj);
                return lambda$uncachedPublicMethodsWithName$0;
            default:
                lambda$evaluate$1 = ReferenceNode.MethodReferenceNode.lambda$evaluate$1((List) obj2, (Method) obj);
                return lambda$evaluate$1;
        }
    }
}
