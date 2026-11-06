package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetReactionRequest implements CloudDriveRequest {
    private final String groupId;
    private final String reactionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetReactionRequestBuilder {
        private String groupId;
        private String reactionId;

        public GetReactionRequest build() {
            return new GetReactionRequest(this.groupId, this.reactionId);
        }

        public GetReactionRequestBuilder groupId(String str) {
            this.groupId = str;
            return this;
        }

        public GetReactionRequestBuilder reactionId(String str) {
            this.reactionId = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GetReactionRequest.GetReactionRequestBuilder(groupId=");
            sb.append(this.groupId);
            sb.append(", reactionId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.reactionId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public GetReactionRequest(String str, String str2) {
        this.groupId = str;
        this.reactionId = str2;
    }

    public static GetReactionRequestBuilder builder() {
        return new GetReactionRequestBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GetReactionRequest;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this || !(cloudDriveRequest instanceof GetReactionRequest)) {
            return 0;
        }
        GetReactionRequest getReactionRequest = (GetReactionRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getGroupId(), getReactionRequest.getGroupId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getReactionId(), getReactionRequest.getReactionId());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetReactionRequest)) {
            return false;
        }
        GetReactionRequest getReactionRequest = (GetReactionRequest) obj;
        if (!getReactionRequest.canEqual(this)) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = getReactionRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String reactionId = getReactionId();
        String reactionId2 = getReactionRequest.getReactionId();
        return reactionId != null ? reactionId.equals(reactionId2) : reactionId2 == null;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getReactionId() {
        return this.reactionId;
    }

    public int hashCode() {
        String groupId = getGroupId();
        int hashCode = groupId == null ? 43 : groupId.hashCode();
        String reactionId = getReactionId();
        return ((hashCode + 59) * 59) + (reactionId != null ? reactionId.hashCode() : 43);
    }

    public String toString() {
        return "GetReactionRequest(groupId=" + getGroupId() + ", reactionId=" + getReactionId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
