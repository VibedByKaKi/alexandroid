package com.amazon.alexa.accessory.notificationpublisher.batch.models;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NotificationCluster {
    static final String GROUP_TYPE_NAMED = "named";
    public static final int LONG_MESSAGE_THRESHOLD_CHARS = 250;
    private final ClusterType clusterType;
    private int cumulativeContentLength;
    private final String groupChatName;
    private int longMessageCount;
    private final List<Notification> notifications;
    private final SenderIdentity senderIdentity;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ClusterType {
        COMMS_DIRECT,
        COMMS_GROUP_CHAT,
        NON_COMMS_APP
    }

    public NotificationCluster(@NonNull List<Notification> list) {
        this.notifications = list;
        Notification notification = list.get(0);
        ClusterType determineClusterType = determineClusterType(notification);
        this.clusterType = determineClusterType;
        this.senderIdentity = SenderIdentity.from(notification);
        this.groupChatName = buildGroupName(notification, determineClusterType);
        calculateContentMetrics(list);
    }

    @NonNull
    private static String buildGroupName(@NonNull Notification notification, @NonNull ClusterType clusterType) {
        if (clusterType != ClusterType.COMMS_GROUP_CHAT) {
            return "";
        }
        String groupType = notification.getGroupType();
        String groupName = notification.getGroupName();
        return (!"named".equals(groupType) || groupName.isEmpty()) ? "a group" : groupName;
    }

    private void calculateContentMetrics(@NonNull List<Notification> list) {
        int i = 0;
        int i2 = 0;
        for (Notification notification : list) {
            String contentWithoutPrefix = notification.getContentWithoutPrefix();
            if (contentWithoutPrefix.isEmpty()) {
                contentWithoutPrefix = notification.getDetailedContent();
            }
            i2 += contentWithoutPrefix.length();
            if (contentWithoutPrefix.length() >= 250) {
                i++;
            }
        }
        this.longMessageCount = i;
        this.cumulativeContentLength = i2;
    }

    private static ClusterType determineClusterType(@NonNull Notification notification) {
        return NotificationConstants.TYPE_COMMS.equals(notification.getType()) ? NotificationConstants.SUB_TYPE_GROUP_MESSAGE.equalsIgnoreCase(notification.getSubType()) ? ClusterType.COMMS_GROUP_CHAT : ClusterType.COMMS_DIRECT : ClusterType.NON_COMMS_APP;
    }

    @NonNull
    public ClusterType getClusterType() {
        return this.clusterType;
    }

    public int getCumulativeContentLength() {
        return this.cumulativeContentLength;
    }

    @NonNull
    public String getDisplayLabel() {
        return this.senderIdentity.getDisplayLabel();
    }

    @NonNull
    public String getGroupChatName() {
        return this.groupChatName;
    }

    public int getLongMessageCount() {
        return this.longMessageCount;
    }

    @NonNull
    public List<Notification> getNotifications() {
        return Collections.unmodifiableList(this.notifications);
    }

    @NonNull
    public SenderIdentity getSenderIdentity() {
        return this.senderIdentity;
    }

    public boolean hasLongMessages() {
        return this.longMessageCount > 0 || this.cumulativeContentLength >= 250;
    }
}
