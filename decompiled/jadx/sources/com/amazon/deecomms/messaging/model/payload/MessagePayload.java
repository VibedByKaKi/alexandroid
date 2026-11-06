package com.amazon.deecomms.messaging.model.payload;

import android.content.Context;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonSubTypes({@JsonSubTypes.Type(name = "event/call", value = CallEventPayload.class), @JsonSubTypes.Type(name = "event/missed-call", value = MissedCallEventPayload.class), @JsonSubTypes.Type(name = "message/text", value = TextMessagePayload.class), @JsonSubTypes.Type(name = "message/contact-invitation", value = ContactInvitationPayload.class), @JsonSubTypes.Type(name = "message/contact-connection-success", value = ContactConnectionSuccessPayload.class), @JsonSubTypes.Type(name = "message/audio", value = AudioMessagePayload.class), @JsonSubTypes.Type(name = "message/media", value = MediaMessagePayload.class), @JsonSubTypes.Type(name = "event/reaction", value = ReactionEventMessagePayload.class), @JsonSubTypes.Type(name = "message/shared-content", value = SharingMessagePayload.class)})
@JsonTypeInfo(include = JsonTypeInfo.As.PROPERTY, property = MessagingControllerConstant.MESSAGING_CONTROLLER_PAYLOAD_TYPE, use = JsonTypeInfo.Id.NAME)
/* loaded from: classes5.dex */
public interface MessagePayload {
    String getNotificationText(Context context);

    String getSummaryText(Context context);

    @JsonIgnore
    String getType();
}
