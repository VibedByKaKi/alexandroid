package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.internal.util.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$$ExternalSyntheticLambda8 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultAccessoryExplorer$$ExternalSyntheticLambda8(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.$r8$classId) {
            case 0:
                DefaultAccessoryExplorer.lambda$observeStandbyAccessories$3(th);
                break;
            case 1:
                Logger.e("Accessory scanner failed to filter out known accessories", th);
                break;
            case 2:
                DefaultAccessoryExplorer.lambda$observeStandbyAccessories$5(th);
                break;
            default:
                DefaultAccessoryExplorer.lambda$startObservingLeDevices$20(th);
                break;
        }
    }
}
