package androidx.core.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Predicate$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Predicate$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean equals;
        boolean lambda$negate$1;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                equals = obj2.equals(obj);
                return equals;
            default:
                lambda$negate$1 = ((Predicate) obj2).lambda$negate$1(obj);
                return lambda$negate$1;
        }
    }
}
