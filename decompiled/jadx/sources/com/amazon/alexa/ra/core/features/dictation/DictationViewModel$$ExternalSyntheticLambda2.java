package com.amazon.alexa.ra.core.features.dictation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DictationViewModel$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DictationViewModel f$0;

    public /* synthetic */ DictationViewModel$$ExternalSyntheticLambda2(DictationViewModel dictationViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = dictationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit wireRepositoryCallbacks$lambda$10;
        Unit uiEvents$lambda$7;
        Unit uiEvents$lambda$8;
        switch (this.$r8$classId) {
            case 0:
                wireRepositoryCallbacks$lambda$10 = DictationViewModel.wireRepositoryCallbacks$lambda$10(this.f$0, (DictationLimit) obj);
                return wireRepositoryCallbacks$lambda$10;
            case 1:
                uiEvents$lambda$7 = DictationViewModel.uiEvents$lambda$7(this.f$0, (String) obj);
                return uiEvents$lambda$7;
            default:
                uiEvents$lambda$8 = DictationViewModel.uiEvents$lambda$8(this.f$0, ((Integer) obj).intValue());
                return uiEvents$lambda$8;
        }
    }
}
