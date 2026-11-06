package com.amazon.alexa.redesign.compose.home;

import android.view.View;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.amazon.alexa.api.compat.model.assistant.AccountApiSender;
import com.amazon.alexa.api.compat.model.assistant.ConversationsApiSender;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AccountAssistantSubcomponentBase;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.ConversationsAssistantSubcomponentBase;
import com.amazon.alexa.ra.core.ui.markdown.MarkdownRendererKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeKt$$ExternalSyntheticLambda27 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ HomeKt$$ExternalSyntheticLambda27(String str, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit ReactNativeHeader$lambda$165$lambda$164;
        Unit lambda$updateBMCLEntitlementStatus$2;
        Unit lambda$updateEntitlementStatus$3;
        Unit accessibilityGroupModifier$lambda$32;
        switch (this.$r8$classId) {
            case 0:
                ReactNativeHeader$lambda$165$lambda$164 = HomeKt.ReactNativeHeader$lambda$165$lambda$164(this.f$0, this.f$1, (View) obj);
                return ReactNativeHeader$lambda$165$lambda$164;
            case 1:
                lambda$updateBMCLEntitlementStatus$2 = AccountAssistantSubcomponentBase.lambda$updateBMCLEntitlementStatus$2(this.f$1, this.f$0, (AccountApiSender) obj);
                return lambda$updateBMCLEntitlementStatus$2;
            case 2:
                lambda$updateEntitlementStatus$3 = ConversationsAssistantSubcomponentBase.lambda$updateEntitlementStatus$3(this.f$1, this.f$0, (ConversationsApiSender) obj);
                return lambda$updateEntitlementStatus$3;
            default:
                accessibilityGroupModifier$lambda$32 = MarkdownRendererKt.accessibilityGroupModifier$lambda$32(this.f$0, this.f$1, (SemanticsPropertyReceiver) obj);
                return accessibilityGroupModifier$lambda$32;
        }
    }

    public /* synthetic */ HomeKt$$ExternalSyntheticLambda27(boolean z, String str, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = str;
    }
}
