package com.amazon.alexa.voiceui.ra;

import com.amazon.alexa.api.AlexaAplCommand;
import com.amazon.alexa.api.AlexaAplCommandListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RaInteractor$$ExternalSyntheticLambda1 implements AlexaAplCommandListener {
    public final /* synthetic */ RaInteractor f$0;

    public /* synthetic */ RaInteractor$$ExternalSyntheticLambda1(RaInteractor raInteractor) {
        this.f$0 = raInteractor;
    }

    @Override // com.amazon.alexa.api.AlexaAplCommandListener
    public final void onAplCommandReceived(AlexaAplCommand alexaAplCommand) {
        this.f$0.aplCommandListener(alexaAplCommand);
    }
}
