package com.amazon.alexa.accessory.repositories.voicestreaming;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryVoiceStreamingRepository$$ExternalSyntheticLambda0 implements ResultCallable, ObservableOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryVoiceStreamingRepository f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MemoryVoiceStreamingRepository$$ExternalSyntheticLambda0(MemoryVoiceStreamingRepository memoryVoiceStreamingRepository, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = memoryVoiceStreamingRepository;
        this.f$1 = i;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public void call(Producer.Result result) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startVoiceStreamLease$4(this.f$1, result);
                break;
            default:
                this.f$0.lambda$stopVoiceStreamLease$5(this.f$1, result);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.lambda$requestVoiceStreamLease$3(this.f$1, observableEmitter);
    }
}
