package com.amazon.alexa.biloba.model.cardV2.actions;

import com.amazon.alexa.biloba.interfaces.Validator;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class WebviewAction extends ActionV2 implements Validator {

    @SerializedName("url")
    private String url = null;

    @SerializedName("actionArguments")
    private Map<String, String> actionArguments = new HashMap();

    public WebviewAction actionArguments(Map<String, String> map) {
        this.actionArguments = map;
        return this;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.actions.ActionV2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WebviewAction webviewAction = (WebviewAction) obj;
            if (super.equals(obj) && Objects.equals(this.url, webviewAction.url) && Objects.equals(this.actionArguments, webviewAction.actionArguments)) {
                return true;
            }
        }
        return false;
    }

    public Map<String, String> getActionArguments() {
        return this.actionArguments;
    }

    public String getUrl() {
        return this.url;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.actions.ActionV2
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.url, this.actionArguments);
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.actions.ActionV2, com.amazon.alexa.biloba.interfaces.Validator
    public boolean isValid() {
        return super.isValid() && this.url != null;
    }

    public void setActionArguments(Map<String, String> map) {
        this.actionArguments = map;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.actions.ActionV2
    public String toString() {
        return super.toString().concat("     url: " + toIndentedString(this.url) + "\n     actionArguments: " + toIndentedString(this.actionArguments) + "\n}");
    }

    public WebviewAction url(String str) {
        this.url = str;
        return this;
    }
}
