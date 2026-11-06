package com.amazon.alexa.voice.ui.onedesign.movies;

import androidx.camera.core.processing.util.GLUtils;
import com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel;
import defpackage.a$$ExternalSyntheticOutline0;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MoviesRatingText {
    private MoviesRatingText() {
        throw new IllegalStateException("No instances!");
    }

    public static CharSequence fromRating(MoviesCardModel.RatingModel ratingModel) {
        return !isValidRating(ratingModel) ? "" : a$$ExternalSyntheticOutline0.m$1(new DecimalFormat(GLUtils.VERSION_UNKNOWN).format(ratingModel.getAverage()), "/", Integer.toString((int) ratingModel.getMaximum()));
    }

    private static boolean isValidRating(MoviesCardModel.RatingModel ratingModel) {
        return ratingModel != null && ratingModel.getAverage() > 0.0d && ratingModel.getMaximum() > 0.0d && ratingModel.getAverage() <= ratingModel.getMaximum();
    }
}
