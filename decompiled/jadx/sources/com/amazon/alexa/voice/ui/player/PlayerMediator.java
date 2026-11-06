package com.amazon.alexa.voice.ui.player;

import com.amazon.alexa.voice.ui.player.PlayerContract;
import com.amazon.regulator.ViewController;
import com.amazon.regulator.transitions.InstantTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class PlayerMediator implements PlayerContract.Mediator {
    private final ViewController controller;

    public PlayerMediator(ViewController viewController) {
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller);
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerContract.Mediator
    public void dismiss() {
        this.controller.getRouter().popController(this.controller, new InstantTransition());
    }
}
