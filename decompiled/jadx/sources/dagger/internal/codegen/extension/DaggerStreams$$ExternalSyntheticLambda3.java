package dagger.internal.codegen.extension;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSetMultimap;
import dagger.internal.codegen.extension.DaggerCollectors;
import java.util.function.BinaryOperator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class DaggerStreams$$ExternalSyntheticLambda3 implements BinaryOperator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DaggerStreams$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        ImmutableSetMultimap.Builder lambda$toImmutableSetMultimap$5;
        ImmutableMap.Builder lambda$toImmutableMap$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$toImmutableSetMultimap$5 = DaggerStreams.lambda$toImmutableSetMultimap$5((ImmutableSetMultimap.Builder) obj, (ImmutableSetMultimap.Builder) obj2);
                return lambda$toImmutableSetMultimap$5;
            case 1:
                return ((DaggerCollectors.ToOptionalState) obj).combine((DaggerCollectors.ToOptionalState) obj2);
            default:
                lambda$toImmutableMap$2 = DaggerStreams.lambda$toImmutableMap$2((ImmutableMap.Builder) obj, (ImmutableMap.Builder) obj2);
                return lambda$toImmutableMap$2;
        }
    }
}
