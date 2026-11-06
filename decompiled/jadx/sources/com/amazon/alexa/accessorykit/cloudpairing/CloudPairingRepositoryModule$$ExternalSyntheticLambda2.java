package com.amazon.alexa.accessorykit.cloudpairing;

import com.amazon.alexa.accessorykit.accessories.session.firmware.FirmwareRepositoryModule;
import com.facebook.react.bridge.Promise;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class CloudPairingRepositoryModule$$ExternalSyntheticLambda2 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Promise f$0;

    public /* synthetic */ CloudPairingRepositoryModule$$ExternalSyntheticLambda2(int i, Promise promise) {
        this.$r8$classId = i;
        this.f$0 = promise;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        Promise promise = this.f$0;
        switch (i) {
            case 0:
                promise.resolve(null);
                break;
            case 1:
                promise.resolve(null);
                break;
            case 2:
                promise.resolve(null);
                break;
            case 3:
                promise.resolve(null);
                break;
            case 4:
                FirmwareRepositoryModule.lambda$initiateFirmwareTransfer$1(promise);
                break;
            case 5:
                promise.resolve(null);
                break;
            case 6:
                promise.resolve(null);
                break;
            case 7:
                promise.resolve(null);
                break;
            case 8:
                promise.resolve(null);
                break;
            case 9:
                promise.resolve(null);
                break;
            case 10:
                promise.resolve(null);
                break;
            default:
                promise.resolve(null);
                break;
        }
    }
}
