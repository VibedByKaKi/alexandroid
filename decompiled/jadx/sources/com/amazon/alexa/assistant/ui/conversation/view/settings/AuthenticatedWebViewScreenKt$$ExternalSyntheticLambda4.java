package com.amazon.alexa.assistant.ui.conversation.view.settings;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AuthenticatedWebViewScreenKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ AuthenticatedWebViewScreenKt$$ExternalSyntheticLambda4(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState AuthenticatedWebViewContent$lambda$16$lambda$13$lambda$12;
        MutableState invoke$lambda$1$lambda$0;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                AuthenticatedWebViewContent$lambda$16$lambda$13$lambda$12 = AuthenticatedWebViewScreenKt.AuthenticatedWebViewContent$lambda$16$lambda$13$lambda$12(mutableState);
                return AuthenticatedWebViewContent$lambda$16$lambda$13$lambda$12;
            default:
                invoke$lambda$1$lambda$0 = AlexaSettingsScreenKt$AlexaSettingsScreen$5.invoke$lambda$1$lambda$0(mutableState);
                return invoke$lambda$1$lambda$0;
        }
    }
}
