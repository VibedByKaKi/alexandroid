package com.amazon.alexa.accessory.internal;

import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessorySupplier$$ExternalSyntheticLambda3 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAccessorySupplier f$0;

    public /* synthetic */ DefaultAccessorySupplier$$ExternalSyntheticLambda3(DefaultAccessorySupplier defaultAccessorySupplier, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultAccessorySupplier;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        CompletableSource lambda$unlink$0;
        CompletableSource lambda$createStandbyRunnable$10;
        Boolean lambda$isConnectible$8;
        int i = this.$r8$classId;
        DefaultAccessorySupplier defaultAccessorySupplier = this.f$0;
        DeviceGroup deviceGroup = (DeviceGroup) obj;
        switch (i) {
            case 0:
                lambda$unlink$0 = defaultAccessorySupplier.lambda$unlink$0(deviceGroup);
                return lambda$unlink$0;
            case 1:
                lambda$createStandbyRunnable$10 = defaultAccessorySupplier.lambda$createStandbyRunnable$10(deviceGroup);
                return lambda$createStandbyRunnable$10;
            default:
                lambda$isConnectible$8 = defaultAccessorySupplier.lambda$isConnectible$8(deviceGroup);
                return lambda$isConnectible$8;
        }
    }
}
