package com.amazon.deecomms.messaging.model.payload;

import android.content.Context;
import com.amazon.alexa.sharing.api.models.Payload;
import com.amazon.deecomms.R;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MediaMessagePayload implements MessagePayload {
    public static final String IMAGE_TYPE = "IMAGE";
    public static final String TYPE = "message/media";
    public static final String VIDEO_TYPE = "VIDEO";

    @JsonProperty(Payload.SERIALIZED_NAME_ATTACHMENTS)
    private Attachment[] attachments;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.deecomms.messaging.model.payload.MediaMessagePayload$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$deecomms$messaging$model$payload$MediaMessagePayload$MediaNotificationType;

        static {
            int[] iArr = new int[MediaNotificationType.values().length];
            $SwitchMap$com$amazon$deecomms$messaging$model$payload$MediaMessagePayload$MediaNotificationType = iArr;
            try {
                iArr[MediaNotificationType.SINGLE_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$messaging$model$payload$MediaMessagePayload$MediaNotificationType[MediaNotificationType.MULTIPLE_IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$messaging$model$payload$MediaMessagePayload$MediaNotificationType[MediaNotificationType.SINGLE_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$messaging$model$payload$MediaMessagePayload$MediaNotificationType[MediaNotificationType.MULTIPLE_VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$messaging$model$payload$MediaMessagePayload$MediaNotificationType[MediaNotificationType.IMAGES_AND_VIDEOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$messaging$model$payload$MediaMessagePayload$MediaNotificationType[MediaNotificationType.EMPTY_PAYLOAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Attachment {

        @JsonProperty("type")
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

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getNotificationText(Context context) {
        return getSummaryText(context);
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getSummaryText(Context context) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$deecomms$messaging$model$payload$MediaMessagePayload$MediaNotificationType[determineMediaNotificationType().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : String.format(context.getString(R.string.notification_text_multiple_videos_and_images_message), Integer.valueOf(getAttachments().length)) : String.format(context.getString(R.string.notification_text_multiple_video_messages), Integer.valueOf(getAttachments().length)) : context.getString(R.string.notification_text_new_video_message) : String.format(context.getString(R.string.notification_text_multiple_image_messages), Integer.valueOf(getAttachments().length)) : context.getString(R.string.notification_text_new_image_message);
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getType() {
        return "message/media";
    }
}
