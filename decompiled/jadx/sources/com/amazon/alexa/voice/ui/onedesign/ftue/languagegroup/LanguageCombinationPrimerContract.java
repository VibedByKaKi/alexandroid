package com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface LanguageCombinationPrimerContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void close();

        LanguageCombinationPrimerParameters getLanguageCombinationPrimerParameters();

        void updateLanguageCombinationAndExit(LanguageGroup languageGroup);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void updateLanguageCombinationAndExit(LanguageGroup languageGroup);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void close();

        void continueClicked(LanguageGroup languageGroup);

        void start();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void setAvailableLanguages(List<LanguageCombinationListItem> list);

        void setAvailableLanguagesHeaderText(CharSequence charSequence);

        void setAvailableSectionVisible(boolean z);

        void setContinueButtonEnabled(boolean z);

        void setContinueButtonText(CharSequence charSequence);

        void setHeadingText(CharSequence charSequence);

        void setRecommendedLanguages(List<LanguageCombinationListItem> list);

        void setRecommendedLanguagesHeaderText(CharSequence charSequence);

        void setRecommendedSectionVisible(boolean z);

        void setSectionDescription(CharSequence charSequence);

        void setTitle(CharSequence charSequence);
    }
}
