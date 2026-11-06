package com.amazon.alexa.voice.ui.onedesign.movies;

import com.amazon.alexa.voice.ui.onedesign.movies.MoviesContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MoviesInteractor implements MoviesContract.Interactor {
    private final MoviesContract.Mediator mediator;

    public MoviesInteractor(MoviesContract.Mediator mediator) {
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesContract.Interactor
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesContract.Interactor
    public void showChildIfNeeded() {
        this.mediator.showChildIfNeeded();
    }
}
