package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class PdfViewerKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ PdfViewerKt$$ExternalSyntheticLambda3(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState PdfViewer$lambda$2$lambda$1;
        MutableState invoke$lambda$1$lambda$0;
        MutableState invoke$lambda$1$lambda$02;
        MutableState invoke$lambda$1$lambda$03;
        MutableState invoke$lambda$1$lambda$04;
        MutableState invoke$lambda$1$lambda$05;
        MutableState DeleteConfirmationPrimer$lambda$3$lambda$1$lambda$0;
        MutableState ImageViewer$lambda$1$lambda$0;
        MutableState ShareSheet$lambda$16$lambda$15;
        MutableState TextFileViewer$lambda$1$lambda$0;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                PdfViewer$lambda$2$lambda$1 = PdfViewerKt.PdfViewer$lambda$2$lambda$1(str);
                return PdfViewer$lambda$2$lambda$1;
            case 1:
                invoke$lambda$1$lambda$0 = ComposableSingletons$RAConversationHeaderKt$lambda1$1.invoke$lambda$1$lambda$0(str);
                return invoke$lambda$1$lambda$0;
            case 2:
                invoke$lambda$1$lambda$02 = ComposableSingletons$RAConversationHeaderKt$lambda2$1.invoke$lambda$1$lambda$0(str);
                return invoke$lambda$1$lambda$02;
            case 3:
                invoke$lambda$1$lambda$03 = ComposableSingletons$RAConversationHeaderKt$lambda3$1.invoke$lambda$1$lambda$0(str);
                return invoke$lambda$1$lambda$03;
            case 4:
                invoke$lambda$1$lambda$04 = ComposableSingletons$RAConversationHeaderKt$lambda4$1.invoke$lambda$1$lambda$0(str);
                return invoke$lambda$1$lambda$04;
            case 5:
                invoke$lambda$1$lambda$05 = ComposableSingletons$RAConversationHeaderKt$lambda5$1.invoke$lambda$1$lambda$0(str);
                return invoke$lambda$1$lambda$05;
            case 6:
                DeleteConfirmationPrimer$lambda$3$lambda$1$lambda$0 = DeleteConfirmationPrimerKt.DeleteConfirmationPrimer$lambda$3$lambda$1$lambda$0(str);
                return DeleteConfirmationPrimer$lambda$3$lambda$1$lambda$0;
            case 7:
                ImageViewer$lambda$1$lambda$0 = ImageViewerKt.ImageViewer$lambda$1$lambda$0(str);
                return ImageViewer$lambda$1$lambda$0;
            case 8:
                ShareSheet$lambda$16$lambda$15 = ShareSheetKt.ShareSheet$lambda$16$lambda$15(str);
                return ShareSheet$lambda$16$lambda$15;
            default:
                TextFileViewer$lambda$1$lambda$0 = TextFileViewerKt.TextFileViewer$lambda$1$lambda$0(str);
                return TextFileViewer$lambda$1$lambda$0;
        }
    }
}
