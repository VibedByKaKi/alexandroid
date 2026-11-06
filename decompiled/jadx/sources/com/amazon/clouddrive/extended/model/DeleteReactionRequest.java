package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeleteReactionRequest implements CloudDriveRequest {
    private final String groupId;
    private final String kind;
    private final String reactionId;
    private final String topic;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DeleteReactionRequestBuilder {
        private String groupId;
        private String kind;
        private String reactionId;
        private String topic;

        public DeleteReactionRequest build() {
            return new DeleteReactionRequest(this.reactionId, this.groupId, this.topic, this.kind);
        }

        public DeleteReactionRequestBuilder groupId(String str) {
            this.groupId = str;
            return this;
        }

        public DeleteReactionRequestBuilder kind(String str) {
            this.kind = str;
            return this;
        }

        public DeleteReactionRequestBuilder reactionId(String str) {
            this.reactionId = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DeleteReactionRequest.DeleteReactionRequestBuilder(reactionId=");
            sb.append(this.reactionId);
            sb.append(", groupId=");
            sb.append(this.groupId);
            sb.append(", topic=");
            sb.append(this.topic);
            sb.append(", kind=");
            return a$$ExternalSyntheticOutline0.m(sb, this.kind, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public DeleteReactionRequestBuilder topic(String str) {
            this.topic = str;
            return this;
        }
    }

    public DeleteReactionRequest(String str, String str2, String str3, String str4) {
        this.reactionId = str;
        this.groupId = str2;
        this.topic = str3;
        this.kind = str4;
    }

    public static DeleteReactionRequestBuilder builder() {
        return new DeleteReactionRequestBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof DeleteReactionRequest;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this || !(cloudDriveRequest instanceof DeleteReactionRequest)) {
            return 0;
        }
        DeleteReactionRequest deleteReactionRequest = (DeleteReactionRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getReactionId(), deleteReactionRequest.getReactionId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getGroupId(), deleteReactionRequest.getGroupId());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getTopic(), deleteReactionRequest.getTopic());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getKind(), deleteReactionRequest.getKind());
        if (compare4 != 0) {
            return compare4;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteReactionRequest)) {
            return false;
        }
        DeleteReactionRequest deleteReactionRequest = (DeleteReactionRequest) obj;
        if (!deleteReactionRequest.canEqual(this)) {
            return false;
        }
        String reactionId = getReactionId();
        String reactionId2 = deleteReactionRequest.getReactionId();
        if (reactionId != null ? !reactionId.equals(reactionId2) : reactionId2 != null) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = deleteReactionRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String topic = getTopic();
        String topic2 = deleteReactionRequest.getTopic();
        if (topic != null ? !topic.equals(topic2) : topic2 != null) {
            return false;
        }
        String kind = getKind();
        String kind2 = deleteReactionRequest.getKind();
        return kind != null ? kind.equals(kind2) : kind2 == null;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getKind() {
        return this.kind;
    }

    public String getReactionId() {
        return this.reactionId;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        String reactionId = getReactionId();
        int hashCode = reactionId == null ? 43 : reactionId.hashCode();
        String groupId = getGroupId();
        int hashCode2 = ((hashCode + 59) * 59) + (groupId == null ? 43 : groupId.hashCode());
        String topic = getTopic();
        int i = hashCode2 * 59;
        int hashCode3 = topic == null ? 43 : topic.hashCode();
        String kind = getKind();
        return ((i + hashCode3) * 59) + (kind != null ? kind.hashCode() : 43);
    }

    public String toString() {
        return "DeleteReactionRequest(reactionId=" + getReactionId() + ", groupId=" + getGroupId() + ", topic=" + getTopic() + ", kind=" + getKind() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
