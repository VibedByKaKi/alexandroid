package com.amazon.alexa.voice.ui.onedesign.movies;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.annotation.UiModel;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface MoviesCardModel extends Parcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface MovieModel extends Parcelable {
        CharSequence getAbout();

        List<CharSequence> getCast();

        int getDuration();

        String getImageUrl();

        RatingModel getImdbRating();

        @NonNull
        CharSequence getLinkText();

        @NonNull
        String getLinkUrl();

        @NonNull
        CharSequence getName();

        CharSequence getRating();

        int getReleaseYear();

        @NonNull
        List<? extends TheaterModel> getTheaterList();

        String getVideoUrl();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface RatingModel extends Parcelable {
        double getAverage();

        double getMaximum();

        CharSequence getSource();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface TheaterModel extends Parcelable {
        @NonNull
        CharSequence getLocation();

        @NonNull
        CharSequence getName();

        @NonNull
        List<? extends TimeModel> getTimeList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel
    public interface TimeModel extends Parcelable {
        @NonNull
        CharSequence getTime();
    }

    @Nullable
    CharSequence getAttribution();

    @NonNull
    CharSequence getLinkText();

    @NonNull
    String getLinkUrl();

    @NonNull
    List<? extends MovieModel> getMovieList();

    @NonNull
    CharSequence getSubTitle();

    @NonNull
    CharSequence getTitle();
}
