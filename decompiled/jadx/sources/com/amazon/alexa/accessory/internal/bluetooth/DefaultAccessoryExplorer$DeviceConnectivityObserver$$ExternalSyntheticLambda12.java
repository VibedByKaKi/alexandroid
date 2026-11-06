package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.internal.PeripheralDevice;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda12 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAccessoryExplorer.DeviceConnectivityObserver f$0;
    public final /* synthetic */ PeripheralDevice f$1;

    public /* synthetic */ DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda12(DefaultAccessoryExplorer.DeviceConnectivityObserver deviceConnectivityObserver, PeripheralDevice peripheralDevice, int i) {
        this.$r8$classId = i;
        this.f$0 = deviceConnectivityObserver;
        this.f$1 = peripheralDevice;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onSocketConnected$3(this.f$1, (Throwable) obj);
                break;
            case 1:
                this.f$0.lambda$handlePossibleAccessoryConnected$6(this.f$1, (Throwable) obj);
                break;
            default:
                this.f$0.lambda$handlePossibleAccessoryDisconnected$12(this.f$1, (Boolean) obj);
                break;
        }
    }
}
