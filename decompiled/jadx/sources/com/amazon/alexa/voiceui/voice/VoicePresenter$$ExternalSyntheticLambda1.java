package com.amazon.alexa.voiceui.voice;

import com.amazon.alexa.api.AlexaUserInterfaceOptions;
import com.amazon.alexa.voiceui.cards.CardData;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class VoicePresenter$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VoicePresenter f$0;

    public /* synthetic */ VoicePresenter$$ExternalSyntheticLambda1(VoicePresenter voicePresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = voicePresenter;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        VoicePresenter voicePresenter = this.f$0;
        switch (i) {
            case 0:
                voicePresenter.lambda$observeCardRendering$5((Boolean) obj);
                break;
            case 1:
                voicePresenter.lambda$new$0((CardData) obj);
                break;
            case 2:
                voicePresenter.lambda$new$2((Boolean) obj);
                break;
            default:
                voicePresenter.lambda$new$3((AlexaUserInterfaceOptions) obj);
                break;
        }
    }
}
