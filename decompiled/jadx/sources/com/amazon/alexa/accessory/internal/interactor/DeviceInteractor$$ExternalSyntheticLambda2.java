package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.PeripheralDevices;
import com.amazon.alexa.accessory.internal.interactor.ConnectivityInteractor;
import com.amazon.alexa.accessory.internal.interactor.DeviceInteractor;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DeviceInteractor$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DeviceInteractor$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        boolean lambda$getUnpairedDeviceGroups$12;
        boolean lambda$onAccessorySessionFailed$0;
        boolean lambda$apply$0;
        boolean lambda$removeUnpairedDeviceGroup$0;
        boolean lambda$reconnect$4;
        boolean lambda$removeUnpairedDeviceGroups$7;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$getUnpairedDeviceGroups$12 = DeviceInteractor.lambda$getUnpairedDeviceGroups$12((PeripheralDevices) obj2, (DeviceGroup) obj);
                return lambda$getUnpairedDeviceGroups$12;
            case 1:
                lambda$onAccessorySessionFailed$0 = ConnectivityInteractor.SessionListener.lambda$onAccessorySessionFailed$0((Accessory) obj2, (Boolean) obj);
                return lambda$onAccessorySessionFailed$0;
            case 2:
                lambda$apply$0 = ((DeviceInteractor.AnonymousClass1) obj2).lambda$apply$0((DeviceGroup) obj);
                return lambda$apply$0;
            case 3:
                lambda$removeUnpairedDeviceGroup$0 = ((DeviceInteractor.BluetoothBondObserver) obj2).lambda$removeUnpairedDeviceGroup$0((DeviceGroup) obj);
                return lambda$removeUnpairedDeviceGroup$0;
            case 4:
                lambda$reconnect$4 = ((ConnectivityInteractor) obj2).lambda$reconnect$4((DeviceGroup) obj);
                return lambda$reconnect$4;
            default:
                lambda$removeUnpairedDeviceGroups$7 = ((DeviceInteractor) obj2).lambda$removeUnpairedDeviceGroups$7((List) obj);
                return lambda$removeUnpairedDeviceGroups$7;
        }
    }
}
