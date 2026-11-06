package com.amazon.alexa.voice.ui.onedesign.sports.scores;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.annotation.UiModel;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface SportsScoresCardModel extends Parcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface NextGameModel extends Parcelable {
        @NonNull
        CharSequence getDate();

        @NonNull
        CharSequence getOpponent();

        @NonNull
        CharSequence getTime();

        @NonNull
        CharSequence getTitle();

        boolean isHostedByHomeTeam();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface ScoreComponentsModel extends Parcelable {
        @NonNull
        List<CharSequence> getAwayTeamScoreComponents();

        @NonNull
        CharSequence getAwayTeamShortName();

        @NonNull
        List<CharSequence> getHomeTeamScoreComponents();

        @NonNull
        CharSequence getHomeTeamShortName();

        @NonNull
        List<CharSequence> getScoreComponentsHeadings();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface TeamStandingModel extends Parcelable {
        @NonNull
        String getImageUrl();

        boolean getIsAhead();

        @NonNull
        CharSequence getPoints();

        @NonNull
        CharSequence getTeamName();
    }

    @NonNull
    TeamStandingModel getAwayTeamStanding();

    @NonNull
    TeamStandingModel getHomeTeamStanding();

    NextGameModel getNextGame();

    @NonNull
    ScoreComponentsModel getScores();

    CharSequence getSportName();

    @NonNull
    CharSequence getSubTitle();

    @NonNull
    CharSequence getTitle();
}
