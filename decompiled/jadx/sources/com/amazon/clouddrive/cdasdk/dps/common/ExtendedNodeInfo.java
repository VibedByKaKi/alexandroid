package com.amazon.clouddrive.cdasdk.dps.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.NodeInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExtendedNodeInfo extends NodeInfo {

    @SerializedName("sourceCollectionId")
    @Expose
    private String sourceCollectionId;

    @SerializedName("sourceCollectionTitle")
    @Expose
    private String sourceCollectionTitle;

    @Generated
    public ExtendedNodeInfo() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ExtendedNodeInfo;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtendedNodeInfo)) {
            return false;
        }
        ExtendedNodeInfo extendedNodeInfo = (ExtendedNodeInfo) obj;
        if (!extendedNodeInfo.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String sourceCollectionTitle = getSourceCollectionTitle();
        String sourceCollectionTitle2 = extendedNodeInfo.getSourceCollectionTitle();
        if (sourceCollectionTitle != null ? !sourceCollectionTitle.equals(sourceCollectionTitle2) : sourceCollectionTitle2 != null) {
            return false;
        }
        String sourceCollectionId = getSourceCollectionId();
        String sourceCollectionId2 = extendedNodeInfo.getSourceCollectionId();
        return sourceCollectionId != null ? sourceCollectionId.equals(sourceCollectionId2) : sourceCollectionId2 == null;
    }

    @Generated
    public String getSourceCollectionId() {
        return this.sourceCollectionId;
    }

    @Generated
    public String getSourceCollectionTitle() {
        return this.sourceCollectionTitle;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String sourceCollectionTitle = getSourceCollectionTitle();
        int i = hashCode * 59;
        int hashCode2 = sourceCollectionTitle == null ? 43 : sourceCollectionTitle.hashCode();
        String sourceCollectionId = getSourceCollectionId();
        return ((i + hashCode2) * 59) + (sourceCollectionId != null ? sourceCollectionId.hashCode() : 43);
    }

    @Generated
    public void setSourceCollectionId(String str) {
        this.sourceCollectionId = str;
    }

    @Generated
    public void setSourceCollectionTitle(String str) {
        this.sourceCollectionTitle = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.NodeInfo, com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public String toString() {
        return "ExtendedNodeInfo(sourceCollectionTitle=" + getSourceCollectionTitle() + ", sourceCollectionId=" + getSourceCollectionId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
