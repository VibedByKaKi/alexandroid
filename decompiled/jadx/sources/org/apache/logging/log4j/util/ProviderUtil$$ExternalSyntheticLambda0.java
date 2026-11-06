package org.apache.logging.log4j.util;

import java.util.Objects;
import java.util.function.Predicate;
import org.apache.logging.log4j.spi.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ProviderUtil$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ProviderUtil$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$lazyInit$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$lazyInit$0 = ProviderUtil.lambda$lazyInit$0((Provider) obj);
                return lambda$lazyInit$0;
            default:
                return Objects.nonNull((String) obj);
        }
    }
}
