package com.amazon.alexa.ra.core.ui.fragments.suggestion;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SuggestionPillsKt$$ExternalSyntheticLambda28 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SuggestionPillsKt$$ExternalSyntheticLambda28(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float SmartActionsSuggestionPill$lambda$63$lambda$62;
        Unit invoke$lambda$4$lambda$1$lambda$0;
        Unit invoke$lambda$4$lambda$3$lambda$2;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                SmartActionsSuggestionPill$lambda$63$lambda$62 = SuggestionPillsKt.SmartActionsSuggestionPill$lambda$63$lambda$62((State) obj);
                return Float.valueOf(SmartActionsSuggestionPill$lambda$63$lambda$62);
            case 1:
                invoke$lambda$4$lambda$1$lambda$0 = SuggestionPillsKt$SmartActionFeedbackIcons$2.invoke$lambda$4$lambda$1$lambda$0((Function1) obj);
                return invoke$lambda$4$lambda$1$lambda$0;
            default:
                invoke$lambda$4$lambda$3$lambda$2 = SuggestionPillsKt$SmartActionFeedbackIcons$2.invoke$lambda$4$lambda$3$lambda$2((Function1) obj);
                return invoke$lambda$4$lambda$3$lambda$2;
        }
    }
}
