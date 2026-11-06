package com.amazon.alexa.voice.ui.onedesign.sports.update.game;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.annotation.UiModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface GameModel extends Parcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface TeamScoreModel extends Parcelable {
        String getLogoUrl();

        @NonNull
        CharSequence getName();

        int getScore();
    }

    TeamScoreModel getFirstTeamScore();

    boolean getInProgress();

    @NonNull
    CharSequence getLeagueName();

    TeamScoreModel getSecondTeamScore();

    @NonNull
    CharSequence getTemporalIndicator();
}
