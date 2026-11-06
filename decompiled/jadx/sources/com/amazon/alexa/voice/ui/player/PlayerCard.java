package com.amazon.alexa.voice.ui.player;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class PlayerCard implements PlayerCardModel {
    public static final Parcelable.Creator<PlayerCard> CREATOR = new Parcelable.Creator<PlayerCard>() { // from class: com.amazon.alexa.voice.ui.player.PlayerCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlayerCard createFromParcel(Parcel parcel) {
            return new PlayerCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlayerCard[] newArray(int i) {
            return new PlayerCard[i];
        }
    };
    private final String artImageUrl;
    private final String audioItemId;
    private final String backgroundImageUrl;
    private final CharSequence description;
    private final CharSequence details;
    private final String playbackSource;
    private final boolean progressVisible;
    private final String providerLogoId;
    private final String providerName;
    private final CharSequence title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        String artImageUrl;
        String audioItemId;
        String backgroundImageUrl;
        CharSequence description;
        CharSequence details;
        String playbackSource;
        boolean progressVisible;
        String providerLogoId;
        String providerName;
        CharSequence title;

        public Builder artImageUrl(String str) {
            this.artImageUrl = str;
            return this;
        }

        public Builder audioItemId(String str) {
            this.audioItemId = str;
            return this;
        }

        public Builder backgroundImageUrl(String str) {
            this.backgroundImageUrl = str;
            return this;
        }

        public PlayerCard build() {
            return new PlayerCard(this);
        }

        public Builder description(CharSequence charSequence) {
            this.description = charSequence;
            return this;
        }

        public Builder details(CharSequence charSequence) {
            this.details = charSequence;
            return this;
        }

        public Builder playbackSource(String str) {
            this.playbackSource = str;
            return this;
        }

        public Builder progressVisible(boolean z) {
            this.progressVisible = z;
            return this;
        }

        public Builder providerLogoId(String str) {
            this.providerLogoId = str;
            return this;
        }

        public Builder providerName(String str) {
            this.providerName = str;
            return this;
        }

        public Builder title(CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public PlayerCard(Parcel parcel) {
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.title = (CharSequence) creator.createFromParcel(parcel);
        this.description = (CharSequence) creator.createFromParcel(parcel);
        this.details = (CharSequence) creator.createFromParcel(parcel);
        this.backgroundImageUrl = parcel.readString();
        this.artImageUrl = parcel.readString();
        this.providerLogoId = parcel.readString();
        this.providerName = parcel.readString();
        this.audioItemId = parcel.readString();
        this.progressVisible = parcel.readByte() != 0;
        this.playbackSource = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlayerCard.class != obj.getClass()) {
            return false;
        }
        PlayerCard playerCard = (PlayerCard) obj;
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = playerCard.title;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.description;
        CharSequence charSequence4 = playerCard.description;
        if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
            return false;
        }
        CharSequence charSequence5 = this.details;
        CharSequence charSequence6 = playerCard.details;
        if (charSequence5 == null ? charSequence6 != null : !charSequence5.equals(charSequence6)) {
            return false;
        }
        String str = this.backgroundImageUrl;
        String str2 = playerCard.backgroundImageUrl;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        String str3 = this.artImageUrl;
        String str4 = playerCard.artImageUrl;
        if (str3 == null ? str4 != null : !str3.equals(str4)) {
            return false;
        }
        String str5 = this.providerLogoId;
        String str6 = playerCard.providerLogoId;
        if (str5 == null ? str6 != null : !str5.equals(str6)) {
            return false;
        }
        String str7 = this.providerName;
        String str8 = playerCard.providerName;
        if (str7 == null ? str8 != null : !str7.equals(str8)) {
            return false;
        }
        String str9 = this.audioItemId;
        String str10 = playerCard.audioItemId;
        if (str9 == null ? str10 != null : !str9.equals(str10)) {
            return false;
        }
        if (this.progressVisible != playerCard.progressVisible) {
            return false;
        }
        String str11 = this.playbackSource;
        String str12 = playerCard.playbackSource;
        return str11 == null ? str12 == null : str11.equals(str12);
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public String getArtImageUrl() {
        return this.artImageUrl;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public String getAudioItemId() {
        return this.audioItemId;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public CharSequence getDescription() {
        return this.description;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public CharSequence getDetails() {
        return this.details;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public String getPlaybackSource() {
        return this.playbackSource;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public String getProviderLogoId() {
        return this.providerLogoId;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public String getProviderName() {
        return this.providerName;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int hashCode = (JfifUtil.MARKER_EOI + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.description;
        int hashCode2 = (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
        CharSequence charSequence3 = this.details;
        int hashCode3 = (hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31;
        String str = this.backgroundImageUrl;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.artImageUrl;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.providerLogoId;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.providerName;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.audioItemId;
        int hashCode8 = (((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.progressVisible ? 1 : 0)) * 31;
        String str6 = this.playbackSource;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.amazon.alexa.voice.ui.player.PlayerCardModel
    public boolean isProgressVisible() {
        return this.progressVisible;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerCard{title=");
        sb.append((Object) this.title);
        sb.append(", description=");
        sb.append((Object) this.description);
        sb.append(", details=");
        sb.append((Object) this.details);
        sb.append(", backgroundImageUrl=");
        sb.append(this.backgroundImageUrl);
        sb.append(", artImageUrl=");
        sb.append(this.artImageUrl);
        sb.append(", providerLogoId=");
        sb.append(this.providerLogoId);
        sb.append(", providerName=");
        sb.append(this.providerName);
        sb.append(", audioItemId=");
        sb.append(this.audioItemId);
        sb.append(", progressVisible=");
        sb.append(this.progressVisible);
        sb.append(", playbackSource=");
        return ArcMode$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_OBJ, this.playbackSource, sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.title, parcel, i);
        TextUtils.writeToParcel(this.description, parcel, i);
        TextUtils.writeToParcel(this.details, parcel, i);
        parcel.writeString(this.backgroundImageUrl);
        parcel.writeString(this.artImageUrl);
        parcel.writeString(this.providerLogoId);
        parcel.writeString(this.providerName);
        parcel.writeString(this.audioItemId);
        parcel.writeByte(this.progressVisible ? (byte) 1 : (byte) 0);
        parcel.writeString(this.playbackSource);
    }

    public PlayerCard(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.details = builder.details;
        this.backgroundImageUrl = builder.backgroundImageUrl;
        this.artImageUrl = builder.artImageUrl;
        this.providerLogoId = builder.providerLogoId;
        this.providerName = builder.providerName;
        this.audioItemId = builder.audioItemId;
        this.progressVisible = builder.progressVisible;
        this.playbackSource = builder.playbackSource;
    }
}
