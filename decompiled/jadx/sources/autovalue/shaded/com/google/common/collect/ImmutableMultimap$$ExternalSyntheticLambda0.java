package autovalue.shaded.com.google.common.collect;

import java.util.Collection;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ImmutableMultimap$$ExternalSyntheticLambda0 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BiConsumer f$0;

    public /* synthetic */ ImmutableMultimap$$ExternalSyntheticLambda0(BiConsumer biConsumer, int i) {
        this.$r8$classId = i;
        this.f$0 = biConsumer;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.$r8$classId;
        BiConsumer biConsumer = this.f$0;
        switch (i) {
            case 0:
                ImmutableMultimap.lambda$forEach$3(biConsumer, obj, (Collection) obj2);
                break;
            case 1:
                AbstractMapBasedMultimap.lambda$forEach$3(biConsumer, obj, (Collection) obj2);
                break;
            default:
                biConsumer.accept(obj2, obj);
                break;
        }
    }
}
