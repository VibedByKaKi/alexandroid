package com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer;

import com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer.BottomSheetContainerContract;
import com.amazon.regulator.Router;
import com.amazon.regulator.ViewController;
import com.amazon.regulator.transitions.InstantTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BottomSheetContainerMediator implements BottomSheetContainerContract.Mediator {
    private static final String TAG = "BottomSheetContainerMediator";
    private final ViewController controller;

    public BottomSheetContainerMediator(ViewController viewController) {
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer.BottomSheetContainerContract.Mediator
    public void cleanup() {
        Router childRouter = this.controller.getChildRouter(BottomSheetContainerController.CARD_ROUTER);
        childRouter.popCurrentController();
        childRouter.destroy();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer.BottomSheetContainerContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller, new InstantTransition());
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer.BottomSheetContainerContract.Mediator
    public boolean onBackPressed() {
        return this.controller.getRouter().handleBack();
    }
}
