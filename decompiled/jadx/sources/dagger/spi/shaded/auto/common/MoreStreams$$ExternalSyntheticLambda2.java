package dagger.spi.shaded.auto.common;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MoreStreams$$ExternalSyntheticLambda2 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MoreStreams$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((ImmutableBiMap.Builder) obj).put((Map.Entry) obj2);
                break;
            default:
                ((ImmutableMap.Builder) obj).put((Map.Entry) obj2);
                break;
        }
    }
}
