package com.amazon.alexa.accessory.internal;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessorySupplier$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAccessorySupplier f$0;
    public final /* synthetic */ Accessory f$1;

    public /* synthetic */ DefaultAccessorySupplier$$ExternalSyntheticLambda1(DefaultAccessorySupplier defaultAccessorySupplier, Accessory accessory, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultAccessorySupplier;
        this.f$1 = accessory;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        CompletableSource lambda$monitorUnexpiredStandbyTimeoutAccessory$9;
        CompletableSource lambda$link$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$monitorUnexpiredStandbyTimeoutAccessory$9 = this.f$0.lambda$monitorUnexpiredStandbyTimeoutAccessory$9(this.f$1, (DeviceGroup) obj);
                return lambda$monitorUnexpiredStandbyTimeoutAccessory$9;
            default:
                lambda$link$3 = this.f$0.lambda$link$3(this.f$1, (Boolean) obj);
                return lambda$link$3;
        }
    }
}
