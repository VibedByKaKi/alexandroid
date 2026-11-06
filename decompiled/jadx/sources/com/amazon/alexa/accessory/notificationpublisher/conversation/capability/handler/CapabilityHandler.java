package com.amazon.alexa.accessory.notificationpublisher.conversation.capability.handler;

import com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.Conversation;
import com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/handler/CapabilityHandler;", "", "start", "", "conversation", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/Conversation;", "handle", "event", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEvent;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CapabilityHandler {
    void handle(@NotNull ConversationEvent event, @NotNull Conversation conversation);

    void start(@NotNull Conversation conversation);
}
