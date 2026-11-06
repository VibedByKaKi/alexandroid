package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetReUpdateNodesRequest implements CloudDriveRequest {
    private int limit;
    private String startToken;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof GetReUpdateNodesRequest)) {
            return 1;
        }
        GetReUpdateNodesRequest getReUpdateNodesRequest = (GetReUpdateNodesRequest) cloudDriveRequest;
        int compare = Integer.compare(this.limit, getReUpdateNodesRequest.getLimit());
        return compare != 0 ? compare : ObjectComparator.compare(this.startToken, getReUpdateNodesRequest.getStartToken());
    }

    public boolean equals(Object obj) {
        return (obj instanceof GetReUpdateNodesRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public int getLimit() {
        return this.limit;
    }

    public String getStartToken() {
        return this.startToken;
    }

    public int hashCode() {
        return Objects.hash(this.startToken, Integer.valueOf(this.limit));
    }

    public void setLimit(int i) {
        this.limit = i;
    }

    public void setStartToken(String str) {
        this.startToken = str;
    }
}
