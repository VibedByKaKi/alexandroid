package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda1(String str, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit SettingsParagraph$lambda$28$lambda$27;
        Unit PrivacyParagraph$lambda$36$lambda$35;
        switch (this.$r8$classId) {
            case 0:
                SettingsParagraph$lambda$28$lambda$27 = LiveModeLearnMoreScreenKt.SettingsParagraph$lambda$28$lambda$27(this.f$0, this.f$1, (SemanticsPropertyReceiver) obj);
                return SettingsParagraph$lambda$28$lambda$27;
            default:
                PrivacyParagraph$lambda$36$lambda$35 = LiveModeLearnMoreScreenKt.PrivacyParagraph$lambda$36$lambda$35(this.f$0, this.f$1, (SemanticsPropertyReceiver) obj);
                return PrivacyParagraph$lambda$36$lambda$35;
        }
    }
}
