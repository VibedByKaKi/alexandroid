package com.amazon.deecomms.messaging.model.payload;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.deecomms.notifications.util.TextMessageTranslator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TextMessagePayload implements MessagePayload {
    public static final String ERROR_MISSING_PROPERTY_TEXT = "MISSING_PAYLOAD_PROPERTY_TEXT";
    public static final String TYPE = "message/text";

    @JsonProperty("templateId")
    private String templateId;

    @JsonProperty("text")
    private String text;

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getNotificationText(Context context) {
        return getSummaryText(context);
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getSummaryText(Context context) {
        return !TextUtils.isEmpty(this.templateId) ? new TextMessageTranslator(context).translate(this.templateId, getText()) : getText();
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getText() {
        return this.text;
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getType() {
        return "message/text";
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setText(String str) {
        this.text = str;
    }
}
