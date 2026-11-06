package com.amazon.alexa.accessory.repositories.speech;

import com.amazon.alexa.accessory.internal.repositories.BaseProducer;
import com.amazon.alexa.accessory.repositories.speech.SpeechProducer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class MemorySpeechRepository extends BaseProducer<SpeechProducer.ActionHandler> implements SpeechRepository, SpeechProducer {
    @Override // com.amazon.alexa.accessory.repositories.speech.SpeechRepository
    public void initiateSpeech() {
        getHandler().handleInitiateSpeech();
    }
}
