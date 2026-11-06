package com.amazon.alexa.accessory.capabilities.transport;

import com.amazon.alexa.accessory.repositories.Producer;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class TransportCapability$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TransportCapability$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((TransportCapability) obj2).lambda$initializeDeviceType$0((String) obj);
                break;
            case 1:
                ((Producer.Result) obj2).complete((Boolean) obj);
                break;
            default:
                ((Producer.Result) obj2).completeWithError((Throwable) obj);
                break;
        }
    }
}
