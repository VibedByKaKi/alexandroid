package com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.EducationPrimerContract;
import com.amazon.regulator.Component;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EducationPrimerMediator implements EducationPrimerContract.Mediator {
    private final ViewController viewController;

    public EducationPrimerMediator(@NonNull ViewController viewController) {
        this.viewController = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.EducationPrimerContract.Mediator
    public void completeStep() {
        Component component = this.viewController.getComponent();
        if (component.isRegistered(OnEducationPrimerCompletedListener.class)) {
            ((OnEducationPrimerCompletedListener) component.get(OnEducationPrimerCompletedListener.class)).onEducationPrimerCompleted();
        }
    }
}
