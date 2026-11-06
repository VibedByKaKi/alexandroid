package com.amazon.alexa.voice.nowplaying;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.notificationpublisher.servicerequest.GetFocusFilterTemplatesFromS3RequestSender;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.amazon.alexa.voice.ui.onedesign.util.JSONUtils;
import com.amazon.alexa.voice.ui.onedesign.util.Logger;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class PlayerInfoPayload {
    private static final String TAG = "PlayerInfoPayload";
    private final String album;
    private final String artImageUrl;
    private final String artist;
    private final String backgroundImageUrl;
    private final String mediaId;
    private final String playbackSource;
    private final String providerLogoId;
    private final String providerName;
    private final String title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        String album;
        String artImageUrl;
        String artist;
        String backgroundImageUrl;
        String mediaId;
        String playbackSource;
        String providerLogoId;
        String providerName;
        String title;

        public Builder album(String str) {
            this.album = str;
            return this;
        }

        public Builder artImageUrl(String str) {
            this.artImageUrl = str;
            return this;
        }

        public Builder artist(String str) {
            this.artist = str;
            return this;
        }

        public Builder backgroundImageUrl(String str) {
            this.backgroundImageUrl = str;
            return this;
        }

        public PlayerInfoPayload build() {
            String str = this.title;
            if (str == null) {
                str = "";
            }
            this.title = str;
            String str2 = this.artist;
            if (str2 == null) {
                str2 = "";
            }
            this.artist = str2;
            String str3 = this.album;
            if (str3 == null) {
                str3 = "";
            }
            this.album = str3;
            String str4 = this.backgroundImageUrl;
            if (str4 == null) {
                str4 = "";
            }
            this.backgroundImageUrl = str4;
            String str5 = this.artImageUrl;
            if (str5 == null) {
                str5 = "";
            }
            this.artImageUrl = str5;
            String str6 = this.providerLogoId;
            if (str6 == null) {
                str6 = "";
            }
            this.providerLogoId = str6;
            String str7 = this.providerName;
            this.providerName = str7 != null ? str7 : "";
            return new PlayerInfoPayload(this, 0);
        }

        public Builder mediaId(String str) {
            this.mediaId = str;
            return this;
        }

        public Builder playbackSource(String str) {
            this.playbackSource = str;
            return this;
        }

        public Builder providerLogoId(String str) {
            this.providerLogoId = str;
            return this;
        }

        public Builder providerName(String str) {
            this.providerName = str;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory {
        public PlayerInfoPayload create(@NonNull JSONObject jSONObject) {
            String optionalString;
            String optionalString2;
            String optionalString3;
            String optionalString4;
            String optionalString5;
            String optionalString6;
            Builder builder = new Builder();
            String optionalString7 = JSONUtils.optionalString(jSONObject, VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID);
            String optionalString8 = JSONUtils.optionalString(jSONObject, VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_SOURCE);
            JSONObject optJSONObject = jSONObject.optJSONObject("infoText");
            String str = null;
            if (optJSONObject == null) {
                Logger.debug("PlayerInfo is missing infoText object");
                optionalString3 = null;
                optionalString = null;
                optionalString2 = null;
            } else {
                optionalString = JSONUtils.optionalString(optJSONObject, "title", "");
                optionalString2 = JSONUtils.optionalString(optJSONObject, "subText1", "");
                optionalString3 = JSONUtils.optionalString(optJSONObject, "subText2", "");
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(GetFocusFilterTemplatesFromS3RequestSender.TEMPLATE_KEY);
            if (optJSONObject2 == null) {
                Logger.debug("PlayerInfo is missing template object");
                optionalString5 = null;
                optionalString4 = null;
            } else {
                optionalString4 = JSONUtils.optionalString(optJSONObject2, VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_BACKGROUND_IMAGE_URL, "");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("art");
                if (optJSONObject3 == null) {
                    Logger.debug("PlayerInfo is missing template.art object");
                    optionalString5 = null;
                } else {
                    optionalString5 = JSONUtils.optionalString(optJSONObject3, "url", "");
                }
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("provider");
            if (optJSONObject4 == null) {
                Logger.debug("PlayerInfo is missing provider object");
                optionalString6 = null;
            } else {
                optionalString6 = JSONUtils.optionalString(optJSONObject4, VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_PROVIDER_NAME, "");
                JSONObject optJSONObject5 = optJSONObject4.optJSONObject("providerLogo");
                if (optJSONObject5 == null) {
                    Logger.debug("PlayerInfo is missing provider.providerLogo object");
                } else {
                    str = JSONUtils.optionalString(optJSONObject5, "iconId", "");
                }
            }
            return builder.title(optionalString).artist(optionalString2).album(optionalString3).backgroundImageUrl(optionalString4).artImageUrl(optionalString5).providerLogoId(str).providerName(optionalString6).mediaId(optionalString7).playbackSource(optionalString8).build();
        }
    }

    private PlayerInfoPayload(Builder builder) {
        this.title = builder.title;
        this.artist = builder.artist;
        this.album = builder.album;
        this.backgroundImageUrl = builder.backgroundImageUrl;
        this.artImageUrl = builder.artImageUrl;
        this.providerName = builder.providerName;
        this.providerLogoId = builder.providerLogoId;
        this.mediaId = builder.mediaId;
        this.playbackSource = builder.playbackSource;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlayerInfoPayload.class == obj.getClass()) {
            PlayerInfoPayload playerInfoPayload = (PlayerInfoPayload) obj;
            if (!this.title.equals(playerInfoPayload.title) || !this.artist.equals(playerInfoPayload.artist) || !this.album.equals(playerInfoPayload.album) || !this.backgroundImageUrl.equals(playerInfoPayload.backgroundImageUrl) || !this.artImageUrl.equals(playerInfoPayload.artImageUrl) || !this.providerName.equals(playerInfoPayload.providerName) || !this.providerLogoId.equals(playerInfoPayload.providerLogoId)) {
                return false;
            }
            String str = this.mediaId;
            String str2 = playerInfoPayload.mediaId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getArtImageUrl() {
        return this.artImageUrl;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @Nullable
    public String getMediaId() {
        return this.mediaId;
    }

    public String getPlaybackSource() {
        return this.playbackSource;
    }

    public String getProviderLogoId() {
        return this.providerLogoId;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Objects.hash(this.title, this.artist, this.album, this.backgroundImageUrl, this.artImageUrl, this.providerName, this.providerLogoId, this.mediaId);
    }

    public String toString() {
        return "PlayerInfoPayload{title=\"" + this.title + "\", artist=\"" + this.artist + "\", album=\"" + this.album + "\", backgroundImageUrl=\"" + this.backgroundImageUrl + "\", artImageUrl=\"" + this.artImageUrl + "\", providerName=\"" + this.providerName + "\", providerLogoId=\"" + this.providerLogoId + "\", mediaId=" + (this.mediaId == null ? "null" : a$$ExternalSyntheticOutline0.m(new StringBuilder("'"), this.mediaId, "'")) + AbstractJsonLexerKt.END_OBJ;
    }

    public /* synthetic */ PlayerInfoPayload(Builder builder, int i) {
        this(builder);
    }
}
