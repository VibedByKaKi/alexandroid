package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteIdentitiesResult implements Serializable {
    private List<UnprocessedIdentityId> unprocessedIdentityIds;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteIdentitiesResult)) {
            return false;
        }
        DeleteIdentitiesResult deleteIdentitiesResult = (DeleteIdentitiesResult) obj;
        if ((deleteIdentitiesResult.getUnprocessedIdentityIds() == null) ^ (getUnprocessedIdentityIds() == null)) {
            return false;
        }
        return deleteIdentitiesResult.getUnprocessedIdentityIds() == null || deleteIdentitiesResult.getUnprocessedIdentityIds().equals(getUnprocessedIdentityIds());
    }

    public List<UnprocessedIdentityId> getUnprocessedIdentityIds() {
        return this.unprocessedIdentityIds;
    }

    public int hashCode() {
        return 31 + (getUnprocessedIdentityIds() == null ? 0 : getUnprocessedIdentityIds().hashCode());
    }

    public void setUnprocessedIdentityIds(Collection<UnprocessedIdentityId> collection) {
        if (collection == null) {
            this.unprocessedIdentityIds = null;
        } else {
            this.unprocessedIdentityIds = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUnprocessedIdentityIds() != null) {
            sb.append("UnprocessedIdentityIds: " + getUnprocessedIdentityIds());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteIdentitiesResult withUnprocessedIdentityIds(UnprocessedIdentityId... unprocessedIdentityIdArr) {
        if (getUnprocessedIdentityIds() == null) {
            this.unprocessedIdentityIds = new ArrayList(unprocessedIdentityIdArr.length);
        }
        for (UnprocessedIdentityId unprocessedIdentityId : unprocessedIdentityIdArr) {
            this.unprocessedIdentityIds.add(unprocessedIdentityId);
        }
        return this;
    }

    public DeleteIdentitiesResult withUnprocessedIdentityIds(Collection<UnprocessedIdentityId> collection) {
        setUnprocessedIdentityIds(collection);
        return this;
    }
}
