package androidx.core.util;

import androidx.core.content.IntentSanitizer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Predicate$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Predicate f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Predicate$$ExternalSyntheticLambda0(Class cls, Predicate predicate) {
        this.$r8$classId = 2;
        this.f$1 = cls;
        this.f$0 = predicate;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$or$2;
        boolean lambda$and$0;
        boolean lambda$allowExtra$13;
        switch (this.$r8$classId) {
            case 0:
                lambda$or$2 = this.f$0.lambda$or$2((Predicate) this.f$1, obj);
                return lambda$or$2;
            case 1:
                lambda$and$0 = this.f$0.lambda$and$0((Predicate) this.f$1, obj);
                return lambda$and$0;
            default:
                lambda$allowExtra$13 = IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.f$1, this.f$0, obj);
                return lambda$allowExtra$13;
        }
    }

    public /* synthetic */ Predicate$$ExternalSyntheticLambda0(Predicate predicate, Predicate predicate2, int i) {
        this.$r8$classId = i;
        this.f$0 = predicate;
        this.f$1 = predicate2;
    }
}
