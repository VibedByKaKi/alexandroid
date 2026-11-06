package com.amazon.alexa.assistant.capability.speechrecognizer;

import com.amazon.alexa.accessory.notificationpublisher.conversation.capability.handler.TextMessageSendingHandler;
import com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.Conversation;
import com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechProviderError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class VoiceChatSpeechProvider$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ VoiceChatSpeechProvider$$ExternalSyntheticLambda0(long j, VoiceChatSpeechProvider voiceChatSpeechProvider, String str) {
        this.f$0 = j;
        this.f$1 = voiceChatSpeechProvider;
        this.f$2 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onSpeechDetected$lambda$37;
        Unit sendReply$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                onSpeechDetected$lambda$37 = VoiceChatSpeechProvider.onSpeechDetected$lambda$37(this.f$0, (VoiceChatSpeechProvider) this.f$1, (String) this.f$2, (SpeechProviderError) obj);
                return onSpeechDetected$lambda$37;
            default:
                sendReply$lambda$1 = TextMessageSendingHandler.sendReply$lambda$1((TextMessageSendingHandler) this.f$1, (Conversation) this.f$2, this.f$0, ((Boolean) obj).booleanValue());
                return sendReply$lambda$1;
        }
    }

    public /* synthetic */ VoiceChatSpeechProvider$$ExternalSyntheticLambda0(TextMessageSendingHandler textMessageSendingHandler, Conversation conversation, long j) {
        this.f$1 = textMessageSendingHandler;
        this.f$2 = conversation;
        this.f$0 = j;
    }
}
