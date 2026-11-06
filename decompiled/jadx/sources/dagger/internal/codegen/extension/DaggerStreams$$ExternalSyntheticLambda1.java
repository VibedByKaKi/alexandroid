package dagger.internal.codegen.extension;

import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class DaggerStreams$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function f$0;
    public final /* synthetic */ Function f$1;

    public /* synthetic */ DaggerStreams$$ExternalSyntheticLambda1(Function function, Function function2, int i) {
        this.$r8$classId = i;
        this.f$0 = function;
        this.f$1 = function2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map.Entry lambda$toImmutableSetMultimap$3;
        Map.Entry lambda$toImmutableMap$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$toImmutableSetMultimap$3 = DaggerStreams.lambda$toImmutableSetMultimap$3(this.f$0, this.f$1, obj);
                return lambda$toImmutableSetMultimap$3;
            default:
                lambda$toImmutableMap$0 = DaggerStreams.lambda$toImmutableMap$0(this.f$0, this.f$1, obj);
                return lambda$toImmutableMap$0;
        }
    }
}
