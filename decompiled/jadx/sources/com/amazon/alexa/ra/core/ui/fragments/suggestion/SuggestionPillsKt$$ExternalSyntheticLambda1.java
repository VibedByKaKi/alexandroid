package com.amazon.alexa.ra.core.ui.fragments.suggestion;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import com.amazon.alexa.ra.core.ui.fragments.FragmentRendererConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SuggestionPillsKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SuggestionPillsKt$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$75$lambda$74;
        Unit invoke$lambda$7$lambda$1$lambda$0;
        Unit SuggestionPillContent$lambda$52$lambda$51;
        Unit Render$lambda$5$lambda$4$lambda$3$lambda$2;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$75$lambda$74 = SuggestionPillsKt.SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$75$lambda$74((MutableState) obj2, (FocusState) obj);
                return SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$75$lambda$74;
            case 1:
                invoke$lambda$7$lambda$1$lambda$0 = SuggestionPillsKt$SuggestionPillContent$3.invoke$lambda$7$lambda$1$lambda$0((MutableState) obj2, ((Boolean) obj).booleanValue());
                return invoke$lambda$7$lambda$1$lambda$0;
            case 2:
                SuggestionPillContent$lambda$52$lambda$51 = SuggestionPillsKt.SuggestionPillContent$lambda$52$lambda$51((MutableState) obj2, (FocusState) obj);
                return SuggestionPillContent$lambda$52$lambda$51;
            default:
                Render$lambda$5$lambda$4$lambda$3$lambda$2 = SuggestionFragmentView.Render$lambda$5$lambda$4$lambda$3$lambda$2((FragmentRendererConfig) obj2, (String) obj);
                return Render$lambda$5$lambda$4$lambda$3$lambda$2;
        }
    }
}
