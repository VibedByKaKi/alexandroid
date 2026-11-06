package com.amazon.alexa.voice.ui.onedesign.movies;

import com.amazon.alexa.voice.ui.onedesign.movies.MoviesContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MoviesPresenter implements MoviesContract.Presenter {
    private final MoviesContract.Interactor interactor;

    public MoviesPresenter(MoviesContract.Interactor interactor) {
        this.interactor = interactor;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesContract.Presenter
    public void dismiss() {
        this.interactor.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesContract.Presenter
    public void start() {
        this.interactor.showChildIfNeeded();
    }
}
