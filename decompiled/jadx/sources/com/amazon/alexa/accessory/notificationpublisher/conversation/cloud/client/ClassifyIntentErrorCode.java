package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentErrorCode;", "", "<init>", "()V", ClassifyIntentErrorCode.CLOUD_TURN_FAILED, "", ClassifyIntentErrorCode.WEBSOCKET_OPEN_FAILED, ClassifyIntentErrorCode.WEBSOCKET_SEND_REJECTED, ClassifyIntentErrorCode.WEBSOCKET_CLOSED, ClassifyIntentErrorCode.WEBSOCKET_FAILURE, ClassifyIntentErrorCode.MALFORMED_INBOUND_FRAME, "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ClassifyIntentErrorCode {

    @NotNull
    public static final String CLOUD_TURN_FAILED = "CLOUD_TURN_FAILED";

    @NotNull
    public static final ClassifyIntentErrorCode INSTANCE = new ClassifyIntentErrorCode();

    @NotNull
    public static final String MALFORMED_INBOUND_FRAME = "MALFORMED_INBOUND_FRAME";

    @NotNull
    public static final String WEBSOCKET_CLOSED = "WEBSOCKET_CLOSED";

    @NotNull
    public static final String WEBSOCKET_FAILURE = "WEBSOCKET_FAILURE";

    @NotNull
    public static final String WEBSOCKET_OPEN_FAILED = "WEBSOCKET_OPEN_FAILED";

    @NotNull
    public static final String WEBSOCKET_SEND_REJECTED = "WEBSOCKET_SEND_REJECTED";

    private ClassifyIntentErrorCode() {
    }
}
