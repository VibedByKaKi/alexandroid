package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableLongUnaryOperator$$ExternalSyntheticLambda0 implements FailableLongUnaryOperator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FailableLongUnaryOperator$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
    public final long applyAsLong(long j) {
        long lambda$identity$0;
        long lambda$static$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$identity$0 = FailableLongUnaryOperator.lambda$identity$0(j);
                return lambda$identity$0;
            default:
                lambda$static$0 = FailableLongUnaryOperator.lambda$static$0(j);
                return lambda$static$0;
        }
    }
}
