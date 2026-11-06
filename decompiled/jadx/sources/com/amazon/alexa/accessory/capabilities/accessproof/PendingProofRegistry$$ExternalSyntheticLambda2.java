package com.amazon.alexa.accessory.capabilities.accessproof;

import com.amazon.alexa.accessory.capabilities.accessproof.AccessProofCapability;
import com.amazon.alexa.accessory.capabilities.accessproof.PendingProofRegistry;
import com.amazon.alexa.accessory.internal.ActionQueue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class PendingProofRegistry$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ PendingProofRegistry$$ExternalSyntheticLambda2(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PendingProofRegistry) this.f$0).lambda$complete$0((PendingProofRegistry.Verifying) this.f$1);
                break;
            case 1:
                ((AccessProofCapability.SendAccessProofResultAction) this.f$0).lambda$run$0((ActionQueue.Action.Callback) this.f$1);
                break;
            default:
                ((PendingProofRegistry) this.f$0).lambda$startVerifying$1((String) this.f$1);
                break;
        }
    }
}
