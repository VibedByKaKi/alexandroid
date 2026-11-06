package com.amazon.alexa.ra.core.ui.fragments.suggestion;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.data.model.SmartActionsFeedbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SuggestionPillsKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ State f$1;

    public /* synthetic */ SuggestionPillsKt$$ExternalSyntheticLambda5(Object obj, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$83$lambda$82;
        Unit SuggestionPillFadeIn$lambda$37$lambda$36;
        switch (this.$r8$classId) {
            case 0:
                SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$83$lambda$82 = SuggestionPillsKt.SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$83$lambda$82((Function1) this.f$0, (MutableState) this.f$1, (SmartActionsFeedbackType) obj);
                return SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$83$lambda$82;
            default:
                SuggestionPillFadeIn$lambda$37$lambda$36 = SuggestionPillsKt.SuggestionPillFadeIn$lambda$37$lambda$36((FragmentData) this.f$0, this.f$1, (SmartActionsFeedbackType) obj);
                return SuggestionPillFadeIn$lambda$37$lambda$36;
        }
    }
}
