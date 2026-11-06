package com.amazon.alexa.voice.ui.onedesign.standard;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.standard.StandardContract;
import com.amazon.alexa.voice.ui.onedesign.util.IntentUtils;
import com.amazon.regulator.ViewController;
import com.amazon.regulator.transitions.InstantTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class StandardMediator implements StandardContract.Mediator {
    private final ViewController controller;

    public StandardMediator(ViewController viewController) {
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardContract.Mediator
    public void dismiss() {
        this.controller.getRouter().popController(this.controller, new InstantTransition());
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardContract.Mediator
    public void openLinkUrl(@NonNull CharSequence charSequence) {
        IntentUtils.openLinkUrl(this.controller, charSequence.toString());
    }
}
