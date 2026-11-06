package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client;

import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.WebSocket;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ClassifyIntentClient$$ExternalSyntheticLambda18 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClassifyIntentClient f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ClassifyIntentClient$$ExternalSyntheticLambda18(ClassifyIntentClient classifyIntentClient, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = classifyIntentClient;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onSocketOpen$lambda$13;
        Unit beginTurn$lambda$6;
        switch (this.$r8$classId) {
            case 0:
                onSocketOpen$lambda$13 = ClassifyIntentClient.onSocketOpen$lambda$13(this.f$0, (ClassifyIntentClient.SessionContext) this.f$1, (WebSocket) this.f$2);
                return onSocketOpen$lambda$13;
            default:
                beginTurn$lambda$6 = ClassifyIntentClient.beginTurn$lambda$6(this.f$0, (String) this.f$1, (String) this.f$2);
                return beginTurn$lambda$6;
        }
    }
}
