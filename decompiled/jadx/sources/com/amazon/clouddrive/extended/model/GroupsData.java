package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupsData {
    private ReactionSummaries reactionSummaries;

    public boolean canEqual(Object obj) {
        return obj instanceof GroupsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupsData)) {
            return false;
        }
        GroupsData groupsData = (GroupsData) obj;
        if (!groupsData.canEqual(this)) {
            return false;
        }
        ReactionSummaries reactionSummaries = getReactionSummaries();
        ReactionSummaries reactionSummaries2 = groupsData.getReactionSummaries();
        return reactionSummaries != null ? reactionSummaries.equals(reactionSummaries2) : reactionSummaries2 == null;
    }

    public ReactionSummaries getReactionSummaries() {
        return this.reactionSummaries;
    }

    public int hashCode() {
        ReactionSummaries reactionSummaries = getReactionSummaries();
        return 59 + (reactionSummaries == null ? 43 : reactionSummaries.hashCode());
    }

    public void setReactionSummaries(ReactionSummaries reactionSummaries) {
        this.reactionSummaries = reactionSummaries;
    }

    public String toString() {
        return "GroupsData(reactionSummaries=" + getReactionSummaries() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
