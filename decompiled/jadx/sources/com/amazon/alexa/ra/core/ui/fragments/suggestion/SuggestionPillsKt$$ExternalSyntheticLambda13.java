package com.amazon.alexa.ra.core.ui.fragments.suggestion;

import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SuggestionPillsKt$$ExternalSyntheticLambda13 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ FragmentData f$1;

    public /* synthetic */ SuggestionPillsKt$$ExternalSyntheticLambda13(Function1 function1, FragmentData fragmentData, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = fragmentData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit SuggestionPillsVertical$lambda$16$lambda$15$lambda$14$lambda$13;
        Unit invoke$lambda$3$lambda$2$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                SuggestionPillsVertical$lambda$16$lambda$15$lambda$14$lambda$13 = SuggestionPillsKt.SuggestionPillsVertical$lambda$16$lambda$15$lambda$14$lambda$13(this.f$0, this.f$1);
                return SuggestionPillsVertical$lambda$16$lambda$15$lambda$14$lambda$13;
            default:
                invoke$lambda$3$lambda$2$lambda$1 = SuggestionPillsKt$SuggestionPillsWrap$1.invoke$lambda$3$lambda$2$lambda$1(this.f$0, this.f$1);
                return invoke$lambda$3$lambda$2$lambda$1;
        }
    }
}
