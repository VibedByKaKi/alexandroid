package com.amazon.alexa.accessorykit.wificonfig;

import com.amazon.alexa.accessorykit.wificonfig.WifiConfigApController;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class WifiConfigApController$$ExternalSyntheticLambda1 implements Predicate, BiFunction {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ WifiConfigApController$$ExternalSyntheticLambda1(Object obj) {
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        WifiConfigApConnectionInfo lambda$startWifiAp$1;
        lambda$startWifiAp$1 = ((WifiConfigApController) this.f$0).lambda$startWifiAp$1((Boolean) obj, (Boolean) obj2);
        return lambda$startWifiAp$1;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean lambda$waitForStatus$15;
        lambda$waitForStatus$15 = WifiConfigApController.lambda$waitForStatus$15((WifiConfigApController.WifiConfigApStatus) this.f$0, (WifiConfigApController.WifiConfigApStatus) obj);
        return lambda$waitForStatus$15;
    }
}
