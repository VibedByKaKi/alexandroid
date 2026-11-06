package com.amazon.alexa.location;

import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LocationManager$$ExternalSyntheticLambda3 implements Action1, BiFunction, SingleOnSubscribe {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ LocationManager$$ExternalSyntheticLambda3(Object obj) {
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Map lambda$syncToOS$13;
        lambda$syncToOS$13 = LocationManager.lambda$syncToOS$13((Map) this.f$0, (List) obj, (List) obj2);
        return lambda$syncToOS$13;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        ((AtomicBoolean) this.f$0).set(true);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        ((LocationProvider) this.f$0).lambda$getMostRecentLocation$1(singleEmitter);
    }
}
