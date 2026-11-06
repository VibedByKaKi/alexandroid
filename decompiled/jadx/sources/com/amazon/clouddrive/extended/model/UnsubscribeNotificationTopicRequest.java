package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UnsubscribeNotificationTopicRequest implements CloudDriveRequest {
    private String notificationTopicId;
    private String sourceId;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof UnsubscribeNotificationTopicRequest)) {
            return 1;
        }
        UnsubscribeNotificationTopicRequest unsubscribeNotificationTopicRequest = (UnsubscribeNotificationTopicRequest) cloudDriveRequest;
        String notificationTopicId = getNotificationTopicId();
        String notificationTopicId2 = unsubscribeNotificationTopicRequest.getNotificationTopicId();
        if (notificationTopicId != notificationTopicId2) {
            if (notificationTopicId == null) {
                return -1;
            }
            if (notificationTopicId2 == null) {
                return 1;
            }
            int compareTo = notificationTopicId.compareTo(notificationTopicId2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        String sourceId = getSourceId();
        String sourceId2 = unsubscribeNotificationTopicRequest.getSourceId();
        if (sourceId != sourceId2) {
            if (sourceId == null) {
                return -1;
            }
            if (sourceId2 == null) {
                return 1;
            }
            int compareTo2 = sourceId.compareTo(sourceId2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UnsubscribeNotificationTopicRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getNotificationTopicId() {
        return this.notificationTopicId;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        return ((getNotificationTopicId() != null ? getNotificationTopicId().hashCode() : 0) * 31) + (getSourceId() != null ? getSourceId().hashCode() : 0);
    }

    public void setNotificationTopicId(String str) {
        this.notificationTopicId = str;
    }

    public void setSourceId(String str) {
        this.sourceId = str;
    }
}
