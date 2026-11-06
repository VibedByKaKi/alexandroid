package com.amazon.alexa.voice.ui.onedesign.local;

import com.amazon.alexa.voice.ui.onedesign.local.LocalContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LocalPresenter implements LocalContract.Presenter {
    private final LocalContract.Interactor interactor;

    public LocalPresenter(LocalContract.Interactor interactor) {
        this.interactor = interactor;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalContract.Presenter
    public void closeClicked() {
        this.interactor.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalContract.Presenter
    public void dismiss() {
        this.interactor.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalContract.Presenter
    public void start() {
        this.interactor.showChildIfNeeded();
    }
}
