package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class OptionalProvider$$ExternalSyntheticLambda1 implements Provider {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OptionalProvider$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Object lambda$static$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$1 = OptionalProvider.lambda$static$1();
                return lambda$static$1;
            default:
                return Collections.EMPTY_SET;
        }
    }
}
