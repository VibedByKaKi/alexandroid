package com.amazon.alexa.voice.ui.onedesign.ftue.language;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Language implements LanguageModel {
    public static final Parcelable.Creator<Language> CREATOR = new Parcelable.Creator<Language>() { // from class: com.amazon.alexa.voice.ui.onedesign.ftue.language.Language.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Language createFromParcel(Parcel parcel) {
            return new Language(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Language[] newArray(int i) {
            return new Language[i];
        }
    };
    private final String country;
    private final CharSequence displayCountry;
    private final CharSequence displayLanguage;
    private final String language;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        String country;
        CharSequence displayCountry;
        CharSequence displayLanguage;
        String language;

        public Language build() {
            return new Language(this);
        }

        public Builder country(String str) {
            this.country = str;
            return this;
        }

        public Builder displayCountry(CharSequence charSequence) {
            this.displayCountry = charSequence;
            return this;
        }

        public Builder displayLanguage(CharSequence charSequence) {
            this.displayLanguage = charSequence;
            return this;
        }

        public Builder language(String str) {
            this.language = str;
            return this;
        }
    }

    public Language(Parcel parcel) {
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.displayLanguage = (CharSequence) creator.createFromParcel(parcel);
        this.displayCountry = (CharSequence) creator.createFromParcel(parcel);
        this.language = parcel.readString();
        this.country = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Language.class != obj.getClass()) {
            return false;
        }
        Language language = (Language) obj;
        CharSequence charSequence = this.displayLanguage;
        CharSequence charSequence2 = language.displayLanguage;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.displayCountry;
        CharSequence charSequence4 = language.displayCountry;
        if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
            return false;
        }
        String str = this.language;
        String str2 = language.language;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        String str3 = this.country;
        String str4 = language.country;
        return str3 == null ? str4 == null : str3.equals(str4);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.language.LanguageModel
    @NonNull
    public String getCountry() {
        return this.country;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.language.LanguageModel
    @NonNull
    public CharSequence getDisplayCountry() {
        return this.displayCountry;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.language.LanguageModel
    @NonNull
    public CharSequence getDisplayLanguage() {
        return this.displayLanguage;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.language.LanguageModel
    @NonNull
    public String getLanguage() {
        return this.language;
    }

    public int hashCode() {
        CharSequence charSequence = this.displayLanguage;
        int hashCode = (JfifUtil.MARKER_EOI + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.displayCountry;
        int hashCode2 = (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
        String str = this.language;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.country;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Language{displayLanguage=");
        sb.append((Object) this.displayLanguage);
        sb.append(", displayCountry=");
        sb.append((Object) this.displayCountry);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", country=");
        return ArcMode$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_OBJ, this.country, sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.displayLanguage, parcel, i);
        TextUtils.writeToParcel(this.displayCountry, parcel, i);
        parcel.writeString(this.language);
        parcel.writeString(this.country);
    }

    public Language(Builder builder) {
        this.displayLanguage = builder.displayLanguage;
        this.displayCountry = builder.displayCountry;
        this.language = builder.language;
        this.country = builder.country;
    }
}
