package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Sets$1$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Set f$0;

    public /* synthetic */ Sets$1$$ExternalSyntheticLambda0(Set set, int i) {
        this.$r8$classId = i;
        this.f$0 = set;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$stream$0;
        boolean lambda$stream$02;
        boolean lambda$parallelStream$1;
        int i = this.$r8$classId;
        Set set = this.f$0;
        switch (i) {
            case 0:
                lambda$stream$0 = Sets.AnonymousClass1.lambda$stream$0(set, obj);
                return lambda$stream$0;
            case 1:
                lambda$stream$02 = Sets.AnonymousClass3.lambda$stream$0(set, obj);
                return lambda$stream$02;
            case 2:
                lambda$parallelStream$1 = Sets.AnonymousClass3.lambda$parallelStream$1(set, obj);
                return lambda$parallelStream$1;
            default:
                return set.contains(obj);
        }
    }
}
