package com.amazon.alexa.sharing.repo.models.acms.payload;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TextMessagePayload implements MessagePayload {
    public static final String ERROR_MISSING_PROPERTY_TEXT = "MISSING_PAYLOAD_PROPERTY_TEXT";
    public static final String TYPE = "message/text";

    @SerializedName("templateId")
    private String templateId;

    @SerializedName("text")
    private String text;

    public TextMessagePayload(String str, String str2) {
        this.text = str;
        this.templateId = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TextMessagePayload textMessagePayload = (TextMessagePayload) obj;
            if (Objects.equals(this.text, textMessagePayload.text) && Objects.equals(this.templateId, textMessagePayload.templateId)) {
                return true;
            }
        }
        return false;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getText() {
        return this.text;
    }

    @Override // com.amazon.alexa.sharing.repo.models.acms.payload.MessagePayload
    public String getType() {
        return "message/text";
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.text, this.templateId);
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextMessagePayload {text='");
        sb.append(this.text);
        sb.append("', templateId='");
        return a$$ExternalSyntheticOutline0.m(sb, this.templateId, "'}");
    }
}
