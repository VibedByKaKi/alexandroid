package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateUserAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessToken;
    private Map<String, String> clientMetadata;
    private List<AttributeType> userAttributes;

    public UpdateUserAttributesRequest addClientMetadataEntry(String str, String str2) {
        if (this.clientMetadata == null) {
            this.clientMetadata = new HashMap();
        }
        if (this.clientMetadata.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.clientMetadata.put(str, str2);
        return this;
    }

    public UpdateUserAttributesRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateUserAttributesRequest)) {
            return false;
        }
        UpdateUserAttributesRequest updateUserAttributesRequest = (UpdateUserAttributesRequest) obj;
        if ((updateUserAttributesRequest.getUserAttributes() == null) ^ (getUserAttributes() == null)) {
            return false;
        }
        if (updateUserAttributesRequest.getUserAttributes() != null && !updateUserAttributesRequest.getUserAttributes().equals(getUserAttributes())) {
            return false;
        }
        if ((updateUserAttributesRequest.getAccessToken() == null) ^ (getAccessToken() == null)) {
            return false;
        }
        if (updateUserAttributesRequest.getAccessToken() != null && !updateUserAttributesRequest.getAccessToken().equals(getAccessToken())) {
            return false;
        }
        if ((updateUserAttributesRequest.getClientMetadata() == null) ^ (getClientMetadata() == null)) {
            return false;
        }
        return updateUserAttributesRequest.getClientMetadata() == null || updateUserAttributesRequest.getClientMetadata().equals(getClientMetadata());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public List<AttributeType> getUserAttributes() {
        return this.userAttributes;
    }

    public int hashCode() {
        return (((((getUserAttributes() == null ? 0 : getUserAttributes().hashCode()) + 31) * 31) + (getAccessToken() == null ? 0 : getAccessToken().hashCode())) * 31) + (getClientMetadata() != null ? getClientMetadata().hashCode() : 0);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setClientMetadata(Map<String, String> map) {
        this.clientMetadata = map;
    }

    public void setUserAttributes(Collection<AttributeType> collection) {
        if (collection == null) {
            this.userAttributes = null;
        } else {
            this.userAttributes = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserAttributes() != null) {
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        }
        if (getAccessToken() != null) {
            sb.append("AccessToken: " + getAccessToken() + ",");
        }
        if (getClientMetadata() != null) {
            sb.append("ClientMetadata: " + getClientMetadata());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateUserAttributesRequest withAccessToken(String str) {
        this.accessToken = str;
        return this;
    }

    public UpdateUserAttributesRequest withClientMetadata(Map<String, String> map) {
        this.clientMetadata = map;
        return this;
    }

    public UpdateUserAttributesRequest withUserAttributes(AttributeType... attributeTypeArr) {
        if (getUserAttributes() == null) {
            this.userAttributes = new ArrayList(attributeTypeArr.length);
        }
        for (AttributeType attributeType : attributeTypeArr) {
            this.userAttributes.add(attributeType);
        }
        return this;
    }

    public UpdateUserAttributesRequest withUserAttributes(Collection<AttributeType> collection) {
        setUserAttributes(collection);
        return this;
    }
}
