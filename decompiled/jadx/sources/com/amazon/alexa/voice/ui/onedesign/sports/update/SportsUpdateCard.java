package com.amazon.alexa.voice.ui.onedesign.sports.update;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.sports.update.game.Game;
import com.amazon.alexa.voice.ui.onedesign.sports.update.game.GameModel;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SportsUpdateCard implements SportsUpdateCardModel {
    public static final Parcelable.Creator<SportsUpdateCard> CREATOR = new Parcelable.Creator<SportsUpdateCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.sports.update.SportsUpdateCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportsUpdateCard createFromParcel(Parcel parcel) {
            return new SportsUpdateCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportsUpdateCard[] newArray(int i) {
            return new SportsUpdateCard[i];
        }
    };
    private final List<? extends GameModel> gameList;
    private final CharSequence title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        List<? extends GameModel> gameList = new ArrayList();
        CharSequence title;

        public SportsUpdateCard build() {
            if (this.title == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("title == null");
                return null;
            }
            if (this.gameList != null) {
                return new SportsUpdateCard(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("gameList == null");
            return null;
        }

        public Builder gameList(@NonNull List<? extends GameModel> list) {
            this.gameList = list;
            return this;
        }

        public Builder title(@NonNull CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public SportsUpdateCard(Parcel parcel) {
        this.title = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.gameList = parcel.createTypedArrayList(Game.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SportsUpdateCard.class != obj.getClass()) {
            return false;
        }
        SportsUpdateCard sportsUpdateCard = (SportsUpdateCard) obj;
        return this.title.equals(sportsUpdateCard.title) && this.gameList.equals(sportsUpdateCard.gameList);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.update.SportsUpdateCardModel
    public List<? extends GameModel> getGameList() {
        return this.gameList;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.sports.update.SportsUpdateCardModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.gameList.hashCode() + ChatData$$ExternalSyntheticOutline0.m(this.title, JfifUtil.MARKER_EOI, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SportsUpdateCard{title=");
        sb.append((Object) this.title);
        sb.append(", gameList=");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.gameList, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.title, parcel, i);
        parcel.writeTypedList(this.gameList);
    }

    public SportsUpdateCard(Builder builder) {
        this.title = builder.title;
        this.gameList = builder.gameList;
    }
}
