package com.amazon.alexa.accessorykit;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryInteractor$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryInteractor f$0;

    public /* synthetic */ AccessoryInteractor$$ExternalSyntheticLambda2(AccessoryInteractor accessoryInteractor, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryInteractor;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AccessoryInteractor accessoryInteractor = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                accessoryInteractor.lambda$linkAccessoryClient$0(str);
                break;
            default:
                accessoryInteractor.lambda$linkAccessoryClient$3(str);
                break;
        }
    }
}
