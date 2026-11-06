package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableIntUnaryOperator$$ExternalSyntheticLambda1 implements FailableIntUnaryOperator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FailableIntUnaryOperator f$0;
    public final /* synthetic */ FailableIntUnaryOperator f$1;

    public /* synthetic */ FailableIntUnaryOperator$$ExternalSyntheticLambda1(FailableIntUnaryOperator failableIntUnaryOperator, FailableIntUnaryOperator failableIntUnaryOperator2, int i) {
        this.$r8$classId = i;
        this.f$0 = failableIntUnaryOperator;
        this.f$1 = failableIntUnaryOperator2;
    }

    @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
    public final int applyAsInt(int i) {
        int lambda$compose$0;
        int lambda$andThen$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$compose$0 = this.f$0.lambda$compose$0(this.f$1, i);
                return lambda$compose$0;
            default:
                lambda$andThen$0 = this.f$0.lambda$andThen$0(this.f$1, i);
                return lambda$andThen$0;
        }
    }
}
