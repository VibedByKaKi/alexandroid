package autovalue.shaded.com.google.common.collect;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ImmutableMultimap$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BiConsumer f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ImmutableMultimap$$ExternalSyntheticLambda2(BiConsumer biConsumer, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = biConsumer;
        this.f$1 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ImmutableMultimap.lambda$forEach$2(this.f$0, this.f$1, obj);
                break;
            default:
                this.f$0.accept(this.f$1, obj);
                break;
        }
    }
}
