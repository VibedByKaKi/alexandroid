package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateReactionRequest implements CloudDriveRequest {
    private final String body;
    private final String groupId;
    private final String kind;
    private final String reactionId;
    private final String topic;

    public CreateReactionRequest(String str, String str2, String str3, String str4, String str5) {
        this.kind = str2;
        this.body = str3;
        this.topic = str4;
        this.groupId = str;
        this.reactionId = str5;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this || !(cloudDriveRequest instanceof CreateReactionRequest)) {
            return 0;
        }
        CreateReactionRequest createReactionRequest = (CreateReactionRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getKind(), createReactionRequest.getKind());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getBody(), createReactionRequest.getBody());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getTopic(), createReactionRequest.getTopic());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getGroupId(), createReactionRequest.getGroupId());
        if (compare4 != 0) {
            return compare4;
        }
        int compare5 = ObjectComparator.compare(getReactionId(), createReactionRequest.getReactionId());
        if (compare5 != 0) {
            return compare5;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateReactionRequest)) {
            return false;
        }
        CreateReactionRequest createReactionRequest = (CreateReactionRequest) obj;
        if (getKind() == null ? createReactionRequest.getKind() == null : getKind().equals(createReactionRequest.getKind())) {
            if (getBody() == null ? createReactionRequest.getBody() == null : getBody().equals(createReactionRequest.getBody())) {
                if (getTopic() == null ? createReactionRequest.getTopic() == null : getTopic().equals(createReactionRequest.getTopic())) {
                    if (getGroupId() == null ? createReactionRequest.getGroupId() == null : getGroupId().equals(createReactionRequest.getGroupId())) {
                        if (getReactionId() == null ? createReactionRequest.getReactionId() == null : getReactionId().equals(createReactionRequest.getReactionId())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String getBody() {
        return this.body;
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
        return ((((((((getKind() != null ? getKind().hashCode() : 0) * 31) + (getBody() != null ? getBody().hashCode() : 0)) * 31) + (getTopic() != null ? getTopic().hashCode() : 0)) * 31) + (getGroupId() != null ? getGroupId().hashCode() : 0)) * 31) + (getReactionId() != null ? getReactionId().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreateReactionRequest{kind='");
        sb.append(this.kind);
        sb.append("', body='");
        sb.append(this.body);
        sb.append("', topic='");
        sb.append(this.topic);
        sb.append("', groupId='");
        sb.append(this.groupId);
        sb.append("', reactionId='");
        return a$$ExternalSyntheticOutline0.m(sb, this.reactionId, "'}");
    }
}
