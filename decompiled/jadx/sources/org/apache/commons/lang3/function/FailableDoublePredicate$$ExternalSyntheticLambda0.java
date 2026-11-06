package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableDoublePredicate$$ExternalSyntheticLambda0 implements FailableDoublePredicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FailableDoublePredicate f$0;
    public final /* synthetic */ FailableDoublePredicate f$1;

    public /* synthetic */ FailableDoublePredicate$$ExternalSyntheticLambda0(FailableDoublePredicate failableDoublePredicate, FailableDoublePredicate failableDoublePredicate2, int i) {
        this.$r8$classId = i;
        this.f$0 = failableDoublePredicate;
        this.f$1 = failableDoublePredicate2;
    }

    @Override // org.apache.commons.lang3.function.FailableDoublePredicate
    public final boolean test(double d) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$or$0(this.f$1, d);
            default:
                return this.f$0.lambda$and$0(this.f$1, d);
        }
    }
}
