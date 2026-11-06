package com.amazon.alexa.mobile.assistant.client.service;

import com.amazon.alexa.api.compat.model.assistant.AssistantApiDeliveryResult;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AssistantServiceDataBridge$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AssistantServiceDataBridge f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ AssistantServiceDataBridge$$ExternalSyntheticLambda2(AssistantServiceDataBridge assistantServiceDataBridge, String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = assistantServiceDataBridge;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AssistantApiDeliveryResult onAddFragments$lambda$11;
        AssistantApiDeliveryResult onDisplay$lambda$15;
        AssistantApiDeliveryResult onConversationUpdated$lambda$6;
        AssistantApiDeliveryResult onUpdateConversationMetadata$lambda$13;
        AssistantApiDeliveryResult onDeleteConversations$lambda$14;
        AssistantApiDeliveryResult onPersonalizedContent$lambda$16;
        AssistantApiDeliveryResult onUpdateFragmentData$lambda$12;
        switch (this.$r8$classId) {
            case 0:
                onAddFragments$lambda$11 = AssistantServiceDataBridge.onAddFragments$lambda$11(this.f$0, this.f$1, this.f$2);
                return onAddFragments$lambda$11;
            case 1:
                onDisplay$lambda$15 = AssistantServiceDataBridge.onDisplay$lambda$15(this.f$0, this.f$1, this.f$2);
                return onDisplay$lambda$15;
            case 2:
                onConversationUpdated$lambda$6 = AssistantServiceDataBridge.onConversationUpdated$lambda$6(this.f$0, this.f$1, this.f$2);
                return onConversationUpdated$lambda$6;
            case 3:
                onUpdateConversationMetadata$lambda$13 = AssistantServiceDataBridge.onUpdateConversationMetadata$lambda$13(this.f$0, this.f$1, this.f$2);
                return onUpdateConversationMetadata$lambda$13;
            case 4:
                onDeleteConversations$lambda$14 = AssistantServiceDataBridge.onDeleteConversations$lambda$14(this.f$0, this.f$1, this.f$2);
                return onDeleteConversations$lambda$14;
            case 5:
                onPersonalizedContent$lambda$16 = AssistantServiceDataBridge.onPersonalizedContent$lambda$16(this.f$0, this.f$1, this.f$2);
                return onPersonalizedContent$lambda$16;
            default:
                onUpdateFragmentData$lambda$12 = AssistantServiceDataBridge.onUpdateFragmentData$lambda$12(this.f$0, this.f$1, this.f$2);
                return onUpdateFragmentData$lambda$12;
        }
    }
}
