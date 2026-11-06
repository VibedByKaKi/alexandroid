package com.amazon.alexa.ra.core.ui.fragments.suggestion;

import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.data.model.SuggestionPillTextData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SuggestionPillsKt$$ExternalSyntheticLambda17 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SuggestionPillsKt$$ExternalSyntheticLambda17(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int SuggestionPills$lambda$10$lambda$9;
        Unit invoke$lambda$2$lambda$1$lambda$0;
        Unit invoke$lambda$2$lambda$1$lambda$02;
        Unit invoke$lambda$2$lambda$1$lambda$03;
        Unit invoke$lambda$2$lambda$1$lambda$04;
        SuggestionPillTextData invoke$lambda$2$lambda$1$lambda$05;
        int SuggestionPillWithInsets$lambda$32$lambda$31;
        switch (this.$r8$classId) {
            case 0:
                SuggestionPills$lambda$10$lambda$9 = SuggestionPillsKt.SuggestionPills$lambda$10$lambda$9(((Integer) obj).intValue());
                return Integer.valueOf(SuggestionPills$lambda$10$lambda$9);
            case 1:
                invoke$lambda$2$lambda$1$lambda$0 = ComposableSingletons$SuggestionCardsKt$lambda1$1.invoke$lambda$2$lambda$1$lambda$0((FragmentData) obj);
                return invoke$lambda$2$lambda$1$lambda$0;
            case 2:
                invoke$lambda$2$lambda$1$lambda$02 = ComposableSingletons$SuggestionCardsKt$lambda2$1.invoke$lambda$2$lambda$1$lambda$0((FragmentData) obj);
                return invoke$lambda$2$lambda$1$lambda$02;
            case 3:
                invoke$lambda$2$lambda$1$lambda$03 = ComposableSingletons$SuggestionCardsKt$lambda3$1.invoke$lambda$2$lambda$1$lambda$0((FragmentData) obj);
                return invoke$lambda$2$lambda$1$lambda$03;
            case 4:
                invoke$lambda$2$lambda$1$lambda$04 = ComposableSingletons$SuggestionCardsKt$lambda4$1.invoke$lambda$2$lambda$1$lambda$0((FragmentData) obj);
                return invoke$lambda$2$lambda$1$lambda$04;
            case 5:
                invoke$lambda$2$lambda$1$lambda$05 = ComposableSingletons$SuggestionPillsKt$lambda6$1.invoke$lambda$2$lambda$1$lambda$0((FragmentData) obj);
                return invoke$lambda$2$lambda$1$lambda$05;
            default:
                SuggestionPillWithInsets$lambda$32$lambda$31 = SuggestionPillsKt.SuggestionPillWithInsets$lambda$32$lambda$31(((Integer) obj).intValue());
                return Integer.valueOf(SuggestionPillWithInsets$lambda$32$lambda$31);
        }
    }
}
