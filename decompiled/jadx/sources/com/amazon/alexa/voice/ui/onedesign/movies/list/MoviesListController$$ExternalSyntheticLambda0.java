package com.amazon.alexa.voice.ui.onedesign.movies.list;

import com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListAdapter;
import com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class MoviesListController$$ExternalSyntheticLambda0 implements MoviesListAdapter.OnMoviePosterClickListener, MoviesListAdapter.OnMovieLinkClickListener {
    public final /* synthetic */ MoviesListContract.Presenter f$0;

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListAdapter.OnMovieLinkClickListener
    public void onMovieLinkClicked(MoviesListLinkModel moviesListLinkModel) {
        this.f$0.linkClicked(moviesListLinkModel);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListAdapter.OnMoviePosterClickListener
    public void onMoviePosterClicked(MoviesListPosterModel moviesListPosterModel) {
        this.f$0.posterClicked(moviesListPosterModel);
    }
}
