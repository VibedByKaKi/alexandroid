package dagger.internal.codegen.binding;

import dagger.spi.model.ComponentPath;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class BindingGraph$$ExternalSyntheticLambda18 implements UnaryOperator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BindingGraph$$ExternalSyntheticLambda18(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$static$0;
        String lambda$static$1;
        String lambda$static$2;
        switch (this.$r8$classId) {
            case 0:
                return ((ComponentPath) obj).parent();
            case 1:
                lambda$static$0 = ErrorMessages.lambda$static$0((String) obj);
                return lambda$static$0;
            case 2:
                lambda$static$1 = ErrorMessages.lambda$static$1((String) obj);
                return lambda$static$1;
            default:
                lambda$static$2 = ErrorMessages.lambda$static$2((String) obj);
                return lambda$static$2;
        }
    }
}
