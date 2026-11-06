package org.openjdk.tools.javac.comp;

import java.util.function.Supplier;
import org.openjdk.tools.javac.comp.ArgumentAttr;
import org.openjdk.tools.javac.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class ArgumentAttr$ExplicitLambdaType$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArgumentAttr.ExplicitLambdaType f$0;

    public /* synthetic */ ArgumentAttr$ExplicitLambdaType$$ExternalSyntheticLambda0(ArgumentAttr.ExplicitLambdaType explicitLambdaType, int i) {
        this.$r8$classId = i;
        this.f$0 = explicitLambdaType;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        List lambda$argtypes$0;
        List lambda$returnExpressions$1;
        int i = this.$r8$classId;
        ArgumentAttr.ExplicitLambdaType explicitLambdaType = this.f$0;
        switch (i) {
            case 0:
                lambda$argtypes$0 = explicitLambdaType.lambda$argtypes$0();
                return lambda$argtypes$0;
            default:
                lambda$returnExpressions$1 = explicitLambdaType.lambda$returnExpressions$1();
                return lambda$returnExpressions$1;
        }
    }
}
