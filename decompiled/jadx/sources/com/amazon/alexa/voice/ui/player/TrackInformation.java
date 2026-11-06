package com.amazon.alexa.voice.ui.player;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TrackInformation implements TrackInformationModel {
    public static final Parcelable.Creator<TrackInformation> CREATOR = new Parcelable.Creator<TrackInformation>() { // from class: com.amazon.alexa.voice.ui.player.TrackInformation.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackInformation createFromParcel(Parcel parcel) {
            return new TrackInformation(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackInformation[] newArray(int i) {
            return new TrackInformation[i];
        }
    };
    private final String artImageUrl;
    private final String audioItemId;
    private final CharSequence description;
    private final CharSequence details;
    private final int maxPosition;
    private final String providerIconId;
    private final CharSequence providerName;
    private final boolean seekable;
    private final CharSequence title;
    private final CharSequence totalTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        String artImageUrl;
        String audioItemId;
        CharSequence description;
        CharSequence details;
        int maxPosition;
        String providerIconId;
        CharSequence providerName;
        boolean seekable;
        CharSequence title;
        CharSequence totalTime;

        public Builder artImageUrl(String str) {
            this.artImageUrl = str;
            return this;
        }

        public Builder audioItemId(String str) {
            this.audioItemId = str;
            return this;
        }

        public TrackInformation build() {
            return new TrackInformation(this);
        }

        public Builder description(CharSequence charSequence) {
            this.description = charSequence;
            return this;
        }

        public Builder details(CharSequence charSequence) {
            this.details = charSequence;
            return this;
        }

        public Builder maxPosition(int i) {
            this.maxPosition = i;
            return this;
        }

        public Builder providerIconId(String str) {
            this.providerIconId = str;
            return this;
        }

        public Builder providerName(CharSequence charSequence) {
            this.providerName = charSequence;
            return this;
        }

        public Builder seekable(boolean z) {
            this.seekable = z;
            return this;
        }

        public Builder title(CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }

        public Builder totalTime(CharSequence charSequence) {
            this.totalTime = charSequence;
            return this;
        }
    }

    public TrackInformation(Parcel parcel) {
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.title = (CharSequence) creator.createFromParcel(parcel);
        this.description = (CharSequence) creator.createFromParcel(parcel);
        this.details = (CharSequence) creator.createFromParcel(parcel);
        this.artImageUrl = parcel.readString();
        this.providerIconId = parcel.readString();
        this.providerName = (CharSequence) creator.createFromParcel(parcel);
        this.totalTime = (CharSequence) creator.createFromParcel(parcel);
        this.maxPosition = parcel.readInt();
        this.audioItemId = parcel.readString();
        this.seekable = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackInformation.class != obj.getClass()) {
            return false;
        }
        TrackInformation trackInformation = (TrackInformation) obj;
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = trackInformation.title;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.description;
        CharSequence charSequence4 = trackInformation.description;
        if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
            return false;
        }
        CharSequence charSequence5 = this.details;
        CharSequence charSequence6 = trackInformation.details;
        if (charSequence5 == null ? charSequence6 != null : !charSequence5.equals(charSequence6)) {
            return false;
        }
        String str = this.artImageUrl;
        String str2 = trackInformation.artImageUrl;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        String str3 = this.providerIconId;
        String str4 = trackInformation.providerIconId;
        if (str3 == null ? str4 != null : !str3.equals(str4)) {
            return false;
        }
        CharSequence charSequence7 = this.providerName;
        CharSequence charSequence8 = trackInformation.providerName;
        if (charSequence7 == null ? charSequence8 != null : !charSequence7.equals(charSequence8)) {
            return false;
        }
        CharSequence charSequence9 = this.totalTime;
        CharSequence charSequence10 = trackInformation.totalTime;
        if (charSequence9 == null ? charSequence10 != null : !charSequence9.equals(charSequence10)) {
            return false;
        }
        if (this.maxPosition != trackInformation.maxPosition) {
            return false;
        }
        String str5 = this.audioItemId;
        String str6 = trackInformation.audioItemId;
        if (str5 == null ? str6 == null : str5.equals(str6)) {
            return this.seekable == trackInformation.seekable;
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    @Nullable
    public String getArtImageUrl() {
        return this.artImageUrl;
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    @Nullable
    public String getAudioItemId() {
        return this.audioItemId;
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    public CharSequence getDescription() {
        return this.description;
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    public CharSequence getDetails() {
        return this.details;
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    public int getMaxPosition() {
        return this.maxPosition;
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    @Nullable
    public String getProviderIconId() {
        return this.providerIconId;
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    @Nullable
    public CharSequence getProviderName() {
        return this.providerName;
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    public CharSequence getTitle() {
        return this.title;
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    public CharSequence getTotalTime() {
        return this.totalTime;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int hashCode = (JfifUtil.MARKER_EOI + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.description;
        int hashCode2 = (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
        CharSequence charSequence3 = this.details;
        int hashCode3 = (hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31;
        String str = this.artImageUrl;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.providerIconId;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        CharSequence charSequence4 = this.providerName;
        int hashCode6 = (hashCode5 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31;
        CharSequence charSequence5 = this.totalTime;
        int hashCode7 = (((hashCode6 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31) + this.maxPosition) * 31;
        String str3 = this.audioItemId;
        return ((hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.seekable ? 1 : 0);
    }

    @Override // com.amazon.alexa.voice.ui.player.TrackInformationModel
    public boolean isSeekable() {
        return this.seekable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackInformation{title=");
        sb.append((Object) this.title);
        sb.append(", description=");
        sb.append((Object) this.description);
        sb.append(", details=");
        sb.append((Object) this.details);
        sb.append(", artImageUrl=");
        sb.append(this.artImageUrl);
        sb.append(", providerIconId=");
        sb.append(this.providerIconId);
        sb.append(", providerName=");
        sb.append((Object) this.providerName);
        sb.append(", totalTime=");
        sb.append((Object) this.totalTime);
        sb.append(", maxPosition=");
        sb.append(this.maxPosition);
        sb.append(", audioItemId=");
        sb.append(this.audioItemId);
        sb.append(", seekable=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.seekable, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.title, parcel, i);
        TextUtils.writeToParcel(this.description, parcel, i);
        TextUtils.writeToParcel(this.details, parcel, i);
        parcel.writeString(this.artImageUrl);
        parcel.writeString(this.providerIconId);
        TextUtils.writeToParcel(this.providerName, parcel, i);
        TextUtils.writeToParcel(this.totalTime, parcel, i);
        parcel.writeInt(this.maxPosition);
        parcel.writeString(this.audioItemId);
        parcel.writeByte(this.seekable ? (byte) 1 : (byte) 0);
    }

    public TrackInformation(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.details = builder.details;
        this.artImageUrl = builder.artImageUrl;
        this.providerIconId = builder.providerIconId;
        this.providerName = builder.providerName;
        this.totalTime = builder.totalTime;
        this.maxPosition = builder.maxPosition;
        this.audioItemId = builder.audioItemId;
        this.seekable = builder.seekable;
    }
}
