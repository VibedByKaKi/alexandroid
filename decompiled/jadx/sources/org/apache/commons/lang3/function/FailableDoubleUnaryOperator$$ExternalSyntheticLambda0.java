package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableDoubleUnaryOperator$$ExternalSyntheticLambda0 implements FailableDoubleUnaryOperator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FailableDoubleUnaryOperator$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
    public final double applyAsDouble(double d) {
        switch (this.$r8$classId) {
            case 0:
                return FailableDoubleUnaryOperator.lambda$identity$0(d);
            default:
                return FailableDoubleUnaryOperator.lambda$static$0(d);
        }
    }
}
