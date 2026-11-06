package com.amazon.alexa.accessory.crypto.persistence;

import com.google.common.base.Supplier;
import java.security.KeyStore;
import java.security.spec.AlgorithmParameterSpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class KeyWrapper$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ KeyWrapper$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        AlgorithmParameterSpec lambda$static$0;
        KeyStore.ProtectionParameter lambda$static$02;
        KeyStore.ProtectionParameter lambda$static$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = KeyWrapper.lambda$static$0();
                return lambda$static$0;
            case 1:
                lambda$static$02 = KeyStoreProtectionParamsBuilder.lambda$static$0();
                return lambda$static$02;
            default:
                lambda$static$1 = KeyStoreProtectionParamsBuilder.lambda$static$1();
                return lambda$static$1;
        }
    }
}
