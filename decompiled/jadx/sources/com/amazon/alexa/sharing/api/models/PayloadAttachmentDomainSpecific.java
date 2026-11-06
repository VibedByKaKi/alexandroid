package com.amazon.alexa.sharing.api.models;

import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PayloadAttachmentDomainSpecific implements PayloadAttachment {
    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName("type")
    private String type;

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
        return Objects.equals(this.type, ((PayloadAttachmentDomainSpecific) obj).type);
    }

    @Override // com.amazon.alexa.sharing.api.models.PayloadAttachment
    @Nullable
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type);
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("class PayloadAttachmentDomainSpecific {\n    type: "), toIndentedString(this.type), "\n}");
    }

    public PayloadAttachmentDomainSpecific type(String str) {
        this.type = str;
        return this;
    }
}
