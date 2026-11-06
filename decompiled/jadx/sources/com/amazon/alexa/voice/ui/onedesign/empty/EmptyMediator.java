package com.amazon.alexa.voice.ui.onedesign.empty;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract;
import com.amazon.alexa.voice.ui.onedesign.list.ListType;
import com.amazon.alexa.voice.ui.routing.Navigator;
import com.amazon.regulator.ViewController;
import com.amazon.regulator.transitions.InstantTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class EmptyMediator implements EmptyContract.Mediator {
    private final ViewController controller;

    public EmptyMediator(ViewController viewController) {
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract.Mediator
    public void dismiss() {
        this.controller.getRouter().popController(this.controller, new InstantTransition());
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract.Mediator
    public void navigateTo(String str) {
        ((Navigator) this.controller.getComponent().get(Navigator.class)).navigate(str);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract.Mediator
    public void navigateToList(@NonNull ListType listType) {
        ((Navigator) this.controller.getComponent().get(Navigator.class)).navigateToSpecialList(listType.toString());
    }
}
