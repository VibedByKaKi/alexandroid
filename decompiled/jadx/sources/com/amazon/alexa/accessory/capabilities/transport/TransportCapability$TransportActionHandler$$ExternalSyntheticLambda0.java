package com.amazon.alexa.accessory.capabilities.transport;

import com.amazon.alexa.accessory.capabilities.transport.TransportCapability;
import com.amazon.alexa.accessory.streams.control.ControlResponseHandler;
import io.reactivex.rxjava3.functions.Cancellable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class TransportCapability$TransportActionHandler$$ExternalSyntheticLambda0 implements Cancellable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TransportCapability.TransportActionHandler f$0;
    public final /* synthetic */ ControlResponseHandler f$1;

    public /* synthetic */ TransportCapability$TransportActionHandler$$ExternalSyntheticLambda0(TransportCapability.TransportActionHandler transportActionHandler, ControlResponseHandler controlResponseHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = transportActionHandler;
        this.f$1 = controlResponseHandler;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$issueUpgradeTransport$5(this.f$1);
                break;
            default:
                this.f$0.lambda$requestSwitchTransport$10(this.f$1);
                break;
        }
    }
}
