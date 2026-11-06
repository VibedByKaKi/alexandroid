package com.amazon.alexa.ra.core.ui.custom;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class PdfViewerKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Uri f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ PdfViewerKt$$ExternalSyntheticLambda6(String str, Uri uri, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = uri;
        this.f$2 = function0;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit PdfViewer$lambda$13;
        Unit TextFileViewer$lambda$11;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PdfViewer$lambda$13 = PdfViewerKt.PdfViewer$lambda$13(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, intValue);
                return PdfViewer$lambda$13;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                TextFileViewer$lambda$11 = TextFileViewerKt.TextFileViewer$lambda$11(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, intValue2);
                return TextFileViewer$lambda$11;
        }
    }
}
