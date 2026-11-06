package com.amazon.alexa.accessory.capabilities.transport;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.capabilities.transport.TransportCapability;
import com.amazon.alexa.accessory.protocol.Common;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class TransportCapability$TransportActionHandler$$ExternalSyntheticLambda1 implements SingleOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TransportCapability.TransportActionHandler f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ TransportCapability$TransportActionHandler$$ExternalSyntheticLambda1(TransportCapability.TransportActionHandler transportActionHandler, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = transportActionHandler;
        this.f$1 = obj;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public final void subscribe(SingleEmitter singleEmitter) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$requestSwitchTransport$11((Accessory) this.f$1, singleEmitter);
                break;
            case 1:
                this.f$0.lambda$requestAccessoryConnection$7((Accessory) this.f$1, singleEmitter);
                break;
            default:
                this.f$0.lambda$issueUpgradeTransport$6((Common.Transport) this.f$1, singleEmitter);
                break;
        }
    }
}
