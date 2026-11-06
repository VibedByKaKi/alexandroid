package com.amazon.alexa.assistant.capability.conversation;

import com.amazon.alexa.voice.utils.RouteHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/NoOpConversationIDProvider;", "Lcom/amazon/alexa/assistant/capability/conversation/ConversationIDProvider;", "<init>", "()V", RouteHelper.PARAMETER_CONV_ID, "", "getConversationID", "()Ljava/lang/String;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NoOpConversationIDProvider implements ConversationIDProvider {

    @Nullable
    private final String conversationID;

    @Override // com.amazon.alexa.assistant.capability.conversation.ConversationIDProvider
    @Nullable
    public String getConversationID() {
        return this.conversationID;
    }
}
