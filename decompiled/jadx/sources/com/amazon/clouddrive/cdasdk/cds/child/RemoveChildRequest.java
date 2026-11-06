package com.amazon.clouddrive.cdasdk.cds.child;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.sharing.api.models.Message;
import com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RemoveChildRequest extends VersionedNodeRequest {

    @SerializedName("childId")
    @Expose
    private String childId;

    @SerializedName("childOwnerId")
    @Expose
    private String childOwnerId;

    @SerializedName(Message.SERIALIZED_NAME_PARENT_ID)
    @Expose
    private String parentId;

    @Generated
    public RemoveChildRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof RemoveChildRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoveChildRequest)) {
            return false;
        }
        RemoveChildRequest removeChildRequest = (RemoveChildRequest) obj;
        if (!removeChildRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String parentId = getParentId();
        String parentId2 = removeChildRequest.getParentId();
        if (parentId != null ? !parentId.equals(parentId2) : parentId2 != null) {
            return false;
        }
        String childId = getChildId();
        String childId2 = removeChildRequest.getChildId();
        if (childId != null ? !childId.equals(childId2) : childId2 != null) {
            return false;
        }
        String childOwnerId = getChildOwnerId();
        String childOwnerId2 = removeChildRequest.getChildOwnerId();
        return childOwnerId != null ? childOwnerId.equals(childOwnerId2) : childOwnerId2 == null;
    }

    @Generated
    public String getChildId() {
        return this.childId;
    }

    @Generated
    public String getChildOwnerId() {
        return this.childOwnerId;
    }

    @Generated
    public String getParentId() {
        return this.parentId;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String parentId = getParentId();
        int hashCode2 = (hashCode * 59) + (parentId == null ? 43 : parentId.hashCode());
        String childId = getChildId();
        int i = hashCode2 * 59;
        int hashCode3 = childId == null ? 43 : childId.hashCode();
        String childOwnerId = getChildOwnerId();
        return ((i + hashCode3) * 59) + (childOwnerId != null ? childOwnerId.hashCode() : 43);
    }

    @Generated
    public void setChildId(String str) {
        this.childId = str;
    }

    @Generated
    public void setChildOwnerId(String str) {
        this.childOwnerId = str;
    }

    @Generated
    public void setParentId(String str) {
        this.parentId = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "RemoveChildRequest(parentId=" + getParentId() + ", childId=" + getChildId() + ", childOwnerId=" + getChildOwnerId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
