package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.collect.Collections2;
import java.util.Collection;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Collections2$FilteredCollection$$ExternalSyntheticLambda3 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Collection f$0;

    public /* synthetic */ Collections2$FilteredCollection$$ExternalSyntheticLambda3(Collection collection, int i) {
        this.$r8$classId = i;
        this.f$0 = collection;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$retainAll$1;
        int i = this.$r8$classId;
        Collection collection = this.f$0;
        switch (i) {
            case 0:
                lambda$retainAll$1 = Collections2.FilteredCollection.lambda$retainAll$1(collection, obj);
                return lambda$retainAll$1;
            default:
                return collection.contains(obj);
        }
    }
}
