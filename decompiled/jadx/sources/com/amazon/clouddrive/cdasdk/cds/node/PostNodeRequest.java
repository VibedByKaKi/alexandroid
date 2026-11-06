package com.amazon.clouddrive.cdasdk.cds.node;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.NodeRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PostNodeRequest extends NodeRequest {

    @SerializedName("localId")
    @Expose
    private String localId;

    @Generated
    public PostNodeRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PostNodeRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PostNodeRequest)) {
            return false;
        }
        PostNodeRequest postNodeRequest = (PostNodeRequest) obj;
        if (!postNodeRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String localId = getLocalId();
        String localId2 = postNodeRequest.getLocalId();
        return localId != null ? localId.equals(localId2) : localId2 == null;
    }

    @Generated
    public String getLocalId() {
        return this.localId;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String localId = getLocalId();
        return (hashCode * 59) + (localId == null ? 43 : localId.hashCode());
    }

    @Generated
    public void setLocalId(String str) {
        this.localId = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public String toString() {
        return "PostNodeRequest(localId=" + getLocalId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
