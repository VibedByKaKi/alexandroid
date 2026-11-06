package com.amazon.alexa.accessorykit.finishsetup;

import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.functions.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FinishSetupInteractor$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FinishSetupInteractor$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        boolean booleanValue;
        boolean lambda$observeNewlySetupDevices$4;
        switch (this.$r8$classId) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                return booleanValue;
            default:
                lambda$observeNewlySetupDevices$4 = InterProcessFASViewCoordinator.lambda$observeNewlySetupDevices$4((DeviceGroup) obj);
                return lambda$observeNewlySetupDevices$4;
        }
    }
}
