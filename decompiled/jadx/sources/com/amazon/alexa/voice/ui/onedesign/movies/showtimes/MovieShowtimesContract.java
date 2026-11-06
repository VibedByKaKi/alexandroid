package com.amazon.alexa.voice.ui.onedesign.movies.showtimes;

import com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface MovieShowtimesContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void close();

        CharSequence getDate();

        MoviesCard.Movie getMovie();

        void openLink();

        void openTheater(MoviesCard.Theater theater);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void openLinkUrl(String str);

        void openTheater(CharSequence charSequence, CharSequence charSequence2, MoviesCard.Theater theater);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void backClicked();

        void end();

        void interacted();

        void linkClicked();

        void start();

        void theaterClicked(MovieShowtimesTheaterModel movieShowtimesTheaterModel);

        void viewDestroyed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void floodBackgroundToStatusBar();

        void setContent(List<? extends MovieShowtimesTheaterModel> list);

        void setSubTitle(CharSequence charSequence);

        void setTitle(CharSequence charSequence);
    }
}
