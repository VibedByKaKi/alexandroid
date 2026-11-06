package com.amazon.alexa.sharing.repo.models.acms.payload;

import com.amazon.alexa.sharing.api.models.Payload;
import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class MediaMessagePayload implements MessagePayload {
    public static final String IMAGE_TYPE = "IMAGE";
    public static final String TYPE = "message/media";
    public static final String VIDEO_TYPE = "VIDEO";

    @SerializedName(Payload.SERIALIZED_NAME_ATTACHMENTS)
    private Attachment[] attachments;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Attachment {

        @SerializedName("type")
        private String type;

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MediaNotificationType {
        EMPTY_PAYLOAD,
        UNKNOWN_PAYLOAD,
        SINGLE_IMAGE,
        SINGLE_VIDEO,
        MULTIPLE_IMAGES,
        MULTIPLE_VIDEOS,
        IMAGES_AND_VIDEOS
    }

    private MediaNotificationType determineMediaNotificationType() {
        Attachment[] attachments = getAttachments();
        if (attachments.length == 0) {
            return MediaNotificationType.EMPTY_PAYLOAD;
        }
        String type = attachments[0].getType();
        return attachments.length == 1 ? getSingularMediaNotificationType(type) : getMultipleMediaNotificationType(type);
    }

    private MediaNotificationType getMultipleMediaNotificationType(String str) {
        if (includesImagesAndVideo().booleanValue()) {
            return MediaNotificationType.IMAGES_AND_VIDEOS;
        }
        str.getClass();
        return !str.equals("IMAGE") ? !str.equals("VIDEO") ? MediaNotificationType.UNKNOWN_PAYLOAD : MediaNotificationType.MULTIPLE_VIDEOS : MediaNotificationType.MULTIPLE_IMAGES;
    }

    private MediaNotificationType getSingularMediaNotificationType(String str) {
        str.getClass();
        return !str.equals("IMAGE") ? !str.equals("VIDEO") ? MediaNotificationType.UNKNOWN_PAYLOAD : MediaNotificationType.SINGLE_VIDEO : MediaNotificationType.SINGLE_IMAGE;
    }

    private Boolean includesImagesAndVideo() {
        Attachment[] attachments = getAttachments();
        for (Attachment attachment : attachments) {
            if (!attachment.type.equalsIgnoreCase(attachments[0].type)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public Attachment[] getAttachments() {
        return this.attachments;
    }

    @Override // com.amazon.alexa.sharing.repo.models.acms.payload.MessagePayload
    public String getType() {
        return "message/media";
    }
}
