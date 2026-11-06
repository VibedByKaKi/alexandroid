package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NotificationTopicSubscription implements Comparable<NotificationTopicSubscription> {
    private boolean isSubscribed;
    private NotificationTopic notificationTopic;

    @Override // java.lang.Comparable
    public int compareTo(NotificationTopicSubscription notificationTopicSubscription) {
        int compareTo;
        if (notificationTopicSubscription == null) {
            return -1;
        }
        if (notificationTopicSubscription == this) {
            return 0;
        }
        NotificationTopic notificationTopic = getNotificationTopic();
        NotificationTopic notificationTopic2 = notificationTopicSubscription.getNotificationTopic();
        if (notificationTopic != notificationTopic2) {
            if (notificationTopic == null) {
                return -1;
            }
            if (notificationTopic2 == null) {
                return 1;
            }
            int compareTo2 = notificationTopic.compareTo(notificationTopic2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        Boolean valueOf = Boolean.valueOf(isSubscribed());
        Boolean valueOf2 = Boolean.valueOf(notificationTopicSubscription.isSubscribed());
        if (valueOf == valueOf2 || (compareTo = valueOf.compareTo(valueOf2)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof NotificationTopicSubscription) && compareTo((NotificationTopicSubscription) obj) == 0;
    }

    public NotificationTopic getNotificationTopic() {
        return this.notificationTopic;
    }

    public int hashCode() {
        return (isSubscribed() ? 1 : 0) + ((getNotificationTopic() != null ? getNotificationTopic().hashCode() : 0) * 31);
    }

    public boolean isSubscribed() {
        return this.isSubscribed;
    }

    public void setNotificationTopic(NotificationTopic notificationTopic) {
        this.notificationTopic = notificationTopic;
    }

    public void setSubscribed(boolean z) {
        this.isSubscribed = z;
    }
}
