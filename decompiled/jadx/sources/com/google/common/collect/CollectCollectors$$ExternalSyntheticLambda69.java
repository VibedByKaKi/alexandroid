package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import com.google.common.collect.MultimapBuilder;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda69 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CollectCollectors$$ExternalSyntheticLambda69(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        CollectCollectors.EnumMapAccumulator lambda$toImmutableEnumMap$3;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$toImmutableEnumMap$3 = CollectCollectors.lambda$toImmutableEnumMap$3((BinaryOperator) obj);
                return lambda$toImmutableEnumMap$3;
            case 1:
                return ((MultimapBuilder.ListMultimapBuilder) obj).build();
            default:
                return ((MultimapBuilder.SetMultimapBuilder) obj).build();
        }
    }
}
