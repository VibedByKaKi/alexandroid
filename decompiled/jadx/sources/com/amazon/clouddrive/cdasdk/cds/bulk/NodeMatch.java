package com.amazon.clouddrive.cdasdk.cds.bulk;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.NodeInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeMatch {

    @SerializedName("multipleHits")
    @Expose
    private boolean multipleHits;

    @SerializedName("nodeInfo")
    @Expose
    private NodeInfo nodeInfo;

    @Generated
    public NodeMatch() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof NodeMatch;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NodeMatch)) {
            return false;
        }
        NodeMatch nodeMatch = (NodeMatch) obj;
        if (!nodeMatch.canEqual(this) || isMultipleHits() != nodeMatch.isMultipleHits()) {
            return false;
        }
        NodeInfo nodeInfo = getNodeInfo();
        NodeInfo nodeInfo2 = nodeMatch.getNodeInfo();
        return nodeInfo != null ? nodeInfo.equals(nodeInfo2) : nodeInfo2 == null;
    }

    @Generated
    public NodeInfo getNodeInfo() {
        return this.nodeInfo;
    }

    @Generated
    public int hashCode() {
        int i = isMultipleHits() ? 79 : 97;
        NodeInfo nodeInfo = getNodeInfo();
        return ((i + 59) * 59) + (nodeInfo == null ? 43 : nodeInfo.hashCode());
    }

    @Generated
    public boolean isMultipleHits() {
        return this.multipleHits;
    }

    @Generated
    public void setMultipleHits(boolean z) {
        this.multipleHits = z;
    }

    @Generated
    public void setNodeInfo(NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    @Generated
    public String toString() {
        return "NodeMatch(nodeInfo=" + getNodeInfo() + ", multipleHits=" + isMultipleHits() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
