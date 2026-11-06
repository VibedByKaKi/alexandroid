package com.amazon.alexa.biloba.model.cardV2.data;

import com.amazon.alexa.biloba.interfaces.Validator;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TemplateData implements Validator {

    @SerializedName("templateType")
    private TemplateType templateType = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.templateType, ((TemplateData) obj).templateType);
    }

    public TemplateType getTemplateType() {
        return this.templateType;
    }

    public int hashCode() {
        return Objects.hash(this.templateType);
    }

    @Override // com.amazon.alexa.biloba.interfaces.Validator
    public boolean isValid() {
        return this.templateType != null;
    }

    public void setTemplateType(TemplateType templateType) {
        this.templateType = templateType;
    }

    public TemplateData templateType(TemplateType templateType) {
        this.templateType = templateType;
        return this;
    }

    public String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public String toString() {
        return "TemplateData {\n     templateType:" + toIndentedString(getTemplateType()) + "\n";
    }
}
