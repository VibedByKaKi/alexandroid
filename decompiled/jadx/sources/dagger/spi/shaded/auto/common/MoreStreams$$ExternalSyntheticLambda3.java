package dagger.spi.shaded.auto.common;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import java.util.function.BinaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MoreStreams$$ExternalSyntheticLambda3 implements BinaryOperator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MoreStreams$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        ImmutableBiMap.Builder lambda$toImmutableBiMap$5;
        ImmutableMap.Builder lambda$toImmutableMap$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$toImmutableBiMap$5 = MoreStreams.lambda$toImmutableBiMap$5((ImmutableBiMap.Builder) obj, (ImmutableBiMap.Builder) obj2);
                return lambda$toImmutableBiMap$5;
            default:
                lambda$toImmutableMap$2 = MoreStreams.lambda$toImmutableMap$2((ImmutableMap.Builder) obj, (ImmutableMap.Builder) obj2);
                return lambda$toImmutableMap$2;
        }
    }
}
