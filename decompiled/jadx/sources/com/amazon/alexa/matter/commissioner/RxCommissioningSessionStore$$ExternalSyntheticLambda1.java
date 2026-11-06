package com.amazon.alexa.matter.commissioner;

import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class RxCommissioningSessionStore$$ExternalSyntheticLambda1 implements CompletableOnSubscribe, MaybeOnSubscribe {
    public final /* synthetic */ RxCommissioningSessionStore f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ RxCommissioningSessionStore$$ExternalSyntheticLambda1(RxCommissioningSessionStore rxCommissioningSessionStore, String str) {
        this.f$0 = rxCommissioningSessionStore;
        this.f$1 = str;
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        this.f$0.lambda$remove$2(this.f$1, completableEmitter);
    }

    @Override // io.reactivex.rxjava3.core.MaybeOnSubscribe
    public void subscribe(MaybeEmitter maybeEmitter) {
        this.f$0.lambda$get$0(this.f$1, maybeEmitter);
    }
}
