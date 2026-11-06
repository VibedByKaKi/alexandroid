package com.amazon.alexa.voice.ui.onedesign.ftue.handsfree;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.permissions.HandsFreeSettings;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ReturningPrimerMediator extends HandsfreePrimerMediator {
    public ReturningPrimerMediator(@NonNull ViewController viewController) {
        super(viewController);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerMediator, com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Mediator
    public void close() {
        ViewController controller = getController();
        controller.getRouter().popController(controller);
        ((OnReturningPrimerDismissedListener) controller.getComponent().get(OnReturningPrimerDismissedListener.class)).onReturningPrimerDismissed();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Mediator
    public void requestPermissions() {
        ((HandsFreeSettings) getController().getComponent().get(HandsFreeSettings.class)).enableHandsfreePermissions(true);
        close();
    }
}
