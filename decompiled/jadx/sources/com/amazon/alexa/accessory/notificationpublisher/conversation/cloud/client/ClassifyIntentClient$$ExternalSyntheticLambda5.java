package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ClassifyIntentClient$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClassifyIntentClient f$0;

    public /* synthetic */ ClassifyIntentClient$$ExternalSyntheticLambda5(ClassifyIntentClient classifyIntentClient, int i) {
        this.$r8$classId = i;
        this.f$0 = classifyIntentClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit close$lambda$11;
        Unit endTurnInput$lambda$8;
        int i = this.$r8$classId;
        ClassifyIntentClient classifyIntentClient = this.f$0;
        switch (i) {
            case 0:
                close$lambda$11 = ClassifyIntentClient.close$lambda$11(classifyIntentClient);
                return close$lambda$11;
            default:
                endTurnInput$lambda$8 = ClassifyIntentClient.endTurnInput$lambda$8(classifyIntentClient);
                return endTurnInput$lambda$8;
        }
    }
}
