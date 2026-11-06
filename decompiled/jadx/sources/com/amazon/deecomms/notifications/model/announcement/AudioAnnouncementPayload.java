package com.amazon.deecomms.notifications.model.announcement;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.amazon.deecomms.R;
import com.amazon.deecomms.messaging.model.payload.MessagePayload;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AudioAnnouncementPayload implements MessagePayload {
    public static final String TYPE = "announcement/audio";

    @JsonProperty("effectName")
    private String effectName;

    @JsonProperty(VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID)
    private String mediaId;

    @JsonProperty("sourceName")
    private String sourceName;

    @JsonProperty(LivePreviewBundleKeys.TRANSCRIPT)
    private String transcript;

    @JsonProperty(MessagingControllerConstant.MESSAGING_CONTROLLER_PAYLOAD_TYPE)
    private String type;

    private String getTranscript() {
        return this.transcript;
    }

    public String getEffectName() {
        return this.effectName;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getNotificationText(Context context) {
        String transcript = getTranscript();
        if (TextUtils.isEmpty(transcript)) {
            return new String(Character.toChars(127908)) + context.getString(R.string.audio_announcement);
        }
        return new String(Character.toChars(127908)) + context.getString(R.string.notification_text_audio_announcement, transcript);
    }

    public String getSourceName() {
        return this.sourceName;
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getSummaryText(Context context) {
        return getTranscript();
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getType() {
        return "announcement/audio";
    }

    public void setEffectName(String str) {
        this.effectName = str;
    }

    public void setMediaId(String str) {
        this.mediaId = str;
    }

    public void setSourceName(String str) {
        this.sourceName = str;
    }

    public void setTranscript(String str) {
        this.transcript = str;
    }
}
