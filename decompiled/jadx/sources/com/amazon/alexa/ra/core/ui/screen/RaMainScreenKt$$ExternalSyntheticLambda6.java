package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.MutableState;
import com.amazon.alexa.ra.chrome.model.AlexaUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class RaMainScreenKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RaMainScreenKt$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState rememberCardReadRequest$lambda$45$lambda$44;
        boolean LocalConversationSurfaceVisible$lambda$0;
        Unit unit;
        Unit unit2;
        MutableState RaScreen$lambda$16$lambda$15;
        String RaScreen$lambda$24$lambda$23;
        MutableState RaScreen$lambda$32$lambda$31;
        MutableState rememberConversationRouteEntry$lambda$58$lambda$57;
        Unit unit3;
        AlexaUiState alexaUiState;
        float ScreenShareConsentScreen$lambda$29$lambda$28$lambda$20$lambda$19;
        Unit unit4;
        MutableState SmartActionsFeedbackScreen$lambda$5$lambda$4;
        Unit unit5;
        switch (this.$r8$classId) {
            case 0:
                rememberCardReadRequest$lambda$45$lambda$44 = RaMainScreenKt.rememberCardReadRequest$lambda$45$lambda$44();
                return rememberCardReadRequest$lambda$45$lambda$44;
            case 1:
                LocalConversationSurfaceVisible$lambda$0 = LocalConversationSurfaceVisibleKt.LocalConversationSurfaceVisible$lambda$0();
                return Boolean.valueOf(LocalConversationSurfaceVisible$lambda$0);
            case 2:
                unit = Unit.INSTANCE;
                return unit;
            case 3:
                unit2 = Unit.INSTANCE;
                return unit2;
            case 4:
                RaScreen$lambda$16$lambda$15 = RaMainScreenKt.RaScreen$lambda$16$lambda$15();
                return RaScreen$lambda$16$lambda$15;
            case 5:
                RaScreen$lambda$24$lambda$23 = RaMainScreenKt.RaScreen$lambda$24$lambda$23();
                return RaScreen$lambda$24$lambda$23;
            case 6:
                RaScreen$lambda$32$lambda$31 = RaMainScreenKt.RaScreen$lambda$32$lambda$31();
                return RaScreen$lambda$32$lambda$31;
            case 7:
                rememberConversationRouteEntry$lambda$58$lambda$57 = RaMainScreenKt.rememberConversationRouteEntry$lambda$58$lambda$57();
                return rememberConversationRouteEntry$lambda$58$lambda$57;
            case 8:
                unit3 = Unit.INSTANCE;
                return unit3;
            case 9:
                alexaUiState = AlexaUiState.IDLE;
                return alexaUiState;
            case 10:
                ScreenShareConsentScreen$lambda$29$lambda$28$lambda$20$lambda$19 = ScreenShareConsentScreenKt.ScreenShareConsentScreen$lambda$29$lambda$28$lambda$20$lambda$19();
                return Float.valueOf(ScreenShareConsentScreen$lambda$29$lambda$28$lambda$20$lambda$19);
            case 11:
                unit4 = Unit.INSTANCE;
                return unit4;
            case 12:
                SmartActionsFeedbackScreen$lambda$5$lambda$4 = SmartActionsFeedbackScreenKt.SmartActionsFeedbackScreen$lambda$5$lambda$4();
                return SmartActionsFeedbackScreen$lambda$5$lambda$4;
            default:
                unit5 = Unit.INSTANCE;
                return unit5;
        }
    }
}
