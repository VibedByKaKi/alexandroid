package com.amazon.alexa.voice.ui.onedesign.sports.scores;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SportsScoresCard implements SportsScoresCardModel {
    public static final Parcelable.Creator<SportsScoresCard> CREATOR = new Parcelable.Creator<SportsScoresCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportsScoresCard createFromParcel(Parcel parcel) {
            return new SportsScoresCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportsScoresCard[] newArray(int i) {
            return new SportsScoresCard[i];
        }
    };
    private final SportsScoresCardModel.TeamStandingModel awayTeamStanding;
    private final SportsScoresCardModel.TeamStandingModel homeTeamStanding;
    private final SportsScoresCardModel.NextGameModel nextGame;
    private final SportsScoresCardModel.ScoreComponentsModel scores;
    private final CharSequence sportName;
    private final CharSequence subTitle;
    private final CharSequence title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        SportsScoresCardModel.TeamStandingModel awayTeamStanding;
        SportsScoresCardModel.TeamStandingModel homeTeamStanding;
        SportsScoresCardModel.NextGameModel nextGame;
        SportsScoresCardModel.ScoreComponentsModel scores;
        CharSequence sportName;
        CharSequence subTitle;
        CharSequence title;

        public Builder awayTeamStanding(@NonNull SportsScoresCardModel.TeamStandingModel teamStandingModel) {
            this.awayTeamStanding = teamStandingModel;
            return this;
        }

        public SportsScoresCard build() {
            if (this.title == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("title == null");
                return null;
            }
            if (this.subTitle == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("subTitle == null");
                return null;
            }
            if (this.homeTeamStanding == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("homeTeamStanding == null");
                return null;
            }
            if (this.awayTeamStanding == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("awayTeamStanding == null");
                return null;
            }
            if (this.scores != null) {
                return new SportsScoresCard(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("scores == null");
            return null;
        }

        public Builder homeTeamStanding(@NonNull SportsScoresCardModel.TeamStandingModel teamStandingModel) {
            this.homeTeamStanding = teamStandingModel;
            return this;
        }

        public Builder nextGame(SportsScoresCardModel.NextGameModel nextGameModel) {
            this.nextGame = nextGameModel;
            return this;
        }

        public Builder scores(@NonNull SportsScoresCardModel.ScoreComponentsModel scoreComponentsModel) {
            this.scores = scoreComponentsModel;
            return this;
        }

        public Builder sportName(CharSequence charSequence) {
            this.sportName = charSequence;
            return this;
        }

        public Builder subTitle(@NonNull CharSequence charSequence) {
            this.subTitle = charSequence;
            return this;
        }

        public Builder title(@NonNull CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public SportsScoresCard(Parcel parcel) {
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.title = (CharSequence) creator.createFromParcel(parcel);
        this.subTitle = (CharSequence) creator.createFromParcel(parcel);
        this.sportName = (CharSequence) creator.createFromParcel(parcel);
        this.homeTeamStanding = (SportsScoresCardModel.TeamStandingModel) parcel.readParcelable(SportsScoresCardModel.TeamStandingModel.class.getClassLoader());
        this.awayTeamStanding = (SportsScoresCardModel.TeamStandingModel) parcel.readParcelable(SportsScoresCardModel.TeamStandingModel.class.getClassLoader());
        this.scores = (SportsScoresCardModel.ScoreComponentsModel) parcel.readParcelable(SportsScoresCardModel.ScoreComponentsModel.class.getClassLoader());
        this.nextGame = (SportsScoresCardModel.NextGameModel) parcel.readParcelable(SportsScoresCardModel.NextGameModel.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SportsScoresCard.class != obj.getClass()) {
            return false;
        }
        SportsScoresCard sportsScoresCard = (SportsScoresCard) obj;
        if (!this.title.equals(sportsScoresCard.title) || !this.subTitle.equals(sportsScoresCard.subTitle)) {
            return false;
        }
        CharSequence charSequence = this.sportName;
        CharSequence charSequence2 = sportsScoresCard.sportName;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        if (!this.homeTeamStanding.equals(sportsScoresCard.homeTeamStanding) || !this.awayTeamStanding.equals(sportsScoresCard.awayTeamStanding) || !this.scores.equals(sportsScoresCard.scores)) {
            return false;
        }
        SportsScoresCardModel.NextGameModel nextGameModel = this.nextGame;
        SportsScoresCardModel.NextGameModel nextGameModel2 = sportsScoresCard.nextGame;
        return nextGameModel == null ? nextGameModel2 == null : nextGameModel.equals(nextGameModel2);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel
    public SportsScoresCardModel.TeamStandingModel getAwayTeamStanding() {
        return this.awayTeamStanding;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel
    public SportsScoresCardModel.TeamStandingModel getHomeTeamStanding() {
        return this.homeTeamStanding;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel
    public SportsScoresCardModel.NextGameModel getNextGame() {
        return this.nextGame;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel
    public SportsScoresCardModel.ScoreComponentsModel getScores() {
        return this.scores;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel
    public CharSequence getSportName() {
        return this.sportName;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel
    public CharSequence getSubTitle() {
        return this.subTitle;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        int m = ChatData$$ExternalSyntheticOutline0.m(this.subTitle, ChatData$$ExternalSyntheticOutline0.m(this.title, JfifUtil.MARKER_EOI, 31), 31);
        CharSequence charSequence = this.sportName;
        int hashCode = (this.scores.hashCode() + ((this.awayTeamStanding.hashCode() + ((this.homeTeamStanding.hashCode() + ((m + (charSequence != null ? charSequence.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        SportsScoresCardModel.NextGameModel nextGameModel = this.nextGame;
        return hashCode + (nextGameModel != null ? nextGameModel.hashCode() : 0);
    }

    public String toString() {
        return "SportsScoresCard{title=" + ((Object) this.title) + ", subTitle=" + ((Object) this.subTitle) + ", sportName=" + ((Object) this.sportName) + ", homeTeamStanding=" + this.homeTeamStanding + ", awayTeamStanding=" + this.awayTeamStanding + ", scores=" + this.scores + ", nextGame=" + this.nextGame + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.title, parcel, i);
        TextUtils.writeToParcel(this.subTitle, parcel, i);
        TextUtils.writeToParcel(this.sportName, parcel, i);
        parcel.writeParcelable(this.homeTeamStanding, i);
        parcel.writeParcelable(this.awayTeamStanding, i);
        parcel.writeParcelable(this.scores, i);
        parcel.writeParcelable(this.nextGame, i);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TeamStanding implements SportsScoresCardModel.TeamStandingModel {
        public static final Parcelable.Creator<TeamStanding> CREATOR = new Parcelable.Creator<TeamStanding>() { // from class: com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCard.TeamStanding.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TeamStanding createFromParcel(Parcel parcel) {
                return new TeamStanding(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TeamStanding[] newArray(int i) {
                return new TeamStanding[i];
            }
        };
        private final String imageUrl;
        private final boolean isAhead;
        private final CharSequence points;
        private final CharSequence teamName;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            String imageUrl;
            boolean isAhead;
            CharSequence points;
            CharSequence teamName;

            public TeamStanding build() {
                if (this.imageUrl == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("imageUrl == null");
                    return null;
                }
                if (this.teamName == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("teamName == null");
                    return null;
                }
                if (this.points != null) {
                    return new TeamStanding(this);
                }
                Single$$ExternalSyntheticBUOutline0.m$3("points == null");
                return null;
            }

            public Builder imageUrl(@NonNull String str) {
                this.imageUrl = str;
                return this;
            }

            public Builder isAhead(boolean z) {
                this.isAhead = z;
                return this;
            }

            public Builder points(@NonNull CharSequence charSequence) {
                this.points = charSequence;
                return this;
            }

            public Builder teamName(@NonNull CharSequence charSequence) {
                this.teamName = charSequence;
                return this;
            }
        }

        public TeamStanding(Parcel parcel) {
            this.imageUrl = parcel.readString();
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.teamName = (CharSequence) creator.createFromParcel(parcel);
            this.points = (CharSequence) creator.createFromParcel(parcel);
            this.isAhead = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TeamStanding.class != obj.getClass()) {
                return false;
            }
            TeamStanding teamStanding = (TeamStanding) obj;
            return this.imageUrl.equals(teamStanding.imageUrl) && this.teamName.equals(teamStanding.teamName) && this.points.equals(teamStanding.points) && this.isAhead == teamStanding.isAhead;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.TeamStandingModel
        public String getImageUrl() {
            return this.imageUrl;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.TeamStandingModel
        public boolean getIsAhead() {
            return this.isAhead;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.TeamStandingModel
        public CharSequence getPoints() {
            return this.points;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.TeamStandingModel
        public CharSequence getTeamName() {
            return this.teamName;
        }

        public int hashCode() {
            return ChatData$$ExternalSyntheticOutline0.m(this.points, ChatData$$ExternalSyntheticOutline0.m(this.teamName, ArcMode$$ExternalSyntheticOutline0.m(JfifUtil.MARKER_EOI, 31, this.imageUrl), 31), 31) + (this.isAhead ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TeamStanding{imageUrl=");
            sb.append(this.imageUrl);
            sb.append(", teamName=");
            sb.append((Object) this.teamName);
            sb.append(", points=");
            sb.append((Object) this.points);
            sb.append(", isAhead=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.isAhead, AbstractJsonLexerKt.END_OBJ);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.imageUrl);
            TextUtils.writeToParcel(this.teamName, parcel, i);
            TextUtils.writeToParcel(this.points, parcel, i);
            parcel.writeByte(this.isAhead ? (byte) 1 : (byte) 0);
        }

        public TeamStanding(Builder builder) {
            this.imageUrl = builder.imageUrl;
            this.teamName = builder.teamName;
            this.points = builder.points;
            this.isAhead = builder.isAhead;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NextGame implements SportsScoresCardModel.NextGameModel {
        public static final Parcelable.Creator<NextGame> CREATOR = new Parcelable.Creator<NextGame>() { // from class: com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCard.NextGame.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public NextGame createFromParcel(Parcel parcel) {
                return new NextGame(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public NextGame[] newArray(int i) {
                return new NextGame[i];
            }
        };
        private final CharSequence date;
        private final boolean hostedByHomeTeam;
        private final CharSequence opponent;
        private final CharSequence time;
        private final CharSequence title;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            CharSequence date;
            boolean hostedByHomeTeam;
            CharSequence opponent;
            CharSequence time;
            CharSequence title;

            public NextGame build() {
                if (this.title == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("title == null");
                    return null;
                }
                if (this.date == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("date == null");
                    return null;
                }
                if (this.time == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("time == null");
                    return null;
                }
                if (this.opponent != null) {
                    return new NextGame(this);
                }
                Single$$ExternalSyntheticBUOutline0.m$3("opponent == null");
                return null;
            }

            public Builder date(@NonNull CharSequence charSequence) {
                this.date = charSequence;
                return this;
            }

            public Builder hostedByHomeTeam(boolean z) {
                this.hostedByHomeTeam = z;
                return this;
            }

            public Builder opponent(@NonNull CharSequence charSequence) {
                this.opponent = charSequence;
                return this;
            }

            public Builder time(@NonNull CharSequence charSequence) {
                this.time = charSequence;
                return this;
            }

            public Builder title(@NonNull CharSequence charSequence) {
                this.title = charSequence;
                return this;
            }
        }

        public NextGame(Parcel parcel) {
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.title = (CharSequence) creator.createFromParcel(parcel);
            this.date = (CharSequence) creator.createFromParcel(parcel);
            this.time = (CharSequence) creator.createFromParcel(parcel);
            this.hostedByHomeTeam = parcel.readByte() != 0;
            this.opponent = (CharSequence) creator.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || NextGame.class != obj.getClass()) {
                return false;
            }
            NextGame nextGame = (NextGame) obj;
            return this.title.equals(nextGame.title) && this.date.equals(nextGame.date) && this.time.equals(nextGame.time) && this.hostedByHomeTeam == nextGame.hostedByHomeTeam && this.opponent.equals(nextGame.opponent);
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.NextGameModel
        public CharSequence getDate() {
            return this.date;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.NextGameModel
        public CharSequence getOpponent() {
            return this.opponent;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.NextGameModel
        public CharSequence getTime() {
            return this.time;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.NextGameModel
        public CharSequence getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.opponent.hashCode() + ((ChatData$$ExternalSyntheticOutline0.m(this.time, ChatData$$ExternalSyntheticOutline0.m(this.date, ChatData$$ExternalSyntheticOutline0.m(this.title, JfifUtil.MARKER_EOI, 31), 31), 31) + (this.hostedByHomeTeam ? 1 : 0)) * 31);
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.NextGameModel
        public boolean isHostedByHomeTeam() {
            return this.hostedByHomeTeam;
        }

        public String toString() {
            return "NextGame{title=" + ((Object) this.title) + ", date=" + ((Object) this.date) + ", time=" + ((Object) this.time) + ", hostedByHomeTeam=" + this.hostedByHomeTeam + ", opponent=" + ((Object) this.opponent) + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.title, parcel, i);
            TextUtils.writeToParcel(this.date, parcel, i);
            TextUtils.writeToParcel(this.time, parcel, i);
            parcel.writeByte(this.hostedByHomeTeam ? (byte) 1 : (byte) 0);
            TextUtils.writeToParcel(this.opponent, parcel, i);
        }

        public NextGame(Builder builder) {
            this.title = builder.title;
            this.date = builder.date;
            this.time = builder.time;
            this.hostedByHomeTeam = builder.hostedByHomeTeam;
            this.opponent = builder.opponent;
        }
    }

    public SportsScoresCard(Builder builder) {
        this.title = builder.title;
        this.subTitle = builder.subTitle;
        this.sportName = builder.sportName;
        this.homeTeamStanding = builder.homeTeamStanding;
        this.awayTeamStanding = builder.awayTeamStanding;
        this.scores = builder.scores;
        this.nextGame = builder.nextGame;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ScoreComponents implements SportsScoresCardModel.ScoreComponentsModel {
        public static final Parcelable.Creator<ScoreComponents> CREATOR = new Parcelable.Creator<ScoreComponents>() { // from class: com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCard.ScoreComponents.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ScoreComponents createFromParcel(Parcel parcel) {
                return new ScoreComponents(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ScoreComponents[] newArray(int i) {
                return new ScoreComponents[i];
            }
        };
        private final List<CharSequence> awayTeamScoreComponents;
        private final CharSequence awayTeamShortName;
        private final List<CharSequence> homeTeamScoreComponents;
        private final CharSequence homeTeamShortName;
        private final List<CharSequence> scoreComponentsHeadings;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            CharSequence awayTeamShortName;
            CharSequence homeTeamShortName;
            List<CharSequence> homeTeamScoreComponents = new ArrayList();
            List<CharSequence> awayTeamScoreComponents = new ArrayList();
            List<CharSequence> scoreComponentsHeadings = new ArrayList();

            public Builder awayTeamScoreComponents(@NonNull List<CharSequence> list) {
                this.awayTeamScoreComponents = list;
                return this;
            }

            public Builder awayTeamShortName(@NonNull CharSequence charSequence) {
                this.awayTeamShortName = charSequence;
                return this;
            }

            public ScoreComponents build() {
                if (this.homeTeamShortName == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("homeTeamShortName == null");
                    return null;
                }
                if (this.awayTeamShortName == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("awayTeamShortName == null");
                    return null;
                }
                if (this.homeTeamScoreComponents == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("homeTeamScoreComponents == null");
                    return null;
                }
                if (this.awayTeamScoreComponents == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("awayTeamScoreComponents == null");
                    return null;
                }
                if (this.scoreComponentsHeadings != null) {
                    return new ScoreComponents(this);
                }
                Single$$ExternalSyntheticBUOutline0.m$3("scoreComponentsHeadings == null");
                return null;
            }

            public Builder homeTeamScoreComponents(@NonNull List<CharSequence> list) {
                this.homeTeamScoreComponents = list;
                return this;
            }

            public Builder homeTeamShortName(@NonNull CharSequence charSequence) {
                this.homeTeamShortName = charSequence;
                return this;
            }

            public Builder scoreComponentsHeadings(@NonNull List<CharSequence> list) {
                this.scoreComponentsHeadings = list;
                return this;
            }
        }

        public ScoreComponents(Parcel parcel) {
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.homeTeamShortName = (CharSequence) creator.createFromParcel(parcel);
            this.awayTeamShortName = (CharSequence) creator.createFromParcel(parcel);
            int readInt = parcel.readInt();
            this.homeTeamScoreComponents = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                this.homeTeamScoreComponents.add((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            this.awayTeamScoreComponents = new ArrayList(readInt2);
            for (int i2 = 0; i2 < readInt2; i2++) {
                this.awayTeamScoreComponents.add((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }
            int readInt3 = parcel.readInt();
            this.scoreComponentsHeadings = new ArrayList(readInt3);
            for (int i3 = 0; i3 < readInt3; i3++) {
                this.scoreComponentsHeadings.add((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ScoreComponents.class != obj.getClass()) {
                return false;
            }
            ScoreComponents scoreComponents = (ScoreComponents) obj;
            return this.homeTeamShortName.equals(scoreComponents.homeTeamShortName) && this.awayTeamShortName.equals(scoreComponents.awayTeamShortName) && this.homeTeamScoreComponents.equals(scoreComponents.homeTeamScoreComponents) && this.awayTeamScoreComponents.equals(scoreComponents.awayTeamScoreComponents) && this.scoreComponentsHeadings.equals(scoreComponents.scoreComponentsHeadings);
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.ScoreComponentsModel
        public List<CharSequence> getAwayTeamScoreComponents() {
            return this.awayTeamScoreComponents;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.ScoreComponentsModel
        public CharSequence getAwayTeamShortName() {
            return this.awayTeamShortName;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.ScoreComponentsModel
        public List<CharSequence> getHomeTeamScoreComponents() {
            return this.homeTeamScoreComponents;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.ScoreComponentsModel
        public CharSequence getHomeTeamShortName() {
            return this.homeTeamShortName;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresCardModel.ScoreComponentsModel
        public List<CharSequence> getScoreComponentsHeadings() {
            return this.scoreComponentsHeadings;
        }

        public int hashCode() {
            return this.scoreComponentsHeadings.hashCode() + ((this.awayTeamScoreComponents.hashCode() + ((this.homeTeamScoreComponents.hashCode() + ChatData$$ExternalSyntheticOutline0.m(this.awayTeamShortName, ChatData$$ExternalSyntheticOutline0.m(this.homeTeamShortName, JfifUtil.MARKER_EOI, 31), 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ScoreComponents{homeTeamShortName=");
            sb.append((Object) this.homeTeamShortName);
            sb.append(", awayTeamShortName=");
            sb.append((Object) this.awayTeamShortName);
            sb.append(", homeTeamScoreComponents=");
            sb.append(this.homeTeamScoreComponents);
            sb.append(", awayTeamScoreComponents=");
            sb.append(this.awayTeamScoreComponents);
            sb.append(", scoreComponentsHeadings=");
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.scoreComponentsHeadings, AbstractJsonLexerKt.END_OBJ);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.homeTeamShortName, parcel, i);
            TextUtils.writeToParcel(this.awayTeamShortName, parcel, i);
            List<CharSequence> list = this.homeTeamScoreComponents;
            if (list != null) {
                parcel.writeInt(list.size());
                Iterator<CharSequence> it2 = this.homeTeamScoreComponents.iterator();
                while (it2.hasNext()) {
                    TextUtils.writeToParcel(it2.next(), parcel, i);
                }
            } else {
                parcel.writeInt(0);
            }
            List<CharSequence> list2 = this.awayTeamScoreComponents;
            if (list2 != null) {
                parcel.writeInt(list2.size());
                Iterator<CharSequence> it3 = this.awayTeamScoreComponents.iterator();
                while (it3.hasNext()) {
                    TextUtils.writeToParcel(it3.next(), parcel, i);
                }
            } else {
                parcel.writeInt(0);
            }
            List<CharSequence> list3 = this.scoreComponentsHeadings;
            if (list3 == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(list3.size());
            Iterator<CharSequence> it4 = this.scoreComponentsHeadings.iterator();
            while (it4.hasNext()) {
                TextUtils.writeToParcel(it4.next(), parcel, i);
            }
        }

        public ScoreComponents(Builder builder) {
            this.homeTeamShortName = builder.homeTeamShortName;
            this.awayTeamShortName = builder.awayTeamShortName;
            this.homeTeamScoreComponents = builder.homeTeamScoreComponents;
            this.awayTeamScoreComponents = builder.awayTeamScoreComponents;
            this.scoreComponentsHeadings = builder.scoreComponentsHeadings;
        }
    }
}
