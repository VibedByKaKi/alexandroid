package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableLongPredicate$$ExternalSyntheticLambda0 implements FailableLongPredicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FailableLongPredicate f$0;
    public final /* synthetic */ FailableLongPredicate f$1;

    public /* synthetic */ FailableLongPredicate$$ExternalSyntheticLambda0(FailableLongPredicate failableLongPredicate, FailableLongPredicate failableLongPredicate2, int i) {
        this.$r8$classId = i;
        this.f$0 = failableLongPredicate;
        this.f$1 = failableLongPredicate2;
    }

    @Override // org.apache.commons.lang3.function.FailableLongPredicate
    public final boolean test(long j) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$and$0(this.f$1, j);
            default:
                return this.f$0.lambda$or$0(this.f$1, j);
        }
    }
}
