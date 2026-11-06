package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class BatchCreateInviteRequest implements CloudDriveRequest {

    @NonNull
    private final String groupId;

    @NonNull
    private final List<Invitee> invitees;

    public BatchCreateInviteRequest(@NonNull String str, @NonNull List<Invitee> list) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("groupId is null");
            throw null;
        }
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("invitees is null");
            throw null;
        }
        this.groupId = str;
        this.invitees = list;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof BatchCreateInviteRequest)) {
            return 1;
        }
        BatchCreateInviteRequest batchCreateInviteRequest = (BatchCreateInviteRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getGroupId(), batchCreateInviteRequest.getGroupId());
        if (compare != 0) {
            return compare;
        }
        int compareCollections = ObjectComparator.compareCollections(getInvitees(), batchCreateInviteRequest.getInvitees());
        if (compareCollections != 0) {
            return compareCollections;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchCreateInviteRequest)) {
            return false;
        }
        BatchCreateInviteRequest batchCreateInviteRequest = (BatchCreateInviteRequest) obj;
        String groupId = getGroupId();
        String groupId2 = batchCreateInviteRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        List<Invitee> invitees = getInvitees();
        List<Invitee> invitees2 = batchCreateInviteRequest.getInvitees();
        return invitees != null ? invitees.equals(invitees2) : invitees2 == null;
    }

    @NonNull
    public String getGroupId() {
        return this.groupId;
    }

    @NonNull
    public List<Invitee> getInvitees() {
        return this.invitees;
    }

    public int hashCode() {
        String groupId = getGroupId();
        int hashCode = groupId == null ? 43 : groupId.hashCode();
        List<Invitee> invitees = getInvitees();
        return ((hashCode + 59) * 59) + (invitees != null ? invitees.hashCode() : 43);
    }

    public String toString() {
        return "BatchCreateInviteRequest(groupId=" + getGroupId() + ", invitees=" + getInvitees() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
