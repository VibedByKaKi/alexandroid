package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteAliasRequest extends AmazonWebServiceRequest implements Serializable {
    private String aliasName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteAliasRequest)) {
            return false;
        }
        DeleteAliasRequest deleteAliasRequest = (DeleteAliasRequest) obj;
        if ((deleteAliasRequest.getAliasName() == null) ^ (getAliasName() == null)) {
            return false;
        }
        return deleteAliasRequest.getAliasName() == null || deleteAliasRequest.getAliasName().equals(getAliasName());
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public int hashCode() {
        return 31 + (getAliasName() == null ? 0 : getAliasName().hashCode());
    }

    public void setAliasName(String str) {
        this.aliasName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAliasName() != null) {
            sb.append("AliasName: " + getAliasName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteAliasRequest withAliasName(String str) {
        this.aliasName = str;
        return this;
    }
}
