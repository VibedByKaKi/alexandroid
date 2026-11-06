package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.cam.client.CamServiceClient;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeRequest extends NodeInfo {

    @SerializedName("applicationId")
    @Expose
    private String applicationId;

    @SerializedName(CamServiceClient.QUERY_CONFLICT_RESOLUTION)
    @Expose
    private ConflictResolution conflictResolution;

    @SerializedName(BizMetricsConstants.CUSTOMER_ID)
    @Expose
    private String customerId;

    @SerializedName("resourceVersion")
    @Expose
    private ResourceVersion resourceVersion;

    @Generated
    public NodeRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof NodeRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NodeRequest)) {
            return false;
        }
        NodeRequest nodeRequest = (NodeRequest) obj;
        if (!nodeRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String customerId = getCustomerId();
        String customerId2 = nodeRequest.getCustomerId();
        if (customerId != null ? !customerId.equals(customerId2) : customerId2 != null) {
            return false;
        }
        String applicationId = getApplicationId();
        String applicationId2 = nodeRequest.getApplicationId();
        if (applicationId != null ? !applicationId.equals(applicationId2) : applicationId2 != null) {
            return false;
        }
        ConflictResolution conflictResolution = getConflictResolution();
        ConflictResolution conflictResolution2 = nodeRequest.getConflictResolution();
        if (conflictResolution != null ? !conflictResolution.equals(conflictResolution2) : conflictResolution2 != null) {
            return false;
        }
        ResourceVersion resourceVersion = getResourceVersion();
        ResourceVersion resourceVersion2 = nodeRequest.getResourceVersion();
        return resourceVersion != null ? resourceVersion.equals(resourceVersion2) : resourceVersion2 == null;
    }

    @Generated
    public String getApplicationId() {
        return this.applicationId;
    }

    @Generated
    public ConflictResolution getConflictResolution() {
        return this.conflictResolution;
    }

    @Generated
    public String getCustomerId() {
        return this.customerId;
    }

    @Generated
    public ResourceVersion getResourceVersion() {
        return this.resourceVersion;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String customerId = getCustomerId();
        int hashCode2 = (hashCode * 59) + (customerId == null ? 43 : customerId.hashCode());
        String applicationId = getApplicationId();
        int hashCode3 = (hashCode2 * 59) + (applicationId == null ? 43 : applicationId.hashCode());
        ConflictResolution conflictResolution = getConflictResolution();
        int i = hashCode3 * 59;
        int hashCode4 = conflictResolution == null ? 43 : conflictResolution.hashCode();
        ResourceVersion resourceVersion = getResourceVersion();
        return ((i + hashCode4) * 59) + (resourceVersion != null ? resourceVersion.hashCode() : 43);
    }

    @Generated
    public void setApplicationId(String str) {
        this.applicationId = str;
    }

    @Generated
    public void setConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    @Generated
    public void setCustomerId(String str) {
        this.customerId = str;
    }

    @Generated
    public void setResourceVersion(ResourceVersion resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public String toString() {
        return "NodeRequest(customerId=" + getCustomerId() + ", applicationId=" + getApplicationId() + ", conflictResolution=" + getConflictResolution() + ", resourceVersion=" + getResourceVersion() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
