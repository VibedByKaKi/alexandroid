package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ResendConfirmationCodeResult implements Serializable {
    private CodeDeliveryDetailsType codeDeliveryDetails;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResendConfirmationCodeResult)) {
            return false;
        }
        ResendConfirmationCodeResult resendConfirmationCodeResult = (ResendConfirmationCodeResult) obj;
        if ((resendConfirmationCodeResult.getCodeDeliveryDetails() == null) ^ (getCodeDeliveryDetails() == null)) {
            return false;
        }
        return resendConfirmationCodeResult.getCodeDeliveryDetails() == null || resendConfirmationCodeResult.getCodeDeliveryDetails().equals(getCodeDeliveryDetails());
    }

    public CodeDeliveryDetailsType getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    public int hashCode() {
        return 31 + (getCodeDeliveryDetails() == null ? 0 : getCodeDeliveryDetails().hashCode());
    }

    public void setCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetailsType) {
        this.codeDeliveryDetails = codeDeliveryDetailsType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCodeDeliveryDetails() != null) {
            sb.append("CodeDeliveryDetails: " + getCodeDeliveryDetails());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ResendConfirmationCodeResult withCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetailsType) {
        this.codeDeliveryDetails = codeDeliveryDetailsType;
        return this;
    }
}
