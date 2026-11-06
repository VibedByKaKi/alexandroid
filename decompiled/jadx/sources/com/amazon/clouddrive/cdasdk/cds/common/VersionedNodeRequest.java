package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VersionedNodeRequest extends CloudDriveRequest {

    @SerializedName("resourceVersion")
    @Expose
    private ResourceVersion resourceVersion;

    @Generated
    public VersionedNodeRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof VersionedNodeRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedNodeRequest)) {
            return false;
        }
        VersionedNodeRequest versionedNodeRequest = (VersionedNodeRequest) obj;
        if (!versionedNodeRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        ResourceVersion resourceVersion = getResourceVersion();
        ResourceVersion resourceVersion2 = versionedNodeRequest.getResourceVersion();
        return resourceVersion != null ? resourceVersion.equals(resourceVersion2) : resourceVersion2 == null;
    }

    @Generated
    public ResourceVersion getResourceVersion() {
        return this.resourceVersion;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        ResourceVersion resourceVersion = getResourceVersion();
        return (hashCode * 59) + (resourceVersion == null ? 43 : resourceVersion.hashCode());
    }

    @Generated
    public void setResourceVersion(ResourceVersion resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "VersionedNodeRequest(resourceVersion=" + getResourceVersion() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
