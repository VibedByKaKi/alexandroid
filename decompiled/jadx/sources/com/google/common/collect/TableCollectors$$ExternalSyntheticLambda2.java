package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import java.util.function.BinaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class TableCollectors$$ExternalSyntheticLambda2 implements BinaryOperator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BinaryOperator f$0;

    public /* synthetic */ TableCollectors$$ExternalSyntheticLambda2(BinaryOperator binaryOperator, int i) {
        this.$r8$classId = i;
        this.f$0 = binaryOperator;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Table lambda$toTable$2;
        TableCollectors.ImmutableTableCollectorState lambda$toImmutableTable$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$toTable$2 = TableCollectors.lambda$toTable$2(this.f$0, (Table) obj, (Table) obj2);
                return lambda$toTable$2;
            default:
                lambda$toImmutableTable$3 = TableCollectors.lambda$toImmutableTable$3(this.f$0, (TableCollectors.ImmutableTableCollectorState) obj, (TableCollectors.ImmutableTableCollectorState) obj2);
                return lambda$toImmutableTable$3;
        }
    }
}
