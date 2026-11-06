package com.amazon.alexa.accessorykit.interprocess.utils;

import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccountManagerWrapper$$ExternalSyntheticLambda1 implements SingleOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccountManagerWrapper f$0;

    public /* synthetic */ AccountManagerWrapper$$ExternalSyntheticLambda1(AccountManagerWrapper accountManagerWrapper, int i) {
        this.$r8$classId = i;
        this.f$0 = accountManagerWrapper;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public final void subscribe(SingleEmitter singleEmitter) {
        int i = this.$r8$classId;
        AccountManagerWrapper accountManagerWrapper = this.f$0;
        switch (i) {
            case 0:
                accountManagerWrapper.lambda$getMarketplace$1(singleEmitter);
                break;
            case 1:
                accountManagerWrapper.lambda$obtainUser$2(singleEmitter);
                break;
            case 2:
                accountManagerWrapper.lambda$obtainUser$3(singleEmitter);
                break;
            default:
                accountManagerWrapper.lambda$isChildProfile$6(singleEmitter);
                break;
        }
    }
}
