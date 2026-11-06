package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class AccessTokenRequest implements CloudDriveRequest {
    private String token;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof AccessTokenRequest)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getToken(), ((AccessTokenRequest) cloudDriveRequest).getToken());
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AccessTokenRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((getToken() == null ? 0 : getToken().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setToken(String str) {
        this.token = str;
    }

    public AccessTokenRequest withToken(String str) {
        setToken(str);
        return this;
    }
}
