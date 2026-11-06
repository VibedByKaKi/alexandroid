package com.amazon.clouddrive.extended.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.extended.model.BatchCreateInviteResponse;
import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GetGroupShareBehaviorResponse implements CloudDriveResponse {
    private final List<BatchCreateInviteResponse.Invite> invites;
    private final String sharePrompt;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetGroupShareBehaviorResponseBuilder {
        private List<BatchCreateInviteResponse.Invite> invites;
        private String sharePrompt;

        public GetGroupShareBehaviorResponse build() {
            return new GetGroupShareBehaviorResponse(this.sharePrompt, this.invites);
        }

        public GetGroupShareBehaviorResponseBuilder invites(List<BatchCreateInviteResponse.Invite> list) {
            this.invites = list;
            return this;
        }

        public GetGroupShareBehaviorResponseBuilder sharePrompt(String str) {
            this.sharePrompt = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GetGroupShareBehaviorResponse.GetGroupShareBehaviorResponseBuilder(sharePrompt=");
            sb.append(this.sharePrompt);
            sb.append(", invites=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.invites, sb);
        }
    }

    public GetGroupShareBehaviorResponse(String str, List<BatchCreateInviteResponse.Invite> list) {
        this.sharePrompt = str;
        this.invites = list;
    }

    public static GetGroupShareBehaviorResponseBuilder builder() {
        return new GetGroupShareBehaviorResponseBuilder();
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof GetGroupShareBehaviorResponse)) {
            return GetGroupShareBehaviorResponse.class.getName().compareTo(cloudDriveResponse.getClass().getName());
        }
        GetGroupShareBehaviorResponse getGroupShareBehaviorResponse = (GetGroupShareBehaviorResponse) cloudDriveResponse;
        int compare = ObjectComparator.compare(getSharePrompt(), getGroupShareBehaviorResponse.getSharePrompt());
        if (compare != 0) {
            return compare;
        }
        int compareCollections = ObjectComparator.compareCollections(getInvites(), getGroupShareBehaviorResponse.getInvites());
        if (compareCollections != 0) {
            return compareCollections;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetGroupShareBehaviorResponse)) {
            return false;
        }
        GetGroupShareBehaviorResponse getGroupShareBehaviorResponse = (GetGroupShareBehaviorResponse) obj;
        String sharePrompt = getSharePrompt();
        String sharePrompt2 = getGroupShareBehaviorResponse.getSharePrompt();
        if (sharePrompt != null ? !sharePrompt.equals(sharePrompt2) : sharePrompt2 != null) {
            return false;
        }
        List<BatchCreateInviteResponse.Invite> invites = getInvites();
        List<BatchCreateInviteResponse.Invite> invites2 = getGroupShareBehaviorResponse.getInvites();
        return invites != null ? invites.equals(invites2) : invites2 == null;
    }

    public List<BatchCreateInviteResponse.Invite> getInvites() {
        return this.invites;
    }

    public String getSharePrompt() {
        return this.sharePrompt;
    }

    public int hashCode() {
        String sharePrompt = getSharePrompt();
        int hashCode = sharePrompt == null ? 43 : sharePrompt.hashCode();
        List<BatchCreateInviteResponse.Invite> invites = getInvites();
        return ((hashCode + 59) * 59) + (invites != null ? invites.hashCode() : 43);
    }

    public String toString() {
        return "GetGroupShareBehaviorResponse(sharePrompt=" + getSharePrompt() + ", invites=" + getInvites() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
