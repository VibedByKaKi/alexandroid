package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryScanner$$ExternalSyntheticLambda3 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultAccessoryScanner$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        Accessory lambda$filterOutKnownAccessory$1;
        MaybeSource lambda$startObservingLeDevices$15;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$filterOutKnownAccessory$1 = DefaultAccessoryScanner.lambda$filterOutKnownAccessory$1((Accessory) obj2, (Boolean) obj);
                return lambda$filterOutKnownAccessory$1;
            default:
                lambda$startObservingLeDevices$15 = DefaultAccessoryExplorer.lambda$startObservingLeDevices$15((DeviceGroup) obj2, (Boolean) obj);
                return lambda$startObservingLeDevices$15;
        }
    }
}
