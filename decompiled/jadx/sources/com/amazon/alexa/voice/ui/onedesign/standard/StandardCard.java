package com.amazon.alexa.voice.ui.onedesign.standard;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class StandardCard implements StandardCardModel {
    public static final Parcelable.Creator<StandardCard> CREATOR = new Parcelable.Creator<StandardCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.standard.StandardCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StandardCard createFromParcel(Parcel parcel) {
            return new StandardCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StandardCard[] newArray(int i) {
            return new StandardCard[i];
        }
    };
    private final CharSequence cardType;
    private final CharSequence content;
    private final CharSequence contentImageAttribution;
    private final CharSequence contentImageUrl;
    private final List<CharSequence> domains;
    private final CharSequence linkText;
    private final CharSequence linkUrl;
    private final CharSequence subTitle;
    private final CharSequence title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        CharSequence cardType;
        CharSequence content;
        CharSequence contentImageAttribution;
        CharSequence contentImageUrl;
        List<CharSequence> domains;
        CharSequence linkText;
        CharSequence linkUrl;
        CharSequence subTitle;
        CharSequence title;

        public StandardCard build() {
            return new StandardCard(this);
        }

        public Builder cardType(CharSequence charSequence) {
            this.cardType = charSequence;
            return this;
        }

        public Builder content(CharSequence charSequence) {
            this.content = charSequence;
            return this;
        }

        public Builder contentImageAttribution(CharSequence charSequence) {
            this.contentImageAttribution = charSequence;
            return this;
        }

        public Builder contentImageUrl(CharSequence charSequence) {
            this.contentImageUrl = charSequence;
            return this;
        }

        public Builder domains(List<CharSequence> list) {
            this.domains = list;
            return this;
        }

        public Builder linkText(CharSequence charSequence) {
            this.linkText = charSequence;
            return this;
        }

        public Builder linkUrl(CharSequence charSequence) {
            this.linkUrl = charSequence;
            return this;
        }

        public Builder subTitle(CharSequence charSequence) {
            this.subTitle = charSequence;
            return this;
        }

        public Builder title(CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public StandardCard(Parcel parcel) {
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.title = (CharSequence) creator.createFromParcel(parcel);
        this.subTitle = (CharSequence) creator.createFromParcel(parcel);
        this.content = (CharSequence) creator.createFromParcel(parcel);
        this.contentImageUrl = (CharSequence) creator.createFromParcel(parcel);
        this.contentImageAttribution = (CharSequence) creator.createFromParcel(parcel);
        this.linkUrl = (CharSequence) creator.createFromParcel(parcel);
        this.linkText = (CharSequence) creator.createFromParcel(parcel);
        int readInt = parcel.readInt();
        this.domains = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.domains.add((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }
        this.cardType = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StandardCard.class != obj.getClass()) {
            return false;
        }
        StandardCard standardCard = (StandardCard) obj;
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = standardCard.title;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.subTitle;
        CharSequence charSequence4 = standardCard.subTitle;
        if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
            return false;
        }
        CharSequence charSequence5 = this.content;
        CharSequence charSequence6 = standardCard.content;
        if (charSequence5 == null ? charSequence6 != null : !charSequence5.equals(charSequence6)) {
            return false;
        }
        CharSequence charSequence7 = this.contentImageUrl;
        CharSequence charSequence8 = standardCard.contentImageUrl;
        if (charSequence7 == null ? charSequence8 != null : !charSequence7.equals(charSequence8)) {
            return false;
        }
        CharSequence charSequence9 = this.contentImageAttribution;
        CharSequence charSequence10 = standardCard.contentImageAttribution;
        if (charSequence9 == null ? charSequence10 != null : !charSequence9.equals(charSequence10)) {
            return false;
        }
        CharSequence charSequence11 = this.linkUrl;
        CharSequence charSequence12 = standardCard.linkUrl;
        if (charSequence11 == null ? charSequence12 != null : !charSequence11.equals(charSequence12)) {
            return false;
        }
        CharSequence charSequence13 = this.linkText;
        CharSequence charSequence14 = standardCard.linkText;
        if (charSequence13 == null ? charSequence14 != null : !charSequence13.equals(charSequence14)) {
            return false;
        }
        List<CharSequence> list = this.domains;
        List<CharSequence> list2 = standardCard.domains;
        if (list == null ? list2 != null : !list.equals(list2)) {
            return false;
        }
        CharSequence charSequence15 = this.cardType;
        CharSequence charSequence16 = standardCard.cardType;
        return charSequence15 == null ? charSequence16 == null : charSequence15.equals(charSequence16);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardCardModel
    public CharSequence getCardType() {
        return this.cardType;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardCardModel
    public CharSequence getContent() {
        return this.content;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardCardModel
    public CharSequence getContentImageAttribution() {
        return this.contentImageAttribution;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardCardModel
    public CharSequence getContentImageUrl() {
        return this.contentImageUrl;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardCardModel
    public List<CharSequence> getDomains() {
        return this.domains;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardCardModel
    public CharSequence getLinkText() {
        return this.linkText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardCardModel
    public CharSequence getLinkUrl() {
        return this.linkUrl;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardCardModel
    public CharSequence getSubTitle() {
        return this.subTitle;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.standard.StandardCardModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int hashCode = (JfifUtil.MARKER_EOI + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.subTitle;
        int hashCode2 = (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
        CharSequence charSequence3 = this.content;
        int hashCode3 = (hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31;
        CharSequence charSequence4 = this.contentImageUrl;
        int hashCode4 = (hashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31;
        CharSequence charSequence5 = this.contentImageAttribution;
        int hashCode5 = (hashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31;
        CharSequence charSequence6 = this.linkUrl;
        int hashCode6 = (hashCode5 + (charSequence6 != null ? charSequence6.hashCode() : 0)) * 31;
        CharSequence charSequence7 = this.linkText;
        int hashCode7 = (hashCode6 + (charSequence7 != null ? charSequence7.hashCode() : 0)) * 31;
        List<CharSequence> list = this.domains;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        CharSequence charSequence8 = this.cardType;
        return hashCode8 + (charSequence8 != null ? charSequence8.hashCode() : 0);
    }

    public String toString() {
        return "StandardCard{title=" + ((Object) this.title) + ", subTitle=" + ((Object) this.subTitle) + ", content=" + ((Object) this.content) + ", contentImageUrl=" + ((Object) this.contentImageUrl) + ", contentImageAttribution=" + ((Object) this.contentImageAttribution) + ", linkUrl=" + ((Object) this.linkUrl) + ", linkText=" + ((Object) this.linkText) + ", domains=" + this.domains + ", cardType=" + ((Object) this.cardType) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.title, parcel, i);
        TextUtils.writeToParcel(this.subTitle, parcel, i);
        TextUtils.writeToParcel(this.content, parcel, i);
        TextUtils.writeToParcel(this.contentImageUrl, parcel, i);
        TextUtils.writeToParcel(this.contentImageAttribution, parcel, i);
        TextUtils.writeToParcel(this.linkUrl, parcel, i);
        TextUtils.writeToParcel(this.linkText, parcel, i);
        List<CharSequence> list = this.domains;
        if (list != null) {
            parcel.writeInt(list.size());
            Iterator<CharSequence> it2 = this.domains.iterator();
            while (it2.hasNext()) {
                TextUtils.writeToParcel(it2.next(), parcel, i);
            }
        } else {
            parcel.writeInt(0);
        }
        TextUtils.writeToParcel(this.cardType, parcel, i);
    }

    public StandardCard(Builder builder) {
        this.title = builder.title;
        this.subTitle = builder.subTitle;
        this.content = builder.content;
        this.contentImageUrl = builder.contentImageUrl;
        this.contentImageAttribution = builder.contentImageAttribution;
        this.linkUrl = builder.linkUrl;
        this.linkText = builder.linkText;
        this.domains = builder.domains;
        this.cardType = builder.cardType;
    }
}
