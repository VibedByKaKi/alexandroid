package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentCloseReason;
import com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationSessionContext;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnControlling;", "", "delegate", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnControllerDelegate;", "getDelegate", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnControllerDelegate;", "setDelegate", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnControllerDelegate;)V", "startCaptureTurn", "", LivePreviewBundleKeys.TRANSCRIPT, "", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "capabilityHint", "context", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationSessionContext;", "close", "reason", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentCloseReason;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CaptureTurnControlling {
    void close(@NotNull ClassifyIntentCloseReason reason);

    @Nullable
    CaptureTurnControllerDelegate getDelegate();

    void setDelegate(@Nullable CaptureTurnControllerDelegate captureTurnControllerDelegate);

    void startCaptureTurn(@NotNull String transcript, @NotNull String sessionId, @NotNull String capabilityHint, @NotNull ConversationSessionContext context);
}
