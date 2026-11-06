package com.amazon.clouddrive.cdasdk.cds.node;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.NodeRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UpdateNodeRequest extends NodeRequest {

    @SerializedName("contentETag")
    @Expose
    private String contentETag;

    @Generated
    public UpdateNodeRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof UpdateNodeRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateNodeRequest)) {
            return false;
        }
        UpdateNodeRequest updateNodeRequest = (UpdateNodeRequest) obj;
        if (!updateNodeRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String contentETag = getContentETag();
        String contentETag2 = updateNodeRequest.getContentETag();
        return contentETag != null ? contentETag.equals(contentETag2) : contentETag2 == null;
    }

    @Generated
    public String getContentETag() {
        return this.contentETag;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String contentETag = getContentETag();
        return (hashCode * 59) + (contentETag == null ? 43 : contentETag.hashCode());
    }

    @Generated
    public void setContentETag(String str) {
        this.contentETag = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeRequest, com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public String toString() {
        return "UpdateNodeRequest(contentETag=" + getContentETag() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
