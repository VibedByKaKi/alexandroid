package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListSourcesRequest extends CloudDriveRequest {

    @SerializedName("includeDevice")
    @Expose
    private Boolean includeDevice;

    @SerializedName("parentDeviceId")
    @Expose
    private String parentDeviceId;

    @Generated
    public ListSourcesRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListSourcesRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListSourcesRequest)) {
            return false;
        }
        ListSourcesRequest listSourcesRequest = (ListSourcesRequest) obj;
        if (!listSourcesRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Boolean includeDevice = getIncludeDevice();
        Boolean includeDevice2 = listSourcesRequest.getIncludeDevice();
        if (includeDevice != null ? !includeDevice.equals(includeDevice2) : includeDevice2 != null) {
            return false;
        }
        String parentDeviceId = getParentDeviceId();
        String parentDeviceId2 = listSourcesRequest.getParentDeviceId();
        return parentDeviceId != null ? parentDeviceId.equals(parentDeviceId2) : parentDeviceId2 == null;
    }

    @Generated
    public Boolean getIncludeDevice() {
        return this.includeDevice;
    }

    @Generated
    public String getParentDeviceId() {
        return this.parentDeviceId;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean includeDevice = getIncludeDevice();
        int i = hashCode * 59;
        int hashCode2 = includeDevice == null ? 43 : includeDevice.hashCode();
        String parentDeviceId = getParentDeviceId();
        return ((i + hashCode2) * 59) + (parentDeviceId != null ? parentDeviceId.hashCode() : 43);
    }

    @Generated
    public void setIncludeDevice(Boolean bool) {
        this.includeDevice = bool;
    }

    @Generated
    public void setParentDeviceId(String str) {
        this.parentDeviceId = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "ListSourcesRequest(includeDevice=" + getIncludeDevice() + ", parentDeviceId=" + getParentDeviceId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
