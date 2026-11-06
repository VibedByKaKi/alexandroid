package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.internal.PeripheralDevice;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda10 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAccessoryExplorer.DeviceConnectivityObserver f$0;
    public final /* synthetic */ PeripheralDevice f$1;

    public /* synthetic */ DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda10(DefaultAccessoryExplorer.DeviceConnectivityObserver deviceConnectivityObserver, PeripheralDevice peripheralDevice, int i) {
        this.$r8$classId = i;
        this.f$0 = deviceConnectivityObserver;
        this.f$1 = peripheralDevice;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        MaybeSource lambda$onSocketConnected$0;
        CompletableSource lambda$handlePossibleAccessoryConnected$5;
        switch (this.$r8$classId) {
            case 0:
                lambda$onSocketConnected$0 = this.f$0.lambda$onSocketConnected$0(this.f$1, (DeviceGroup) obj);
                return lambda$onSocketConnected$0;
            default:
                lambda$handlePossibleAccessoryConnected$5 = this.f$0.lambda$handlePossibleAccessoryConnected$5(this.f$1, (DeviceGroup) obj);
                return lambda$handlePossibleAccessoryConnected$5;
        }
    }
}
