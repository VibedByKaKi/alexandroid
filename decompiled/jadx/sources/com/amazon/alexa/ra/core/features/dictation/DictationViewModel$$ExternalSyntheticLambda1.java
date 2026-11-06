package com.amazon.alexa.ra.core.features.dictation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DictationViewModel$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DictationViewModel f$0;

    public /* synthetic */ DictationViewModel$$ExternalSyntheticLambda1(DictationViewModel dictationViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = dictationViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit wireRepositoryCallbacks$lambda$9;
        Unit uiEvents$lambda$1;
        Unit uiEvents$lambda$2;
        Unit uiEvents$lambda$3;
        Unit uiEvents$lambda$4;
        Unit uiEvents$lambda$5;
        Unit uiEvents$lambda$6;
        int i = this.$r8$classId;
        DictationViewModel dictationViewModel = this.f$0;
        switch (i) {
            case 0:
                wireRepositoryCallbacks$lambda$9 = DictationViewModel.wireRepositoryCallbacks$lambda$9(dictationViewModel);
                return wireRepositoryCallbacks$lambda$9;
            case 1:
                uiEvents$lambda$1 = DictationViewModel.uiEvents$lambda$1(dictationViewModel);
                return uiEvents$lambda$1;
            case 2:
                uiEvents$lambda$2 = DictationViewModel.uiEvents$lambda$2(dictationViewModel);
                return uiEvents$lambda$2;
            case 3:
                uiEvents$lambda$3 = DictationViewModel.uiEvents$lambda$3(dictationViewModel);
                return uiEvents$lambda$3;
            case 4:
                uiEvents$lambda$4 = DictationViewModel.uiEvents$lambda$4(dictationViewModel);
                return uiEvents$lambda$4;
            case 5:
                uiEvents$lambda$5 = DictationViewModel.uiEvents$lambda$5(dictationViewModel);
                return uiEvents$lambda$5;
            default:
                uiEvents$lambda$6 = DictationViewModel.uiEvents$lambda$6(dictationViewModel);
                return uiEvents$lambda$6;
        }
    }
}
