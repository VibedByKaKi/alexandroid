package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda9 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAccessoryExplorer.DeviceConnectivityObserver f$0;
    public final /* synthetic */ Accessory f$1;

    public /* synthetic */ DefaultAccessoryExplorer$DeviceConnectivityObserver$$ExternalSyntheticLambda9(DefaultAccessoryExplorer.DeviceConnectivityObserver deviceConnectivityObserver, Accessory accessory, int i) {
        this.$r8$classId = i;
        this.f$0 = deviceConnectivityObserver;
        this.f$1 = accessory;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$queryAccessoryInquiryRecord$22(this.f$1, (Throwable) obj);
                break;
            case 1:
                this.f$0.lambda$handleUnknownAccessoryConnectedViaSpp$26(this.f$1, (Boolean) obj);
                break;
            default:
                this.f$0.lambda$handleUnknownAccessoryConnectedViaSpp$27(this.f$1, (Throwable) obj);
                break;
        }
    }
}
