package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteIdentitiesRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> identityIdsToDelete;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteIdentitiesRequest)) {
            return false;
        }
        DeleteIdentitiesRequest deleteIdentitiesRequest = (DeleteIdentitiesRequest) obj;
        if ((deleteIdentitiesRequest.getIdentityIdsToDelete() == null) ^ (getIdentityIdsToDelete() == null)) {
            return false;
        }
        return deleteIdentitiesRequest.getIdentityIdsToDelete() == null || deleteIdentitiesRequest.getIdentityIdsToDelete().equals(getIdentityIdsToDelete());
    }

    public List<String> getIdentityIdsToDelete() {
        return this.identityIdsToDelete;
    }

    public int hashCode() {
        return 31 + (getIdentityIdsToDelete() == null ? 0 : getIdentityIdsToDelete().hashCode());
    }

    public void setIdentityIdsToDelete(Collection<String> collection) {
        if (collection == null) {
            this.identityIdsToDelete = null;
        } else {
            this.identityIdsToDelete = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIdentityIdsToDelete() != null) {
            sb.append("IdentityIdsToDelete: " + getIdentityIdsToDelete());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteIdentitiesRequest withIdentityIdsToDelete(String... strArr) {
        if (getIdentityIdsToDelete() == null) {
            this.identityIdsToDelete = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.identityIdsToDelete.add(str);
        }
        return this;
    }

    public DeleteIdentitiesRequest withIdentityIdsToDelete(Collection<String> collection) {
        setIdentityIdsToDelete(collection);
        return this;
    }
}
