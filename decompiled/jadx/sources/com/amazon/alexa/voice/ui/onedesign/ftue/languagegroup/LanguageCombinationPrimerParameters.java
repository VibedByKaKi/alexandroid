package com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LanguageCombinationPrimerParameters implements LanguageCombinationPrimerParametersModel {
    private final ArrayList<LanguageGroup> availableLanguages;
    private final LanguageGroup currentLanguage;
    private final ArrayList<LanguageGroup> recommendedLanguages;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        ArrayList<LanguageGroup> availableLanguages;
        LanguageGroup currentLanguage;
        ArrayList<LanguageGroup> recommendedLanguages;

        public Builder availableLanguages(ArrayList<LanguageGroup> arrayList) {
            this.availableLanguages = arrayList;
            return this;
        }

        public LanguageCombinationPrimerParameters build() {
            return new LanguageCombinationPrimerParameters(this);
        }

        public Builder currentLanguage(LanguageGroup languageGroup) {
            this.currentLanguage = languageGroup;
            return this;
        }

        public Builder recommendedLanguages(ArrayList<LanguageGroup> arrayList) {
            this.recommendedLanguages = arrayList;
            return this;
        }
    }

    public LanguageCombinationPrimerParameters(Builder builder) {
        this.currentLanguage = builder.currentLanguage;
        this.availableLanguages = builder.availableLanguages;
        this.recommendedLanguages = builder.recommendedLanguages;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LanguageCombinationPrimerParameters.class != obj.getClass()) {
            return false;
        }
        LanguageCombinationPrimerParameters languageCombinationPrimerParameters = (LanguageCombinationPrimerParameters) obj;
        LanguageGroup languageGroup = this.currentLanguage;
        LanguageGroup languageGroup2 = languageCombinationPrimerParameters.currentLanguage;
        if (languageGroup == null ? languageGroup2 != null : !languageGroup.equals(languageGroup2)) {
            return false;
        }
        ArrayList<LanguageGroup> arrayList = this.availableLanguages;
        ArrayList<LanguageGroup> arrayList2 = languageCombinationPrimerParameters.availableLanguages;
        if (arrayList == null ? arrayList2 != null : !arrayList.equals(arrayList2)) {
            return false;
        }
        ArrayList<LanguageGroup> arrayList3 = this.recommendedLanguages;
        ArrayList<LanguageGroup> arrayList4 = languageCombinationPrimerParameters.recommendedLanguages;
        return arrayList3 == null ? arrayList4 == null : arrayList3.equals(arrayList4);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerParametersModel
    @NonNull
    public ArrayList<LanguageGroup> getAvailableLanguages() {
        return this.availableLanguages;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerParametersModel
    @NonNull
    public LanguageGroup getCurrentLanguage() {
        return this.currentLanguage;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerParametersModel
    @NonNull
    public ArrayList<LanguageGroup> getRecommendedLanguages() {
        return this.recommendedLanguages;
    }

    public int hashCode() {
        LanguageGroup languageGroup = this.currentLanguage;
        int hashCode = (JfifUtil.MARKER_EOI + (languageGroup != null ? languageGroup.hashCode() : 0)) * 31;
        ArrayList<LanguageGroup> arrayList = this.availableLanguages;
        int hashCode2 = (hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<LanguageGroup> arrayList2 = this.recommendedLanguages;
        return hashCode2 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public String toString() {
        return "LanguageCombinationPrimerParameters{currentLanguage=" + this.currentLanguage + ", availableLanguages=" + this.availableLanguages + ", recommendedLanguages=" + this.recommendedLanguages + AbstractJsonLexerKt.END_OBJ;
    }
}
