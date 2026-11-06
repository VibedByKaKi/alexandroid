package com.amazon.alexa.accessory.frames.accessproof;

import android.content.Context;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessProofManager$$ExternalSyntheticLambda7 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessProofManager$$ExternalSyntheticLambda7(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Collection fromAssets;
        AttestationRevocationList lambda$new$0;
        Collection lambda$new$1;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return (String) ((AtomicReference) obj).get();
            case 1:
                fromAssets = PinnedAttestationRoots.fromAssets((Context) obj);
                return fromAssets;
            case 2:
                return ((AttestationRevocationListCache) obj).current();
            case 3:
                lambda$new$0 = AttestationChainValidator.lambda$new$0((AttestationRevocationList) obj);
                return lambda$new$0;
            default:
                lambda$new$1 = AttestationChainValidator.lambda$new$1((Set) obj);
                return lambda$new$1;
        }
    }
}
