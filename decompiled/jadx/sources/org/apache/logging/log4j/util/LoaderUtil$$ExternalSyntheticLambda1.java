package org.apache.logging.log4j.util;

import org.apache.logging.log4j.simple.internal.SimpleProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class LoaderUtil$$ExternalSyntheticLambda1 implements java.util.function.Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LoaderUtil$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object lambda$newCheckedInstanceOfProperty$3;
        PropertiesUtil lambda$static$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$newCheckedInstanceOfProperty$3 = LoaderUtil.lambda$newCheckedInstanceOfProperty$3();
                return lambda$newCheckedInstanceOfProperty$3;
            case 1:
                lambda$static$0 = PropertiesUtil.lambda$static$0();
                return lambda$static$0;
            default:
                return new SimpleProvider();
        }
    }
}
