package com.amazon.alexa.accessory.internal;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.notificationpublisher.AccessoryNotifier;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessorySupplier$$ExternalSyntheticLambda8 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Accessory f$0;

    public /* synthetic */ DefaultAccessorySupplier$$ExternalSyntheticLambda8(Accessory accessory, int i) {
        this.$r8$classId = i;
        this.f$0 = accessory;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Accessory accessory = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                DefaultAccessorySupplier.lambda$createStandbyRunnable$12(accessory, th);
                break;
            default:
                AccessoryNotifier.lambda$onMessageNotification$1(accessory, th);
                break;
        }
    }
}
