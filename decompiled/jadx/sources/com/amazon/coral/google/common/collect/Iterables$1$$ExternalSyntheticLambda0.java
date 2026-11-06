package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.CollectCollectors;
import com.amazon.coral.google.common.collect.Iterables;
import com.amazon.coral.google.common.collect.MultimapBuilder;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Iterables$1$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Iterables$1$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Iterable lambda$spliterator$0;
        CollectCollectors.EnumMapAccumulator lambda$toImmutableEnumMap$14;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$spliterator$0 = Iterables.AnonymousClass1.lambda$spliterator$0((Iterable) obj);
                return lambda$spliterator$0;
            case 1:
                lambda$toImmutableEnumMap$14 = CollectCollectors.lambda$toImmutableEnumMap$14((BinaryOperator) obj);
                return lambda$toImmutableEnumMap$14;
            case 2:
                return ((MultimapBuilder.ListMultimapBuilder) obj).build();
            default:
                return ((MultimapBuilder.SetMultimapBuilder) obj).build();
        }
    }
}
