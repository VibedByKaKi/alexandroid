package com.amazon.alexa.biloba.model.cardV2.data;

import com.amazon.alexa.biloba.interfaces.Validator;
import com.amazon.alexa.biloba.model.cardV2.actions.ActionV2;
import com.amazon.alexa.biloba.model.cardV2.customAdapter.ActionAdapter;
import com.amazon.alexa.ra.core.data.fragments.CardContext;
import com.amazon.alexa.ra.core.data.fragments.Reference;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HaloTemplateData extends TemplateData implements Validator {

    @SerializedName("localizedTitle")
    private String localizedTitle = null;

    @SerializedName("localizedSubTitle")
    private String localizedSubTitle = null;

    @SerializedName("localizedDescription")
    private String localizedDescription = null;

    @SerializedName(Reference.ICON_URL)
    private String iconUrl = null;

    @SerializedName("iconAltText")
    private String iconAltText = null;

    @SerializedName("backgroundColor")
    private String backgroundColor = null;

    @SerializedName(CardContext.ACTIONS)
    @JsonAdapter(ActionAdapter.class)
    private List<ActionV2> actions = new ArrayList();

    public HaloTemplateData actions(List<ActionV2> list) {
        this.actions = list;
        return this;
    }

    public HaloTemplateData addActionsItem(ActionV2 actionV2) {
        this.actions.add(actionV2);
        return this;
    }

    public HaloTemplateData backgroundColor(String str) {
        this.backgroundColor = str;
        return this;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.data.TemplateData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HaloTemplateData haloTemplateData = (HaloTemplateData) obj;
            if (super.equals(obj) && Objects.equals(this.localizedTitle, haloTemplateData.localizedTitle) && Objects.equals(this.localizedSubTitle, haloTemplateData.localizedSubTitle) && Objects.equals(this.localizedDescription, haloTemplateData.localizedDescription) && Objects.equals(this.iconUrl, haloTemplateData.iconUrl) && Objects.equals(this.iconAltText, haloTemplateData.iconAltText) && Objects.equals(this.backgroundColor, haloTemplateData.backgroundColor) && Objects.equals(this.actions, haloTemplateData.actions)) {
                return true;
            }
        }
        return false;
    }

    public List<ActionV2> getActions() {
        return this.actions;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getIconAltText() {
        return this.iconAltText;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getLocalizedDescription() {
        return this.localizedDescription;
    }

    public String getLocalizedSubTitle() {
        return this.localizedSubTitle;
    }

    public String getLocalizedTitle() {
        return this.localizedTitle;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.data.TemplateData
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.localizedTitle, this.localizedSubTitle, this.localizedDescription, this.iconUrl, this.iconAltText, this.backgroundColor, this.actions);
    }

    public HaloTemplateData iconAltText(String str) {
        this.iconAltText = str;
        return this;
    }

    public HaloTemplateData iconUrl(String str) {
        this.iconUrl = str;
        return this;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.data.TemplateData, com.amazon.alexa.biloba.interfaces.Validator
    public boolean isValid() {
        return (!super.isValid() || this.localizedTitle == null || this.localizedDescription == null || this.actions == null) ? false : true;
    }

    public HaloTemplateData localizedDescription(String str) {
        this.localizedDescription = str;
        return this;
    }

    public HaloTemplateData localizedSubTitle(String str) {
        this.localizedSubTitle = str;
        return this;
    }

    public HaloTemplateData localizedTitle(String str) {
        this.localizedTitle = str;
        return this;
    }

    public void setActions(List<ActionV2> list) {
        this.actions = list;
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public void setIconAltText(String str) {
        this.iconAltText = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setLocalizedDescription(String str) {
        this.localizedDescription = str;
    }

    public void setLocalizedSubTitle(String str) {
        this.localizedSubTitle = str;
    }

    public void setLocalizedTitle(String str) {
        this.localizedTitle = str;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.data.TemplateData
    public String toString() {
        return super.toString().concat("     localizedTitle: " + toIndentedString(this.localizedTitle) + "\n     localizedSubTitle: " + toIndentedString(this.localizedSubTitle) + "\n     localizedDescription: " + toIndentedString(this.localizedDescription) + "\n     iconUrl: " + toIndentedString(this.iconUrl) + "\n     iconAltText: " + toIndentedString(this.iconAltText) + "\n     backgroundColor: " + toIndentedString(this.backgroundColor) + "\n     actions: " + toIndentedString(this.actions) + "\n}");
    }
}
