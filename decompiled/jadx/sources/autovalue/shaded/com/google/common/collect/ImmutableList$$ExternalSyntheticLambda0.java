package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.collect.ImmutableSet;
import autovalue.shaded.com.google.common.collect.ImmutableSortedMap;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ImmutableList$$ExternalSyntheticLambda0 implements IntFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImmutableCollection f$0;

    public /* synthetic */ ImmutableList$$ExternalSyntheticLambda0(ImmutableCollection immutableCollection, int i) {
        this.$r8$classId = i;
        this.f$0 = immutableCollection;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        int i2 = this.$r8$classId;
        ImmutableCollection immutableCollection = this.f$0;
        switch (i2) {
            case 0:
                return ((ImmutableList) immutableCollection).get(i);
            case 1:
                return ((ImmutableSet.Indexed) immutableCollection).get(i);
            case 2:
                return ((ImmutableSortedMap.C1EntrySet.AnonymousClass1) immutableCollection).get(i);
            default:
                return ((IndexedImmutableSet) immutableCollection).get(i);
        }
    }
}
