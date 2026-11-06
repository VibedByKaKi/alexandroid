package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.PeripheralDevice;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda11 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((DefaultAccessoryExplorer.DeviceConnectivityObserver) obj2).lambda$onSocketConnected$2((Accessory) obj);
                break;
            case 1:
                DefaultAccessoryExplorer.DeviceConnectivityObserver.lambda$handlePossibleAccessoryDisconnected$13((PeripheralDevice) obj2, (Throwable) obj);
                break;
            default:
                DefaultAccessoryExplorer.DeviceConnectivityObserver.AnonymousClass1.lambda$onSuccess$6((Accessory) obj2, (Throwable) obj);
                break;
        }
    }
}
