package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.Accessory;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryInteractor$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryInteractor f$0;
    public final /* synthetic */ Accessory f$1;

    public /* synthetic */ AccessoryInteractor$$ExternalSyntheticLambda3(AccessoryInteractor accessoryInteractor, Accessory accessory, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryInteractor;
        this.f$1 = accessory;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$linkAccessoryClient$1(this.f$1, (Throwable) obj);
                break;
            case 1:
                this.f$0.lambda$linkAccessoryClient$4(this.f$1, (Throwable) obj);
                break;
            default:
                this.f$0.lambda$linkAccessoryClient$5(this.f$1, (Throwable) obj);
                break;
        }
    }
}
