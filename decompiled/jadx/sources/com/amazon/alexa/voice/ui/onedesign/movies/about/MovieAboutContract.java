package com.amazon.alexa.voice.ui.onedesign.movies.about;

import com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface MovieAboutContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void backClicked();

        void close();

        void closeClicked();

        CharSequence getDate();

        MoviesCard.Movie getMovie();

        void openLink();

        void openShowtimes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void openLinkUrl(String str);

        void openShowtimes(CharSequence charSequence, MoviesCard.Movie movie);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void backClicked();

        void close();

        void closeClicked();

        void interacted();

        void linkClicked();

        void showTimesClicked();

        void start();

        void viewDestroyed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void floodBackgroundToStatusBar();

        void setCast(CharSequence charSequence, CharSequence charSequence2);

        void setDescription(CharSequence charSequence);

        void setLinkText(CharSequence charSequence);

        void setPosterImageUrl(String str);

        void setShowtimesText(CharSequence charSequence);

        void setSubTitle(CharSequence charSequence, CharSequence charSequence2);

        void setTitle(CharSequence charSequence);
    }
}
