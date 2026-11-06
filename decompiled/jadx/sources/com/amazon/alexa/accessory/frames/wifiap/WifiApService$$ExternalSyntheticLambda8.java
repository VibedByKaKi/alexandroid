package com.amazon.alexa.accessory.frames.wifiap;

import com.amazon.alexa.accessory.frames.wifiap.WifiApUtils;
import com.amazon.alexa.accessory.protocol.Common;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class WifiApService$$ExternalSyntheticLambda8 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WifiApStateHandler f$0;

    public /* synthetic */ WifiApService$$ExternalSyntheticLambda8(WifiApStateHandler wifiApStateHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = wifiApStateHandler;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        ObservableSource lambda$stopWifiAp$9;
        ObservableSource lambda$handleStop$4;
        int i = this.$r8$classId;
        WifiApStateHandler wifiApStateHandler = this.f$0;
        switch (i) {
            case 0:
                lambda$stopWifiAp$9 = WifiApService.lambda$stopWifiAp$9(wifiApStateHandler, (WifiApUtils.WifiConfigApStatus) obj);
                return lambda$stopWifiAp$9;
            default:
                lambda$handleStop$4 = wifiApStateHandler.lambda$handleStop$4((Common.ErrorCode) obj);
                return lambda$handleStop$4;
        }
    }
}
