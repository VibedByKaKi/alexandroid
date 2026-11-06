package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.collect.CollectCollectors;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AbstractMapBasedMultiset$$ExternalSyntheticLambda0 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AbstractMapBasedMultiset$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                AbstractMapBasedMultiset.lambda$forEachEntry$0((ObjIntConsumer) obj3, obj, (Count) obj2);
                break;
            default:
                ((CollectCollectors.EnumMapAccumulator) obj3).put((Enum) obj, obj2);
                break;
        }
    }
}
