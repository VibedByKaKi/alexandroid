package com.amazon.alexa.ra.core.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeOobeScreenKt$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ LiveModeOobeScreenKt$$ExternalSyntheticLambda11(Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit LiveModeOobeScreen$lambda$13$lambda$12;
        Unit CameraShareConsentScreen$lambda$10$lambda$9;
        Unit ConversationsUi$lambda$77$lambda$72$lambda$55$lambda$54;
        boolean SettingsParagraph$lambda$28$lambda$27$lambda$26;
        Unit ScreenShareConsentScreen$lambda$10$lambda$9;
        Unit WebViewBottomSheetScreen$lambda$12$lambda$11;
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                LiveModeOobeScreen$lambda$13$lambda$12 = LiveModeOobeScreenKt.LiveModeOobeScreen$lambda$13$lambda$12(function0);
                return LiveModeOobeScreen$lambda$13$lambda$12;
            case 1:
                CameraShareConsentScreen$lambda$10$lambda$9 = CameraShareConsentScreenKt.CameraShareConsentScreen$lambda$10$lambda$9(function0);
                return CameraShareConsentScreen$lambda$10$lambda$9;
            case 2:
                ConversationsUi$lambda$77$lambda$72$lambda$55$lambda$54 = ConversationsHistoryScreenKt.ConversationsUi$lambda$77$lambda$72$lambda$55$lambda$54(function0);
                return ConversationsUi$lambda$77$lambda$72$lambda$55$lambda$54;
            case 3:
                SettingsParagraph$lambda$28$lambda$27$lambda$26 = LiveModeLearnMoreScreenKt.SettingsParagraph$lambda$28$lambda$27$lambda$26(function0);
                break;
            case 4:
                SettingsParagraph$lambda$28$lambda$27$lambda$26 = LiveModeLearnMoreScreenKt.PrivacyParagraph$lambda$36$lambda$35$lambda$34(function0);
                break;
            case 5:
                ScreenShareConsentScreen$lambda$10$lambda$9 = ScreenShareConsentScreenKt.ScreenShareConsentScreen$lambda$10$lambda$9(function0);
                return ScreenShareConsentScreen$lambda$10$lambda$9;
            default:
                WebViewBottomSheetScreen$lambda$12$lambda$11 = WebViewBottomSheetScreenKt.WebViewBottomSheetScreen$lambda$12$lambda$11(function0);
                return WebViewBottomSheetScreen$lambda$12$lambda$11;
        }
        return Boolean.valueOf(SettingsParagraph$lambda$28$lambda$27$lambda$26);
    }
}
