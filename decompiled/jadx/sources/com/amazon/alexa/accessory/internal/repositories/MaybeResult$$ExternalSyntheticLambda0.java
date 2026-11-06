package com.amazon.alexa.accessory.internal.repositories;

import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MaybeResult$$ExternalSyntheticLambda0 implements CompletableOnSubscribe, MaybeOnSubscribe, SingleOnSubscribe {
    public final /* synthetic */ ResultCallable f$0;

    public /* synthetic */ MaybeResult$$ExternalSyntheticLambda0(ResultCallable resultCallable) {
        this.f$0 = resultCallable;
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        CompletableResult.lambda$create$0(this.f$0, completableEmitter);
    }

    @Override // io.reactivex.rxjava3.core.MaybeOnSubscribe
    public void subscribe(MaybeEmitter maybeEmitter) {
        MaybeResult.lambda$create$0(this.f$0, maybeEmitter);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        SingleResult.lambda$create$0(this.f$0, singleEmitter);
    }
}
