package org.apache.commons.lang3;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class RandomUtils$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RandomUtils$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Random lambda$static$0;
        SecureRandom lambda$static$1;
        String lambda$static$02;
        switch (this.$r8$classId) {
            case 0:
                return ThreadLocalRandom.current();
            case 1:
                return RandomUtils.secure();
            case 2:
                return RandomUtils.insecure();
            case 3:
                return RandomUtils.secureStrong();
            case 4:
                return new SecureRandom();
            case 5:
                lambda$static$0 = RandomUtils.lambda$static$0();
                return lambda$static$0;
            case 6:
                lambda$static$1 = RandomUtils.lambda$static$1();
                return lambda$static$1;
            case 7:
                return new ArrayList();
            default:
                lambda$static$02 = SystemUtils.lambda$static$0();
                return lambda$static$02;
        }
    }
}
