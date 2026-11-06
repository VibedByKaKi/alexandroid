package com.amazon.alexa.voice.ui.onedesign.movies.list;

import androidx.annotation.DrawableRes;
import com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface MoviesListContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void close();

        MoviesCard getCard();

        void openLink(String str);

        void openMovieShowtimes(MoviesCard.Movie movie);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void openLinkUrl(String str);

        void openMovie(CharSequence charSequence, MoviesCard.Movie movie);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void closeClicked();

        void end();

        void interacted();

        void linkClicked(MoviesListLinkModel moviesListLinkModel);

        void posterClicked(MoviesListPosterModel moviesListPosterModel);

        void start();

        void viewDestroyed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void add(Object obj);

        void floodBackgroundToStatusBar();

        void setSubTitle(CharSequence charSequence);

        void setTitle(CharSequence charSequence);

        void setTitleAttributionImage(@DrawableRes int i);
    }
}
