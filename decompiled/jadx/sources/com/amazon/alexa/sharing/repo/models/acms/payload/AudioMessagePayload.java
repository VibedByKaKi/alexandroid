package com.amazon.alexa.sharing.repo.models.acms.payload;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AudioMessagePayload implements MessagePayload {
    public static final String ERROR_MISSING_PROPERTY_MEDIA_ID = "MISSING_PAYLOAD_PROPERTY_MEDIA_ID";
    public static final String TYPE = "message/audio";

    @SerializedName(VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID)
    private String mediaId;

    @SerializedName(LivePreviewBundleKeys.TRANSCRIPT)
    private String transcript;

    public AudioMessagePayload(String str, String str2) {
        this.mediaId = str;
        this.transcript = str2;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public String getTranscript() {
        return this.transcript;
    }

    @Override // com.amazon.alexa.sharing.repo.models.acms.payload.MessagePayload
    public String getType() {
        return "message/audio";
    }

    public void setMediaId(String str) {
        this.mediaId = str;
    }

    public void setTranscript(String str) {
        this.transcript = str;
    }

    public AudioMessagePayload() {
    }
}
