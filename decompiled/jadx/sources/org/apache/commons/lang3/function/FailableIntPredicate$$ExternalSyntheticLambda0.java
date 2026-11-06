package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableIntPredicate$$ExternalSyntheticLambda0 implements FailableIntPredicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FailableIntPredicate f$0;
    public final /* synthetic */ FailableIntPredicate f$1;

    public /* synthetic */ FailableIntPredicate$$ExternalSyntheticLambda0(FailableIntPredicate failableIntPredicate, FailableIntPredicate failableIntPredicate2, int i) {
        this.$r8$classId = i;
        this.f$0 = failableIntPredicate;
        this.f$1 = failableIntPredicate2;
    }

    @Override // org.apache.commons.lang3.function.FailableIntPredicate
    public final boolean test(int i) {
        boolean lambda$and$0;
        boolean lambda$or$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$and$0 = this.f$0.lambda$and$0(this.f$1, i);
                return lambda$and$0;
            default:
                lambda$or$0 = this.f$0.lambda$or$0(this.f$1, i);
                return lambda$or$0;
        }
    }
}
