package com.amazon.alexa.voice.ui.onedesign.hints;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.hints.HintsContract;
import com.amazon.regulator.ViewController;
import com.amazon.regulator.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class HintsMediator implements HintsContract.Mediator {
    private final ViewController controller;

    public HintsMediator(@NonNull ViewController viewController) {
        Preconditions.nonNull(viewController, "controller must be non-null.");
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.hints.HintsContract.Mediator
    public void dismiss() {
        this.controller.getRouter().popController(this.controller);
    }
}
