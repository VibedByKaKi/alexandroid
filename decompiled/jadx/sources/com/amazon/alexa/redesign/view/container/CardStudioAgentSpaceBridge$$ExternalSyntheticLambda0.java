package com.amazon.alexa.redesign.view.container;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CardStudioAgentSpaceBridge$$ExternalSyntheticLambda0 implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardStudioAgentSpaceBridge f$0;

    public /* synthetic */ CardStudioAgentSpaceBridge$$ExternalSyntheticLambda0(CardStudioAgentSpaceBridge cardStudioAgentSpaceBridge, int i) {
        this.$r8$classId = i;
        this.f$0 = cardStudioAgentSpaceBridge;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.$r8$classId;
        CardStudioAgentSpaceBridge cardStudioAgentSpaceBridge = this.f$0;
        switch (i) {
            case 0:
                CardStudioAgentSpaceBridge.registerProcessLifecycleObserver$lambda$28(cardStudioAgentSpaceBridge, lifecycleOwner, event);
                break;
            default:
                CardStudioAgentSpaceBridge.registerActivityLifecycleObserver$lambda$30(cardStudioAgentSpaceBridge, lifecycleOwner, event);
                break;
        }
    }
}
