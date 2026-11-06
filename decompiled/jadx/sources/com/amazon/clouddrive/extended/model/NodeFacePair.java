package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeFacePair implements Comparable<NodeFacePair> {
    private String faceId;
    private String nodeId;

    @Override // java.lang.Comparable
    public int compareTo(NodeFacePair nodeFacePair) {
        if (nodeFacePair == null) {
            return -1;
        }
        if (nodeFacePair == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getFaceId(), nodeFacePair.getFaceId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getNodeId(), nodeFacePair.getNodeId());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof NodeFacePair) && compareTo((NodeFacePair) obj) == 0;
    }

    public String getFaceId() {
        return this.faceId;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public int hashCode() {
        return (((getFaceId() == null ? 0 : getFaceId().hashCode()) + 1 + (getNodeId() != null ? getNodeId().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setFaceId(String str) {
        this.faceId = str;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }
}
