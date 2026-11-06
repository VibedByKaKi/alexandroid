package org.apache.logging.log4j.util;

import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.logging.log4j.spi.Provider;
import org.apache.logging.log4j.util.PropertiesUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ProviderUtil$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ProviderUtil$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Stream lambda$getValidUnits$0;
        switch (this.$r8$classId) {
            case 0:
                return ((Provider) obj).getPriority();
            case 1:
                lambda$getValidUnits$0 = PropertiesUtil.TimeUnit.lambda$getValidUnits$0((PropertiesUtil.TimeUnit) obj);
                return lambda$getValidUnits$0;
            default:
                return ((Provider) obj).toString();
        }
    }
}
