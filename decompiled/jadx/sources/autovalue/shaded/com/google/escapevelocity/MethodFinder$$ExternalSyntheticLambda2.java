package autovalue.shaded.com.google.escapevelocity;

import autovalue.shaded.com.google.escapevelocity.ReferenceNode;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MethodFinder$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MethodFinder$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$evaluate$0;
        boolean lambda$evaluate$2;
        Method method = (Method) obj;
        switch (this.$r8$classId) {
            case 0:
                return Objects.nonNull(method);
            case 1:
                lambda$evaluate$0 = ReferenceNode.MemberReferenceNode.lambda$evaluate$0(method);
                return lambda$evaluate$0;
            default:
                lambda$evaluate$2 = ReferenceNode.MethodReferenceNode.lambda$evaluate$2(method);
                return lambda$evaluate$2;
        }
    }
}
