package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class RaMainScreenKt$$ExternalSyntheticLambda13 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ RaMainScreenKt$$ExternalSyntheticLambda13(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState RaScreen$lambda$8$lambda$7;
        MutableState ConversationsUi$lambda$77$lambda$72$lambda$53$lambda$52;
        MutableState FeedbackScreen$lambda$5$lambda$4;
        MutableState LiveModeLearnMoreScreen$lambda$19$lambda$15$lambda$14;
        MutableState RaScreen$lambda$12$lambda$11;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                RaScreen$lambda$8$lambda$7 = RaMainScreenKt.RaScreen$lambda$8$lambda$7(str);
                return RaScreen$lambda$8$lambda$7;
            case 1:
                ConversationsUi$lambda$77$lambda$72$lambda$53$lambda$52 = ConversationsHistoryScreenKt.ConversationsUi$lambda$77$lambda$72$lambda$53$lambda$52(str);
                return ConversationsUi$lambda$77$lambda$72$lambda$53$lambda$52;
            case 2:
                FeedbackScreen$lambda$5$lambda$4 = FeedbackScreenKt.FeedbackScreen$lambda$5$lambda$4(str);
                return FeedbackScreen$lambda$5$lambda$4;
            case 3:
                LiveModeLearnMoreScreen$lambda$19$lambda$15$lambda$14 = LiveModeLearnMoreScreenKt.LiveModeLearnMoreScreen$lambda$19$lambda$15$lambda$14(str);
                return LiveModeLearnMoreScreen$lambda$19$lambda$15$lambda$14;
            default:
                RaScreen$lambda$12$lambda$11 = RaMainScreenKt.RaScreen$lambda$12$lambda$11(str);
                return RaScreen$lambda$12$lambda$11;
        }
    }
}
