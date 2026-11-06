package com.amazon.alexa.accessory.capabilities.wificonfig;

import com.amazon.alexa.accessory.capabilities.wificonfig.WifiConfigCapability;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.repositories.Producer;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class WifiConfigCapability$WifiConfigHandler$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Producer.Result f$0;

    public /* synthetic */ WifiConfigCapability$WifiConfigHandler$$ExternalSyntheticLambda3(int i, Producer.Result result) {
        this.$r8$classId = i;
        this.f$0 = result;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Producer.Result result = this.f$0;
        switch (i) {
            case 0:
                WifiConfigCapability.WifiConfigHandler.lambda$handleConnectToWiFiConfigAp$2(result, (Throwable) obj);
                break;
            case 1:
                WifiConfigCapability.WifiConfigHandler.lambda$handleDisconnectFromWiFiConfigAp$5(result, (Throwable) obj);
                break;
            default:
                result.complete((Common.ErrorCode) obj);
                break;
        }
    }
}
