package com.amazon.clouddrive.cdasdk.cds.child;

import com.amazon.alexa.cam.client.CamServiceClient;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.sharing.api.models.Message;
import com.amazon.clouddrive.cdasdk.cds.common.ConflictResolution;
import com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AddChildRequest extends VersionedNodeRequest {

    @SerializedName("childId")
    @Expose
    private String childId;

    @SerializedName("childOwnerId")
    @Expose
    private String childOwnerId;

    @SerializedName(CamServiceClient.QUERY_CONFLICT_RESOLUTION)
    @Expose
    private ConflictResolution conflictResolution;

    @SerializedName(Message.SERIALIZED_NAME_PARENT_ID)
    @Expose
    private String parentId;

    @Generated
    public AddChildRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof AddChildRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddChildRequest)) {
            return false;
        }
        AddChildRequest addChildRequest = (AddChildRequest) obj;
        if (!addChildRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String parentId = getParentId();
        String parentId2 = addChildRequest.getParentId();
        if (parentId != null ? !parentId.equals(parentId2) : parentId2 != null) {
            return false;
        }
        String childId = getChildId();
        String childId2 = addChildRequest.getChildId();
        if (childId != null ? !childId.equals(childId2) : childId2 != null) {
            return false;
        }
        String childOwnerId = getChildOwnerId();
        String childOwnerId2 = addChildRequest.getChildOwnerId();
        if (childOwnerId != null ? !childOwnerId.equals(childOwnerId2) : childOwnerId2 != null) {
            return false;
        }
        ConflictResolution conflictResolution = getConflictResolution();
        ConflictResolution conflictResolution2 = addChildRequest.getConflictResolution();
        return conflictResolution != null ? conflictResolution.equals(conflictResolution2) : conflictResolution2 == null;
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
    public ConflictResolution getConflictResolution() {
        return this.conflictResolution;
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
        int hashCode3 = (hashCode2 * 59) + (childId == null ? 43 : childId.hashCode());
        String childOwnerId = getChildOwnerId();
        int i = hashCode3 * 59;
        int hashCode4 = childOwnerId == null ? 43 : childOwnerId.hashCode();
        ConflictResolution conflictResolution = getConflictResolution();
        return ((i + hashCode4) * 59) + (conflictResolution != null ? conflictResolution.hashCode() : 43);
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
    public void setConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    @Generated
    public void setParentId(String str) {
        this.parentId = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "AddChildRequest(parentId=" + getParentId() + ", childId=" + getChildId() + ", childOwnerId=" + getChildOwnerId() + ", conflictResolution=" + getConflictResolution() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
