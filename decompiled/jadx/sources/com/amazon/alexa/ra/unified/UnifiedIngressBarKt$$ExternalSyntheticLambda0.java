package com.amazon.alexa.ra.unified;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import com.amazon.alexa.voice.ui.ra.RaConversationLifecycleNotifier;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class UnifiedIngressBarKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RaConversationLifecycleNotifier f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ UnifiedIngressBarKt$$ExternalSyntheticLambda0(RaConversationLifecycleNotifier raConversationLifecycleNotifier, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = raConversationLifecycleNotifier;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectResult rememberConversationActive$lambda$89$lambda$88;
        DisposableEffectResult rememberRawConversationActive$lambda$96$lambda$95;
        DisposableEffectResult rememberVoiceOrLiveModality$lambda$102$lambda$101;
        DisposableEffectResult UnifiedIngressBarScreen$lambda$14$lambda$13;
        switch (this.$r8$classId) {
            case 0:
                rememberConversationActive$lambda$89$lambda$88 = UnifiedIngressBarKt.rememberConversationActive$lambda$89$lambda$88(this.f$0, this.f$1, (DisposableEffectScope) obj);
                return rememberConversationActive$lambda$89$lambda$88;
            case 1:
                rememberRawConversationActive$lambda$96$lambda$95 = UnifiedIngressBarKt.rememberRawConversationActive$lambda$96$lambda$95(this.f$0, this.f$1, (DisposableEffectScope) obj);
                return rememberRawConversationActive$lambda$96$lambda$95;
            case 2:
                rememberVoiceOrLiveModality$lambda$102$lambda$101 = UnifiedIngressBarKt.rememberVoiceOrLiveModality$lambda$102$lambda$101(this.f$0, this.f$1, (DisposableEffectScope) obj);
                return rememberVoiceOrLiveModality$lambda$102$lambda$101;
            default:
                UnifiedIngressBarScreen$lambda$14$lambda$13 = UnifiedIngressBarKt.UnifiedIngressBarScreen$lambda$14$lambda$13(this.f$0, this.f$1, (DisposableEffectScope) obj);
                return UnifiedIngressBarScreen$lambda$14$lambda$13;
        }
    }
}
