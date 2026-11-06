package com.amazon.alexa.notification.api.actions.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class NotificationAction {
    private final String actionId;
    private final NotificationActionType actionType;
    private final DisplayType displayType;
    private final String label;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NotificationActionBuilder {
        private String actionId;
        private NotificationActionType actionType;
        private DisplayType displayType;
        private String label;

        public NotificationActionBuilder actionId(String str) {
            this.actionId = str;
            return this;
        }

        public NotificationActionBuilder actionType(NotificationActionType notificationActionType) {
            this.actionType = notificationActionType;
            return this;
        }

        public NotificationAction build() {
            return new NotificationAction(this.actionId, this.label, this.displayType, this.actionType);
        }

        public NotificationActionBuilder displayType(DisplayType displayType) {
            this.displayType = displayType;
            return this;
        }

        public NotificationActionBuilder label(String str) {
            this.label = str;
            return this;
        }

        public String toString() {
            return "NotificationAction.NotificationActionBuilder(actionId=" + this.actionId + ", label=" + this.label + ", displayType=" + this.displayType + ", actionType=" + this.actionType + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public NotificationAction(String str, String str2, DisplayType displayType, NotificationActionType notificationActionType) {
        this.actionId = str;
        this.label = str2;
        this.displayType = displayType;
        this.actionType = notificationActionType;
    }

    public static NotificationActionBuilder builder() {
        return new NotificationActionBuilder();
    }

    public String getActionId() {
        return this.actionId;
    }

    public NotificationActionType getActionType() {
        return this.actionType;
    }

    public DisplayType getDisplayType() {
        return this.displayType;
    }

    public String getLabel() {
        return this.label;
    }
}
