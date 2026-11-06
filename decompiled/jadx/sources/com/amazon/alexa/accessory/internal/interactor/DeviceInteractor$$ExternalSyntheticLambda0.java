package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.PeripheralDevice;
import com.amazon.alexa.accessory.internal.interactor.DeviceInteractor;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DeviceInteractor$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DeviceInteractor$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                DeviceInteractor.lambda$keepDeviceGroupInformationUpdated$4((DeviceGroup) obj);
                break;
            case 1:
                DeviceInteractor.AccessoryInteractorSessionListener.lambda$onAccessorySessionConnected$0((Accessory) obj);
                break;
            default:
                DeviceInteractor.BluetoothBondObserver.lambda$removeUnpairedDeviceGroup$1((PeripheralDevice) obj);
                break;
        }
    }
}
