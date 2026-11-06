package com.amazon.deecomms.notifications.model.announcement;

import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SimpleTextAnnouncementPayload {
    public static final String TYPE = "announcement/text-simple";

    @JsonProperty("announcementText")
    private String announcementText;

    @JsonProperty("sourceName")
    private String sourceName;

    @JsonProperty(MessagingControllerConstant.MESSAGING_CONTROLLER_PAYLOAD_TYPE)
    private String type;

    public String getNotificationText() {
        return this.announcementText;
    }

    public String getType() {
        return "announcement/text-simple";
    }
}
