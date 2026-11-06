package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeOobeScreenKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ LiveModeOobeScreenKt$$ExternalSyntheticLambda5(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit LiveModeOobeScreen$lambda$43$lambda$42;
        MutableState invoke$lambda$11$lambda$8$lambda$7;
        MutableState invoke$lambda$7$lambda$6;
        MutableState CitationSourcesBottomSheetContent$lambda$9$lambda$2$lambda$1;
        MutableState ConversationsUi$lambda$77$lambda$72$lambda$57$lambda$56;
        Unit ConversationsUi$lambda$77$lambda$72$lambda$65$lambda$64;
        Unit ConversationsUi$lambda$77$lambda$72$lambda$71$lambda$67$lambda$66;
        boolean ConversationsUi$lambda$77$lambda$75$lambda$74;
        Unit ConversationsUi$lambda$41$lambda$40;
        MutableState WebViewScreen$lambda$42$lambda$37$lambda$36;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                LiveModeOobeScreen$lambda$43$lambda$42 = LiveModeOobeScreenKt.LiveModeOobeScreen$lambda$43$lambda$42(mutableState);
                return LiveModeOobeScreen$lambda$43$lambda$42;
            case 1:
                invoke$lambda$11$lambda$8$lambda$7 = FullScreenThumbnailScreenKt$FullScreenThumbnailScreen$2.invoke$lambda$11$lambda$8$lambda$7(mutableState);
                return invoke$lambda$11$lambda$8$lambda$7;
            case 2:
                invoke$lambda$7$lambda$6 = WebViewBottomSheetScreenKt$WebViewBottomSheetScreen$4.invoke$lambda$7$lambda$6(mutableState);
                return invoke$lambda$7$lambda$6;
            case 3:
                CitationSourcesBottomSheetContent$lambda$9$lambda$2$lambda$1 = CitationSourcesBottomSheetScreenKt.CitationSourcesBottomSheetContent$lambda$9$lambda$2$lambda$1(mutableState);
                return CitationSourcesBottomSheetContent$lambda$9$lambda$2$lambda$1;
            case 4:
                ConversationsUi$lambda$77$lambda$72$lambda$57$lambda$56 = ConversationsHistoryScreenKt.ConversationsUi$lambda$77$lambda$72$lambda$57$lambda$56(mutableState);
                return ConversationsUi$lambda$77$lambda$72$lambda$57$lambda$56;
            case 5:
                ConversationsUi$lambda$77$lambda$72$lambda$65$lambda$64 = ConversationsHistoryScreenKt.ConversationsUi$lambda$77$lambda$72$lambda$65$lambda$64(mutableState);
                return ConversationsUi$lambda$77$lambda$72$lambda$65$lambda$64;
            case 6:
                ConversationsUi$lambda$77$lambda$72$lambda$71$lambda$67$lambda$66 = ConversationsHistoryScreenKt.ConversationsUi$lambda$77$lambda$72$lambda$71$lambda$67$lambda$66(mutableState);
                return ConversationsUi$lambda$77$lambda$72$lambda$71$lambda$67$lambda$66;
            case 7:
                ConversationsUi$lambda$77$lambda$75$lambda$74 = ConversationsHistoryScreenKt.ConversationsUi$lambda$77$lambda$75$lambda$74(mutableState);
                return Boolean.valueOf(ConversationsUi$lambda$77$lambda$75$lambda$74);
            case 8:
                ConversationsUi$lambda$41$lambda$40 = ConversationsHistoryScreenKt.ConversationsUi$lambda$41$lambda$40(mutableState);
                return ConversationsUi$lambda$41$lambda$40;
            default:
                WebViewScreen$lambda$42$lambda$37$lambda$36 = WebViewBottomSheetScreenKt.WebViewScreen$lambda$42$lambda$37$lambda$36(mutableState);
                return WebViewScreen$lambda$42$lambda$37$lambda$36;
        }
    }
}
