package com.amazon.alexa.sharing.api.models;

import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PayloadAttachmentEmoji implements PayloadAttachment {
    public static final String SERIALIZED_NAME_TEXT = "text";
    public static final String SERIALIZED_NAME_TYPE = "type";
    public static final String TYPE = "emoji";

    @SerializedName("text")
    private String text;

    @SerializedName("type")
    private String type = TYPE;

    public PayloadAttachmentEmoji(String str) {
        this.text = str;
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PayloadAttachmentEmoji payloadAttachmentEmoji = (PayloadAttachmentEmoji) obj;
            if (Objects.equals(this.type, payloadAttachmentEmoji.type) && Objects.equals(this.text, payloadAttachmentEmoji.text)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getText() {
        return this.text;
    }

    @Override // com.amazon.alexa.sharing.api.models.PayloadAttachment
    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.text);
    }

    public void setText(String str) {
        this.text = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class PayloadAttachmentEmoji {\n    type: ");
        sb.append(toIndentedString(this.type));
        sb.append("\n    text: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.text), "\n}");
    }
}
