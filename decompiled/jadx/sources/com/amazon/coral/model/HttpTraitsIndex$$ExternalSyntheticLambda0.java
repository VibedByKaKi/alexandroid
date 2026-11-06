package com.amazon.coral.model;

import com.amazon.coral.model.validation.FaultTraitsChecker;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HttpTraitsIndex$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HttpTraitsIndex$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map lambda$loadService$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$loadService$0 = HttpTraitsIndex.lambda$loadService$0((String) obj);
                return lambda$loadService$0;
            default:
                return new FaultTraitsChecker((StructureModel) obj);
        }
    }
}
