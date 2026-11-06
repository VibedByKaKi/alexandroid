package com.amazon.alexa.ra.core.data.model;

import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentClient;
import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentClientCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ConversationScreenState$$ExternalSyntheticLambda27 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ConversationScreenState$$ExternalSyntheticLambda27(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LiveTranscriptTurn appendLiveTranscriptResponseSegment$lambda$22;
        Unit abortSession$lambda$12;
        LiveTranscriptTurn updateLiveTranscript$lambda$21;
        switch (this.$r8$classId) {
            case 0:
                appendLiveTranscriptResponseSegment$lambda$22 = ConversationScreenState.appendLiveTranscriptResponseSegment$lambda$22(this.f$0, this.f$1, (LiveTranscriptTurn) obj);
                return appendLiveTranscriptResponseSegment$lambda$22;
            case 1:
                abortSession$lambda$12 = ClassifyIntentClient.abortSession$lambda$12(this.f$0, this.f$1, (ClassifyIntentClientCallback) obj);
                return abortSession$lambda$12;
            default:
                updateLiveTranscript$lambda$21 = ConversationScreenState.updateLiveTranscript$lambda$21(this.f$0, this.f$1, (LiveTranscriptTurn) obj);
                return updateLiveTranscript$lambda$21;
        }
    }
}
