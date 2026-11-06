package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupNode {
    private List<String> collectionIds;
    private NodeExtended nodeExtended;
    private ReactionSummary reactionSummary;

    public boolean canEqual(Object obj) {
        return obj instanceof GroupNode;
    }

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
        NodeExtended nodeExtended = getNodeExtended();
        NodeExtended nodeExtended2 = groupNode.getNodeExtended();
        if (nodeExtended != null ? !nodeExtended.equals(nodeExtended2) : nodeExtended2 != null) {
            return false;
        }
        ReactionSummary reactionSummary = getReactionSummary();
        ReactionSummary reactionSummary2 = groupNode.getReactionSummary();
        if (reactionSummary != null ? !reactionSummary.equals(reactionSummary2) : reactionSummary2 != null) {
            return false;
        }
        List<String> collectionIds = getCollectionIds();
        List<String> collectionIds2 = groupNode.getCollectionIds();
        return collectionIds != null ? collectionIds.equals(collectionIds2) : collectionIds2 == null;
    }

    public List<String> getCollectionIds() {
        return this.collectionIds;
    }

    public NodeExtended getNodeExtended() {
        return this.nodeExtended;
    }

    public ReactionSummary getReactionSummary() {
        return this.reactionSummary;
    }

    public int hashCode() {
        NodeExtended nodeExtended = getNodeExtended();
        int hashCode = nodeExtended == null ? 43 : nodeExtended.hashCode();
        ReactionSummary reactionSummary = getReactionSummary();
        int i = (hashCode + 59) * 59;
        int hashCode2 = reactionSummary == null ? 43 : reactionSummary.hashCode();
        List<String> collectionIds = getCollectionIds();
        return ((i + hashCode2) * 59) + (collectionIds != null ? collectionIds.hashCode() : 43);
    }

    public void setCollectionIds(List<String> list) {
        this.collectionIds = list;
    }

    public void setNodeExtended(NodeExtended nodeExtended) {
        this.nodeExtended = nodeExtended;
    }

    public void setReactionSummary(ReactionSummary reactionSummary) {
        this.reactionSummary = reactionSummary;
    }

    public String toString() {
        return "GroupNode(nodeExtended=" + getNodeExtended() + ", reactionSummary=" + getReactionSummary() + ", collectionIds=" + getCollectionIds() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
