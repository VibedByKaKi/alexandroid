package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableLongUnaryOperator$$ExternalSyntheticLambda1 implements FailableLongUnaryOperator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FailableLongUnaryOperator f$0;
    public final /* synthetic */ FailableLongUnaryOperator f$1;

    public /* synthetic */ FailableLongUnaryOperator$$ExternalSyntheticLambda1(FailableLongUnaryOperator failableLongUnaryOperator, FailableLongUnaryOperator failableLongUnaryOperator2, int i) {
        this.$r8$classId = i;
        this.f$0 = failableLongUnaryOperator;
        this.f$1 = failableLongUnaryOperator2;
    }

    @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
    public final long applyAsLong(long j) {
        long lambda$andThen$0;
        long lambda$compose$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$andThen$0 = this.f$0.lambda$andThen$0(this.f$1, j);
                return lambda$andThen$0;
            default:
                lambda$compose$0 = this.f$0.lambda$compose$0(this.f$1, j);
                return lambda$compose$0;
        }
    }
}
