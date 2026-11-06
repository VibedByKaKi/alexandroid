package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class TableCollectors$$ExternalSyntheticLambda1 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function f$0;
    public final /* synthetic */ Function f$1;
    public final /* synthetic */ Function f$2;
    public final /* synthetic */ BinaryOperator f$3;

    public /* synthetic */ TableCollectors$$ExternalSyntheticLambda1(Function function, Function function2, Function function3, BinaryOperator binaryOperator, int i) {
        this.$r8$classId = i;
        this.f$0 = function;
        this.f$1 = function2;
        this.f$2 = function3;
        this.f$3 = binaryOperator;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                TableCollectors.lambda$toTable$1(this.f$0, this.f$1, this.f$2, this.f$3, (Table) obj, obj2);
                break;
            default:
                TableCollectors.lambda$toImmutableTable$2(this.f$0, this.f$1, this.f$2, this.f$3, (TableCollectors.ImmutableTableCollectorState) obj, obj2);
                break;
        }
    }
}
