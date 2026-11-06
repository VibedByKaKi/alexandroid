package com.amazon.alexa.voice.ui.onedesign.local;

import com.amazon.alexa.voice.ui.onedesign.local.LocalContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LocalInteractor implements LocalContract.Interactor {
    private final LocalContract.Mediator mediator;

    public LocalInteractor(LocalContract.Mediator mediator) {
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalContract.Interactor
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalContract.Interactor
    public void showChildIfNeeded() {
        this.mediator.showChildIfNeeded();
    }
}
