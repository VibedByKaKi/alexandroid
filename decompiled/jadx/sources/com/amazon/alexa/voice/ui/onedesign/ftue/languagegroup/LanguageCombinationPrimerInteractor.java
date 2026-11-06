package com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup;

import com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LanguageCombinationPrimerInteractor implements LanguageCombinationPrimerContract.Interactor {
    private final LanguageCombinationPrimerParameters languageCombinationPrimerParameters;
    private final LanguageCombinationPrimerContract.Mediator mediator;

    public LanguageCombinationPrimerInteractor(LanguageCombinationPrimerContract.Mediator mediator, LanguageCombinationPrimerParameters languageCombinationPrimerParameters) {
        this.mediator = mediator;
        this.languageCombinationPrimerParameters = languageCombinationPrimerParameters;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerContract.Interactor
    public LanguageCombinationPrimerParameters getLanguageCombinationPrimerParameters() {
        return this.languageCombinationPrimerParameters;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerContract.Interactor
    public void updateLanguageCombinationAndExit(LanguageGroup languageGroup) {
        this.mediator.updateLanguageCombinationAndExit(languageGroup);
    }
}
