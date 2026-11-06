package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableDoubleUnaryOperator$$ExternalSyntheticLambda2 implements FailableDoubleUnaryOperator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FailableDoubleUnaryOperator f$0;
    public final /* synthetic */ FailableDoubleUnaryOperator f$1;

    public /* synthetic */ FailableDoubleUnaryOperator$$ExternalSyntheticLambda2(FailableDoubleUnaryOperator failableDoubleUnaryOperator, FailableDoubleUnaryOperator failableDoubleUnaryOperator2, int i) {
        this.$r8$classId = i;
        this.f$0 = failableDoubleUnaryOperator;
        this.f$1 = failableDoubleUnaryOperator2;
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
    public final double applyAsDouble(double d) {
        double lambda$compose$0;
        double lambda$andThen$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$compose$0 = this.f$0.lambda$compose$0(this.f$1, d);
                return lambda$compose$0;
            default:
                lambda$andThen$0 = this.f$0.lambda$andThen$0(this.f$1, d);
                return lambda$andThen$0;
        }
    }
}
