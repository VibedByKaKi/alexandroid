package com.amazon.alexa.ra.cards.ui;

import androidx.compose.runtime.Composer;
import com.amazon.alexa.assistant.ui.conversation.view.settings.AlexaSettingsScreenKt;
import com.amazon.alexa.ra.core.ui.custom.MediaThumbnailsForCamKt;
import com.amazon.alexa.ra.core.ui.custom.TextFileViewerKt;
import com.amazon.alexa.ra.core.ui.lightbox.LightBoxScreenKt;
import com.amazon.alexa.ra.core.ui.screen.ConversationsHistoryScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class FullImageCardKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ FullImageCardKt$$ExternalSyntheticLambda6(String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit AttributionSection$lambda$30;
        Unit SectionHeader$lambda$10;
        Unit FileThumbnailErrorState$lambda$21;
        Unit TextFileBody$lambda$12;
        Unit CardRenderError$lambda$10;
        Unit EmptyConversationDescription$lambda$85;
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AttributionSection$lambda$30 = FullImageCardKt.AttributionSection$lambda$30(this.f$0, this.f$1, composer, intValue);
                return AttributionSection$lambda$30;
            case 1:
                SectionHeader$lambda$10 = AlexaSettingsScreenKt.SectionHeader$lambda$10(this.f$0, this.f$1, composer, intValue);
                return SectionHeader$lambda$10;
            case 2:
                FileThumbnailErrorState$lambda$21 = MediaThumbnailsForCamKt.FileThumbnailErrorState$lambda$21(this.f$0, this.f$1, composer, intValue);
                return FileThumbnailErrorState$lambda$21;
            case 3:
                TextFileBody$lambda$12 = TextFileViewerKt.TextFileBody$lambda$12(this.f$0, this.f$1, composer, intValue);
                return TextFileBody$lambda$12;
            case 4:
                CardRenderError$lambda$10 = LightBoxScreenKt.CardRenderError$lambda$10(this.f$0, this.f$1, composer, intValue);
                return CardRenderError$lambda$10;
            default:
                EmptyConversationDescription$lambda$85 = ConversationsHistoryScreenKt.EmptyConversationDescription$lambda$85(this.f$0, this.f$1, composer, intValue);
                return EmptyConversationDescription$lambda$85;
        }
    }
}
