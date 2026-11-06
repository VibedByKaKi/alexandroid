package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UnsubscribeNotificationTopicResponse implements CloudDriveResponse {
    private NotificationTopicSubscription notificationTopicSubscription;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof UnsubscribeNotificationTopicResponse)) {
            return 1;
        }
        NotificationTopicSubscription notificationTopicSubscription = getNotificationTopicSubscription();
        NotificationTopicSubscription notificationTopicSubscription2 = ((UnsubscribeNotificationTopicResponse) cloudDriveResponse).getNotificationTopicSubscription();
        if (notificationTopicSubscription != notificationTopicSubscription2) {
            if (notificationTopicSubscription == null) {
                return -1;
            }
            if (notificationTopicSubscription2 == null) {
                return 1;
            }
            int compareTo = notificationTopicSubscription.compareTo(notificationTopicSubscription2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UnsubscribeNotificationTopicResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public NotificationTopicSubscription getNotificationTopicSubscription() {
        return this.notificationTopicSubscription;
    }

    public int hashCode() {
        if (getNotificationTopicSubscription() != null) {
            return getNotificationTopicSubscription().hashCode();
        }
        return 0;
    }

    public void setNotificationTopicSubscription(NotificationTopicSubscription notificationTopicSubscription) {
        this.notificationTopicSubscription = notificationTopicSubscription;
    }
}
