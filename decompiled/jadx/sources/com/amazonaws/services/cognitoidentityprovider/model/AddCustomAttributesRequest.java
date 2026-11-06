package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AddCustomAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    private List<SchemaAttributeType> customAttributes;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AddCustomAttributesRequest)) {
            return false;
        }
        AddCustomAttributesRequest addCustomAttributesRequest = (AddCustomAttributesRequest) obj;
        if ((addCustomAttributesRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (addCustomAttributesRequest.getUserPoolId() != null && !addCustomAttributesRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((addCustomAttributesRequest.getCustomAttributes() == null) ^ (getCustomAttributes() == null)) {
            return false;
        }
        return addCustomAttributesRequest.getCustomAttributes() == null || addCustomAttributesRequest.getCustomAttributes().equals(getCustomAttributes());
    }

    public List<SchemaAttributeType> getCustomAttributes() {
        return this.customAttributes;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((getUserPoolId() == null ? 0 : getUserPoolId().hashCode()) + 31) * 31) + (getCustomAttributes() != null ? getCustomAttributes().hashCode() : 0);
    }

    public void setCustomAttributes(Collection<SchemaAttributeType> collection) {
        if (collection == null) {
            this.customAttributes = null;
        } else {
            this.customAttributes = new ArrayList(collection);
        }
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        }
        if (getCustomAttributes() != null) {
            sb.append("CustomAttributes: " + getCustomAttributes());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AddCustomAttributesRequest withCustomAttributes(SchemaAttributeType... schemaAttributeTypeArr) {
        if (getCustomAttributes() == null) {
            this.customAttributes = new ArrayList(schemaAttributeTypeArr.length);
        }
        for (SchemaAttributeType schemaAttributeType : schemaAttributeTypeArr) {
            this.customAttributes.add(schemaAttributeType);
        }
        return this;
    }

    public AddCustomAttributesRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }

    public AddCustomAttributesRequest withCustomAttributes(Collection<SchemaAttributeType> collection) {
        setCustomAttributes(collection);
        return this;
    }
}
