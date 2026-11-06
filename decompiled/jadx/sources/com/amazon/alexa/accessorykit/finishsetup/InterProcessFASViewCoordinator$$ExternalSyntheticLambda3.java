package com.amazon.alexa.accessorykit.finishsetup;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import com.amazon.alexa.accessorykit.finishsetup.FinishSetupInteractor;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class InterProcessFASViewCoordinator$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ InterProcessFASViewCoordinator$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((InterProcessFASViewCoordinator) obj2).lambda$observeNewlySetupDevices$6((DeviceGroup) obj);
                break;
            case 1:
                FinishSetupInteractor.FinishSetupAccessoryExplorerObserver.lambda$onUnknownAccessoryFound$1((Accessory) obj2, (Throwable) obj);
                break;
            case 2:
                ((FinishSetupInteractor.FinishSetupAccessorySessionListener) obj2).lambda$onAccessorySessionConnected$0((Boolean) obj);
                break;
            default:
                InterProcessFASViewCoordinator.lambda$presentViewIfValid$1((FinishSetupEvent) obj2, (Throwable) obj);
                break;
        }
    }
}
