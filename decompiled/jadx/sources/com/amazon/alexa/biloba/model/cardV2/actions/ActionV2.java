package com.amazon.alexa.biloba.model.cardV2.actions;

import com.amazon.alexa.biloba.interfaces.Validator;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ActionV2 implements Validator {

    @SerializedName("actionText")
    private String actionText = null;

    @SerializedName("actionType")
    private ActionTypeV2 actionType = null;

    public ActionV2 actionText(String str) {
        this.actionText = str;
        return this;
    }

    public ActionV2 actionType(ActionTypeV2 actionTypeV2) {
        this.actionType = actionTypeV2;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActionV2 actionV2 = (ActionV2) obj;
            if (Objects.equals(this.actionText, actionV2.actionText) && Objects.equals(this.actionType, actionV2.actionType)) {
                return true;
            }
        }
        return false;
    }

    public String getActionText() {
        return this.actionText;
    }

    public ActionTypeV2 getActionType() {
        return this.actionType;
    }

    public int hashCode() {
        return Objects.hash(this.actionText, this.actionType);
    }

    @Override // com.amazon.alexa.biloba.interfaces.Validator
    public boolean isValid() {
        return (this.actionText == null || this.actionType == null) ? false : true;
    }

    public void setActionText(String str) {
        this.actionText = str;
    }

    public void setActionType(ActionTypeV2 actionTypeV2) {
        this.actionType = actionTypeV2;
    }

    public String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public String toString() {
        return "ActionV2 {\n     actionText:" + toIndentedString(this.actionText) + "\n     actionType:" + toIndentedString(this.actionType) + "\n";
    }
}
