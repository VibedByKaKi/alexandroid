package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NotificationTopic implements Comparable<NotificationTopic> {
    private String description;
    private String displayName;
    private String notificationTopicId;

    @Override // java.lang.Comparable
    public int compareTo(NotificationTopic notificationTopic) {
        if (notificationTopic == null) {
            return -1;
        }
        if (notificationTopic == this) {
            return 0;
        }
        String description = getDescription();
        String description2 = notificationTopic.getDescription();
        if (description != description2) {
            if (description == null) {
                return -1;
            }
            if (description2 == null) {
                return 1;
            }
            int compareTo = description.compareTo(description2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        String displayName = getDisplayName();
        String displayName2 = notificationTopic.getDisplayName();
        if (displayName != displayName2) {
            if (displayName == null) {
                return -1;
            }
            if (displayName2 == null) {
                return 1;
            }
            int compareTo2 = displayName.compareTo(displayName2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        String notificationTopicId = getNotificationTopicId();
        String notificationTopicId2 = notificationTopic.getNotificationTopicId();
        if (notificationTopicId != notificationTopicId2) {
            if (notificationTopicId == null) {
                return -1;
            }
            if (notificationTopicId2 == null) {
                return 1;
            }
            int compareTo3 = notificationTopicId.compareTo(notificationTopicId2);
            if (compareTo3 != 0) {
                return compareTo3;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof NotificationTopic) && compareTo((NotificationTopic) obj) == 0;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getNotificationTopicId() {
        return this.notificationTopicId;
    }

    public int hashCode() {
        return ((((getDisplayName() != null ? getDisplayName().hashCode() : 0) * 31) + (getDescription() != null ? getDescription().hashCode() : 0)) * 31) + (getNotificationTopicId() != null ? getNotificationTopicId().hashCode() : 0);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setNotificationTopicId(String str) {
        this.notificationTopicId = str;
    }
}
