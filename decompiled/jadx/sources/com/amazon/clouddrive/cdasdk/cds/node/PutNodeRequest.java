package com.amazon.clouddrive.cdasdk.cds.node;

import com.amazon.clouddrive.cdasdk.cds.common.NodeRequest;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PutNodeRequest extends NodeRequest {
    @Generated
    public PutNodeRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PutNodeRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PutNodeRequest) && ((PutNodeRequest) obj).canEqual(this) && super.equals(obj);
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public String toString() {
        return "PutNodeRequest()";
    }
}
