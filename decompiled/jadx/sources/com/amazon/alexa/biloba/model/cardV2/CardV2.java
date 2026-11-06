package com.amazon.alexa.biloba.model.cardV2;

import com.amazon.alexa.biloba.interfaces.Validator;
import com.amazon.alexa.biloba.model.cardV2.customAdapter.TemplateDataAdapter;
import com.amazon.alexa.biloba.model.cardV2.data.TemplateData;
import com.amazon.alexa.biloba.model.cardV2.data.TemplateType;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CardV2 implements Validator {

    @SerializedName("cardId")
    private String cardId = null;

    @SerializedName("category")
    private CardCategory category = null;

    @SerializedName("templateType")
    private TemplateType templateType = null;

    @SerializedName("templateData")
    @JsonAdapter(TemplateDataAdapter.class)
    private TemplateData templateData = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public CardV2 cardId(String str) {
        this.cardId = str;
        return this;
    }

    public CardV2 category(CardCategory cardCategory) {
        this.category = cardCategory;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CardV2 cardV2 = (CardV2) obj;
            if (Objects.equals(this.cardId, cardV2.cardId) && Objects.equals(this.category, cardV2.category) && Objects.equals(this.templateType, cardV2.templateType) && Objects.equals(this.templateData, cardV2.templateData)) {
                return true;
            }
        }
        return false;
    }

    public String getCardId() {
        return this.cardId;
    }

    public CardCategory getCategory() {
        return this.category;
    }

    public TemplateData getTemplateData() {
        return this.templateData;
    }

    public TemplateType getTemplateType() {
        return this.templateType;
    }

    public int hashCode() {
        return Objects.hash(this.cardId, this.category, this.templateType, this.templateData);
    }

    @Override // com.amazon.alexa.biloba.interfaces.Validator
    public boolean isValid() {
        return (this.cardId == null || this.category == null || this.templateType == null || this.templateData == null) ? false : true;
    }

    public void setCardId(String str) {
        this.cardId = str;
    }

    public void setCategory(CardCategory cardCategory) {
        this.category = cardCategory;
    }

    public void setTemplateData(TemplateData templateData) {
        this.templateData = templateData;
    }

    public void setTemplateType(TemplateType templateType) {
        this.templateType = templateType;
    }

    public CardV2 templateData(TemplateData templateData) {
        this.templateData = templateData;
        return this;
    }

    public CardV2 templateType(TemplateType templateType) {
        this.templateType = templateType;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class CardV2 {\n     cardId: ");
        sb.append(toIndentedString(this.cardId));
        sb.append("\n     category: ");
        sb.append(toIndentedString(this.category));
        sb.append("\n     templateType: ");
        sb.append(toIndentedString(this.templateType));
        sb.append("\n     cardData: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.templateData), "\n}");
    }
}
