package com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup;

import com.amazon.alexa.voice.ui.onedesign.widget.OnItemClickListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class LanguageCombinationPrimerController$$ExternalSyntheticLambda1 implements OnItemClickListener, OnItemSelectionDetected {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LanguageCombinationPrimerController f$0;

    public /* synthetic */ LanguageCombinationPrimerController$$ExternalSyntheticLambda1(LanguageCombinationPrimerController languageCombinationPrimerController, int i) {
        this.$r8$classId = i;
        this.f$0 = languageCombinationPrimerController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.OnItemClickListener
    public void onItemClicked(Object obj) {
        int i = this.$r8$classId;
        LanguageCombinationPrimerController languageCombinationPrimerController = this.f$0;
        LanguageCombinationListItem languageCombinationListItem = (LanguageCombinationListItem) obj;
        switch (i) {
            case 0:
                languageCombinationPrimerController.lambda$onCreateView$1(languageCombinationListItem);
                break;
            default:
                languageCombinationPrimerController.lambda$onCreateView$2(languageCombinationListItem);
                break;
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.OnItemSelectionDetected
    public void onSelectionDetected(LanguageCombinationListItem languageCombinationListItem) {
        this.f$0.lambda$new$3(languageCombinationListItem);
    }
}
