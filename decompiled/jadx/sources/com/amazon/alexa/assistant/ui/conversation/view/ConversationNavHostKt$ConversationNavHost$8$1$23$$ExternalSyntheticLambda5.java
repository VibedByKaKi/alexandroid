package com.amazon.alexa.assistant.ui.conversation.view;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConversationNavHostKt$ConversationNavHost$8$1$23$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JitPermissionMetrics f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ ConversationNavHostKt$ConversationNavHost$8$1$23$$ExternalSyntheticLambda5(JitPermissionMetrics jitPermissionMetrics, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = jitPermissionMetrics;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectResult invoke$lambda$34$lambda$15$lambda$14;
        DisposableEffectResult invoke$lambda$35$lambda$10$lambda$9;
        switch (this.$r8$classId) {
            case 0:
                invoke$lambda$34$lambda$15$lambda$14 = ConversationNavHostKt$ConversationNavHost$8$1$23.invoke$lambda$34$lambda$15$lambda$14(this.f$0, this.f$1, (DisposableEffectScope) obj);
                return invoke$lambda$34$lambda$15$lambda$14;
            default:
                invoke$lambda$35$lambda$10$lambda$9 = ConversationNavHostKt$ConversationNavHost$8$1$24.invoke$lambda$35$lambda$10$lambda$9(this.f$0, this.f$1, (DisposableEffectScope) obj);
                return invoke$lambda$35$lambda$10$lambda$9;
        }
    }
}
