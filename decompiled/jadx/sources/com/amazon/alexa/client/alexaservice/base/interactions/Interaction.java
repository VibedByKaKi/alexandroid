package com.amazon.alexa.client.alexaservice.base.interactions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class Interaction {
    protected final InteractionIdentifier interactionIdentifier;

    public Interaction() {
        this.interactionIdentifier = InteractionIdentifier.createRandom();
    }

    public InteractionIdentifier getInteractionIdentifier() {
        return this.interactionIdentifier;
    }

    public abstract InteractionInterfaceName getInterfaceName();

    public abstract void onStop();

    public Interaction(InteractionIdentifier interactionIdentifier) {
        this.interactionIdentifier = interactionIdentifier;
    }
}
