package com.amazon.alexa.voice.ui.onedesign.sports.scores;

import androidx.annotation.ColorRes;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SportsScoresContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void close();

        void dismiss();

        SportsScoresCard getCard();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void dismiss();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void closeClicked();

        void dismiss();

        void interacted();

        void start();

        void viewDestroyed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void setAwayTeamLogo(String str);

        void setAwayTeamNickName(CharSequence charSequence);

        void setAwayTeamPoints(CharSequence charSequence, boolean z);

        void setAwayTeamScoreComponents(List<CharSequence> list);

        void setAwayTeamShortName(CharSequence charSequence);

        void setGradientBackgroundColor(@ColorRes int i);

        void setGradientBackgroundColorAndDrawable(@ColorRes int i, int i2);

        void setHomeTeamLogo(String str);

        void setHomeTeamNickName(CharSequence charSequence);

        void setHomeTeamPoints(CharSequence charSequence, boolean z);

        void setHomeTeamScoreComponents(List<CharSequence> list);

        void setHomeTeamShortName(CharSequence charSequence);

        void setNextGameDate(CharSequence charSequence);

        void setNextGameTimeAndOpponent(CharSequence charSequence, boolean z, CharSequence charSequence2);

        void setNextGameTitle(CharSequence charSequence);

        void setScoreComponentsHeadings(List<CharSequence> list);

        void setStatusBarColor(@ColorRes int i);

        void setSubTitle(CharSequence charSequence);

        void setTitle(CharSequence charSequence);
    }
}
