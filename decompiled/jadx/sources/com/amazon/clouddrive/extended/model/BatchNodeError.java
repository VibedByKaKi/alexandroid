package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BatchNodeError implements Comparable<BatchNodeError> {
    private String nodeId;

    @Override // java.lang.Comparable
    public int compareTo(BatchNodeError batchNodeError) {
        int compare;
        if (batchNodeError == null) {
            return -1;
        }
        if (batchNodeError == this || (compare = ObjectComparator.compare(getNodeId(), batchNodeError.getNodeId())) == 0) {
            return 0;
        }
        return compare;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BatchNodeError) && compareTo((BatchNodeError) obj) == 0;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public int hashCode() {
        return (getNodeId() == null ? 0 : getNodeId().hashCode()) + 1;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }
}
