package com.amazon.alexa.ra.core.ui.screen;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class WebViewBottomSheetScreenKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ WebViewBottomSheetScreenKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit WebViewScreen$lambda$17$lambda$16;
        Unit SmartActionsFeedbackScreen$lambda$3$lambda$2;
        switch (this.$r8$classId) {
            case 0:
                WebViewScreen$lambda$17$lambda$16 = WebViewBottomSheetScreenKt.WebViewScreen$lambda$17$lambda$16((WebView) obj);
                return WebViewScreen$lambda$17$lambda$16;
            default:
                SmartActionsFeedbackScreen$lambda$3$lambda$2 = SmartActionsFeedbackScreenKt.SmartActionsFeedbackScreen$lambda$3$lambda$2(((Integer) obj).intValue());
                return SmartActionsFeedbackScreen$lambda$3$lambda$2;
        }
    }
}
