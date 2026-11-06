package com.amazon.alexa.accessory.avsclient.nearmiss;

import com.amazon.alexa.accessory.capabilities.speech.SpeechSession;
import com.amazon.alexa.accessory.capabilities.speech.SpeechSettings;
import com.amazon.alexa.accessory.nearmiss.MlisClient;
import com.amazon.alexa.accessory.registration.RegistrationSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface NearMissSpeechSession extends SpeechSession {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        NearMissSpeechSession create(MlisClient mlisClient, SpeechSettings speechSettings, RegistrationSupplier registrationSupplier);
    }

    void start();
}
