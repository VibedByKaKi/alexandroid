package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableIntUnaryOperator$$ExternalSyntheticLambda0 implements FailableIntUnaryOperator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FailableIntUnaryOperator$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
    public final int applyAsInt(int i) {
        int lambda$static$0;
        int lambda$identity$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = FailableIntUnaryOperator.lambda$static$0(i);
                return lambda$static$0;
            default:
                lambda$identity$0 = FailableIntUnaryOperator.lambda$identity$0(i);
                return lambda$identity$0;
        }
    }
}
