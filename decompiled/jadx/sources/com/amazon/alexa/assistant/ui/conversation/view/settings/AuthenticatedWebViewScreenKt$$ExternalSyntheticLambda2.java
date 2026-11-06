package com.amazon.alexa.assistant.ui.conversation.view.settings;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AuthenticatedWebViewScreenKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AuthenticatedWebViewScreenKt$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit AuthenticatedWebViewContent$lambda$6$lambda$5;
        boolean create$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                AuthenticatedWebViewContent$lambda$6$lambda$5 = AuthenticatedWebViewScreenKt.AuthenticatedWebViewContent$lambda$6$lambda$5((Function0) obj);
                return AuthenticatedWebViewContent$lambda$6$lambda$5;
            default:
                create$lambda$0 = AlexaSettingsViewModelFactory.create$lambda$0((AlexaSettingsViewModelFactory) obj);
                return Boolean.valueOf(create$lambda$0);
        }
    }
}
