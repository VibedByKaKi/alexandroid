package autovalue.shaded.com.google.common.collect;

import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda13 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function f$0;

    public /* synthetic */ CollectCollectors$$ExternalSyntheticLambda13(Function function, int i) {
        this.$r8$classId = i;
        this.f$0 = function;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object lambda$flatteningToImmutableListMultimap$19;
        Stream lambda$flatteningToImmutableListMultimap$20;
        Object lambda$flatteningToImmutableSetMultimap$22;
        Stream lambda$flatteningToImmutableSetMultimap$23;
        int i = this.$r8$classId;
        Function function = this.f$0;
        switch (i) {
            case 0:
                lambda$flatteningToImmutableListMultimap$19 = CollectCollectors.lambda$flatteningToImmutableListMultimap$19(function, obj);
                return lambda$flatteningToImmutableListMultimap$19;
            case 1:
                lambda$flatteningToImmutableListMultimap$20 = CollectCollectors.lambda$flatteningToImmutableListMultimap$20(function, obj);
                return lambda$flatteningToImmutableListMultimap$20;
            case 2:
                lambda$flatteningToImmutableSetMultimap$22 = CollectCollectors.lambda$flatteningToImmutableSetMultimap$22(function, obj);
                return lambda$flatteningToImmutableSetMultimap$22;
            default:
                lambda$flatteningToImmutableSetMultimap$23 = CollectCollectors.lambda$flatteningToImmutableSetMultimap$23(function, obj);
                return lambda$flatteningToImmutableSetMultimap$23;
        }
    }
}
