package com.amazon.alexa.ra.plugin.renderers;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavHostController;
import com.amazon.alexa.ra.plugin.navigation.RaConversationDismissHandler;
import com.amazon.alexa.ra.plugin.renderers.RaConversationRenderer$RenderRaConversation$5;
import com.amazon.alexa.voice.ui.ra.RaConversationHost;
import com.amazon.alexa.voice.ui.ra.RaConversationLifecycleNotifier;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class RaConversationRenderer$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ RaConversationRenderer$$ExternalSyntheticLambda5(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectResult SetupBackNavigation$lambda$34$lambda$33;
        DisposableEffectResult invoke$lambda$11$lambda$10;
        DisposableEffectResult rememberIsConversationHostActive$lambda$5$lambda$4;
        switch (this.$r8$classId) {
            case 0:
                SetupBackNavigation$lambda$34$lambda$33 = RaConversationRenderer.SetupBackNavigation$lambda$34$lambda$33((NavHostController) this.f$0, (LifecycleOwner) this.f$1, (RaConversationDismissHandler) this.f$2, (DisposableEffectScope) obj);
                return SetupBackNavigation$lambda$34$lambda$33;
            case 1:
                invoke$lambda$11$lambda$10 = RaConversationRenderer$RenderRaConversation$5.AnonymousClass1.invoke$lambda$11$lambda$10((View) this.f$0, (MutableState) this.f$1, (MutableState) this.f$2, (DisposableEffectScope) obj);
                return invoke$lambda$11$lambda$10;
            default:
                rememberIsConversationHostActive$lambda$5$lambda$4 = ConversationHostActiveKt.rememberIsConversationHostActive$lambda$5$lambda$4((RaConversationLifecycleNotifier) this.f$0, (RaConversationHost) this.f$1, (MutableState) this.f$2, (DisposableEffectScope) obj);
                return rememberIsConversationHostActive$lambda$5$lambda$4;
        }
    }
}
