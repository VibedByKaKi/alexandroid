package com.amazon.alexa.sharing.api.models;

import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PayloadAttachmentText implements PayloadAttachment {
    public static final String SERIALIZED_NAME_TEXT = "text";
    public static final String SERIALIZED_NAME_TYPE = "type";
    public static final String TYPE = "text";

    @SerializedName("text")
    private String text;

    @SerializedName("type")
    private String type = "text";

    public PayloadAttachmentText(String str) {
        this.text = str;
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.text, ((PayloadAttachmentText) obj).text);
    }

    @Nullable
    public String getText() {
        return this.text;
    }

    @Override // com.amazon.alexa.sharing.api.models.PayloadAttachment
    public String getType() {
        return "text";
    }

    public int hashCode() {
        return Objects.hash(this.text);
    }

    public void setText(String str) {
        this.text = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("class PayloadAttachmentText {\n    text: "), toIndentedString(this.text), "\n}");
    }
}
