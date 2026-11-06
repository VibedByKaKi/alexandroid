package com.amazon.deecomms.messaging.model.payload;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.deecomms.R;
import com.amazon.deecomms.messaging.model.Message;
import com.amazon.deecomms.sharing.payload.parse.GenericSharingMessageEventPayload;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SharingMessagePayload implements MessagePayload {
    public static final String PODCAST_DOMAIN_CONTENT_TYPE = "alexa-music/podcastEpisode";
    public static final String TYPE = "message/shared-content";
    private String parentMessageType;

    @JsonProperty("sharingMessage")
    private GenericSharingMessageEventPayload sharingMessage;

    public SharingMessagePayload(GenericSharingMessageEventPayload genericSharingMessageEventPayload) {
        this.sharingMessage = genericSharingMessageEventPayload;
        this.parentMessageType = null;
    }

    public void extractMetadataFromMessage(Message message) {
        setParentMessageType(message.getParentMessageType());
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getNotificationText(@NonNull Context context) {
        return getSummaryText(context);
    }

    public String getParentMessageType() {
        return this.parentMessageType;
    }

    public GenericSharingMessageEventPayload getSharingMessage() {
        return this.sharingMessage;
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getSummaryText(@NonNull Context context) {
        GenericSharingMessageEventPayload genericSharingMessageEventPayload = this.sharingMessage;
        if (genericSharingMessageEventPayload == null) {
            return context.getString(R.string.notification_text_new_shared_message);
        }
        String messageType = genericSharingMessageEventPayload.getMessageType();
        return PODCAST_DOMAIN_CONTENT_TYPE.equals(this.sharingMessage.getDomainContentType()) ? context.getString(R.string.notification_text_new_shared_podcast_message) : "reaction/default".equals(messageType) ? "alexa-music/song".equals(this.parentMessageType) ? context.getString(R.string.notification_text_new_shared_song_reaction) : context.getString(R.string.notification_text_new_shared_reaction) : "alexa-music/song".equals(messageType) ? context.getString(R.string.notification_text_new_shared_song_message) : "alexa-shopping/shoppingList".equals(messageType) ? context.getString(R.string.notification_text_new_shared_shoppingList_message) : context.getString(R.string.notification_text_new_shared_message);
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getType() {
        return "message/shared-content";
    }

    public void setParentMessageType(String str) {
        this.parentMessageType = str;
    }

    public void setSharingMessage(GenericSharingMessageEventPayload genericSharingMessageEventPayload) {
        this.sharingMessage = genericSharingMessageEventPayload;
    }

    public SharingMessagePayload() {
        this(null);
    }
}
