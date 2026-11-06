package com.amazon.alexa.assistant.toolkit.audio.device;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CommunicationDeviceController$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommunicationDeviceController f$0;

    public /* synthetic */ CommunicationDeviceController$$ExternalSyntheticLambda0(CommunicationDeviceController communicationDeviceController, int i) {
        this.$r8$classId = i;
        this.f$0 = communicationDeviceController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit notifyDeviceChanged$lambda$8;
        Unit notifyAvailableDevicesChanged$lambda$10$lambda$9;
        int i = this.$r8$classId;
        CommunicationDeviceController communicationDeviceController = this.f$0;
        switch (i) {
            case 0:
                notifyDeviceChanged$lambda$8 = CommunicationDeviceController.notifyDeviceChanged$lambda$8(communicationDeviceController);
                return notifyDeviceChanged$lambda$8;
            default:
                notifyAvailableDevicesChanged$lambda$10$lambda$9 = CommunicationDeviceController.notifyAvailableDevicesChanged$lambda$10$lambda$9(communicationDeviceController);
                return notifyAvailableDevicesChanged$lambda$10$lambda$9;
        }
    }
}
