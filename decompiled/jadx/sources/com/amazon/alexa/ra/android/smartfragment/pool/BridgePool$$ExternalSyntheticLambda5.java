package com.amazon.alexa.ra.android.smartfragment.pool;

import com.amazon.alexa.ra.android.smartfragment.pool.BridgePool;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class BridgePool$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BridgePool f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BridgePool$$ExternalSyntheticLambda5(BridgePool bridgePool, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = bridgePool;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onTeardownDeadline((BridgePool.Entry) this.f$1);
                break;
            default:
                this.f$0.runDeferredDestroy((String) this.f$1);
                break;
        }
    }
}
