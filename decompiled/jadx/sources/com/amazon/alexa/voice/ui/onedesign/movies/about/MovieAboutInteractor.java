package com.amazon.alexa.voice.ui.onedesign.movies.about;

import com.amazon.alexa.voice.ui.onedesign.movies.MovieCloseActionDelegate;
import com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard;
import com.amazon.alexa.voice.ui.onedesign.movies.about.MovieAboutContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MovieAboutInteractor implements MovieAboutContract.Interactor {
    private final CharSequence date;
    private final MovieCloseActionDelegate delegate;
    private final MovieAboutContract.Mediator mediator;
    private final MoviesCard.Movie movie;

    public MovieAboutInteractor(MoviesCard.Movie movie, CharSequence charSequence, MovieAboutContract.Mediator mediator, MovieCloseActionDelegate movieCloseActionDelegate) {
        this.movie = movie;
        this.date = charSequence;
        this.mediator = mediator;
        this.delegate = movieCloseActionDelegate;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.about.MovieAboutContract.Interactor
    public void backClicked() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.about.MovieAboutContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.about.MovieAboutContract.Interactor
    public void closeClicked() {
        this.delegate.closeClicked();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.about.MovieAboutContract.Interactor
    public CharSequence getDate() {
        return this.date;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.about.MovieAboutContract.Interactor
    public MoviesCard.Movie getMovie() {
        return this.movie;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.about.MovieAboutContract.Interactor
    public void openLink() {
        this.mediator.openLinkUrl(this.movie.getLinkUrl());
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.about.MovieAboutContract.Interactor
    public void openShowtimes() {
        this.mediator.openShowtimes(this.date, this.movie);
    }
}
