package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda15 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MutableState f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda15(MutableState mutableState, Function1 function1) {
        this.f$0 = mutableState;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectResult LiveModeLearnMoreScreen$lambda$13$lambda$12;
        Unit ConversationsUi$lambda$77$lambda$72$lambda$60$lambda$59$lambda$58;
        switch (this.$r8$classId) {
            case 0:
                LiveModeLearnMoreScreen$lambda$13$lambda$12 = LiveModeLearnMoreScreenKt.LiveModeLearnMoreScreen$lambda$13$lambda$12(this.f$0, this.f$1, (DisposableEffectScope) obj);
                return LiveModeLearnMoreScreen$lambda$13$lambda$12;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ConversationsUi$lambda$77$lambda$72$lambda$60$lambda$59$lambda$58 = ConversationsHistoryScreenKt.ConversationsUi$lambda$77$lambda$72$lambda$60$lambda$59$lambda$58(this.f$1, this.f$0, booleanValue);
                return ConversationsUi$lambda$77$lambda$72$lambda$60$lambda$59$lambda$58;
        }
    }

    public /* synthetic */ LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda15(Function1 function1, MutableState mutableState) {
        this.f$1 = function1;
        this.f$0 = mutableState;
    }
}
