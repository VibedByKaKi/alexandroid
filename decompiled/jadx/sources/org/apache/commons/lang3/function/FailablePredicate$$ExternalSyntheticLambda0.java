package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailablePredicate$$ExternalSyntheticLambda0 implements FailablePredicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FailablePredicate f$0;
    public final /* synthetic */ FailablePredicate f$1;

    public /* synthetic */ FailablePredicate$$ExternalSyntheticLambda0(FailablePredicate failablePredicate, FailablePredicate failablePredicate2, int i) {
        this.$r8$classId = i;
        this.f$0 = failablePredicate;
        this.f$1 = failablePredicate2;
    }

    @Override // org.apache.commons.lang3.function.FailablePredicate
    public final boolean test(Object obj) {
        boolean lambda$or$0;
        boolean lambda$and$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$or$0 = this.f$0.lambda$or$0(this.f$1, obj);
                return lambda$or$0;
            default:
                lambda$and$0 = this.f$0.lambda$and$0(this.f$1, obj);
                return lambda$and$0;
        }
    }
}
