package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetUICustomizationResult implements Serializable {
    private UICustomizationType uICustomization;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SetUICustomizationResult)) {
            return false;
        }
        SetUICustomizationResult setUICustomizationResult = (SetUICustomizationResult) obj;
        if ((setUICustomizationResult.getUICustomization() == null) ^ (getUICustomization() == null)) {
            return false;
        }
        return setUICustomizationResult.getUICustomization() == null || setUICustomizationResult.getUICustomization().equals(getUICustomization());
    }

    public UICustomizationType getUICustomization() {
        return this.uICustomization;
    }

    public int hashCode() {
        return 31 + (getUICustomization() == null ? 0 : getUICustomization().hashCode());
    }

    public void setUICustomization(UICustomizationType uICustomizationType) {
        this.uICustomization = uICustomizationType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUICustomization() != null) {
            sb.append("UICustomization: " + getUICustomization());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SetUICustomizationResult withUICustomization(UICustomizationType uICustomizationType) {
        this.uICustomization = uICustomizationType;
        return this;
    }
}
