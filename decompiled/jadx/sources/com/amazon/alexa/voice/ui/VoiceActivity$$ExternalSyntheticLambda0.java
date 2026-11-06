package com.amazon.alexa.voice.ui;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class VoiceActivity$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VoiceActivity f$0;

    public /* synthetic */ VoiceActivity$$ExternalSyntheticLambda0(VoiceActivity voiceActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = voiceActivity;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$doOnStart$4((Boolean) obj);
                break;
            case 1:
                this.f$0.lambda$doOnStart$5((Throwable) obj);
                break;
            case 2:
                this.f$0.lambda$startVoiceRequest$3((Boolean) obj);
                break;
            default:
                this.f$0.doOnStart(((Boolean) obj).booleanValue());
                break;
        }
    }
}
