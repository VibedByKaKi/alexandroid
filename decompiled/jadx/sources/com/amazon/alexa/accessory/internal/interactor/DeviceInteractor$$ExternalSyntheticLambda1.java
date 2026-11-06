package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DeviceInteractor$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DeviceInteractor$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                DeviceInteractor.lambda$keepDeviceGroupInformationUpdated$5((DeviceGroup) obj2, (Throwable) obj);
                break;
            case 1:
                ((CompanionDeviceInteractor) obj2).lambda$listenForRemovedDevices$2((List) obj);
                break;
            default:
                ((CompanionDeviceInteractor) obj2).lambda$listenForNewCompanionDevices$0((String) obj);
                break;
        }
    }
}
