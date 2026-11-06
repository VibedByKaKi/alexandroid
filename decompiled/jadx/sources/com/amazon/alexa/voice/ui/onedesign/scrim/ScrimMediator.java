package com.amazon.alexa.voice.ui.onedesign.scrim;

import android.util.Log;
import com.amazon.alexa.voice.ui.onedesign.scrim.ScrimContract;
import com.amazon.alexa.voice.ui.tta.TypingPrimerDisplayer;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ScrimMediator implements ScrimContract.Mediator {
    private static final String TAG = "ScrimMediator";
    private final ViewController controller;

    public ScrimMediator(ViewController viewController) {
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.scrim.ScrimContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.scrim.ScrimContract.Mediator
    public void openTTA() {
        if (this.controller.getComponent().isRegistered(TypingPrimerDisplayer.class)) {
            ((TypingPrimerDisplayer) this.controller.getComponent().get(TypingPrimerDisplayer.class)).showTypingView();
        } else {
            Log.e(TAG, "Could not open TTA -- TypingPrimerDisplayer not registered");
        }
    }
}
