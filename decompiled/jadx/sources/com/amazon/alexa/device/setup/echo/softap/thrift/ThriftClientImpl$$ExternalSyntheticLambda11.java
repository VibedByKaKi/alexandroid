package com.amazon.alexa.device.setup.echo.softap.thrift;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ThriftClientImpl$$ExternalSyntheticLambda11 implements ObservableOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ThriftClientImpl f$0;

    public /* synthetic */ ThriftClientImpl$$ExternalSyntheticLambda11(ThriftClientImpl thriftClientImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = thriftClientImpl;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public final void subscribe(ObservableEmitter observableEmitter) {
        int i = this.$r8$classId;
        ThriftClientImpl thriftClientImpl = this.f$0;
        switch (i) {
            case 0:
                thriftClientImpl.lambda$getDeviceDetails$1(observableEmitter);
                break;
            case 1:
                thriftClientImpl.lambda$verifyAlexaConnectionState$17(observableEmitter);
                break;
            default:
                thriftClientImpl.lambda$verifyDeviceKnowsItIsRegistered$12(observableEmitter);
                break;
        }
    }
}
