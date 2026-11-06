package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import com.amazon.alexa.accessory.notificationpublisher.conversation.capability.model.Capability;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationSession;", "", "id", "", "capability", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability;", "context", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationSessionContext;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability;Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationSessionContext;)V", "getId", "()Ljava/lang/String;", "getCapability", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability;", "getContext", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationSessionContext;", LivePreviewBundleKeys.TRANSCRIPT, "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationTranscript;", "getTranscript", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationTranscript;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConversationSession {

    @NotNull
    private final Capability capability;

    @NotNull
    private final ConversationSessionContext context;

    @NotNull
    private final String id;

    @NotNull
    private final ConversationTranscript transcript;

    public ConversationSession(@NotNull String str, @NotNull Capability capability, @NotNull ConversationSessionContext conversationSessionContext) {
        str.getClass();
        capability.getClass();
        conversationSessionContext.getClass();
        this.id = str;
        this.capability = capability;
        this.context = conversationSessionContext;
        this.transcript = new ConversationTranscript();
    }

    @NotNull
    public final Capability getCapability() {
        return this.capability;
    }

    @NotNull
    public final ConversationSessionContext getContext() {
        return this.context;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ConversationTranscript getTranscript() {
        return this.transcript;
    }
}
