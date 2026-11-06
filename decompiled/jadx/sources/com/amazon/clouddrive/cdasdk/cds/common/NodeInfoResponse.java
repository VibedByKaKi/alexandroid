package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeInfoResponse extends NodeInfo {

    @SerializedName("location")
    @Expose
    private String location;

    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;

    @Generated
    public NodeInfoResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof NodeInfoResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NodeInfoResponse)) {
            return false;
        }
        NodeInfoResponse nodeInfoResponse = (NodeInfoResponse) obj;
        if (!nodeInfoResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Integer statusCode = getStatusCode();
        Integer statusCode2 = nodeInfoResponse.getStatusCode();
        if (statusCode != null ? !statusCode.equals(statusCode2) : statusCode2 != null) {
            return false;
        }
        String location = getLocation();
        String location2 = nodeInfoResponse.getLocation();
        return location != null ? location.equals(location2) : location2 == null;
    }

    @Generated
    public String getLocation() {
        return this.location;
    }

    @Generated
    public Integer getStatusCode() {
        return this.statusCode;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Integer statusCode = getStatusCode();
        int i = hashCode * 59;
        int hashCode2 = statusCode == null ? 43 : statusCode.hashCode();
        String location = getLocation();
        return ((i + hashCode2) * 59) + (location != null ? location.hashCode() : 43);
    }

    @Generated
    public void setLocation(String str) {
        this.location = str;
    }

    @Generated
    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public String toString() {
        return "NodeInfoResponse(statusCode=" + getStatusCode() + ", location=" + getLocation() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
