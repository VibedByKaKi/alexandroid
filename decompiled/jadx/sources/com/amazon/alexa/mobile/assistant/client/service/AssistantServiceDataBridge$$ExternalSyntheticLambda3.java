package com.amazon.alexa.mobile.assistant.client.service;

import com.amazon.alexa.api.compat.model.assistant.AssistantApiDeliveryResult;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AssistantServiceDataBridge$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AssistantServiceDataBridge f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ AssistantServiceDataBridge$$ExternalSyntheticLambda3(AssistantServiceDataBridge assistantServiceDataBridge, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = assistantServiceDataBridge;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AssistantApiDeliveryResult onFragmentRenderingPaused$lambda$8;
        AssistantApiDeliveryResult onFragmentRenderingResumed$lambda$9;
        switch (this.$r8$classId) {
            case 0:
                onFragmentRenderingPaused$lambda$8 = AssistantServiceDataBridge.onFragmentRenderingPaused$lambda$8(this.f$0, this.f$1);
                return onFragmentRenderingPaused$lambda$8;
            default:
                onFragmentRenderingResumed$lambda$9 = AssistantServiceDataBridge.onFragmentRenderingResumed$lambda$9(this.f$0, this.f$1);
                return onFragmentRenderingResumed$lambda$9;
        }
    }
}
