package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.collect.Iterators;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ImmutableSortedMap$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Comparator f$0;

    public /* synthetic */ ImmutableSortedMap$$ExternalSyntheticLambda0(Comparator comparator, int i) {
        this.$r8$classId = i;
        this.f$0 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$fromEntries$0;
        int lambda$new$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$fromEntries$0 = ImmutableSortedMap.lambda$fromEntries$0(this.f$0, (Map.Entry) obj, (Map.Entry) obj2);
                return lambda$fromEntries$0;
            default:
                lambda$new$0 = Iterators.MergingIterator.lambda$new$0(this.f$0, (PeekingIterator) obj, (PeekingIterator) obj2);
                return lambda$new$0;
        }
    }
}
