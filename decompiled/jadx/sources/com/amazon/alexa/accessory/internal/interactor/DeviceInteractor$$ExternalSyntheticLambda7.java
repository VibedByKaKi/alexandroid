package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.internal.util.Logger;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DeviceInteractor$$ExternalSyntheticLambda7 implements Action {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DeviceInteractor$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Logger.d("Made sure all devices in device supplier are paired.");
                break;
            case 1:
                Logger.e("DeviceInteractor completed observing linked devices. Device information for subsequently linked devices will not be updated.");
                break;
            default:
                Logger.e("Critical: RegistrationInteractor: Login observer onComplete");
                break;
        }
    }
}
