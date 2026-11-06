package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda0 implements LinkInteractionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda0(Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(LinkAnnotation linkAnnotation) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                LiveModeLearnMoreScreenKt.SettingsParagraph$lambda$25$lambda$24$lambda$23$lambda$22(function0, linkAnnotation);
                break;
            default:
                LiveModeLearnMoreScreenKt.PrivacyParagraph$lambda$33$lambda$32$lambda$31$lambda$30(function0, linkAnnotation);
                break;
        }
    }
}
