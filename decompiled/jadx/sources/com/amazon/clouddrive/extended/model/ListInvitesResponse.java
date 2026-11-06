package com.amazon.clouddrive.extended.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.extended.model.BatchCreateInviteResponse;
import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ListInvitesResponse implements CloudDriveResponse {
    private final int count;
    private final List<BatchCreateInviteResponse.Invite> invites;
    private final String nextToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListInvitesResponseBuilder {
        private int count;
        private List<BatchCreateInviteResponse.Invite> invites;
        private String nextToken;

        public ListInvitesResponse build() {
            return new ListInvitesResponse(this.count, this.nextToken, this.invites);
        }

        public ListInvitesResponseBuilder count(int i) {
            this.count = i;
            return this;
        }

        public ListInvitesResponseBuilder invites(List<BatchCreateInviteResponse.Invite> list) {
            this.invites = list;
            return this;
        }

        public ListInvitesResponseBuilder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ListInvitesResponse.ListInvitesResponseBuilder(count=");
            sb.append(this.count);
            sb.append(", nextToken=");
            sb.append(this.nextToken);
            sb.append(", invites=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.invites, sb);
        }
    }

    public ListInvitesResponse(int i, String str, List<BatchCreateInviteResponse.Invite> list) {
        this.count = i;
        this.nextToken = str;
        this.invites = list;
    }

    public static ListInvitesResponseBuilder builder() {
        return new ListInvitesResponseBuilder();
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof ListInvitesResponse)) {
            return ListInvitesResponse.class.getName().compareTo(cloudDriveResponse.getClass().getName());
        }
        ListInvitesResponse listInvitesResponse = (ListInvitesResponse) cloudDriveResponse;
        int i = this.count;
        int i2 = listInvitesResponse.count;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int compare = ObjectComparator.compare(this.nextToken, listInvitesResponse.nextToken);
        if (compare != 0) {
            return compare;
        }
        int compareCollections = ObjectComparator.compareCollections(this.invites, listInvitesResponse.invites);
        if (compareCollections != 0) {
            return compareCollections;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListInvitesResponse)) {
            return false;
        }
        ListInvitesResponse listInvitesResponse = (ListInvitesResponse) obj;
        if (getCount() != listInvitesResponse.getCount()) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listInvitesResponse.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        List<BatchCreateInviteResponse.Invite> invites = getInvites();
        List<BatchCreateInviteResponse.Invite> invites2 = listInvitesResponse.getInvites();
        return invites != null ? invites.equals(invites2) : invites2 == null;
    }

    public int getCount() {
        return this.count;
    }

    public List<BatchCreateInviteResponse.Invite> getInvites() {
        return this.invites;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        int count = getCount() + 59;
        String nextToken = getNextToken();
        int i = count * 59;
        int hashCode = nextToken == null ? 43 : nextToken.hashCode();
        List<BatchCreateInviteResponse.Invite> invites = getInvites();
        return ((i + hashCode) * 59) + (invites != null ? invites.hashCode() : 43);
    }

    public String toString() {
        return "ListInvitesResponse(count=" + getCount() + ", nextToken=" + getNextToken() + ", invites=" + getInvites() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
