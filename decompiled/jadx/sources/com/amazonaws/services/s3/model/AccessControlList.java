package com.amazonaws.services.s3.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AccessControlList implements Serializable, S3RequesterChargedResult {
    private static final long serialVersionUID = 8095040648034788376L;
    private List<Grant> grantList;
    private Set<Grant> grantSet;
    private boolean isRequesterCharged;
    private Owner owner = null;

    private void checkState() {
        if (this.grantSet == null || this.grantList == null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Both grant set and grant list cannot be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlList accessControlList = (AccessControlList) obj;
        Owner owner = this.owner;
        Owner owner2 = accessControlList.owner;
        if (owner == null) {
            if (owner2 != null) {
                return false;
            }
        } else if (!owner.equals(owner2)) {
            return false;
        }
        Set<Grant> set = this.grantSet;
        Set<Grant> set2 = accessControlList.grantSet;
        if (set == null) {
            if (set2 != null) {
                return false;
            }
        } else if (!set.equals(set2)) {
            return false;
        }
        List<Grant> list = this.grantList;
        List<Grant> list2 = accessControlList.grantList;
        if (list == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list.equals(list2)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public Set<Grant> getGrants() {
        checkState();
        if (this.grantSet == null) {
            if (this.grantList == null) {
                this.grantSet = new HashSet();
            } else {
                this.grantSet = new HashSet(this.grantList);
                this.grantList = null;
            }
        }
        return this.grantSet;
    }

    public List<Grant> getGrantsAsList() {
        checkState();
        if (this.grantList == null) {
            if (this.grantSet == null) {
                this.grantList = new LinkedList();
            } else {
                this.grantList = new LinkedList(this.grantSet);
                this.grantSet = null;
            }
        }
        return this.grantList;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void grantAllPermissions(Grant... grantArr) {
        for (Grant grant : grantArr) {
            grantPermission(grant.getGrantee(), grant.getPermission());
        }
    }

    public void grantPermission(Grantee grantee, Permission permission) {
        getGrantsAsList().add(new Grant(grantee, permission));
    }

    public int hashCode() {
        Owner owner = this.owner;
        int hashCode = ((owner == null ? 0 : owner.hashCode()) + 31) * 31;
        Set<Grant> set = this.grantSet;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        List<Grant> list = this.grantList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public boolean isRequesterCharged() {
        return this.isRequesterCharged;
    }

    public void revokeAllPermissions(Grantee grantee) {
        ArrayList arrayList = new ArrayList();
        for (Grant grant : getGrantsAsList()) {
            if (grant.getGrantee().equals(grantee)) {
                arrayList.add(grant);
            }
        }
        this.grantList.removeAll(arrayList);
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public void setRequesterCharged(boolean z) {
        this.isRequesterCharged = z;
    }

    public String toString() {
        return "AccessControlList [owner=" + this.owner + ", grants=" + getGrantsAsList() + MarkdownConstants.RIGHT_BRACKET;
    }
}
