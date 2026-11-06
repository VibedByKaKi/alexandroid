package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetReUpdateNodesResponse implements CloudDriveResponse {
    private int count;
    private List<ReUpdateNode> data = new ArrayList();
    private String nextToken;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof GetReUpdateNodesResponse)) {
            return 1;
        }
        GetReUpdateNodesResponse getReUpdateNodesResponse = (GetReUpdateNodesResponse) cloudDriveResponse;
        int compare = Integer.compare(this.count, getReUpdateNodesResponse.getCount());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(this.nextToken, getReUpdateNodesResponse.getNextToken());
        return compare2 != 0 ? compare2 : ObjectComparator.compare(this.data, getReUpdateNodesResponse.getData());
    }

    public boolean equals(Object obj) {
        return (obj instanceof GetReUpdateNodesResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public int getCount() {
        return this.count;
    }

    public List<ReUpdateNode> getData() {
        return this.data;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return Objects.hash(this.data, this.nextToken, Integer.valueOf(this.count));
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setData(List<ReUpdateNode> list) {
        this.data = list;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }
}
