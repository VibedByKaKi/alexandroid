package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.collect.CollectSpliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda0 implements IntConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Consumer f$0;
    public final /* synthetic */ IntFunction f$1;

    public /* synthetic */ CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda0(Consumer consumer, IntFunction intFunction, int i) {
        this.$r8$classId = i;
        this.f$0 = consumer;
        this.f$1 = intFunction;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.$r8$classId) {
            case 0:
                CollectSpliterators.C1WithCharacteristics.lambda$tryAdvance$0(this.f$0, this.f$1, i);
                break;
            default:
                CollectSpliterators.C1WithCharacteristics.lambda$forEachRemaining$1(this.f$0, this.f$1, i);
                break;
        }
    }
}
