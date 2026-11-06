package com.amazon.alexa.app.notification.actions.handlers.reminders.types;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class FollowUpMetadata {
    private FollowUpStatus followUpStatus;
    private boolean requiresFollowUp;

    public FollowUpMetadata(FollowUpMetadata followUpMetadata) {
        if (followUpMetadata != null) {
            this.requiresFollowUp = followUpMetadata.requiresFollowUp;
            this.followUpStatus = followUpMetadata.followUpStatus;
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FollowUpMetadata;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FollowUpMetadata)) {
            return false;
        }
        FollowUpMetadata followUpMetadata = (FollowUpMetadata) obj;
        if (!followUpMetadata.canEqual(this) || isRequiresFollowUp() != followUpMetadata.isRequiresFollowUp()) {
            return false;
        }
        FollowUpStatus followUpStatus = getFollowUpStatus();
        FollowUpStatus followUpStatus2 = followUpMetadata.getFollowUpStatus();
        return followUpStatus != null ? followUpStatus.equals(followUpStatus2) : followUpStatus2 == null;
    }

    public FollowUpStatus getFollowUpStatus() {
        return this.followUpStatus;
    }

    public int hashCode() {
        int i = isRequiresFollowUp() ? 79 : 97;
        FollowUpStatus followUpStatus = getFollowUpStatus();
        return ((i + 59) * 59) + (followUpStatus == null ? 43 : followUpStatus.hashCode());
    }

    public boolean isRequiresFollowUp() {
        return this.requiresFollowUp;
    }

    public void setFollowUpStatus(FollowUpStatus followUpStatus) {
        this.followUpStatus = followUpStatus;
    }

    public void setRequiresFollowUp(boolean z) {
        this.requiresFollowUp = z;
    }

    public String toString() {
        return "FollowUpMetadata(requiresFollowUp=" + isRequiresFollowUp() + ", followUpStatus=" + getFollowUpStatus() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public FollowUpMetadata() {
    }
}
