package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableFunction$$ExternalSyntheticLambda1 implements FailableFunction {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FailableFunction$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // org.apache.commons.lang3.function.FailableFunction
    public final Object apply(Object obj) {
        Object lambda$static$0;
        Object lambda$identity$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = FailableFunction.lambda$static$0(obj);
                return lambda$static$0;
            default:
                lambda$identity$0 = FailableFunction.lambda$identity$0(obj);
                return lambda$identity$0;
        }
    }
}
