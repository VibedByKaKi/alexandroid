package com.amazon.alexa.ra.core.ui.fragments.suggestion;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SuggestionPillsKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ SuggestionPillsKt$$ExternalSyntheticLambda4(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$81$lambda$80;
        boolean SuggestionPills$lambda$2;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$81$lambda$80 = SuggestionPillsKt.SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$81$lambda$80(mutableState);
                return SmartActionsSuggestionPillContent_dGSv_n8$lambda$84$lambda$81$lambda$80;
            default:
                SuggestionPills$lambda$2 = SuggestionPillsKt.SuggestionPills$lambda$2(mutableState);
                return Boolean.valueOf(SuggestionPills$lambda$2);
        }
    }
}
