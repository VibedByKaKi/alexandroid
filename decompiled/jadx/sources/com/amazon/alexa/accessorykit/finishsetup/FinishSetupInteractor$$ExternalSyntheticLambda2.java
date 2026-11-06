package com.amazon.alexa.accessorykit.finishsetup;

import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FinishSetupInteractor$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FinishSetupInteractor$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        boolean lambda$observeNewlySetupDevices$5;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return ((Set) obj2).contains((String) obj);
            default:
                lambda$observeNewlySetupDevices$5 = ((InterProcessFASViewCoordinator) obj2).lambda$observeNewlySetupDevices$5((DeviceGroup) obj);
                return lambda$observeNewlySetupDevices$5;
        }
    }
}
