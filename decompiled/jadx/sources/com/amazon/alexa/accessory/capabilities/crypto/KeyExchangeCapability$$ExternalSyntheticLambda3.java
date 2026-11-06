package com.amazon.alexa.accessory.capabilities.crypto;

import com.amazon.alexa.accessory.capabilities.crypto.KeyExchangeCapability;
import com.amazon.alexa.accessory.capabilities.crypto.state.KeyExchangeState;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class KeyExchangeCapability$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KeyExchangeCapability f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ KeyExchangeCapability$$ExternalSyntheticLambda3(KeyExchangeCapability keyExchangeCapability, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = keyExchangeCapability;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onTransportFeaturesAvailable$1((KeyExchangeCapability.BufferedMessage) this.f$1);
                break;
            default:
                this.f$0.lambda$performTransition$3((KeyExchangeState) this.f$1);
                break;
        }
    }
}
