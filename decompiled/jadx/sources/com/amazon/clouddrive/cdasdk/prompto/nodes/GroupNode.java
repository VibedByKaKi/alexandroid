package com.amazon.clouddrive.cdasdk.prompto.nodes;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.NodeInfo;
import com.amazon.clouddrive.cdasdk.prompto.reactions.ReactionSummaryResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupNode {

    @SerializedName("addedDate")
    @Expose
    private String addedDate;

    @SerializedName("collectionIds")
    @Expose
    private List<String> collectionIds;

    @SerializedName("node")
    @Expose
    private NodeInfo node;

    @SerializedName("reactionSummary")
    @Expose
    private ReactionSummaryResponse reactionSummary;

    @Generated
    public GroupNode() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GroupNode;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupNode)) {
            return false;
        }
        GroupNode groupNode = (GroupNode) obj;
        if (!groupNode.canEqual(this)) {
            return false;
        }
        NodeInfo node = getNode();
        NodeInfo node2 = groupNode.getNode();
        if (node != null ? !node.equals(node2) : node2 != null) {
            return false;
        }
        ReactionSummaryResponse reactionSummary = getReactionSummary();
        ReactionSummaryResponse reactionSummary2 = groupNode.getReactionSummary();
        if (reactionSummary != null ? !reactionSummary.equals(reactionSummary2) : reactionSummary2 != null) {
            return false;
        }
        List<String> collectionIds = getCollectionIds();
        List<String> collectionIds2 = groupNode.getCollectionIds();
        if (collectionIds != null ? !collectionIds.equals(collectionIds2) : collectionIds2 != null) {
            return false;
        }
        String addedDate = getAddedDate();
        String addedDate2 = groupNode.getAddedDate();
        return addedDate != null ? addedDate.equals(addedDate2) : addedDate2 == null;
    }

    @Generated
    public String getAddedDate() {
        return this.addedDate;
    }

    @Generated
    public List<String> getCollectionIds() {
        return this.collectionIds;
    }

    @Generated
    public NodeInfo getNode() {
        return this.node;
    }

    @Generated
    public ReactionSummaryResponse getReactionSummary() {
        return this.reactionSummary;
    }

    @Generated
    public int hashCode() {
        NodeInfo node = getNode();
        int hashCode = node == null ? 43 : node.hashCode();
        ReactionSummaryResponse reactionSummary = getReactionSummary();
        int hashCode2 = ((hashCode + 59) * 59) + (reactionSummary == null ? 43 : reactionSummary.hashCode());
        List<String> collectionIds = getCollectionIds();
        int i = hashCode2 * 59;
        int hashCode3 = collectionIds == null ? 43 : collectionIds.hashCode();
        String addedDate = getAddedDate();
        return ((i + hashCode3) * 59) + (addedDate != null ? addedDate.hashCode() : 43);
    }

    @Generated
    public void setAddedDate(String str) {
        this.addedDate = str;
    }

    @Generated
    public void setCollectionIds(List<String> list) {
        this.collectionIds = list;
    }

    @Generated
    public void setNode(NodeInfo nodeInfo) {
        this.node = nodeInfo;
    }

    @Generated
    public void setReactionSummary(ReactionSummaryResponse reactionSummaryResponse) {
        this.reactionSummary = reactionSummaryResponse;
    }

    @Generated
    public String toString() {
        return "GroupNode(node=" + getNode() + ", reactionSummary=" + getReactionSummary() + ", collectionIds=" + getCollectionIds() + ", addedDate=" + getAddedDate() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
