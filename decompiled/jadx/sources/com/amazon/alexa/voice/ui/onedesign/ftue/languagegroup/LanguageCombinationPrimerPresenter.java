package com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.metrics.MetricsBridge;
import com.amazon.alexa.voice.ui.onedesign.ftue.R;
import com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerContract;
import com.amazon.alexa.voice.ui.onedesign.ftue.metrics.VoxUiMetricEventName;
import com.amazon.alexa.voice.ui.onedesign.util.Resources;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LanguageCombinationPrimerPresenter implements LanguageCombinationPrimerContract.Presenter {
    private final LanguageCombinationPrimerContract.Interactor interactor;
    private final MetricsBridge metricsBridge;
    private final Resources resources;
    private final LanguageCombinationPrimerContract.View view;

    public LanguageCombinationPrimerPresenter(@NonNull LanguageCombinationPrimerContract.View view, @NonNull LanguageCombinationPrimerContract.Interactor interactor, @NonNull Resources resources, @Nullable MetricsBridge metricsBridge) {
        this.view = view;
        this.interactor = interactor;
        this.resources = resources;
        this.metricsBridge = metricsBridge;
    }

    private List<LanguageCombinationListItem> getLanguageCombinationListItems(List<LanguageGroup> list, LanguageGroup languageGroup) {
        ArrayList arrayList = new ArrayList();
        for (LanguageGroup languageGroup2 : list) {
            arrayList.add(new LanguageCombinationListItem(languageGroup2, languageGroup2.equals(languageGroup)));
        }
        return arrayList;
    }

    private void reportEvent(String str) {
        MetricsBridge metricsBridge = this.metricsBridge;
        if (metricsBridge != null) {
            metricsBridge.reportEvent(str);
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerContract.Presenter
    public void close() {
        this.interactor.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerContract.Presenter
    public void continueClicked(LanguageGroup languageGroup) {
        this.interactor.updateLanguageCombinationAndExit(languageGroup);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerContract.Presenter
    public void start() {
        this.view.setTitle(this.resources.getString(R.string.voice_ui_od_language_ftue_page_title));
        this.view.setHeadingText(this.resources.getString(R.string.voice_ui_od_language_ftue_heading));
        this.view.setContinueButtonText(this.resources.getString(R.string.voice_ui_od_language_ftue_button_continue));
        LanguageCombinationPrimerParameters languageCombinationPrimerParameters = this.interactor.getLanguageCombinationPrimerParameters();
        ArrayList arrayList = new ArrayList(languageCombinationPrimerParameters.getAvailableLanguages());
        arrayList.removeAll(languageCombinationPrimerParameters.getRecommendedLanguages());
        int size = languageCombinationPrimerParameters.getAvailableLanguages().size();
        LanguageCombinationPrimerContract.View view = this.view;
        if (size > 0) {
            view.setAvailableLanguagesHeaderText(this.resources.getString(R.string.voice_ui_od_language_ftue_available_header));
            this.view.setSectionDescription(this.resources.getString(R.string.voice_ui_od_language_ftue_note_not_fully_supported));
            this.view.setAvailableLanguages(getLanguageCombinationListItems(arrayList, languageCombinationPrimerParameters.getCurrentLanguage()));
            this.view.setAvailableSectionVisible(true);
        } else {
            view.setAvailableSectionVisible(false);
        }
        int size2 = languageCombinationPrimerParameters.getRecommendedLanguages().size();
        LanguageCombinationPrimerContract.View view2 = this.view;
        if (size2 > 0) {
            view2.setRecommendedLanguagesHeaderText(this.resources.getString(R.string.voice_ui_od_language_ftue_recommended_header));
            this.view.setRecommendedLanguages(getLanguageCombinationListItems(languageCombinationPrimerParameters.getRecommendedLanguages(), languageCombinationPrimerParameters.getCurrentLanguage()));
            this.view.setRecommendedSectionVisible(true);
        } else {
            view2.setRecommendedSectionVisible(false);
        }
        reportEvent(VoxUiMetricEventName.FTUE_LANGUAGE_PICKER_SHOWN);
    }
}
