package com.amazon.alexa.accessorykit.interprocess;

import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class InterprocessUserSupplier$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InterprocessUserSupplier f$0;

    public /* synthetic */ InterprocessUserSupplier$$ExternalSyntheticLambda0(InterprocessUserSupplier interprocessUserSupplier, int i) {
        this.$r8$classId = i;
        this.f$0 = interprocessUserSupplier;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        InterprocessUserSupplier interprocessUserSupplier = this.f$0;
        switch (i) {
            case 0:
                interprocessUserSupplier.lambda$getUser$4();
                break;
            default:
                interprocessUserSupplier.lambda$userChanged$1();
                break;
        }
    }
}
