package org.apache.commons.lang3;

import java.util.concurrent.Future;
import java.util.function.Function;
import org.apache.commons.lang3.concurrent.Memoizer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class EnumUtils$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function f$0;

    public /* synthetic */ EnumUtils$$ExternalSyntheticLambda0(Function function, int i) {
        this.$r8$classId = i;
        this.f$0 = function;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Future lambda$new$2;
        int i = this.$r8$classId;
        Function function = this.f$0;
        switch (i) {
            case 0:
                return function.apply((Enum) obj);
            default:
                lambda$new$2 = Memoizer.lambda$new$2(function, obj);
                return lambda$new$2;
        }
    }
}
