package com.amazon.alexa.client.alexaservice;

import com.amazon.alexa.client.alexaservice.vad.dialog.VADDialogInitiator;
import com.amazon.alexa.client.alexaservice.vad.naturalturn.SecondaryVadTurnResetter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class VoiceActivityDetectionAuthority$$ExternalSyntheticLambda0 implements VADDialogInitiator.ErrorCallback, SecondaryVadTurnResetter {
    public final /* synthetic */ VoiceActivityDetectionAuthority f$0;

    public /* synthetic */ VoiceActivityDetectionAuthority$$ExternalSyntheticLambda0(VoiceActivityDetectionAuthority voiceActivityDetectionAuthority) {
        this.f$0 = voiceActivityDetectionAuthority;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.dialog.VADDialogInitiator.ErrorCallback
    public void onVADError(String str) {
        this.f$0.onProcessorError(str);
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.naturalturn.SecondaryVadTurnResetter
    public void resetForNextTurn() {
        this.f$0.resetForNextTurn();
    }
}
