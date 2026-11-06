package com.amazon.coral.google.common.cache;

import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class LocalCache$$ExternalSyntheticLambda1 implements BiFunction {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LocalCache$$ExternalSyntheticLambda1(Object obj, BiFunction biFunction) {
        this.f$0 = obj;
        this.f$1 = biFunction;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Object lambda$merge$2;
        Object lambda$computeIfAbsent$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$merge$2 = LocalCache.lambda$merge$2(this.f$0, (BiFunction) this.f$1, obj, obj2);
                return lambda$merge$2;
            default:
                lambda$computeIfAbsent$0 = LocalCache.lambda$computeIfAbsent$0((Function) this.f$1, this.f$0, obj, obj2);
                return lambda$computeIfAbsent$0;
        }
    }

    public /* synthetic */ LocalCache$$ExternalSyntheticLambda1(Function function, Object obj) {
        this.f$1 = function;
        this.f$0 = obj;
    }
}
