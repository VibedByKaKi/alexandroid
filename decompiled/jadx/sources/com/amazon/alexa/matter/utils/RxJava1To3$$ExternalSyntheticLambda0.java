package com.amazon.alexa.matter.utils;

import com.amazon.alexa.voice.services.AlexaMobileSuggestionClient;
import io.reactivex.rxjava3.core.ObservableEmitter;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class RxJava1To3$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ObservableEmitter f$0;

    public /* synthetic */ RxJava1To3$$ExternalSyntheticLambda0(int i, ObservableEmitter observableEmitter) {
        this.$r8$classId = i;
        this.f$0 = observableEmitter;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        ObservableEmitter observableEmitter = this.f$0;
        switch (i) {
            case 0:
                observableEmitter.onNext(obj);
                break;
            case 1:
                observableEmitter.onError((Throwable) obj);
                break;
            case 2:
                AlexaMobileSuggestionClient.lambda$fetchPrompt$1(observableEmitter, (AlexaMobileSuggestionClient.PromptResponse) obj);
                break;
            default:
                AlexaMobileSuggestionClient.lambda$fetchPrompt$2(observableEmitter, (Throwable) obj);
                break;
        }
    }
}
