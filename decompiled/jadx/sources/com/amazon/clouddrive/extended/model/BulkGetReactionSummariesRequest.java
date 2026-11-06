package com.amazon.clouddrive.extended.model;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BulkGetReactionSummariesRequest implements CloudDriveRequest {
    public final String groupId;
    public final List<String> topics;

    public BulkGetReactionSummariesRequest(String str, List<String> list) {
        this.groupId = str;
        this.topics = list;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this || !(cloudDriveRequest instanceof BulkGetReactionSummariesRequest)) {
            return 0;
        }
        BulkGetReactionSummariesRequest bulkGetReactionSummariesRequest = (BulkGetReactionSummariesRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getGroupId(), bulkGetReactionSummariesRequest.getGroupId());
        if (compare != 0) {
            return compare;
        }
        int compareCollections = ObjectComparator.compareCollections(getTopics(), bulkGetReactionSummariesRequest.getTopics());
        if (compareCollections != 0) {
            return compareCollections;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BulkGetReactionSummariesRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        return ((getGroupId() != null ? getGroupId().hashCode() : 0) * 31) + (getTopics() != null ? getTopics().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BulkGetReactionSummariesRequest{groupId='");
        sb.append(this.groupId);
        sb.append("', topics='");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.topics, AbstractJsonLexerKt.END_OBJ);
    }
}
