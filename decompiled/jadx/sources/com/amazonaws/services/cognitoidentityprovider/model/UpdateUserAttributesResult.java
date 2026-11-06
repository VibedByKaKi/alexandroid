package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateUserAttributesResult implements Serializable {
    private List<CodeDeliveryDetailsType> codeDeliveryDetailsList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateUserAttributesResult)) {
            return false;
        }
        UpdateUserAttributesResult updateUserAttributesResult = (UpdateUserAttributesResult) obj;
        if ((updateUserAttributesResult.getCodeDeliveryDetailsList() == null) ^ (getCodeDeliveryDetailsList() == null)) {
            return false;
        }
        return updateUserAttributesResult.getCodeDeliveryDetailsList() == null || updateUserAttributesResult.getCodeDeliveryDetailsList().equals(getCodeDeliveryDetailsList());
    }

    public List<CodeDeliveryDetailsType> getCodeDeliveryDetailsList() {
        return this.codeDeliveryDetailsList;
    }

    public int hashCode() {
        return 31 + (getCodeDeliveryDetailsList() == null ? 0 : getCodeDeliveryDetailsList().hashCode());
    }

    public void setCodeDeliveryDetailsList(Collection<CodeDeliveryDetailsType> collection) {
        if (collection == null) {
            this.codeDeliveryDetailsList = null;
        } else {
            this.codeDeliveryDetailsList = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCodeDeliveryDetailsList() != null) {
            sb.append("CodeDeliveryDetailsList: " + getCodeDeliveryDetailsList());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateUserAttributesResult withCodeDeliveryDetailsList(CodeDeliveryDetailsType... codeDeliveryDetailsTypeArr) {
        if (getCodeDeliveryDetailsList() == null) {
            this.codeDeliveryDetailsList = new ArrayList(codeDeliveryDetailsTypeArr.length);
        }
        for (CodeDeliveryDetailsType codeDeliveryDetailsType : codeDeliveryDetailsTypeArr) {
            this.codeDeliveryDetailsList.add(codeDeliveryDetailsType);
        }
        return this;
    }

    public UpdateUserAttributesResult withCodeDeliveryDetailsList(Collection<CodeDeliveryDetailsType> collection) {
        setCodeDeliveryDetailsList(collection);
        return this;
    }
}
