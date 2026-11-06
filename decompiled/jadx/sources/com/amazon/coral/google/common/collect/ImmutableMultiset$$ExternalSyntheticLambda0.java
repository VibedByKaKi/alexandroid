package com.amazon.coral.google.common.collect;

import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ImmutableMultiset$$ExternalSyntheticLambda0 implements ToIntFunction {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ImmutableMultiset$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        int lambda$toImmutableMultiset$0;
        int lambda$toImmutableSortedMultiset$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$toImmutableMultiset$0 = ImmutableMultiset.lambda$toImmutableMultiset$0(obj);
                return lambda$toImmutableMultiset$0;
            default:
                lambda$toImmutableSortedMultiset$0 = ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$0(obj);
                return lambda$toImmutableSortedMultiset$0;
        }
    }
}
