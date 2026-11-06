package com.amazon.alexa.sharing.sharingsdk.payload;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.sharing.Constants;
import com.amazon.alexa.sharing.repo.models.acms.payload.SharingMessagePayload;
import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.GenericSharingMessageEvent;
import com.amazon.alexa.sharing.sharingsdk.ContentSharingService;
import com.amazon.alexa.sharing.sharingsdk.util.SharingSDKUtil;
import com.amazon.comms.log.CommsLogger;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ReactMessageMetadata {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ContentSharingService.class);

    @NonNull
    private String conversationId;

    @Nullable
    private String domainType;

    @Nullable
    private String globalMessageId;

    @Nullable
    private String messageType;

    @NonNull
    private String rawData;

    @NonNull
    private String templateKey;

    @Nullable
    private String templateName;

    public ReactMessageMetadata(GenericSharingMessageEvent genericSharingMessageEvent, Gson gson) {
        String json = gson.toJson(genericSharingMessageEvent.getPayload());
        this.conversationId = "";
        this.globalMessageId = genericSharingMessageEvent.getGlobalMessageId();
        this.templateName = genericSharingMessageEvent.getName();
        this.templateKey = genericSharingMessageEvent.getTemplateKey();
        this.rawData = json;
        SharingSDKUtil sharingSDKUtil = new SharingSDKUtil();
        this.messageType = sharingSDKUtil.getMessageTypeFromEvent(genericSharingMessageEvent);
        this.domainType = sharingSDKUtil.getDomainTypeFromEvent(genericSharingMessageEvent);
    }

    @NonNull
    private static String extractConversationIdFromPayload(@NonNull JsonObject jsonObject) {
        return jsonObject.has("conversationId") ? jsonObject.get("conversationId").getAsString() : "";
    }

    @NonNull
    private static String extractGlobalMessageIdFromPayload(@NonNull JsonObject jsonObject) {
        return jsonObject.has("globalMessageId") ? jsonObject.get("globalMessageId").getAsString() : jsonObject.has("globalMessageId") ? jsonObject.get("globalMessageId").getAsString() : "";
    }

    @NonNull
    private static String extractTemplateKeyFromPayload(@NonNull JsonObject jsonObject) {
        return jsonObject.has("templateKey") ? jsonObject.get("templateKey").getAsString() : jsonObject.has("reactionId") ? jsonObject.get("reactionId").getAsString() : "TemplateKeyNotFound";
    }

    @NonNull
    private static String extractTemplateNameFromPayload(@NonNull JsonObject jsonObject) {
        return jsonObject.has("name") ? jsonObject.get("name").getAsString() : "";
    }

    @NonNull
    public static ReactMessageMetadata fromContentURI(Uri uri) {
        String uri2 = uri.toString();
        ReactMessageMetadata reactMessageMetadata = new ReactMessageMetadata(uri2);
        try {
            reactMessageMetadata.setTemplateName("PhotoTemplate");
            reactMessageMetadata.setDomainType("photo");
            reactMessageMetadata.setTemplateKey("share-sheet-content::" + uri.getLastPathSegment());
            return reactMessageMetadata;
        } catch (Exception e) {
            CommsLogger commsLogger = LOG;
            commsLogger.e("[Content-Sharing-Service] This URI cannot be parsed.", e);
            commsLogger.d("[Content-Sharing-Service] This URI cannot be parsed.", commsLogger.sensitive(uri2));
            return reactMessageMetadata;
        }
    }

    @NonNull
    public static ReactMessageMetadata fromJson(@NonNull String str) {
        String str2;
        String str3;
        ReactMessageMetadata reactMessageMetadata = new ReactMessageMetadata(str);
        SharingSDKUtil sharingSDKUtil = new SharingSDKUtil();
        try {
            JsonObject jsonObject = (JsonObject) new Gson().fromJson(str, JsonObject.class);
            String extractTemplateKeyFromPayload = extractTemplateKeyFromPayload(jsonObject);
            if (!extractTemplateKeyFromPayload.equals("")) {
                reactMessageMetadata.setTemplateKey(extractTemplateKeyFromPayload);
            }
            String extractGlobalMessageIdFromPayload = extractGlobalMessageIdFromPayload(jsonObject);
            if (!extractGlobalMessageIdFromPayload.equals("")) {
                reactMessageMetadata.setGlobalMessageId(extractGlobalMessageIdFromPayload);
            }
            String extractConversationIdFromPayload = extractConversationIdFromPayload(jsonObject);
            if (!extractConversationIdFromPayload.equals("")) {
                reactMessageMetadata.setConversationId(extractConversationIdFromPayload);
            }
            String extractTemplateNameFromPayload = extractTemplateNameFromPayload(jsonObject);
            if (!extractTemplateNameFromPayload.equals("")) {
                reactMessageMetadata.setTemplateName(extractTemplateNameFromPayload);
            }
            if (!"AddReactionEvent".equals(extractTemplateNameFromPayload) && !"RemoveReactionEvent".equals(extractTemplateNameFromPayload)) {
                str3 = sharingSDKUtil.extractDomainTypeFromPayload(jsonObject);
                str2 = sharingSDKUtil.extractMessageTypeFromPayload(jsonObject);
                reactMessageMetadata.setMessageType(str2);
                reactMessageMetadata.setDomainType(str3);
                return reactMessageMetadata;
            }
            String messageType = ((SharingMessagePayload) new Gson().fromJson(jsonObject.get("sharedMediaMessage").getAsJsonObject().get("payload"), SharingMessagePayload.class)).getSharingMessage().getMessageType();
            String domainTypeFromMessageType = sharingSDKUtil.getDomainTypeFromMessageType(messageType);
            str2 = messageType;
            str3 = domainTypeFromMessageType;
            reactMessageMetadata.setMessageType(str2);
            reactMessageMetadata.setDomainType(str3);
            return reactMessageMetadata;
        } catch (Exception e) {
            CommsLogger commsLogger = LOG;
            commsLogger.e("[Content-Sharing-Service] Raw data is not a JSON object.", e);
            commsLogger.d("[Content-Sharing-Service] Raw data is not a JSON object.", commsLogger.sensitive(str));
            return reactMessageMetadata;
        }
    }

    @NonNull
    public String getConversationId() {
        return this.conversationId;
    }

    @NonNull
    public String getDomainType() {
        return this.domainType;
    }

    @Nullable
    public String getGlobalMessageId() {
        return this.globalMessageId;
    }

    @NonNull
    public String getMessageType() {
        return this.messageType;
    }

    @NonNull
    public String getRawData() {
        return this.rawData;
    }

    @NonNull
    public String getTemplateKey() {
        return this.templateKey;
    }

    @Nullable
    public String getTemplateName() {
        return this.templateName;
    }

    public void setConversationId(@NonNull String str) {
        this.conversationId = str;
    }

    public void setDomainType(@NonNull String str) {
        this.domainType = str;
    }

    public void setGlobalMessageId(@Nullable String str) {
        this.globalMessageId = str;
    }

    public void setMessageType(@NonNull String str) {
        this.messageType = str;
    }

    public void setRawData(@NonNull String str) {
        this.rawData = str;
    }

    public void setTemplateKey(@NonNull String str) {
        this.templateKey = str;
    }

    public void setTemplateName(@Nullable String str) {
        this.templateName = str;
    }

    public HashMap<String, String> toMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("conversationId", this.conversationId);
        hashMap.put("globalMessageId", this.globalMessageId);
        hashMap.put("templateKey", this.templateKey);
        hashMap.put("domainType", this.domainType);
        hashMap.put("messageType", this.messageType);
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReactMessageMetadata {\n\"conversationId\": \"");
        sb.append(this.conversationId);
        sb.append("\",\n\t\"globalMessageId\": \"");
        sb.append(this.globalMessageId);
        sb.append("\",\n\t\"templateKey\": \"");
        sb.append(this.templateKey);
        sb.append("\",\n\t\"domainType\": \"");
        sb.append(this.domainType);
        sb.append("\",\n\t\"messageType\": \"");
        sb.append(this.messageType);
        sb.append("\",\n\t\"templateName\": \"");
        return a$$ExternalSyntheticOutline0.m(sb, this.templateName, "\"\n}");
    }

    public ReactMessageMetadata(@NonNull String str) {
        this.conversationId = "";
        this.rawData = str;
        this.globalMessageId = "";
        this.templateKey = "TemplateKeyNotFound";
        this.templateName = "";
        this.messageType = "";
        this.domainType = "";
    }
}
