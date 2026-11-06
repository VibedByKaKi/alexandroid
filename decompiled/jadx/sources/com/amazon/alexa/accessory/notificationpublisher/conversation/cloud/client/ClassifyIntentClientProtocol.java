package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentCloseReason;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentClientProtocol;", "", "openSession", "", LivePreviewBundleKeys.TRANSCRIPT, "", "capabilityHint", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "captureDeviceType", "callback", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentClientCallback;", "beginTurn", "sendOpusPacket", "data", "", "endTurnInput", "endSession", "reason", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentCloseReason;", "close", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ClassifyIntentClientProtocol {
    void beginTurn(@NotNull String transcript, @NotNull String capabilityHint);

    void close();

    void endSession(@NotNull ClassifyIntentCloseReason reason);

    void endTurnInput();

    void openSession(@NotNull String transcript, @NotNull String capabilityHint, @Nullable String sessionId, @Nullable String captureDeviceType, @NotNull ClassifyIntentClientCallback callback);

    void sendOpusPacket(@NotNull byte[] data);
}
