package com.amazon.alexa.voice.ui.onedesign.sports.update.game;

import com.amazon.alexa.voice.ui.onedesign.sports.update.game.GameContract;
import com.amazon.alexa.voice.ui.onedesign.sports.update.game.GameModel;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GamePresenter implements GameContract.Presenter {
    private final GameModel game;
    private final Locale locale;
    private final GameContract.View view;

    public GamePresenter(GameContract.View view, GameModel gameModel, Locale locale) {
        this.view = view;
        this.game = gameModel;
        this.locale = locale;
    }

    private CharSequence makeHeading(GameModel gameModel) {
        return String.format(Locale.getDefault(), "%s | %s", gameModel.getLeagueName(), gameModel.getTemporalIndicator());
    }

    private CharSequence makeScore(int i) {
        return String.format(this.locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i));
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.update.game.GameContract.Presenter
    public void start() {
        this.view.setHeading(makeHeading(this.game));
        GameModel.TeamScoreModel firstTeamScore = this.game.getFirstTeamScore();
        this.view.setFirstTeamLogoUrl(firstTeamScore.getLogoUrl());
        this.view.setFirstTeamName(firstTeamScore.getName());
        this.view.setFirstTeamScore(makeScore(firstTeamScore.getScore()));
        GameModel.TeamScoreModel secondTeamScore = this.game.getSecondTeamScore();
        this.view.setSecondTeamLogoUrl(secondTeamScore.getLogoUrl());
        this.view.setSecondTeamName(secondTeamScore.getName());
        this.view.setSecondTeamScore(makeScore(secondTeamScore.getScore()));
        this.view.setInProgress(this.game.getInProgress());
    }
}
