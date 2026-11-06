package com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract;
import com.amazon.regulator.ViewController;
import com.amazon.regulator.transitions.InstantTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FtueBottomSheetMediator implements FtueBottomSheetContract.Mediator {
    private final ViewController controller;

    public FtueBottomSheetMediator(@NonNull ViewController viewController) {
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller, new InstantTransition());
    }
}
