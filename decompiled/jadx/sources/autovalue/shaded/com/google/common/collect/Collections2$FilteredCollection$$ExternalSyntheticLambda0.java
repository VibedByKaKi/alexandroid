package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.collect.Collections2;
import autovalue.shaded.com.google.common.collect.Lists;
import java.util.AbstractCollection;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Collections2$FilteredCollection$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractCollection f$0;
    public final /* synthetic */ Predicate f$1;

    public /* synthetic */ Collections2$FilteredCollection$$ExternalSyntheticLambda0(AbstractCollection abstractCollection, Predicate predicate, int i) {
        this.$r8$classId = i;
        this.f$0 = abstractCollection;
        this.f$1 = predicate;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$removeIf$0;
        boolean lambda$removeIf$02;
        switch (this.$r8$classId) {
            case 0:
                return ((Collections2.FilteredCollection) this.f$0).lambda$removeIf$2(this.f$1, obj);
            case 1:
                return ((Collections2.TransformedCollection) this.f$0).lambda$removeIf$1(this.f$1, obj);
            case 2:
                lambda$removeIf$0 = ((Lists.TransformingRandomAccessList) this.f$0).lambda$removeIf$0(this.f$1, obj);
                return lambda$removeIf$0;
            default:
                lambda$removeIf$02 = ((Lists.TransformingSequentialList) this.f$0).lambda$removeIf$0(this.f$1, obj);
                return lambda$removeIf$02;
        }
    }
}
