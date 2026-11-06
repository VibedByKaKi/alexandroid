package com.amazon.alexa.client.alexaservice.base.interactions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class AudioInteraction extends Interaction {
    public AudioInteraction() {
    }

    public abstract void onBackground();

    public abstract void onForeground();

    public abstract void onPause();

    public boolean survivesAudioFocusLoss() {
        return false;
    }

    public AudioInteraction(InteractionIdentifier interactionIdentifier) {
        super(interactionIdentifier);
    }

    public void onScheduled(AudioAttributesPair audioAttributesPair) {
    }
}
