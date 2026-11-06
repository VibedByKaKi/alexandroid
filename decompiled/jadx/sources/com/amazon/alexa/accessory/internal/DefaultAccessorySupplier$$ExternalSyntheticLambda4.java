package com.amazon.alexa.accessory.internal;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryLinkListener;
import com.amazon.alexa.accessorykit.cloudpairing.DefaultAutoSetupInteractor;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessorySupplier$$ExternalSyntheticLambda4 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Accessory f$0;
    public final /* synthetic */ AccessoryLinkListener f$1;

    public /* synthetic */ DefaultAccessorySupplier$$ExternalSyntheticLambda4(Accessory accessory, AccessoryLinkListener accessoryLinkListener, int i) {
        this.$r8$classId = i;
        this.f$0 = accessory;
        this.f$1 = accessoryLinkListener;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DefaultAccessorySupplier.lambda$unlink$1(this.f$0, this.f$1);
                break;
            case 1:
                DefaultAccessorySupplier.lambda$link$4(this.f$0, this.f$1);
                break;
            default:
                DefaultAutoSetupInteractor.lambda$link$6(this.f$0, this.f$1);
                break;
        }
    }
}
