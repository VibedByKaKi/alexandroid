package com.amazon.alexa.voice.ui.onedesign.movies.list;

import com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard;
import com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MoviesListInteractor implements MoviesListContract.Interactor {
    private final MoviesCard card;
    private final MoviesListContract.Mediator mediator;

    public MoviesListInteractor(MoviesCard moviesCard, MoviesListContract.Mediator mediator) {
        this.card = moviesCard;
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListContract.Interactor
    public MoviesCard getCard() {
        return this.card;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListContract.Interactor
    public void openLink(String str) {
        this.mediator.openLinkUrl(str);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListContract.Interactor
    public void openMovieShowtimes(MoviesCard.Movie movie) {
        this.mediator.openMovie(this.card.getSubTitle(), movie);
    }
}
