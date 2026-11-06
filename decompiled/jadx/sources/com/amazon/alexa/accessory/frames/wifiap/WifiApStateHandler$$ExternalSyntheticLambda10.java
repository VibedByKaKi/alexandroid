package com.amazon.alexa.accessory.frames.wifiap;

import com.amazon.alexa.accessory.frames.wifiap.WifiApUtils;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class WifiApStateHandler$$ExternalSyntheticLambda10 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WifiApInfo f$0;

    public /* synthetic */ WifiApStateHandler$$ExternalSyntheticLambda10(WifiApInfo wifiApInfo, int i) {
        this.$r8$classId = i;
        this.f$0 = wifiApInfo;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        WifiApInfo lambda$handleConnect$6;
        WifiApInfo lambda$handleDisconnect$9;
        int i = this.$r8$classId;
        WifiApInfo wifiApInfo = this.f$0;
        WifiApUtils.WifiConfigApStatus wifiConfigApStatus = (WifiApUtils.WifiConfigApStatus) obj;
        switch (i) {
            case 0:
                lambda$handleConnect$6 = WifiApStateHandler.lambda$handleConnect$6(wifiApInfo, wifiConfigApStatus);
                return lambda$handleConnect$6;
            default:
                lambda$handleDisconnect$9 = WifiApStateHandler.lambda$handleDisconnect$9(wifiApInfo, wifiConfigApStatus);
                return lambda$handleDisconnect$9;
        }
    }
}
