package com.amazon.alexa.voice.ui.onedesign.movies.theater;

import com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface MovieTheaterContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void close();

        CharSequence getSubTitle();

        MoviesCard.Theater getTheater();

        CharSequence getTitle();

        void openLocation();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void openLocation(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void backClicked();

        void end();

        void interacted();

        void locationClicked();

        void start();

        void viewDestroyed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void addItem(Object obj);

        void floodBackgroundToStatusBar();

        void setSubTitle(CharSequence charSequence);

        void setTheater(CharSequence charSequence, CharSequence charSequence2);

        void setTitle(CharSequence charSequence);
    }
}
