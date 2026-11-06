package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListNotificationTopicSubscriptionResponse implements CloudDriveResponse {
    private List<NotificationTopicSubscription> notificationTopicSubscriptions;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof ListNotificationTopicSubscriptionResponse)) {
            return 1;
        }
        List<NotificationTopicSubscription> notificationTopicSubscriptions = getNotificationTopicSubscriptions();
        List<NotificationTopicSubscription> notificationTopicSubscriptions2 = ((ListNotificationTopicSubscriptionResponse) cloudDriveResponse).getNotificationTopicSubscriptions();
        if (notificationTopicSubscriptions != notificationTopicSubscriptions2) {
            if (notificationTopicSubscriptions == null) {
                return -1;
            }
            if (notificationTopicSubscriptions2 == null) {
                return 1;
            }
            if (notificationTopicSubscriptions instanceof Comparable) {
                int compareTo = ((Comparable) notificationTopicSubscriptions).compareTo(notificationTopicSubscriptions2);
                if (compareTo != 0) {
                    return compareTo;
                }
            } else if (!notificationTopicSubscriptions.equals(notificationTopicSubscriptions2)) {
                int hashCode = notificationTopicSubscriptions.hashCode();
                int hashCode2 = notificationTopicSubscriptions2.hashCode();
                if (hashCode < hashCode2) {
                    return -1;
                }
                if (hashCode > hashCode2) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListNotificationTopicSubscriptionResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public List<NotificationTopicSubscription> getNotificationTopicSubscriptions() {
        return this.notificationTopicSubscriptions;
    }

    public int hashCode() {
        if (getNotificationTopicSubscriptions() != null) {
            return getNotificationTopicSubscriptions().hashCode();
        }
        return 0;
    }

    public void setNotificationTopicSubscriptions(List<NotificationTopicSubscription> list) {
        this.notificationTopicSubscriptions = list;
    }
}
