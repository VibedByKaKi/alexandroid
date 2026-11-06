package com.amazon.alexa.ra.core.ui.fragments.suggestion;

import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SuggestionPillsKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FocusManager f$0;
    public final /* synthetic */ SoftwareKeyboardController f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ SuggestionPillsKt$$ExternalSyntheticLambda3(FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = focusManager;
        this.f$1 = softwareKeyboardController;
        this.f$2 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$79$lambda$78;
        Unit SuggestionPillContent$lambda$54$lambda$53;
        switch (this.$r8$classId) {
            case 0:
                SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$79$lambda$78 = SuggestionPillsKt.SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$79$lambda$78(this.f$0, this.f$1, this.f$2);
                return SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$79$lambda$78;
            default:
                SuggestionPillContent$lambda$54$lambda$53 = SuggestionPillsKt.SuggestionPillContent$lambda$54$lambda$53(this.f$0, this.f$1, this.f$2);
                return SuggestionPillContent$lambda$54$lambda$53;
        }
    }
}
